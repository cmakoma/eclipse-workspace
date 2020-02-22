import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

// Assignement Labcoin
// Program CoinGui
// Author Christian Makoma
// Created Nov 11, 2019

public class CoinGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
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
	public CoinGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Image centIcon = new ImageIcon(this.getClass().getResource("/UsCent.png")).getImage();
		Image dimeIcon = new ImageIcon(this.getClass().getResource("/UsDime.png")).getImage();
		Image quarterIcon = new ImageIcon(this.getClass().getResource("/UsQuarter.png")).getImage();
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblClickACoin = new JLabel("click a coin");
		lblClickACoin.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblClickACoin, BorderLayout.CENTER);
		
		JButton btnCent =    new JButton("");
		btnCent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblClickACoin.setText(Coin.CENT.toString());
			}
		});
		panel.add(btnCent);
		btnCent.setIcon(new ImageIcon(centIcon));
		
		
		
		JButton btnNickel = new JButton("");
		btnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblClickACoin.setText(Coin.NICKEL.toString());
			}
		});
		panel.add(btnNickel);
		btnNickel.setIcon(new ImageIcon(nickelIcon));
		
		JButton btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblClickACoin.setText(Coin.DIME.toString());
			}
		});
		panel.add(btnDime);
		btnDime.setIcon(new ImageIcon(dimeIcon));
		
		JButton btnQuarter = new JButton("");
		btnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblClickACoin.setText(Coin.QUARTER.toString());
			}
		});
		panel.add(btnQuarter);
		btnQuarter.setIcon(new ImageIcon(quarterIcon));
		
		
	}

}
