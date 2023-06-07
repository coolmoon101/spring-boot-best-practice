package cn.javastack.springboot.test.demo;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api")
public class DemoController {

    @Resource
    private MemberService memberService;


    @GetMapping("/getConfigMember")
    public ConfigMember getConfigMember() {
        return memberService.getConfigMember();
    }

}
