package goodfooddelivery.service;

import goodfooddelivery.interfaces.IRestaurantService;
import goodfooddelivery.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import goodfooddelivery.repository.RestaurantRepository;

import java.util.Optional;

@Service
public class RestaurantService implements IRestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    public Restaurant getRestaurant(Long id)
    {
        Optional<Restaurant> optionalRestaurant= restaurantRepository.findById(id);

        if(optionalRestaurant.isPresent()) {
            return optionalRestaurant.get();
        }
        else
        {
            return null;
        }
    }


}
