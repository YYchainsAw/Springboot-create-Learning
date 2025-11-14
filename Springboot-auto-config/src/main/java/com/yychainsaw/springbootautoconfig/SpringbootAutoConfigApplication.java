package com.yychainsaw.springbootautoconfig;

import com.yychainsaw.anno.EableCommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EableCommonConfig
public class SpringbootAutoConfigApplication
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(SpringbootAutoConfigApplication.class, args);

        System.out.println(context.getBean("dispatcherServlet"));
        System.out.println(context.getBean("province"));
    }
}
