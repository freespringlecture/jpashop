package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by KMS on 2021/02/12.
 */
@Entity
@DiscriminatorValue("M")
@Getter @Setter
public class Movie extends Item {
    
    private String director;
    private String actor;
}
