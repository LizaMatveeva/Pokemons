import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main (String[] args){
        Battle fight = new Battle();
        Pokemon Castform = new Pokemon("One", 1);
        Pokemon Weezing = new Pokemon("Two", 1);
        Pokemon Tyrogue = new Pokemon("Free", 1 );
        Pokemon Cherubi = new Pokemon("Four", 1 );
        Pokemon Cherrim = new Pokemon("Five", 1 );
        Pokemon Floatzel = new Pokemon("Six", 1 );
        fight.addAlly(Castform);
        fight.addAlly(Tyrogue);
        fight.addAlly(Cherrim);
        fight.addFoe(Weezing);
        fight.addFoe(Cherubi);
        fight.addFoe(Floatzel);
        fight.go();
    }
}


