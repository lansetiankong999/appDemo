package com.springboot.cloud.demos.ribbon.rest;

import com.springboot.cloud.common.core.entity.vo.Result;
import com.springboot.cloud.demos.ribbon.service.ClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Jump
 */
@RestController
public class ClassController {

    @Resource
    ClassService classService;

    @GetMapping("/classes")
    public Result hello(@RequestParam String name) {
        return classService.users(name);
    }

    @PostMapping("/classes")
    public Result hello(@RequestBody Map<String, String> params) {
        return classService.users(params);
    }

}
