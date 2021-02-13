package jpabook.jpashop.web;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderSearch;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.service.ItemService;
import jpabook.jpashop.service.MemberService;
import jpabook.jpashop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 주문 컨트롤러
 * Created by KMS on 2021/02/13.
 */
@Controller
@RequiredArgsConstructor
public class OrderController {
    
    private final OrderService orderService;
    private final MemberService memberService;
    private final ItemService itemService;
    
    @GetMapping(value = "/order")
    public String createForm(Model model) {
        
        List<Member> members = memberService.findMembers();
        List<Item> items = itemService.findItems();
        
        model.addAttribute("members", members);
        model.addAttribute("items", items);
        
        return "order/orderForm";
    }
    
    /**
     * 상품 주문
     * @param memberId
     * @param itemId
     * @param count
     * @return
     */
    @PostMapping(value = "/order")
    public String order(@RequestParam("memberId") Long memberId,
                        @RequestParam("itemId") Long itemId,
                        @RequestParam("count") int count) {
        
        orderService.order(memberId, itemId, count);
        return "redirect:/orders";
    }
    
    /**
     * 주문 목록 검색, 취소
     * @param orderSearch
     * @param model
     * @return
     */
    @GetMapping(value = "/orders")
    public String orderList(@ModelAttribute("orderSearch") OrderSearch orderSearch, Model model) {
        
        List<Order> orders = orderService.findOrders(orderSearch);
        model.addAttribute("orders", orders);
        
        return "order/orderList";
    }
    
    /**
     * 주문 취소
     * @param orderId
     * @return
     */
    @PostMapping(value = "/orders/{orderId}/cancel")
    public String cancelOrder(@PathVariable("orderId") Long orderId) {
        
        orderService.cancelOrder(orderId);
        
        return "redirect:/orders";
    }
}
