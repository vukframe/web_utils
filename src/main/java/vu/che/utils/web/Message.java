package vu.che.utils.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Message implements Serializable {

    private static final long serialVersionUID = 7174826549591706108L;
    private String code;
    private Object value;
}
