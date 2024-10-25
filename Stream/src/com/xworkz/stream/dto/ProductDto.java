package com.xworkz.stream.dto;

import java.io.Serializable;
import java.util.Comparator;

public class ProductDto implements Serializable, Comparable<ProductDto> {
	private int id;
	private String name;
	private String vendor;
	private double cost;

	public ProductDto() {

	}

	public ProductDto(int id, String name, String vendor, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDto other = (ProductDto) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", vendor=" + vendor + ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(ProductDto o) {
		// TODO Auto-generated method stub
		return Double.compare(this.cost, o.cost);
	}

}
