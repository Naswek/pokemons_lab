package attacks.physical;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class IronHead extends PhysicalMove {

    private static final Integer START = 1;
    private static final Integer END = 10;

    public IronHead(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Iron Head!";
    }

    protected void applyOppEffects(Pokemon p) {
        int chance = getChance(START, END);
        if (chance == 1) {
            Effect.flinch(p);
        }
    }

    public static int getChance(Integer start, Integer end) {
        Random randominteger = new Random();
        return randominteger.nextInt(START, END);
    }

}
