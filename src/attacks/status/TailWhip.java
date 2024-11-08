package attacks.status;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {

    public TailWhip(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Tail Whip!";
    }

    protected void applyOppEffects(Pokemon p){
        Effect TailWhipEffect = new Effect()
                .stat(Stat.DEFENSE, -1);
        p.addEffect(TailWhipEffect);
    }
}
