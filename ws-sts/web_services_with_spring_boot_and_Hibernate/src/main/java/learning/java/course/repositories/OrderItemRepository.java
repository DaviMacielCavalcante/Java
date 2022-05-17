package learning.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.java.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
