package sky.pro.hwspring.service;

import sky.pro.hwspring.component.Item;

import java.util.Map;

public interface MarketService {
    String add(int id);

    Map<Item, Integer> get();
}
