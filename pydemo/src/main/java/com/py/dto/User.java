package com.py.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author hj
 * @date 2019/2/28
 */
@Data
@AllArgsConstructor
public class User {
    @ApiModelProperty(value = "用户id")
    private String id;
    @NotBlank(message = "用户名称不能为空")
    @ApiModelProperty(value = "用户名称")
    private String name;
}
