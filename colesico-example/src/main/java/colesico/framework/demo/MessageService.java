package colesico.framework.demo;

import colesico.framework.service.Service;

@Service
public class MessageService {
    private final String message;

    public MessageService(MessageServiceConfig config ) {
        this.message = config.getMessage();
    }

    public String sayHello(String name) {
        return message + " " + name;
    }
}
