package sumo.asyncresource

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo

class ExampleController {

    //def index() {}

    def index() {
        render(view: "index")
    }

    @MessageMapping("/hello")
    @SendTo("/topic/hello")
    protected String hello(String world) {
        return "hello from controller, ${world}!"
    }

}
