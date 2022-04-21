package com.itheibai.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
@EnableWebMvc  // 不写会报错，也可以写在启动类上
public class SwaggerConfig {
    @Bean
    public Docket docket(Environment environment) {
        //设置要显示swagger的环境
        Profiles of = Profiles.of("dev","test");
        //判断当前是否处于该环境
        //通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .enable(b) //配置是否启用Swagger，如果是false,在浏览器将无法访问
                .groupName("itheibai") //配置分组名称
                .select() //通过.select()方法，去配置扫描接口，RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.itheibai.user.sys.controller"))
                //配置如何通过path过滤，即这里只扫描请求以/itheibai开头的接口
                .paths(PathSelectors.ant("/**"))
                .build();
    }

//    @Bean
//    public Docket docket1() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("分组1");
//    }
//    @Bean
//    public Docket docket2() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("分组2");
//    }
//    @Bean
//    public Docket docket3() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("分组3");
//    }



    //配置文档信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("itheibai", "https://www.itheibai.com", "itheibai@qq.com");
        return new ApiInfo(
                "Swagger学习",
                "学习如何配置Swagger",
                "v1.0",
                "http://terms.service.url/组织链接", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可 "许可链接",
                "http://www.apache.org/licenses/LICENSE-2.0",// 许可连接
                new ArrayList<>()// 扩展
        );
    }
}
