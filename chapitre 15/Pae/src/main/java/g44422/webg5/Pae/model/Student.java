package g44422.webg5.Pae.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private int id;

	@NotNull(message = "Le cours doit avoir un titre.")
	@NotBlank(message = "Le titre ne doit pas être vide.")
	@Size(min = 1, message = "Le nom doit faire au moins 1 caractère.")
	@Size(max = 50, message = "Le nom doit faire au plus 50 caractères.")
	private String lastName;

	@NotNull(message = "Le cours doit avoir un titre.")
	@NotBlank(message = "Le titre ne doit pas être vide.")
	private Gender gender;

	@NotNull
	@NotBlank
	private Section sectionction;
}
