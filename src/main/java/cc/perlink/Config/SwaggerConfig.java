package cc.perlink.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

// UI 访问界面 /swagger-ui.html

/**
 * Swagger2 配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 扫描接口
                .select()
                .apis(RequestHandlerSelectors.basePackage("cc.perlink.Controller"))
                .build();
    }


    private ApiInfo apiInfo() {
        // 作者信息
        Contact contact = new Contact("黑退欧巴桑", "http://perlink.cc", "669059163@qq.com");

        return new ApiInfo(
                "Blog接口",
                "接口信息一览",
                "v1.0",
                "",
                contact,
                "",
                "",
                new ArrayList<>()
        );
    }
}
