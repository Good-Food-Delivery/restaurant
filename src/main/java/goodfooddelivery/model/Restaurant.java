package goodfooddelivery.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Restaurant")
@Data
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RestaurantID")
    private Long restaurantId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description", columnDefinition = "text")
    private String description;


    public Restaurant(){}

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

