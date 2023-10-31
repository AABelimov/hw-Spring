package sky.pro.hwspring.service;

import org.springframework.stereotype.Service;
import sky.pro.hwspring.component.Item;
import sky.pro.hwspring.repository.MarketRepository;

@Service
public class MarketRepositoryServiceImpl implements MarketRepositoryService{
    private final MarketRepository marketRepository;

    public MarketRepositoryServiceImpl(MarketRepository marketRepository) {
        this.marketRepository = marketRepository;
    }
    @Override
    public Item getItem(int id) {
        return marketRepository.getItem(id);
    }
}
