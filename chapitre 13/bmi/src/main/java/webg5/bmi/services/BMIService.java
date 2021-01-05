package webg5.bmi.services;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Service;

@Service
public class BMIService {
	
	public double computeBMI(int lengthCM, int weight) throws IllegalArgumentException {
		if(lengthCM == 0) {
			throw new IllegalArgumentException("Length cannot be null");
		}

		final double lengthM = lengthCM / 100.0;
		final double bmi = weight / (lengthM * lengthM);
		return new BigDecimal(bmi).round(new MathContext(4)).doubleValue();
	}

	public String computeCategory(double bmi, String gender) {
		if(gender.equals("female")) {
			++bmi;
		}
		if (bmi < 16.5) {
			return "famine";
		}
		if (bmi < 18.5) {
			return "maigreur";
		}
		if (bmi < 25) {
			return "corpulence normale";
		}
		if (bmi < 30) {
			return "surpoids";
		}
		if (bmi < 35) {
			return "obésité modérée";
		}
		if (bmi < 40) {
			return "obésité sévère";
		}
		return "obésité morbide";
	}

}
