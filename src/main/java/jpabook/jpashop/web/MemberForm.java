package jpabook.jpashop.web;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 회원 등록 폼 객체
 * Created by KMS on 2021/02/13.
 */
@Getter @Setter
public class MemberForm {
    
    @NotEmpty(message = "회원 이름은 필수 입니다")
    private String name;
    
    private String city;
    private String street;
    private String zipcode;
    
}