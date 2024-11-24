
package software.ulpgc.dirty;

import software.ulpgc.Pokemon.FilePokemonLoader;
import software.ulpgc.Pokemon.Pokemon;
import software.ulpgc.Pokemon.TsvPokemonDeserializer;
import software.ulpgc.clean.TogglePokemonChartCommand;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/pokemon.csv");
        List<Pokemon> pokemons = new FilePokemonLoader(file, new TsvPokemonDeserializer()).load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.put("toggle", new TogglePokemonChartCommand(mainFrame.piechartDisplay(),pokemons));
        mainFrame.setVisible(true);
    }
}
