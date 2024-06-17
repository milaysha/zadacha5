package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    private final Deth8 deth8;
    public Needle7(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth8.toString();
    }
}
/* public class Duck5 {
    private Egg6 egg;
    public Duck5(Egg6 egg) {
        this.egg = egg;
    }
    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
} */