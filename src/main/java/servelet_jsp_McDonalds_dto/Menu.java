package servelet_jsp_McDonalds_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int m_id;
	private String m_name;
	private String m_desc;
	private double m_price;
	private String m_offer;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_desc() {
		return m_desc;
	}
	public void setM_desc(String m_desc) {
		this.m_desc = m_desc;
	}
	public double getM_price() {
		return m_price;
	}
	public void setM_price(double m_price) {
		this.m_price = m_price;
	}
	public String getM_offer() {
		return m_offer;
	}
	public void setM_offer(String m_offer) {
		this.m_offer = m_offer;
	}
	@Override
	public String toString() {
		return "Menu [m_id=" + m_id + ", m_name=" + m_name + ", m_desc=" + m_desc + ", m_price=" + m_price
				+ ", m_offer=" + m_offer + "]";
	}
	
}
	