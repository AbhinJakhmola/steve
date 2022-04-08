package de.rwth.idsg.steve.web.validation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;

import de.rwth.idsg.steve.NotificationFeature;
import de.rwth.idsg.steve.repository.dto.WebhookSettings;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD})
@Retention(RUNTIME)

public @interface WebhookCollection {
    String message() default "Webhook not valid";
    
    // Required by validation runtime
    Class<?>[] groups() default {};
    
    // Required by validation runtime
    Class<? extends Payload>[] payload() default {};    
}
