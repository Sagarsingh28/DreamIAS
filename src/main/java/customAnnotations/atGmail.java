package customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface atGmail {
	public String value() default "@gmail.com";
	public String message() default "Must have @gmail.com";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
