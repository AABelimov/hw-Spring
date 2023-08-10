package sky.pro.hwspring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.hwspring.component.Item;
import sky.pro.hwspring.service.MarketRepositoryServiceImpl;

import java.util.HashMap;
import java.util.Map;

@Repository
@SessionScope
public class Basket {
    MarketRepositoryServiceImpl marketRepositoryService;
    private final Map<Item, Integer> basket = new HashMap<>();

    public Basket(MarketRepositoryServiceImpl marketRepositoryService) {
        this.marketRepositoryService = marketRepositoryService;
    }

    public String add(int[] id) {
        int legal = 0;
        int illegal = 0;
        for (int i : id) {
            if (i < Item.getNextId()) {
                Item item = marketRepositoryService.getItem(i);
                if (basket.containsKey(item)) {
                    int count = basket.get(item) + 1;
                    basket.put(item, count);
                } else {
                    basket.put(item, 1);
                }
                legal++;
            }else {
                illegal++;
            }
        }
        return String.format("%d added, %d illegal id", legal, illegal);
    }

    public Map<Item, Integer> get() {
        return basket;
    }
}
