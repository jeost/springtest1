package WEBSITENAME.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

    @GetMapping("/") // @GetMapping : URL 매핑 어노테이션 [ 클라이언트가 요청한 URL 이랑 연결
    public String Index(Model model){ // main 문자열을 반환하는 메소드...가 아니라 파일명을 반환시켜줌(어노테이션)
        model.addAttribute("data","java데이터");
        return "main"; // html 파일명 넣기
        //클라이언트가 localhost:8080 요청시 spring 에 SpringBoot controller 내에서 매핑 URL 찾기
        //찾은 매핑된 메소드가 실행되면서 html 파일명 반환
    }
    @GetMapping("/getdata") // getdata로 경로 매핑
    @ResponseBody // 응답객체
    public String getdata(){
        return "java데이터";
    }
}
