package com.xworkz.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.constants.MatchBox;

public class MatchBoxDTO implements Serializable {
	private String brand;
	private int cost;
	private MatchBox matchBox;

	public MatchBoxDTO() {
		System.out.println("created MatchBox with no Args");
	}

	public MatchBoxDTO(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "MatchBoxDTO [brand=" + brand + ", cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, cost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatchBoxDTO other = (MatchBoxDTO) obj;
		return Objects.equals(brand, other.brand) && cost == other.cost;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
