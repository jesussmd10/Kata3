
package software.ulpgc.Pokemon;

import software.ulpgc.clean.Pokemon;

public class TsvPokemonDeserializer implements PokemonDeserializer {
    @Override
    public Pokemon deserialize(String line) {
        return deserialize(line.split(","));
    }

    private Pokemon deserialize(String[] fields) {
        if(fields[3] == ""){
            return new Pokemon(fields[1], fields[2],"None",Integer.parseInt(fields[11]));
        }
        return new Pokemon(fields[1], fields[2], fields[3], Integer.parseInt(fields[11]));
    }


}
