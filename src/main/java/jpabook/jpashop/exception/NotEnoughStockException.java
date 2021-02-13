package jpabook.jpashop.exception;

/**
 * 상품 수량 부족 예외처리
 * Created by KMS on 2021/02/13.
 */
public class NotEnoughStockException extends RuntimeException {
    
    public NotEnoughStockException() {
        super();
    }
    
    public NotEnoughStockException(String message) {
        super(message);
    }
    
    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }
    
}
