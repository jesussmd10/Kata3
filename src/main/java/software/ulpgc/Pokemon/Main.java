
package software.ulpgc.Pokemon;

import software.ulpgc.clean.Pokemon;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Jesus Santacruz/Desktop/IS2/pokemon.csv");
        List<Pokemon> pokemons = new FilePokemonLoader(file, new TsvPokemonDeserializer()).load();
        Map<String, Integer> stats = new HashMap<>();
        for(Pokemon pokemon : pokemons){
            stats.put(pokemon.getPokemon(), pokemon.getGenerationPokemon());
            System.out.println("Pokemon: " + pokemon.getPokemon() + ", Generación: " + pokemon.getGenerationPokemon());
        }

    }
}
