package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 상품 서비스
 * Created by KMS on 2021/02/13.
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {
    
    private final ItemRepository itemRepository;
    
    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }
    
    /**
     * 변경 검지 상품 수정
     * @param itemId
     * @param name
     * @param price
     * @param stockQuantity
     * @return
     */
    @Transactional
    public Item updateItem(Long itemId, String name, int price, int stockQuantity) { //param: 파리미터로 넘어온 준영속 상태의 엔티티
        Item findItem = itemRepository.findOne(itemId); //같은 엔티티를 조회한다
        // findItem.change(price, name, stockQuantity); // set으로 변경하지 말고 메서드로 역추적 가능하게 설계하기를 권장
        findItem.setName(name);
        findItem.setPrice(price);
        findItem.setStockQuantity(stockQuantity); //데이터를 수정한다
        return findItem;
    }
    
    /**
     * 상품 전체 조회
     * @return
     */
    public List<Item> findItems() {
        return itemRepository.findAll();
    }
    
    /**
     * 상품 조회
     * @param itemId
     * @return
     */
    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
    
}
