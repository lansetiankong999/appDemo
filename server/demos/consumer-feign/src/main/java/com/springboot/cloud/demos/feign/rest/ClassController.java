package com.springboot.cloud.demos.feign.rest;

import com.springboot.cloud.common.core.entity.vo.Result;
import com.springboot.cloud.demos.feign.service.ClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Jump
 */
@RestController
public class ClassController {

    @Resource
    private ClassService classService;

    @GetMapping("/classes")
    public Result hello(@RequestParam String name) {
        return classService.users(name);
    }

    @PostMapping("/classes")
    public Result hello(@RequestBody Map map) {
        return classService.users(map);
    }

}
