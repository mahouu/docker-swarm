package org.minolles.docker.swarm;

import org.minolles.docker.swarm.view.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(value="/", produces = { "application/json" })
    public Message index() {
        String result = "Greetings from Spring Boot! oeoe";

        return new Message(result);
    }
}
