package hz.spring.brewry.web.service;


import hz.spring.brewry.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDTO);

    void update(UUID beerId, BeerDTO beerDTO);

    void deleteById(UUID beerId);
}
