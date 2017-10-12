package com.siha.spring5;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@ComponentScan
public class Routes {
    private ActionHandler actionHandler;

    public Routes(ActionHandler actionHandler) {
        this.actionHandler = actionHandler;
    }

    @Bean
    public RouterFunction<?> routerFunction() {
        return route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), actionHandler::hello)
                .and(route(GET("/test"), actionHandler::test));
    }
}
