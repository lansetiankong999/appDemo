package com.springboot.auth.authorization.oauth2;

import com.springboot.auth.authorization.entity.User;
import com.springboot.auth.authorization.provider.SmsCodeProvider;
import com.springboot.auth.authorization.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 手机验证码登陆, 用户相关获取
 *
 * @author Jump
 */
@Slf4j
@Service("mobileUserDetailsService")
public class MobileUserDetailsService extends CustomUserDetailsServiceImpl {

    @Resource
    private IUserService userService;

    @Resource
    private SmsCodeProvider smsCodeProvider;

    @Override
    public UserDetails loadUserByUsername(String uniqueId) {

        User user = userService.getByUniqueId(uniqueId);
        log.info("load user by mobile:{}", user.toString());

        // 如果为mobile模式，从短信服务中获取验证码（动态密码）
        String credentials = smsCodeProvider.getSmsCode(uniqueId, "LOGIN");

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                credentials,
                user.getEnabled(),
                user.getAccountNonExpired(),
                user.getCredentialsNonExpired(),
                user.getAccountNonLocked(),
                super.obtainGrantedAuthorities(user));
    }
}
