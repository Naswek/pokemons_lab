package attacks.physical;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class ThunderFang extends PhysicalMove {

    private static final Integer START = 1;
    private static final Integer END = 10;

    public ThunderFang(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Thunder Fang!";
    }

    protected void applyOppEffects(Pokemon p){
        Effect thunderFangEffect = new Effect()
                .chance(0.1)
                .condition(Status.PARALYZE);
        p.addEffect(thunderFangEffect);

        int chance = getChance(START, END);
        if (chance == 1) {
            Effect.flinch(p);
        }
    }

    public static int getChance(Integer start, Integer end) {
        Random random = new Random();
        return random.nextInt(START, END);
    }
}

