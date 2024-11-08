package attacks.physical;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {

    public Bulldoze(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Bulldoze!";
    }

    protected void applyOppEffects(Pokemon p){
        Effect BulldozeEffect = new Effect()
                .stat(Stat.SPEED, -1);
        p.addEffect(BulldozeEffect);
    }
}

