package sky.pro.hwspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.hwspring.component.Item;
import sky.pro.hwspring.service.MarketServiceImpl;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class MarketController {
    private final MarketServiceImpl marketService;

    public MarketController(MarketServiceImpl marketService) {
        this.marketService = marketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam int... id) {
        return marketService.add(id);
    }

    @GetMapping("/get")
    public Map<Item, Integer> get() {
        return marketService.get();
    }
}
