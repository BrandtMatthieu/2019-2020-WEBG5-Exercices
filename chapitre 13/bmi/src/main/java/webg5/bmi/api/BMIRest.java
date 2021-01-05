package webg5.bmi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

import lombok.extern.slf4j.Slf4j;
import webg5.bmi.api.model.BMIResponse;
import webg5.bmi.services.BMIService;


@RestController
@RequestMapping(path = "/api", produces = "application/json")
@Slf4j
public class BMIRest {
	
	@Autowired
	BMIService bmiService;

	@GetMapping(value = "/bmi", produces = "application/json")
	public BMIResponse bmi(
		@RequestParam(name = "length") @Min(value = 1, message = "La taille doit être au moins d'un centimètre.") int length,
		@RequestParam(name = "weight") @Min(value = 1, message = "Le poids doit être au moins d'un kilogramme") int weight,
		@RequestParam(name = "gender") String gender) {
			log.info("REST: computed BMI");
			double bmi = bmiService.computeBMI(length, weight);
			String corpulence = bmiService.computeCategory(bmi, gender);
			return new BMIResponse(bmi, corpulence);
	}

}
