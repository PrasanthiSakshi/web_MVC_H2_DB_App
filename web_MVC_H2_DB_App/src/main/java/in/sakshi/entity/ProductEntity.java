package in.sakshi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data


public class ProductEntity {
	
	
	@Id
	@GeneratedValue
	private Integer pid;
	private String name;
	private Double Price;
	private Integer Quantity;

}
