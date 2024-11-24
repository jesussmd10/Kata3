
package software.ulpgc.Pokemon;

import software.ulpgc.clean.Pokemon;

public interface PokemonDeserializer {
    Pokemon deserialize(String line);
}
