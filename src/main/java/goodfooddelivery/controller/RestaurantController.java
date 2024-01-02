package goodfooddelivery.controller;

import goodfooddelivery.dto.request.RestaurantCreateRequestDTO;
import goodfooddelivery.dto.response.RestaurantResponseDTO;
import goodfooddelivery.interfaces.IRestaurantService;
import goodfooddelivery.mapper.RestaurantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private IRestaurantService service;

    @PostMapping("/create")
    public ResponseEntity<String> postRestaurant(@RequestBody RestaurantCreateRequestDTO restaurant) {
        try {
            service.saveRestaurant(RestaurantMapper.INSTANCE.toRestaurant(restaurant));

            return new ResponseEntity<>("New Restaurant was created", HttpStatus.CREATED);
        }
        catch(IllegalArgumentException e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<RestaurantResponseDTO> getRestaurant(@PathVariable(value = "id") Long id) {
        RestaurantResponseDTO restaurant = RestaurantMapper.INSTANCE.toRestaurantResponseDTO(service.getRestaurant(id));

        if(restaurant != null) {
            return ResponseEntity.ok().body(restaurant);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

}
