package cn.javastack.springboot.test.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "member")
public class ConfigMember {
    private String name;
    private String address;
    private int age;
}
