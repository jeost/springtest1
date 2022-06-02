package WEBSITENAME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링부트를 실행할때 필요한 설정 세팅
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class);
        // SpringApplication : 스프링 어플리케이션 스타트
         // SpringApplication.run(현재클래스명.class) : 스프링 어플리케이션
    }
}

// SpringBoot 패키지 구성 규칙
 // src->main->java
 // 최상단(root) 패키지 [ 홈페이지 명 ] 필수
 // SpringBoot 시작 클래스는 최상단(root) 패키지 바로 아래에 존재해야함
 // 컨트롤, 서비스, DTO 폴더, DAO 폴더 구성

// @: 어노테이션
 // @ vs extend vs implement
 // 1. extend : 하나의 클래스로부터 클래스 메모리를 받아오기
 // 2. implement : 여러개의 인터페이스를 구현
 // 3. @: 해당 클래스에 메타데이터[프로그램]을 주입

//어노테이션
 // 1. @SpringBootApplication : 스프링부트 실행 설정 어노테이션
  // 1. 스프링부트를 실행할때 필요한 기본 설정값 세팅
  // 2. 내장서버(톰캣)랑 클래스를 연결
   // 내장서버는 기본 포트번호 8080
   // 변경 : src -> main -> resources -> application.properties 파일
    // server.port : 포트번호

//클래스
 // 1. SprimgApplication.run(Webstart.class) : 스프링 어플리케이션 실행

//프론트엔드(html, js, css 등) 패키지
 // src -> main -> resources ->
  // -> static : js, css, img 파일 등
  // -> templates : html 파일 등