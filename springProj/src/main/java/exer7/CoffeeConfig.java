package exer7;

import org.springframework.context.annotation.Bean;

public class CoffeeConfig {
    @Bean
    public Americano americano() {
        return new Americano();
    }

    @Bean
    public Cafelatte cafelatte() {
        return new Cafelatte();
    }

    @Bean
    public Caramelmakiato caramelmakiato() {
        return new Caramelmakiato();
    }
}
