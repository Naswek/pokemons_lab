package attacks.special;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam(double power, double accuracy, Type type){
    }

    protected String describe() {
        return "uses Ice Beam!";
    }

    protected void applyOppEffects(Pokemon p){
        Effect IceBeamEffect = new Effect()
                .chance(0.1)
                .condition(Status.FREEZE);
        p.setCondition(IceBeamEffect);
    }
}
