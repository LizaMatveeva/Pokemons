package my.Pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;
import my.moves.Substitute;
import my.moves.Cross Chop;
import my.moves.Refresh;
import my.moves.Power Swap;
public class Castform extends Pokemon {
    public Castform {String name, int level}{
        super(name,level);
    setType (Type.NORMAL);
    setStats (70, 70, 70, 70, 70, 70);
    setMove (new Substitute(), new Cross Chop(), new Refresh(), new Power Swap());
    }
}