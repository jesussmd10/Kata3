
package software.ulpgc.Pokemon;

public class Pokemon {
    public final String pokemon;
    public final String type;
    public int generationPokemon;

    public Pokemon(String pokemon, String type, int generationPokemon) {
        this.pokemon = pokemon;
        this.type = type;
        this.generationPokemon = generationPokemon;
    }



    public String getPokemon() {
        return pokemon;
    }


    public String getType() {
        return type;
    }



    public int getGenerationPokemon() {
        return generationPokemon;
    }

    @Override
    public String toString() {
        return "pokemon='" + pokemon + '\'' +
                ", type=" + type +
                ", generation=" + generationPokemon;
    }

    public Integer generationPokemon() {
        return getGenerationPokemon();
    }
}
