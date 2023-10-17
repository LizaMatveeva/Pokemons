package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;
public class Cherubi extends Pokemon {
    public Cherubi (String name, int level){
        super (name, level);
        setType (Type.GRASS);
        setStats (45, 35, 45, 62, 53, 35);
        setMove (new HydroPamp(), new ThunderShock(), new Tackle());
    }
}
