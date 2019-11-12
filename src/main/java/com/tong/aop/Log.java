package com.tong.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 日志服务
 *
 * @author tongl
 */
@Component
@ComponentScan(basePackages = {"com.fiberhome"})
@Aspect
@EnableAspectJAutoProxy
public class Log {
    Logger logger = LoggerFactory.getLogger(Log.class);

    /**
     * 配置后置通知：新增/修改用户打印日志
     */
    @AfterReturning("execution(* com.tong.service.*.saveUser(..))")
    public void addLog() {
        logger.info("添加/修改用户操作-日志记录");
    }

    /**
     * 配置后置通知：删除用户打印日志
     */
    @AfterReturning("execution(* com.tong.service.*.deleteUser(..))")
    public void deleteLog() {
        logger.info("删除用户操作-日志记录");
    }
}
