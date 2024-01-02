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
    RestaurantRepository repository;

    public Restaurant getRestaurant(Long id)
    {
        Optional<Restaurant> optionalRestaurant= repository.findById(id);

        if(optionalRestaurant.isPresent()) {
            return optionalRestaurant.get();
        }
        else
        {
            return null;
        }
    }

    public void saveRestaurant(Restaurant restaurant)
    {
        if (restaurant == null) {
            throw new IllegalArgumentException("Restaurant object cannot be null");
        }

        try {
            repository.save(restaurant);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save the restaurant", e);
        }
    }


}
