package io.matheusvictor;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class TestController {

    @Get(processes = MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World!";
    }
}
