package learning.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.java.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
