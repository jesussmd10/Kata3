
package software.ulpgc.Pokemon;

public class TsvPokemonDeserializer implements PokemonDeserializer {
    @Override
    public Pokemon deserialize(String line) {
        return deserialize(line.split(","));
    }

    private Pokemon deserialize(String[] fields) {

        return new Pokemon(fields[1], fields[2], Integer.parseInt(fields[11]));
    }


}
