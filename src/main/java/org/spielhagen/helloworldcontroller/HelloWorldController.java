package org.spielhagen.helloworldcontroller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
    public class HelloWorldController {

        private List<Message> messages = new ArrayList<>();

        @GetMapping("/api/messages")
        public List<Message> getAllMessages() {
            return messages;
        }

        @PostMapping("/api/messages")
        public void addMessage(@RequestBody Message message) {
            messages.add(message);
        }
        @GetMapping
        public String sayHello(){
            return "Hallo Welt2";
        }
        @GetMapping("/api/hello")
        public String getHelloMessage() {
            return "Hello, World!";
        }
        @GetMapping("/api/hello/{name}")
        public String getCustomizedHello(@PathVariable String name) {
            return "Hello, " + name + "!";
        }
}
