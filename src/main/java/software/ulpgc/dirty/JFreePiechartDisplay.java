package software.ulpgc.dirty;

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import software.ulpgc.clean.Piechart;
import software.ulpgc.clean.PiechartDisplay;

public class JFreePiechartDisplay extends JPanel implements PiechartDisplay {
    public JFreePiechartDisplay() {
    }

    public void display(Piechart barchart) {
        this.removeAll();
        this.add(new ChartPanel(JFreePiechartAdapter.adapt(barchart)));
        this.revalidate();
        this.repaint();
    }
}
