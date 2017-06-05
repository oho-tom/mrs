package mrs.app.reservation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = { EndTimeMustBeAfterStartTimeValidator.class })
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface EndTimeMustBeAfterStartTime {
	String message() default "{mrs.app.reservation.EndTimeMustBeAfterStartTime.message}";

	Class<?>[]groups() default {};

	Class<? extends Payload>[]payload() default {};

	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	public @interface List {
		EndTimeMustBeAfterStartTime[]value();
	}
}
