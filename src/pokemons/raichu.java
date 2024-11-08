package pokemons;

import attacks.physical.Slam;
import attacks.status.Rest;
import attacks.status.TailWhip;
import attacks.special.ThunderBolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class raichu extends Pokemon {

    public raichu(String name, int level){

        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(60, 90, 55, 90, 80, 110);

        ThunderBolt thunderbolt = new ThunderBolt(90, 100, Type.ELECTRIC);
        TailWhip tail_whip = new TailWhip(0, 100, Type.NORMAL);
        Slam slam = new Slam(80, 75, Type.NORMAL);
        Rest rest = new Rest(0, 0, Type.PSYCHIC);

        super.setMove(thunderbolt, tail_whip, slam, rest);
    }
}
