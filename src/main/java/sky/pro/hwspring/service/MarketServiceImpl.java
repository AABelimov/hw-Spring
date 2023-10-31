package sky.pro.hwspring.service;

import org.springframework.stereotype.Service;
import sky.pro.hwspring.repository.Basket;
import sky.pro.hwspring.component.Item;

import java.util.Map;

@Service
public class MarketServiceImpl implements MarketService{
    private final Basket basket;

    public MarketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String add(int[] id) {
        return basket.add(id);
    }

    @Override
    public Map<Item, Integer> get() {
        return basket.get();
    }
}
