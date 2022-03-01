package com.java.ddd.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author lenovo
 */
@Slf4j
@Configuration
public class HealthJob {
    /**
     * 项目名称
     */
    @Value("${spring.application.name:job}")
    private String applicationName;


    /**
     * 测试定时任务是否正常
     * @param str
     * @return
     */
    @XxlJob(value = "job_health")
    public ReturnT<String> checkScheduled(String str){
        log.info("测试<"+applicationName+">定时任务是否正常...");
        log.info("测试<"+applicationName+">定时任务是否正常结束");
        return ReturnT.SUCCESS;
    }

}
