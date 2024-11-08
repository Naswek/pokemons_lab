package pokemons;


import attacks.physical.Bulldoze;
import attacks.physical.ThunderFang;
import attacks.special.MudBomb;
import attacks.status.Leer;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class arbok extends Pokemon{

    public arbok(String name, int level){

        super(name, level);
        super.setType(Type.POISON);
        super.setStats(60, 95, 69, 65, 79, 80);

        Bulldoze bulldoze = new Bulldoze(60, 100, Type.GROUND);
        Leer leer = new Leer(0, 100, Type.NORMAL);
        MudBomb mud_bomb = new MudBomb(65, 85, Type.GROUND);
        ThunderFang thunder_fang = new ThunderFang(65, 95, Type.ELECTRIC);

        super.setMove(bulldoze, leer, mud_bomb, thunder_fang);
    }

}
