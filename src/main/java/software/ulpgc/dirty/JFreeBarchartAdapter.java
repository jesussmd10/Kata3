//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package software.ulpgc.dirty;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import software.ulpgc.clean.Piechart;


public class JFreeBarchartAdapter {

    public JFreeBarchartAdapter() {


    }

    public static JFreeChart adapt(Piechart barchart) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("aaa", 999);
        dataset.setValue("aasdd",911);
        return ChartFactory.createPieChart("",dataset,true,true,false);
    }


}
