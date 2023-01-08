package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }
//  매개변수가 없는 GET 메서드
    @GetMapping(value = "/name")
    public String getName(){
        return "Flature";
    }
//   @PathVariable 을 활용한 GET 메서드
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

//    쿼리스트링에 어떤 값이 들어올지 모를떄 map 객체
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + ":" + map.getValue() + "\n");
        });
        return  sb.toString();
    }


}
