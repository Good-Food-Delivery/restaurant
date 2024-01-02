package goodfooddelivery.mapper;
import goodfooddelivery.dto.request.RestaurantCreateRequestDTO;
import goodfooddelivery.dto.response.RestaurantResponseDTO;
import goodfooddelivery.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    RestaurantResponseDTO toRestaurantResponseDTO(Restaurant restaurant);
    Restaurant toRestaurant(RestaurantCreateRequestDTO restaurantCreateRequestDTO);

}

