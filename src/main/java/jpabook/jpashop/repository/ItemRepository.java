package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * 상품 레파지토리
 * Created by KMS on 2021/02/13.
 */
@Repository
@RequiredArgsConstructor
public class ItemRepository {
    
    private final EntityManager em;
    
    public void save(Item item) { //item: 파리미터로 넘어온 준영속 상태의 엔티티
        if (item.getId() == null) {
            em.persist(item); //등록
        } else {
            // 전체 Entity 값들을 확인해 누락된 값은 null 로 업데이트 해버리는 문제가 있음
            // merge는 사용 안하는 것을 권장하고 변경 감지로 수정하는 것을 권장
            em.merge(item); //강제 업데이트
        }
    }
    
    public Item findOne(Long id) {
        return em.find(Item.class, id);
    }
    
    public List<Item> findAll() {
        return em.createQuery("select i from Item i",Item.class)
                .getResultList();
    }
}
