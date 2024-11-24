
package software.ulpgc.clean;

public class Pokemon {
    public final String pokemon;
    public final String type;
    public final String type2;
    public int generationPokemon;

    public Pokemon(String pokemon, String type, String type2, int generationPokemon) {
        this.pokemon = pokemon;
        this.type = type;
        this.type2 = type2;
        this.generationPokemon = generationPokemon;
    }



    public String getPokemon() {
        return pokemon;
    }


    public String getType() {
        return type;
    }

    public String getType2() {
        return type2;
    }

    public int getGenerationPokemon() {
        return generationPokemon;
    }

    @Override
    public String toString() {
        return "pokemon='" + pokemon + '\'' +
                ", type=" + type +
                ", type2=" + type2 +
                ", generation=" + generationPokemon;
    }

    public Integer generationPokemon() {
        return getGenerationPokemon();
    }
}
