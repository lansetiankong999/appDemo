package com.springboot.cloud.auth.authentication.events;

import com.springboot.cloud.auth.authentication.service.impl.ResourceServiceImpl;
import com.springboot.cloud.sysadmin.organization.entity.po.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Jump
 */
@Component
@Slf4j
public class BusReceiver {

    @javax.annotation.Resource
    private ResourceServiceImpl resourceService;

    public void handleMessage(Resource resource) {
        log.info("Received Message:<{}>", resource);
        resourceService.saveResource(resource);
    }
}
