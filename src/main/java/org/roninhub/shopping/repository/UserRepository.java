package org.roninhub.shopping.repository;

import org.springframework.stereotype.Repository;
import org.roninhub.shopping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface  UserRepository extends JpaRepository<User, Integer>{

	User findById(int id);
	
	User findByUsername(String username);
}
