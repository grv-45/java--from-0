package oops;

class Pokemon {
    String power;
    String name;

    Pokemon(String power, String name) {
        this.power = power;
        this.name = name;
    }

    void print() {
        System.out.println(this.power + " used by " + this.name);
    }
}

// Child class
class LegendaryPokemon extends Pokemon {
    String ability;

    LegendaryPokemon(String power, String name, String ability) {
        super(power, name);   // call parent constructor
        this.ability = ability;
    }

    void print() {
        System.out.println(this.power + " used by " + this.name +
                " with special ability " + this.ability);
    }
}

public class inheritance {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Flamethrower", "Charmander");
        p1.print();

        LegendaryPokemon p2 = new LegendaryPokemon("Psychic", "Mewtwo", "Ultra Speed");
        p2.print();
    }
}
