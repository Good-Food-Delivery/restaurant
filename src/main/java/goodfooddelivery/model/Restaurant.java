package goodfooddelivery.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Restaurant")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RestaurantID")
    private Long restaurantId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description", columnDefinition = "text")
    private String description;
}

