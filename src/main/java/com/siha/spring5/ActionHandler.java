package com.siha.spring5;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

@Service
public class ActionHandler {
    public Mono<ServerResponse> hello(ServerRequest request) {
        return Mono.just("hello, world").flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(s)));
    }

    public Mono<ServerResponse> test(ServerRequest request) {
        return Mono.just("test").flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(s)));
    }
}
