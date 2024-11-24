

package software.ulpgc.clean;


import software.ulpgc.Pokemon.FilePokemonLoader;

public class ToggleChartCommand implements Command {

    private final PiechartDisplay piechartDisplay;
    private int i = 0;
    private static Pokemon generation;
    private static FilePokemonLoader pokemons;

    public ToggleChartCommand(PiechartDisplay piechartDisplay) {
        this.piechartDisplay = piechartDisplay;
    }

    public void execute() {
        Piechart nextPiechart = this.getBarchart(++this.i);
        this.piechartDisplay.display(nextPiechart);
    }

    private Piechart getBarchart(int index) {
        return index % 2 == 0 ? generationBarchart() : LengendaryBarchart();
    }

    private Piechart generationBarchart() {
        Piechart piechart = new Piechart("Generation");
        piechart.add("Generation", 111);
        return piechart;
    }

    private static Piechart LengendaryBarchart() {
        Piechart piechart = new Piechart("Legendary");

        return piechart;
    }
}
