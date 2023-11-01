package goodfooddelivery.dto.response;

import lombok.Data;

@Data
public class RestaurantResponseDTO {

    private Long restaurantId;
    private String name;
    private String description;

    public RestaurantResponseDTO()
    {
    }

    public RestaurantResponseDTO(Long restaurantId, String name, String description)
    {
        this.restaurantId = restaurantId;
        this.name = name;
        this.description = description;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
