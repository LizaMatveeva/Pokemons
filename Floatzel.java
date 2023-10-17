package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;

public class Floatzel extends Pokemon {
    public Floatzel (String name, int level){
        super (name, level);
        setType(Type.WATER);
        setStats (85, 105, 55, 85, 50, 115);
        setMove (new HydroPamp(), new ThunderShock());
    }
}
