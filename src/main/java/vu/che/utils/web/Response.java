package vu.che.utils.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private T data;
    private List<Message> messages;

    public Response(T data) {
        this.data = data;
    }

    public Response(Message message) {
        this.messages = Collections.singletonList(message);
    }

    public Response(T data, Message message){
        this.data = data;
        this.messages = Collections.singletonList(message);
    }

}
