package learning.java.course.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import learning.java.course.entities.User;
import learning.java.course.repositories.UserRepository;
import learning.java.course.services.exceptions.DataBaseException;
import learning.java.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		try {
		User entity = findById(id);
		updateDate(entity, obj);
		return repository.save(entity);
		} 
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getName());
		entity.setPhone(obj.getPhone());		
	}
}
