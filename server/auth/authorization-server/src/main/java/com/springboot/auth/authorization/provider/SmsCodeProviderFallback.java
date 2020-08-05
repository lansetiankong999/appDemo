package com.springboot.auth.authorization.provider;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jump
 */
@Component
public class SmsCodeProviderFallback implements SmsCodeProvider {

    @Resource
    PasswordEncoder passwordEncoder;

    @Override
    public String getSmsCode(String mobile, String businessType) {
        // 该类为mock, 目前暂时没有sms的服务
        return passwordEncoder.encode("123456");
    }
}
