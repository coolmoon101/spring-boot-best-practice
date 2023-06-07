package cn.javastack.springboot.test.demo;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Resource
    private ConfigMember configMember;
    public ConfigMember getConfigMember() {
        return configMember;
    }
}
