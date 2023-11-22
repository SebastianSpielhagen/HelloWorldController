package org.spielhagen.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloWorldController {

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
