package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 주문 검색
 * Created by KMS on 2021/02/13.
 */
@Getter @Setter
public class OrderSearch {
    
    private String memberName;      //회원 이름
    private OrderStatus orderStatus;//주문 상태[ORDER, CANCEL]
}