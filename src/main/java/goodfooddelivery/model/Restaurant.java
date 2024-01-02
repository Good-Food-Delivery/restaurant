package goodfooddelivery.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Restaurant")
@Data
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RestaurantID")
    private Long restaurantId;
    @Column(name = "UserAuthID")
    private Long userAuthId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description", columnDefinition = "text")
    private String description;
    @Column(name = "Address")
    private String address;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "City")
    private String city;
    @Column(name = "PhoneNumber")
    private String phoneNumber;

}

