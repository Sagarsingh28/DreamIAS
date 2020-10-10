package customAnnotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<atGmail, String>{

	private String suffix;
	
	@Override
	public void initialize(atGmail constraintAnnotation) {
		suffix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value!=null) {
			return value.endsWith(suffix);
		}else {
			return true;
		}
	}
}
