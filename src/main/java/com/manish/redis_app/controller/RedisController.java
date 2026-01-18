package com.manish.redis_app.controller;

import com.manish.redis_app.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @PostMapping("/save")
    public String save(@RequestParam String key,@RequestParam String value) {
        redisService.save(key, value);
        return "Saved successfully";
    }

    @GetMapping("/get")
    public String get(@RequestParam String key) {
        return redisService.get(key);
    }
}
