package com.yychainsaw.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    //如果配置文件中包含country.name和country.system这两个属性，那么这个bean才会被创建
    @ConditionalOnProperty(prefix = "country",name = {"name", "system"})
    @Bean
    public Country country(@Value("${country.name}") String name,@Value("${country.system}") String system){
        Country country = new Country();

        country.setName(name);
        country.setSystem(system);

        return country;
    }

    //对象默认的名字是方法名
    //如果方法的内部需要使用到ioc容器中已经存在的bean对象，那么只需要在方法上声明即可，spring会自动地注入

    //如果ioc容器中没有名字为aa的bean，那么这个bean才会被创建
    //@ConditionalOnMissingBean(Country.class)
    //@Bean("aa")
    @Bean
    //如果当前环境引入了web起步依赖，则环境中有DispatcherServlet，否则没有
    @ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
    public Province province(){
        return new Province();
    }
}
