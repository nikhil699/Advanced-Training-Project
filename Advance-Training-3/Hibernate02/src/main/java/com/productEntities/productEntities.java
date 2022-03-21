package com.productEntities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class productEntities 
{
	
	@Id
	String Id;
	String Name;
	double Price;
	int Quantity;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public productEntities(){
		super();
		this.Id = Id;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
	}
	
	
	
	
}
