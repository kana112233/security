package com.py.controller;

import com.py.dto.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author hj
 * @date 2019/2/28
 */
@Log4j
@RestController("/user")
public class HelloController {
    @PostMapping("/hello2")
    @ApiOperation(value = "哈喽查询")
    public Object hello(@RequestBody  User user){
        log.error(user.getName()+"进入");
        return user;
    }

    @GetMapping("/{name:\\d+}")
    @ApiOperation(value = "哈喽查询")
    public Object getInfo(@ApiParam("姓名") @PathVariable String name){
        log.error(name+"进入");
        return new User("1",name);
    }
}
