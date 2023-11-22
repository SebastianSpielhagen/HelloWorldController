package org.spielhagen.helloworldcontroller;

import lombok.Getter;

@Getter
public record Message(String id, String name, String message) {

}
