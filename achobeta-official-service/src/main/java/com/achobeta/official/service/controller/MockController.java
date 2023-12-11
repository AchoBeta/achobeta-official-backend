package com.achobeta.official.service.controller;


import com.achobeta.official.service.common.SystemJsonResponse;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jett
 * @since 2023/12/7
 */
@RestController
@RequestMapping("/mock")
public class MockController {
    @PostMapping("/start")
    public SystemJsonResponse start() {
        return SystemJsonResponse.SYSTEM_SUCCESS("mock docker success !");
    }

    @GetMapping("/start")
    public  SystemJsonResponse startGet() {
        return SystemJsonResponse.SYSTEM_SUCCESS("mock get success !");
    }
}
