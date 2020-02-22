import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Assignement A06RedCounter
// Program RedCounter
// Author Christian Makoma
// Created Dec 2, 2019

public class RedCounter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedCounter frame = new RedCounter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * this frame have desired Dimensions 
	 */
	public RedCounter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JLabel labelRedCount = redCountLabel(splitPane);
		
		JLabel buttonClickMe = clickMeEvent(labelRedCount);
		clickMeButton(splitPane, buttonClickMe);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Christian's GUI");
		lblNewLabel.setPreferredSize(new Dimension(93, 30));
		panel.add(lblNewLabel);
	}
	
	/**
	 * 
	 * @param labelRedCount: this is the redCount label
	 * @return this is the event handle methods for clicks and increments
	 */
	private JLabel clickMeEvent(JLabel labelRedCount) {
		JLabel buttonClickMe = new JLabel("Click Me");
		buttonClickMe.addMouseListener(new MouseAdapter() {
			int count = 0;
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int numColor = (int) (Math.random()*5);
				
				if(numColor == 0) {
					buttonClickMe.setBackground(Color.RED);
					count++;
					labelRedCount.setText(String.format(count < 10 ? "Red Counter: 0%d" : "Red Counter: %d", count));
					
					
				}
				else if(numColor == 1) {
					buttonClickMe.setBackground(Color.BLUE);
				}
				else if(numColor == 2) {
					buttonClickMe.setBackground(Color.GREEN);
				}
				else if(numColor == 3) {
					buttonClickMe.setBackground(Color.ORANGE);
				}
				else if(numColor == 4) {
					buttonClickMe.setBackground(Color.MAGENTA);
				}
				
			}
		});
		return buttonClickMe;
	}

	/**
	 * 
	 * @param splitPane can be used to resize the button and label
	 * @param buttonClickMe is Clicked button 
	 */
	private void clickMeButton(JSplitPane splitPane, JLabel buttonClickMe) {
		buttonClickMe.setMinimumSize(new Dimension(250, 16));
		buttonClickMe.setMaximumSize(new Dimension(250, 16));
		buttonClickMe.setPreferredSize(new Dimension(250, 16));
		buttonClickMe.setHorizontalAlignment(SwingConstants.CENTER);
		buttonClickMe.setForeground(Color.WHITE);
		buttonClickMe.setFont(new Font("Monospaced", Font.PLAIN, 23));
		buttonClickMe.setOpaque(true);
		buttonClickMe.setBackground(Color.BLUE);
		splitPane.setRightComponent(buttonClickMe);
	}

	/**
	 * 
	 * @param splitPane can be used to resize the button and label
	 * @return counting label
	 */
	private JLabel redCountLabel(JSplitPane splitPane) {
		JLabel labelRedCount = new JLabel("Red Counter: 00");
		labelRedCount.setPreferredSize(new Dimension(250, 16));
		labelRedCount.setFont(new Font("Monospaced", Font.BOLD, 20));
		labelRedCount.setHorizontalAlignment(SwingConstants.CENTER);
		labelRedCount.setMinimumSize(new Dimension(250, 16));
		labelRedCount.setMaximumSize(new Dimension(250, 16));
		splitPane.setLeftComponent(labelRedCount);
		return labelRedCount;
	}

}
