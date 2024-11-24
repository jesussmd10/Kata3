package software.ulpgc.dirty;

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import software.ulpgc.clean.Piechart;
import software.ulpgc.clean.PiechartDisplay;

public class JFreeBarchartDisplay extends JPanel implements PiechartDisplay {
    public JFreeBarchartDisplay() {
    }

    public void display(Piechart barchart) {
        this.removeAll();
        this.add(new ChartPanel(JFreeBarchartAdapter.adapt(barchart)));
        this.revalidate();
    }
}
