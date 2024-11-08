package pokemons;

import attacks.physical.Bulldoze;
import attacks.special.MudBomb;
import attacks.status.Leer;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ekans extends Pokemon {

    public ekans(String name, int level) {

        super(name, level);
        super.setType(Type.POISON);
        super.setStats(35, 60, 44, 40, 54, 55);

        Bulldoze bulldoze = new Bulldoze(60, 100, Type.GROUND);
        Leer leer = new Leer(0, 100, Type.NORMAL);
        MudBomb mud_bomb = new MudBomb(65, 85, Type.GROUND);

        super.setMove(bulldoze, leer, mud_bomb);
    }
}
