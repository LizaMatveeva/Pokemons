package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;
public class Weezing extends Pokemon {
    public Weezing (String name, int level){
        super (name, level);
        setType (Type.POISON);
        setStats (65, 90, 120, 85, 70, 60);
        setMove (new ShadowPunch(); new BulkUp(); new RockThrow());
    }
}
