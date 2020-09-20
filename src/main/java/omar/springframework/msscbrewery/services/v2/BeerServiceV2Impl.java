package omar.springframework.msscbrewery.services.v2;

import lombok.extern.slf4j.Slf4j;
import omar.springframework.msscbrewery.web.model.BeerDto;
import omar.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import omar.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).beerName("CruzCampo").beerStyle(BeerStyleEnum.ALE).build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
