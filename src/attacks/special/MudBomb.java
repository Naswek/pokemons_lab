package attacks.special;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {

    public MudBomb(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Mud Bomb!";
    }

    protected void applyOppEffects(Pokemon p){
        Effect MudBombEffect = new Effect()
                .stat(Stat.ACCURACY, -1)
                .chance(0.3);
        p.addEffect(MudBombEffect);
    }
}
