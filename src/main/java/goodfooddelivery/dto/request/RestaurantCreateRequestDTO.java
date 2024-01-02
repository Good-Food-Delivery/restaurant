package goodfooddelivery.dto.request;

import lombok.Data;

@Data
public class RestaurantCreateRequestDTO {

    private String name;
    private String description;
    private String address;
    private String postalCode;
    private String city;
    private String phoneNumber;

}
