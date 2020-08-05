package com.springboot.cloud.common.web.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jump
 */
@Data
@NoArgsConstructor
public class BaseVo implements Serializable {
    private String id;
}
