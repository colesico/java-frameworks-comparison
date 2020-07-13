package colesico.framework.demo;

import colesico.framework.config.Config;
import colesico.framework.config.UseFileSource;

@Config
@UseFileSource(file = "message-service.properties")
public class MessageServiceConfig {

    private String message = "Hello";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
