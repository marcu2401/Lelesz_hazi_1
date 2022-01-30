package hu.leleszhazi1.fajlok;

import org.springframework.stereotype.Component;

@Component
public abstract class Herbivorous  implements Wild{

    @Override
    public void Graze() {
        System.out.println("Legel");
    }
}
