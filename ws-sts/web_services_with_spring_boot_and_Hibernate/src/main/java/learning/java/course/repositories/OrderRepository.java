package learning.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.java.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
