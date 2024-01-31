package sunbase.customerManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long Id;
     private String first_name;
     private String last_name;
     private String street;
     private String address;
     private String city;
     private String state;
     @Email
     private String email;
     private String phone;
}
