package ZCW.Api.Practice.Hearthstone.services;

import ZCW.Api.Practice.Hearthstone.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private CardRepository repo;

    @Autowired
    public CardService(CardRepository repo) {
        this.repo = repo;
    }
}
