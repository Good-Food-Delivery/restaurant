package goodfooddelivery.controller;

import goodfooddelivery.dto.response.RestaurantResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/")
public class RestaurantController {

    @GetMapping("/get/{id}")
    public ResponseEntity<RestaurantResponseDTO> getVideo(@PathVariable(value = "id") Long id) {
        //RestaurantResponseDTO restaurant = VideoMapper.INSTANCE.toVideoResponseDTO(videoService.getVideo(id));

//        if(restaurant != null) {
//            return ResponseEntity.ok().body(restaurant);
//        }
//        else
//        {
//            return ResponseEntity.notFound().build();
//        }
        return null;
    }

}
