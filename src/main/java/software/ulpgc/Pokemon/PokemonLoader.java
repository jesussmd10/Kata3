package software.ulpgc.Pokemon;

import software.ulpgc.clean.Pokemon;

import java.io.IOException;
import java.util.List;
public interface PokemonLoader {
    List<Pokemon> load() throws IOException;
}