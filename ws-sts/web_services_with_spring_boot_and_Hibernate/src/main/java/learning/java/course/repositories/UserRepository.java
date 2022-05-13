package learning.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.java.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
