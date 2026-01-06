package scripts;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cronometer extends JPanel implements ActionListener{
	JButton start_btn = new JButton();
	JButton stop_btn = new JButton();
	JButton reset_btn = new JButton();
	JLabel time_label = new JLabel("00:00:00");
	
	Timer timer = new Timer();
	
	Cronometer()
	{
		this.setBounds(0, 0, 300, 300);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(time_label);
		this.add(start_btn);
		this.add(reset_btn);
		this.add(stop_btn);
		
		time_label.setBounds(0, 0, 300, 100);
		time_label.setFont(new Font("MV Boli", Font.BOLD, 45));
		time_label.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
