package pokemons;

import attacks.physical.IronHead;
import attacks.special.IceBeam;
import attacks.special.ThunderBolt;
import attacks.status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class marshadow extends Pokemon {

    public marshadow(String name, int level){

        super(name, level);
        super.setType(Type.FIGHTING, Type.GHOST);
        super.setStats(90, 125, 80, 90, 90, 125);

        ThunderBolt thunderbolt = new ThunderBolt(90, 100, Type.ELECTRIC);
        IronHead ironhead = new IronHead(80, 100, Type.STEEL);
        IceBeam icebeam = new IceBeam(90, 100, Type.ICE);
        ThunderWave thunderwave = new ThunderWave(0, 90, Type.ELECTRIC);

        super.setMove(thunderbolt, ironhead,icebeam, thunderwave);
    }
}
