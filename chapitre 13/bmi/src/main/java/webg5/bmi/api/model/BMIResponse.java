package webg5.bmi.api.model;

import lombok.Value;

@Value
public class BMIResponse {
	private double bmi;
	private String corpulence;
}
