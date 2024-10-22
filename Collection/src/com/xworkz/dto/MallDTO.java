package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MallDTO implements Serializable {

	private int id;
	private String name;
	private Location location; // Enum for location
	private String owner;
	private double landDimension;

	public enum Location {
		Sujata_Theatre, Mahadevpura, Sampige_Rd, Rajaji_Nagar, RR_Nagar, Vittal_Mallya_Road, Whitefield,
		Meenakshi_Temple, Pattandur_Agrahara, Magrath_Road;
	}
}
