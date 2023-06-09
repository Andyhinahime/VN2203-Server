package cn.tedu.jsdvn2203.csmall.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDateTime;
import java.util.Date;

@Configuration
public class BeanConfig {

    @Bean
    public Date date() {
        System.out.println("BeanConfig.data()");
        return new Date();
    }
    @Bean
    public LocalDateTime dateTime(){
        LocalDateTime nowTime = LocalDateTime.now();
        return nowTime;
    }
/*    @Bean
    public Date date(){
        Date date = new Date();
        System.out.println("當前時間:"+date);
        return date;
    }*/

}
