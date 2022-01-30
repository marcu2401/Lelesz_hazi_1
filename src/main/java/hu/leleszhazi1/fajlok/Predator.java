package hu.leleszhazi1.fajlok;


import org.springframework.stereotype.Component;

@Component
public abstract class Predator implements Wild{

    @Override
    public void canKillAnimal() {
        System.out.println("Állatot öl");
    }

}
