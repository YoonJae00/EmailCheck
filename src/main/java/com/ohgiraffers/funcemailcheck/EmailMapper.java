package com.ohgiraffers.funcemailcheck;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmailMapper {
    void regist(USERDTO userdto);
}
