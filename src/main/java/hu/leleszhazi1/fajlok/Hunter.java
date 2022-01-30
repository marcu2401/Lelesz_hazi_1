package hu.leleszhazi1.fajlok;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vadász")
public class Hunter implements Hunt{
    private @Getter @Setter Gun gun;

    @Autowired
    public void setGun(Gun gun){
        this.gun=gun;

    }

    @Override
    public void canUseGun(Gun gun) {
        System.out.println("Lő a fegyverrel a vadász!");
    }
}
