package pokemons;

import attacks.status.TailWhip;
import attacks.special.ThunderBolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class pichu extends Pokemon {

    public pichu(String name, int level){

        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(20, 40, 15, 35, 35, 60);

        ThunderBolt thunderbolt = new ThunderBolt(90, 100, Type.ELECTRIC);
        TailWhip tail_whip = new TailWhip(0, 100, Type.NORMAL);

        super.setMove(thunderbolt, tail_whip);
    }
}
