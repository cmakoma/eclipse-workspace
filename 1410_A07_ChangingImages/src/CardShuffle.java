import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import firstTry.order;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;

// Assignement 1410_A07_ChangingImages
// Program CardShuffle
// Author Christian Makoma
// Created Dec 3, 2019

public class CardShuffle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardShuffle frame = new CardShuffle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CardShuffle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel cardPanel = new JPanel();
		JLabel cardlabel3 = new JLabel("");
		JLabel cardlabel2 = new JLabel("");
		JLabel cardlabel1 = new JLabel("");
		
		Image homeCardIcon = new ImageIcon(CardShuffle.class.getResource("/HomeCard.png")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image jokerIcon1 = new ImageIcon(CardShuffle.class.getResource("/joker1.png")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image jokerIcon2 = new ImageIcon(CardShuffle.class.getResource("/joker2.jpg")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image heartIcon1 = new ImageIcon(CardShuffle.class.getResource("/heart3.jpg")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image heartIcon2 = new ImageIcon(CardShuffle.class.getResource("/heartA.jpg")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image heartIcon3 = new ImageIcon(CardShuffle.class.getResource("/heart9.jpeg")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image spadeIcon1 = new ImageIcon(CardShuffle.class.getResource("/spade5.png")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image spadeIcon2 = new ImageIcon(CardShuffle.class.getResource("/spadeA.jpeg")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
		Image spadeIcon3 = new ImageIcon(CardShuffle.class.getResource("/spadeJ.png")).getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);

		JPanel controlPanel = new JPanel();
		contentPane.add(controlPanel, BorderLayout.WEST);
		controlPanel.setLayout(new GridLayout(8, 0, 0, 0));
		
		JLabel lblCardShuffle = new JLabel("Card Shuffle");
		lblCardShuffle.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardShuffle.setVerticalAlignment(SwingConstants.TOP);
		controlPanel.add(lblCardShuffle);
		
		JCheckBox chckbxOption1 = new JCheckBox("Heart");
		controlPanel.add(chckbxOption1);
		
		JCheckBox chckbxOption2 = new JCheckBox("Spade");
		controlPanel.add(chckbxOption2);
		
		JCheckBox chckbxOption3 = new JCheckBox("Joker");
		controlPanel.add(chckbxOption3);
		
		// submit Button with action listener
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				if(!chckbxOption1.isSelected() && !chckbxOption2.isSelected() && !chckbxOption3.isSelected()) {
					if( count%3 == 1) {
						cardPanel.setBackground(new Color(100,0,0));
					}
					else if(count%3 == 2) {
						cardPanel.setBackground(new Color(0,0,100));
					}else {
						cardPanel.setBackground(new Color(0,100,0));
					}
				}
				
				if(chckbxOption3.isSelected()) {
					if( count%3 == 2) {
						cardlabel3.setIcon(new ImageIcon(jokerIcon1));
					}else if( count%3 == 1)  {
						cardlabel3.setIcon(new ImageIcon(jokerIcon2));
					}else {
						cardlabel3.setIcon(new ImageIcon(homeCardIcon));
					}
					
				}
				
				if(chckbxOption2.isSelected()) {
					if( count%4 == 1) {
						cardlabel2.setIcon(new ImageIcon(spadeIcon1));
					}
					else if( count%4 == 2){
						cardlabel2.setIcon(new ImageIcon(spadeIcon2));
					}
					else if( count%4 == 3){
						cardlabel2.setIcon(new ImageIcon(spadeIcon3));
					}
					else {
						cardlabel2.setIcon(new ImageIcon(homeCardIcon));
					}
				}
				
				if(chckbxOption1.isSelected()) {
					if( count%4 == 1) {
						cardlabel1.setIcon(new ImageIcon(heartIcon1));
					}
					else if ( count%4 == 2) {
						cardlabel1.setIcon(new ImageIcon(heartIcon2));
					}else if ( count%4 == 3) {
						cardlabel1.setIcon(new ImageIcon(heartIcon3));
					}else {
						cardlabel1.setIcon(new ImageIcon (homeCardIcon));
					}
				}
				
				
			}
		});
		controlPanel.add(btnSubmit);
		
		
		cardPanel.setBackground(new Color(0, 100, 0));
		cardPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		contentPane.add(cardPanel, BorderLayout.CENTER);
		cardPanel.setLayout(new GridLayout(0, 3, 3, 0));
		
		
		cardPanel.add(cardlabel1);
		cardlabel1.setIcon(new ImageIcon(homeCardIcon));
		
		
		cardPanel.add(cardlabel2);
		cardlabel2.setIcon(new ImageIcon(homeCardIcon));
		
		
		cardPanel.add(cardlabel3);
		cardlabel3.setIcon(new ImageIcon(homeCardIcon));
	}

}
