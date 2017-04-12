package pl.edu.pw.fizyka.pojava.tosbert;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class BottomPanel extends JPanel { //Antonina Pater

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    SettingsPanel settings;
    RunButtonPanel runButton;
    DetectorPanel detectorPanel;
    GraphFrame graph;


    public BottomPanel() throws HeadlessException {
	setBackground(Color.WHITE);
	setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	setMinimumSize(new Dimension(800,150));
	setMaximumSize(new Dimension(800,150));
	setPreferredSize(new Dimension(800,150));

	this.settings = new SettingsPanel();
	this.add(this.settings);

	this.runButton = new RunButtonPanel();
	this.add(this.runButton);

	this.detectorPanel = new DetectorPanel();
	this.add(this.detectorPanel);

	this.graph = new GraphFrame();
	this.graph.setLocation(getX()+800, (getY()));
	//this.graph.setVisible(true);
    }


}