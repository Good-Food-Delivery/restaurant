package goodfooddelivery.repository;
import goodfooddelivery.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    Restaurant getRestaurantByRestaurantId(Long id);

}
