package servelet_jsp_McDonalds_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int i_id;
	private String i_name;
	private String i_desc;
	private double i_price;
	private String i_offer;
	private int i_quantity;
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public String getI_desc() {
		return i_desc;
	}
	public void setI_desc(String i_desc) {
		this.i_desc = i_desc;
	}
	public double getI_price() {
		return i_price;
	}
	public void setI_price(double i_price) {
		this.i_price = i_price;
	}
	public String getI_offer() {
		return i_offer;
	}
	public void setI_offer(String i_offer) {
		this.i_offer = i_offer;
	}
	public int getI_quantity() {
		return i_quantity;
	}
	public void setI_quantity(int i_quantity) {
		this.i_quantity = i_quantity;
	}
	@Override
	public String toString() {
		return "Items [i_id=" + i_id + ", i_name=" + i_name + ", i_desc=" + i_desc + ", i_price=" + i_price
				+ ", i_offer=" + i_offer + ", i_quantity=" + i_quantity + "]";
	}
	
}
