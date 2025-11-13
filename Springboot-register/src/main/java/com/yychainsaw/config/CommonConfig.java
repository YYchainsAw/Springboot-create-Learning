package com.yychainsaw.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    @Bean
    public Country country(){
        return new Country();
    }

    //对象默认的名字是方法名
    //如果方法的内部需要使用到ioc容器中已经存在的bean对象，那么只需要在方法上声明即可，spring会自动地注入
    @Bean("aa")
    public Province province(){
        return new Province();
    }
}
