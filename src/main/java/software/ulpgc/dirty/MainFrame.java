//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package software.ulpgc.dirty;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import software.ulpgc.clean.PiechartDisplay;
import software.ulpgc.clean.Command;

public class MainFrame extends JFrame {
    private final Map<String, Command> commands;
    private PiechartDisplay piechartDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Statistics of Pokemon");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        this.add(this.pieChartDisplay());
        this.add(this.menu(), "North");
        this.commands = new HashMap();
    }

    public void put(String key, Command value) {
        this.commands.put(key, value);
    }

    private JPanel menu() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(this.toggle());
        return panel;
    }

    private JButton toggle() {
        JButton toggle = new JButton("toggle");
        toggle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((Command)MainFrame.this.commands.get("toggle")).execute();
            }
        });
        return toggle;
    }

    private JPanel pieChartDisplay() {
        JFreePiechartDisplay display = new JFreePiechartDisplay();
        this.piechartDisplay = display;
        return display;
    }

    public PiechartDisplay piechartDisplay() {
        return this.piechartDisplay;
    }
}
