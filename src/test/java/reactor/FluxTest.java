package reactor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

class FluxTest {
    Flux<String> strings;

    @BeforeEach
    void setUp() {
        strings = Flux.just("a", "b", "c");
    }

    @Test
    void simpleFlux() {
        strings.subscribe(System.out::println);
    }

    @Test
    void map() {
        strings.map(String::toUpperCase)
                .subscribe(System.out::println);
    }
}
