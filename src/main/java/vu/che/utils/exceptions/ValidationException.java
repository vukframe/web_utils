package vu.che.utils.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vu.che.utils.web.Message;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ValidationException extends RuntimeException {
    private static final long serialVersionUID = -3228944295086608920L;

    private List<Message> messages;

    public ValidationException(Message message) {
        super("Validation exception");
        this.messages = Collections.singletonList(message);
    }
}
