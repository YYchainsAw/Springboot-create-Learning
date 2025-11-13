package com.yychainsaw.springbootregister;

import cn.itcast.pojo.Country;
import com.yychainsaw.config.CommonConfig;
import com.yychainsaw.config.CommonImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import(CommonImportSelector.class)
public class SpringbootRegisterApplication
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class, args);

        Country country = context.getBean(Country.class);
        System.out.println(country);

        System.out.println(context.getBean("aa"));
    }


}
