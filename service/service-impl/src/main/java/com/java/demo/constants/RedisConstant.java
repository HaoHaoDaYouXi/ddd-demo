package com.java.demo.constants;

/**
 * RedisConstant
 * redis 常量参数 统一管理 不要出现重复的
 * @author TONE
 * @date 2022/3/1
 */
public class RedisConstant {
    /**
     * 所有Key的统一前缀 使用 项目名
     * (方便管理和查询)
     */
    public static final String ALL_PREFIX = "demo";
    /**
     * 限制时间
     */
    public static final Integer ONE_MINUTE_BY_MILLISECOND = 1000*60;
    public static final Integer THIRTY_BY_MINUTES = 30;
    public static final Integer EIGHT_DAY_BY_MINUTES = 60*24*8;
    public static final Integer FIVE_BY_MINUTES = 5;
    /**
     * token 过期时间
     */
    public static final Integer SEVEN_DAY_BY_HOUR = 24*7;



}
