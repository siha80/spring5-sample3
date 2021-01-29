package com.siha.spring5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
//import reactor.ipc.netty.http.server.HttpServer;

import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

@Configuration
@ComponentScan
public class ReactiveWebFluxConfiguration {
//    private static final String HOST = "localhost";
//    private static final int PORT = 8081;

//    @Bean
//    public HttpServer httpServer(RouterFunction<?> routerFunction){
//        System.out.println("------------> server setting...");
//        HttpHandler httpHandler = toHttpHandler(routerFunction);
//        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
//
//        HttpServer server = HttpServer.create(HOST, PORT);
//        server.newHandler(adapter).block();
//    }
}
