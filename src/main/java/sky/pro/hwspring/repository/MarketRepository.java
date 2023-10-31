package sky.pro.hwspring.repository;

import org.springframework.stereotype.Repository;
import sky.pro.hwspring.component.Item;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MarketRepository {
    private final Map<Integer, Item> items = new HashMap<>(Map.of(
            Item.getNextId(), new Item("nails"),
            Item.getNextId(), new Item("hammer"),
            Item.getNextId(), new Item("axe")
    ));

    public Item getItem(int id) {
        return items.get(id);
    }
}
