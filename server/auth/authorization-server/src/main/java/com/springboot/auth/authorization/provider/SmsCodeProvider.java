package com.springboot.auth.authorization.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * todo 实现短信验证码的服务
 *
 * @author Jump
 */
//@FeignClient(name = "sms", fallback = OrganizationProviderFallback.class)
public interface SmsCodeProvider {

    /**
     * 获取短信验证码
     *
     * @param mobile       mobile
     * @param businessType businessType
     * @return String
     */
    @GetMapping(value = "/sms/{mobile}")
    String getSmsCode(@PathVariable("mobile") String mobile, @RequestParam("businessType") String businessType);
}
