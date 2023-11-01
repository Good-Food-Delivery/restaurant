package goodfooddelivery.controller;

import goodfooddelivery.dto.response.RestaurantResponseDTO;
import goodfooddelivery.interfaces.IRestaurantService;
import goodfooddelivery.mapper.RestaurantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private IRestaurantService restaurantService;

    @GetMapping("/get/{id}")
    public ResponseEntity<RestaurantResponseDTO> getRestaurant(@PathVariable(value = "id") Long id) {
        RestaurantResponseDTO restaurant = RestaurantMapper.INSTANCE.toVideoResponseDTO(restaurantService.getRestaurant(id));

        if(restaurant != null) {
            return ResponseEntity.ok().body(restaurant);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

}
