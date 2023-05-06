package com.royal.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Login {
	
	@NotNull(message = "Mobile is required")
	private String mobileNo;
	
	@NotNull(message = "Password is required")
	private String password;

}

/*
 

 package com.royal.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Entity means I marked Signup class as a Entity Class like Pojo Class but not pojo class.
//Data is a part of Lombok they will provide setter and getter methods
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Signup {
	
	//Id means Primary Key. here I marked id as a primary key and I will Generated Automatically.
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	@NotNull(message = "Name is required")
	private String name;
	
	@Embedded
	@NotNull(message = "Address is required")
    private Address address;
	
	//Note: You could not mensed ke take mobile no but I will take that if you want you can remove.
	//The Main Pourpose to using mobile no. user can login using both / any one.
	@Size(max = 10,min = 10)
	@Column(unique = true)
	@NotNull(message = "Mobile is required")
	private String mobileNo;
	
	
	@Email(message="Enter your Email properly")
	@NotNull(message = "Email is required")
	private String email;
	
	//Temporal data stored in a Java Date or Calendar object.
	//@Temporal(TemporalType.DATE) Not Required but if you want you can use
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    
    //@Column(name = "user_name") Not Required MySql will take default column name as userName.
    @NotBlank(message = "UserName is required")
    private String userName;
	
	@NotNull(message = "Password is required")
	private String password;
	

}
 
  */
