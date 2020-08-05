package com.springboot.auth.authorization.provider;

import com.springboot.auth.authorization.entity.Role;
import com.springboot.auth.authorization.entity.User;
import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * @author Jump
 */
@FeignClient(name = "organization", fallback = OrganizationProviderFallback.class)
public interface OrganizationProvider {

    /**
     * 通过关联id查询用户
     *
     * @param uniqueId uniqueId
     * @return User
     */
    @GetMapping(value = "/user")
    Result<User> getUserByUniqueId(@RequestParam("uniqueId") String uniqueId);

    /**
     * 通过id查询权限
     *
     * @param userId userId
     * @return Role
     */
    @GetMapping(value = "/role/user/{userId}")
    Result<Set<Role>> queryRolesByUserId(@PathVariable("userId") String userId);
}
