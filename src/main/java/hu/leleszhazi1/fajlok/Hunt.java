package hu.leleszhazi1.fajlok;

import org.springframework.stereotype.Component;

@Component
public interface Hunt {
    void canUseGun(Gun gun);
}
