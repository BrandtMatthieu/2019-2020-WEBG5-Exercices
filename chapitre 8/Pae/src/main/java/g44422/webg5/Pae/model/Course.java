package g44422.webg5.Pae.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class Course {
	@NotNull(message = "Le cours doit avoir un sigle.")
	@NotBlank(message = "Le sigle ne doit pas être vide.")
	@Size(min = 4, message = "Le sigle doit faire au moins 4 caractères.")
	@Size(max = 10, message = "Le sigle doit faire au plus 10 caractères.")
	@Pattern(regexp = "[A-Z][A-Z]{2,8}[0-9]", message = "Le sigle doit respecter le format standard.")
	public final String id;

	@NotNull(message = "Le cours doit avoir un titre.")
	@NotBlank(message = "Le titre ne doit pas être vide.")
	@Size(min = 4, message = "Le titre doit faire au moins 4 caractères.")
	@Size(max = 50, message = "Le titre doit faire au plus 50 caractères.")
	@Pattern(regexp = "[A-Z][a-z ]{2,47} [0-5]", message = "Le sigle doit respecter le format standard.")
	public final String label;

	@NotNull(message = "Le cours doit avoir un nombre de crédits.")
	@Min(value = 1, message = "Le nombre de crédit doit être d'au minimum 1.")
	@Max(value = 30, message = "Le nombre de crédit doit être d'au maximum 30.")
	public final int ects;
}
