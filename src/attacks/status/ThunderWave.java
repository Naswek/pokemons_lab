package attacks.status;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {

    public ThunderWave(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Thunder Wave";
    }

    protected void applyOppEffects(Pokemon p){
        int Speed_before = (int) p.getStat(Stat.SPEED);
        Effect ThunderWaveEffect = new Effect().chance(1)
                .condition(Status.PARALYZE)
                .attack(0.25)
                .stat(Stat.SPEED, Speed_before);
        p.addEffect(ThunderWaveEffect);
    }
}
