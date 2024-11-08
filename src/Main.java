import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();

        pichu pichu = new pichu("Сёко", 5);
        b.addFoe(pichu);

        marshadow marshadow = new marshadow("Сугуру", 15);
        b.addAlly(marshadow);

        raichu raichu = new raichu("Сатору", 5);
        b.addFoe(raichu);

        ekans ekans = new ekans("Нобара", 5);
        b.addFoe(ekans);

        pikachu pikachu = new pikachu("Мегуми", 5);
        b.addFoe(pikachu);

        arbok arbok = new arbok("Итадори", 5);
        b.addFoe(arbok);

        b.go();
    }
}