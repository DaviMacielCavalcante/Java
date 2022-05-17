package learning.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.java.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
