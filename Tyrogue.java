package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;
public class Tyrogue extends Pokemon {
    public Tyrogue (String name, int level){
        super (name, level);
        setType (Type.FIGHTING);
        setStats (35, 35, 35, 35, 35, 35);
        setMove (new ShadowPunch(), new BulkUp(), new RockThrow(), new Blizzard());
    }
}
