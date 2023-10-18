package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;




public class Castform extends Pokemon {
    public Castform (String name, int level) {
        super (name, level);
        setType (Type.NORMAL);
        setStats (70, 70, 70, 70, 70, 70);
        setMove (new Substitute(), new CrossChop(), new Refresh(), new PowerSwap());
    }
}
