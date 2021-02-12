# 실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발

- SpringBoot 2.4.2
- JDK 11
- DB H2 1.4.200
    - http://www.h2database.com/html/download.html

## 1. 프로젝트 환경설정

- 데이터베이스 파일 생성 방법
    - `jdbc:h2:~/jpashop` (최소 한번)
    - `~/jpashop.mv.db` 파일 생성 확인
    - 이후 부터는 `jdbc:h2:tcp://localhost/~/jpashop` 이렇게 접속
