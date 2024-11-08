package pokemons;

import attacks.physical.Slam;
import attacks.status.TailWhip;
import attacks.special.ThunderBolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class pikachu extends Pokemon {

    public pikachu(String name, int level){

        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(35, 55, 40, 50, 50, 90);

        ThunderBolt thunderbolt = new ThunderBolt(90, 100, Type.ELECTRIC);
        TailWhip tail_whip = new TailWhip(0, 100, Type.NORMAL);
        Slam slam = new Slam(80, 75, Type.NORMAL);

        super.setMove(thunderbolt, tail_whip, slam);
    }
}
