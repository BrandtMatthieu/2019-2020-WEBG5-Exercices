package webg5.bmi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.extern.slf4j.Slf4j;
import webg5.bmi.services.BMIService;


@RestController
@RequestMapping(path = "/api", produces = "text/html")
@Validated
@Slf4j
public class BMIRest {
	
	@Autowired
	BMIService bmiService;

	@GetMapping(value = "/bmi", produces = "text/html")
	public ModelAndView bmi(Model model,
		@RequestParam(name = "length") @Min(value = 1, message = "La taille doit être au moins d'un centimètre.") int length,
		@RequestParam(name = "weight") @Min(value = 1, message = "Le poids doit être au moins d'un kilogramme") int weight,
		@RequestParam(name = "gender") String gender) {
			log.info("REST: computed BMI");
			double bmi = bmiService.computeBMI(length, weight);
			String corpulence = bmiService.computeCategory(bmi, gender);
			model.addAttribute("bmi", bmi);
			model.addAttribute("corpulence", corpulence);
			return new ModelAndView("report::content");
	}

}
