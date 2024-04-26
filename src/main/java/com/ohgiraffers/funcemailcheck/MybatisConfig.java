package com.ohgiraffers.funcemailcheck;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.funcemailcheck", annotationClass = Mapper.class)
public class MybatisConfig {
}
