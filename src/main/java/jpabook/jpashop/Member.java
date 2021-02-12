package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by KMS on 2021/02/12.
 */
@Entity
@Getter @Setter
public class Member {
    
    @Id @GeneratedValue
    private Long id;
    private String username;
}
