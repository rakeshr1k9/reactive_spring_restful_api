package com.rakeshr1k9.reactive_spring_restful_api.fluxandmono;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxAndMonoTest {

    @Test
    public void fluxTest(){

        Flux<String> stringFlux = Flux.just("Spring","Spring Boot");

        stringFlux
                .subscribe(System.out::println);

    }
}
