package jpabook.jpashop.web;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by KMS on 2021/02/13.
 */
@Getter @Setter
public class BookForm {
    
    private Long id;
    
    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;
    
}
