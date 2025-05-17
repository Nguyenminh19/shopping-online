package org.roninhub.shopping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Generates getters, setters, toString, equals, and hashCode methods.
@NoArgsConstructor // Generatess a no-args constructor.
@AllArgsConstructor // Generates a constructor with all arguments.
@Builder // Generates a builder pattern for creating instances.
public class User {
	
	@Id // Specifies the primary key of the entity.
	@GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the primary key value.
	private Integer id;
	private String email;
	@JsonIgnore
	private String password;
	private String fullname;
	private String status;
	private String role;
}
