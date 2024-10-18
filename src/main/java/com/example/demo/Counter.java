package com.example.demo;

import java.math.BigDecimal;

import org.springframework.data.redis.core.RedisHash;

import lombok.Builder;
import lombok.Data;


@RedisHash("Counter")
@Builder
@Data
public class Counter {
    
    private String id;
    private BigDecimal count;

}
