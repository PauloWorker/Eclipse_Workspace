package Slider;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame extends JFrame implements ChangeListener{
	JSlider slider = new JSlider(0, 100, 50);
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	MyFrame()
	{
		
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true); //Enable the drawing points to get the reference of the slide
		slider.setMinorTickSpacing(10); //Set the minor tick drawing to the slider
		
		slider.setPaintTrack(true); //Enable the drawing points to get the reference of the slide
		slider.setMajorTickSpacing(25); //Set the major tick drawing to the slider
		
		slider.setPaintLabels(true); //Enable the paint labels
		
		slider.setFont(new Font("MV Boli", Font.BOLD, 15));
		
		slider.setOrientation(SwingConstants.VERTICAL); //Change the view orientation of the slider
		slider.addChangeListener(this);
		
		label.setFont(new Font("MV Boli", Font.BOLD, 15));
		label.setText("°C = " + slider.getValue());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(640, 420);
		
		panel.add(label);
		panel.add(slider);
		
		
		this.add(panel);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + slider.getValue());
		
	}
}
