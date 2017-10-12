package com.siha.spring5;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

@RestController
public class TestController {
    @GetMapping("/controller/test")
    public Mono<String> testAnswer() {
        return Mono.just("welcome!!!");
    }
}
