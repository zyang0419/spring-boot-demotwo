package com.baichou.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RestController;



//表示启用spring-boot默认配置　spring-boot根据pom中的依赖jar包进行默认配置。
// 其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
// 等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
//SpringBoot项目的Bean装配默认规则是根据Application类所在的包位置从上往下扫描
//使用scanBasePackages属性进行指定要扫描的包以及要扫描的类
@SpringBootApplication(scanBasePackages = {
        "com.baichou"
})
@RestController  //等价于@Controller 和 @ResponseBody
@ServletComponentScan//这个就是扫描相应的Servlet包;
//@Import(value={SpringUtil.class}) //引入不在APP包以及子包中的类，或者未交给spring容器管理的类.或者通过@Bean注入
public class App {

     public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(App.class,args);

//        ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        SpringApplication app = new SpringApplication(App.class);
//        app.run(args);
//        SpringApplication.run("classpath:/META-INF/application-context.xml",args);

    }


}
