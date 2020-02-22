package firstTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class order extends JFrame {

	private JPanel contentPane;
	private double sub = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					order frame = new order();
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
	public order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		JPanel panelSideMenu = new JPanel();
		panelSideMenu.setAlignmentY(Component.TOP_ALIGNMENT);
		JPanel panelMainSelection = new JPanel();
		
		JPanel foodSelect = new JPanel();
		JPanel drinkSelect = new JPanel();
		JPanel dessertSelect = new JPanel();
		
		JRadioButton pizza = new JRadioButton("Pizza");
		JRadioButton burger = new JRadioButton("Burger");
		JRadioButton taco = new JRadioButton("Taco");
		
		JPanel pizzaSelect = new JPanel();
		JPanel burgerSelect = new JPanel();
		JPanel tacoSelect = new JPanel();
		
		JRadioButton coffee = new JRadioButton("Coffee");
		JRadioButton juice = new JRadioButton("Juice");
		JRadioButton soda = new JRadioButton("Soda");
		
		JPanel coffeeSelect = new JPanel();
		JPanel juiceSelect = new JPanel();
		JPanel sodaSelect = new JPanel();
		
		Image dessertIcon1 = new ImageIcon(order.class.getResource("/firstTry/dessertCupcake.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image dessertIcon2 = new ImageIcon(order.class.getResource("/firstTry/dessertBlackForest.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image dessertIcon3 = new ImageIcon(order.class.getResource("/firstTry/dessertAlmond.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image dessertIcon4 = new ImageIcon(order.class.getResource("/firstTry/dessertBlueberry.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		Image pizzaIcon1 = new ImageIcon(order.class.getResource("/firstTry/pizzaHawain.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image pizzaIcon2 = new ImageIcon(order.class.getResource("/firstTry/pizzaPepperoni.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image pizzaIcon3 = new ImageIcon(order.class.getResource("/firstTry/pizzaVeggie.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		Image burgerIcon1 = new ImageIcon(order.class.getResource("/firstTry/burgerCheeseBurger.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image burgerIcon2 = new ImageIcon(order.class.getResource("/firstTry/burgerChicken.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image burgerIcon3 = new ImageIcon(order.class.getResource("/firstTry/burgerFish.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		Image tacoIcon1 = new ImageIcon(order.class.getResource("/firstTry/tacoFish.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image tacoIcon2 = new ImageIcon(order.class.getResource("/firstTry/tacoStreet.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image tacoIcon3 = new ImageIcon(order.class.getResource("/firstTry/tacoViggie.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		Image coffeeIcon1 = new ImageIcon(order.class.getResource("/firstTry/coffeeRegular.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image coffeeIcon2 = new ImageIcon(order.class.getResource("/firstTry/coffeeHQ.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image coffeeIcon3 = new ImageIcon(order.class.getResource("/firstTry/coffeeMilk.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		Image juiceIcon1 = new ImageIcon(order.class.getResource("/firstTry/jusOrange.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image juiceIcon2 = new ImageIcon(order.class.getResource("/firstTry/jusMango.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image juiceIcon3 = new ImageIcon(order.class.getResource("/firstTry/jusCoctail.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		Image sodaIcon1 = new ImageIcon(order.class.getResource("/firstTry/sodaCocacola.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image sodaIcon2 = new ImageIcon(order.class.getResource("/firstTry/sodaOrange.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		Image sodaIcon3 = new ImageIcon(order.class.getResource("/firstTry/sodaSprite.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		
		Food pizza1 = new Food("Hawaiian", 10.99);
		Food pizza2 = new Food("Pepperoni", 12.99);
		Food pizza3 = new Food("Veggie", 14.99);
		
		Food burger1 = new Food("Cheese", 10.99);
		Food burger2 = new Food("Chicken", 12.99);
		Food burger3 = new Food("Fish", 14.99);
		
		Food taco1 = new Food("Fish", 5.99);
		Food taco2 = new Food("Street", 2.99);
		Food taco3 = new Food("Veggies", 4.99);
		
		Food coffee1 = new Food("Regular", 1.99);
		Food coffee2 = new Food("HQ", 2.99);
		Food coffee3 = new Food("Milk Coffee", 3.99);
		
		Food juice1 = new Food("Orange", 1.99);
		Food juice2 = new Food("Mango", 1.99);
		Food juice3 = new Food("Coctail", 3.99);
		
		Food soda1 = new Food("Coca~cola", 0.99);
		Food soda2 = new Food("Orange", 0.99);
		Food soda3 = new Food("Sprite", 0.99);
		
		Food dessert1 = new Food("Cupcake", 2.99);
		Food dessert2 = new Food("Black Forrest", 3.99);
		Food dessert3 = new Food("Almond", 4.99);
		Food dessert4 = new Food("Blueberry", 2.99);

		JLabel pizzaPrice1 =  new JLabel("Hawaiian: 10.99");
		JLabel pizzaPrice2 =  new JLabel("pepperoni: 12.99");
		JLabel pizzaPrice3 =  new JLabel("Veggie: 14.99");
		
		JLabel burgerPrice1 =  new JLabel("Cheese: 10.99");
		JLabel burgerPrice2 =  new JLabel("Chicken: 12.99");
		JLabel burgerPrice3 =  new JLabel("Fish: 14.99");

		JLabel tacoPrice1 =  new JLabel("Fish: 5.99");
		JLabel tacoPrice2 =  new JLabel("Street: 2.99");
		JLabel tacoPrice3 =  new JLabel("Veggies: 4.99");
		
		JLabel coffeePrice1 =  new JLabel("Regular: 1.99");
		JLabel coffeePrice2 =  new JLabel("HQ: 2.99");
		JLabel coffeePrice3 =  new JLabel("Milk Coffee: 3.99");
		
		JLabel juicePrice1 =  new JLabel("Orange: 1.99");
		JLabel juicePrice2 =  new JLabel("Mango: 1.99");
		JLabel juicePrice3 =  new JLabel("Coctail: 3.99");
		
		JLabel sodaPrice1 =  new JLabel("Coca~cola: 0.99");
		JLabel sodaPrice2 =  new JLabel("Orange: 0.99");
		JLabel sodaPrice3 =  new JLabel("Sprite: 0.99");
		
		JLabel dessertPrice1 =  new JLabel("Cupcake: 2.99");
		JLabel dessertPrice2 =  new JLabel("Black Forrest: 3.99");
		JLabel dessertPrice3 =  new JLabel("Almond: 4.99");
		JLabel dessertPrice4 =  new JLabel("Blueberry: 2.99");
		
		
		setJMenuBar(menuBar);
		
		
		
		foodSelect.setBorder(new EmptyBorder(20, 20, 20, 20));
		foodSelect.setLayout(new GridLayout(12, 1, 0, 0));
		foodSelect.add(pizza);
		foodSelect.add(burger);
		foodSelect.add(taco);
		ButtonGroup foodGroup = new ButtonGroup();
		foodGroup.add(pizza);
		foodGroup.add(burger);
		foodGroup.add(taco);

		
		
		JMenuItem menuFood = new JMenuItem("FOOD");
		menuFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSideMenu.removeAll();
				panelMainSelection.removeAll();
				panelSideMenu.add(foodSelect, BorderLayout.WEST);
                revalidate();
                repaint();
			}
		});
		menuBar.add(menuFood);
		
		pizzaSelect.setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton labelPizza1 = new JButton("");
		labelPizza1.setVerticalAlignment(SwingConstants.TOP);
		labelPizza1.setHorizontalAlignment(SwingConstants.LEFT);
		labelPizza1.setOpaque(false);
		labelPizza1.setContentAreaFilled(false);
		labelPizza1.setBorderPainted(false);
		pizzaSelect.add(labelPizza1);
		labelPizza1.setIcon(new ImageIcon(pizzaIcon1));


		
		JButton labelPizza2 = new JButton("");
		labelPizza2.setVerticalAlignment(SwingConstants.TOP);
		labelPizza2.setHorizontalAlignment(SwingConstants.LEFT);
		labelPizza2.setOpaque(false);
		labelPizza2.setContentAreaFilled(false);
		labelPizza2.setBorderPainted(false);
		pizzaSelect.add(labelPizza2);
		labelPizza2.setIcon(new ImageIcon(pizzaIcon2));
		
		
		JButton labelPizza3 = new JButton("");
		labelPizza3.setVerticalAlignment(SwingConstants.TOP);
		labelPizza3.setHorizontalAlignment(SwingConstants.LEFT);
		labelPizza3.setOpaque(false);
		labelPizza3.setContentAreaFilled(false);
		labelPizza3.setBorderPainted(false);
		pizzaSelect.add(labelPizza3);
		labelPizza3.setIcon(new ImageIcon(pizzaIcon3));
		
		JButton pizzaTag1 = new JButton("Hawaiian: 10.99");
		pizzaTag1.setVerticalAlignment(SwingConstants.TOP);
		pizzaTag1.setHorizontalAlignment(SwingConstants.LEFT);
		pizzaTag1.setOpaque(false);
		pizzaTag1.setContentAreaFilled(false);
		pizzaTag1.setBorderPainted(false);
		pizzaSelect.add(pizzaTag1);
		
		JButton pizzaTag2 = new JButton("pepperoni: 12.99");
		pizzaTag2.setVerticalAlignment(SwingConstants.TOP);
		pizzaTag2.setHorizontalAlignment(SwingConstants.LEFT);
		pizzaTag2.setOpaque(false);
		pizzaTag2.setContentAreaFilled(false);
		pizzaTag2.setBorderPainted(false);
		pizzaSelect.add(pizzaTag2);
		
		JButton pizzaTag3 = new JButton("Veggie: 14.99");
		pizzaTag3.setVerticalAlignment(SwingConstants.TOP);
		pizzaTag3.setHorizontalAlignment(SwingConstants.LEFT);
		pizzaTag3.setOpaque(false);
		pizzaTag3.setContentAreaFilled(false);
		pizzaTag3.setBorderPainted(false);
		pizzaSelect.add(pizzaTag3);
		
		
		
		
		
		pizza.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		panelMainSelection.removeAll();
		        		panelMainSelection.add(pizzaSelect, BorderLayout.WEST);
		        		revalidate();
		                repaint();
		        	}
		        });
		
		
	
		burgerSelect.setLayout(new GridLayout(2, 3, 0, 0));
		
		
		JButton labelBurger1 = new JButton("");
		labelBurger1.setVerticalAlignment(SwingConstants.TOP);
		labelBurger1.setHorizontalAlignment(SwingConstants.LEFT);
		labelBurger1.setBackground(Color.LIGHT_GRAY);
		labelBurger1.setOpaque(false);
		labelBurger1.setContentAreaFilled(false);
		labelBurger1.setBorderPainted(false);
		burgerSelect.add(labelBurger1);
		labelBurger1.setIcon(new ImageIcon(burgerIcon1));
	
		JButton labelBurger2 = new JButton("");
		labelBurger2.setVerticalAlignment(SwingConstants.TOP);
		labelBurger2.setHorizontalAlignment(SwingConstants.LEFT);
		labelBurger2.setBackground(Color.LIGHT_GRAY);
		labelBurger2.setOpaque(false);
		labelBurger2.setContentAreaFilled(false);
		labelBurger2.setBorderPainted(false);
		burgerSelect.add(labelBurger2);
		labelBurger2.setIcon(new ImageIcon(burgerIcon2));
		
		JButton labelBurger3 = new JButton("");
		labelBurger3.setVerticalAlignment(SwingConstants.TOP);
		labelBurger3.setHorizontalAlignment(SwingConstants.LEFT);
		labelBurger3.setBackground(Color.LIGHT_GRAY);
		labelBurger3.setOpaque(false);
		labelBurger3.setContentAreaFilled(false);
		labelBurger3.setBorderPainted(false);
		burgerSelect.add(labelBurger3);
		labelBurger3.setIcon(new ImageIcon(burgerIcon3));
		
		JButton burgerTag1 = new JButton("Cheese: 10.99");
		burgerTag1.setVerticalAlignment(SwingConstants.TOP);
		burgerTag1.setHorizontalAlignment(SwingConstants.LEFT);
		burgerTag1.setOpaque(false);
		burgerTag1.setContentAreaFilled(false);
		burgerTag1.setBorderPainted(false);
		burgerSelect.add(burgerTag1);
		
		JButton burgerTag2 = new JButton("Chicken: 12.99");
		burgerTag2.setVerticalAlignment(SwingConstants.TOP);
		burgerTag2.setHorizontalAlignment(SwingConstants.LEFT);
		burgerTag2.setOpaque(false);
		burgerTag2.setContentAreaFilled(false);
		burgerTag2.setBorderPainted(false);
		burgerSelect.add(burgerTag2);
		
		JButton burgerTag3 = new JButton("Fish: 14.99");
		burgerTag3.setVerticalAlignment(SwingConstants.TOP);
		burgerTag3.setHorizontalAlignment(SwingConstants.LEFT);
		burgerTag3.setOpaque(false);
		burgerTag3.setContentAreaFilled(false);
		burgerTag3.setBorderPainted(false);
		burgerSelect.add(burgerTag3);
	
		
		burger.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelMainSelection.removeAll();
        		panelMainSelection.add(burgerSelect, BorderLayout.WEST);
        		revalidate();
                repaint();
        	}
        });
		
		
		tacoSelect.setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton labelTaco1 = new JButton("");
		labelTaco1.setVerticalAlignment(SwingConstants.TOP);
		labelTaco1.setHorizontalAlignment(SwingConstants.LEFT);
		labelTaco1.setOpaque(false);
		labelTaco1.setContentAreaFilled(false);
		labelTaco1.setBorderPainted(false);
		tacoSelect.add(labelTaco1);
		labelTaco1.setIcon(new ImageIcon(tacoIcon1));
		
		JButton labelTaco2 = new JButton("");
		labelTaco2.setVerticalAlignment(SwingConstants.TOP);
		labelTaco2.setHorizontalAlignment(SwingConstants.LEFT);
		labelTaco2.setOpaque(false);
		labelTaco2.setContentAreaFilled(false);
		labelTaco2.setBorderPainted(false);
		tacoSelect.add(labelTaco2);
		labelTaco2.setIcon(new ImageIcon(tacoIcon2));
		
		JButton labelTaco3 = new JButton("");
		labelTaco3.setVerticalAlignment(SwingConstants.TOP);
		labelTaco3.setHorizontalAlignment(SwingConstants.LEFT);
		labelTaco3.setOpaque(false);
		labelTaco3.setContentAreaFilled(false);
		labelTaco3.setBorderPainted(false);
		tacoSelect.add(labelTaco3);
		labelTaco3.setIcon(new ImageIcon(tacoIcon3));
		
		
		JButton tacoTag1 = new JButton("Fish: 5.99");
		tacoTag1.setVerticalAlignment(SwingConstants.TOP);
		tacoTag1.setHorizontalAlignment(SwingConstants.LEFT);
		tacoTag1.setOpaque(false);
		tacoTag1.setContentAreaFilled(false);
		tacoTag1.setBorderPainted(false);
		tacoSelect.add(tacoTag1);
		
		JButton tacoTag2 = new JButton("Street: 2.99");
		tacoTag2.setVerticalAlignment(SwingConstants.TOP);
		tacoTag2.setHorizontalAlignment(SwingConstants.LEFT);
		tacoTag2.setOpaque(false);
		tacoTag2.setContentAreaFilled(false);
		tacoTag2.setBorderPainted(false);
		tacoSelect.add(tacoTag2);
		
		JButton tacoTag3 = new JButton("Veggies: 4.99");
		tacoTag3.setVerticalAlignment(SwingConstants.TOP);
		tacoTag3.setHorizontalAlignment(SwingConstants.LEFT);
		tacoTag3.setOpaque(false);
		tacoTag3.setContentAreaFilled(false);
		tacoTag3.setBorderPainted(false);
		tacoSelect.add(tacoTag3);
		
		taco.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelMainSelection.removeAll();
        		panelMainSelection.add(tacoSelect, BorderLayout.WEST);
        		revalidate();
                repaint();
        	}
        });
	
		// Drinks selection 
		
		drinkSelect.setBorder(new EmptyBorder(20, 20, 20, 20));
		drinkSelect.setLayout(new GridLayout(12, 1, 0, 0));
		drinkSelect.add(coffee);
		drinkSelect.add(juice);
		drinkSelect.add(soda);
		ButtonGroup drinkGroup = new ButtonGroup();
		drinkGroup.add(coffee);
		drinkGroup.add(juice);
		drinkGroup.add(soda);
		
		JMenuItem menuDrinks = new JMenuItem("DRINKS");
		menuDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSideMenu.removeAll();
				panelMainSelection.removeAll();
				panelSideMenu.add(drinkSelect, BorderLayout.WEST);
                revalidate();
                repaint();
			}
		});
		menuBar.add(menuDrinks);
		
		coffeeSelect.setLayout(new GridLayout(2, 3, 0, 0));

		JButton labelCoffee1 = new JButton("");
		labelCoffee1.setVerticalAlignment(SwingConstants.TOP);
		labelCoffee1.setHorizontalAlignment(SwingConstants.LEFT);
		labelCoffee1.setOpaque(false);
		labelCoffee1.setContentAreaFilled(false);
		labelCoffee1.setBorderPainted(false);
		coffeeSelect.add(labelCoffee1);
		labelCoffee1.setIcon(new ImageIcon(coffeeIcon1));
		
		JButton labelCoffee2 = new JButton("");
		labelCoffee2.setVerticalAlignment(SwingConstants.TOP);
		labelCoffee2.setHorizontalAlignment(SwingConstants.LEFT);
		labelCoffee2.setOpaque(false);
		labelCoffee2.setContentAreaFilled(false);
		labelCoffee2.setBorderPainted(false);
		coffeeSelect.add(labelCoffee2);
		labelCoffee2.setIcon(new ImageIcon(coffeeIcon2));
		
		JButton labelCoffee3 = new JButton("");
		labelCoffee3.setVerticalAlignment(SwingConstants.TOP);
		labelCoffee3.setHorizontalAlignment(SwingConstants.LEFT);
		labelCoffee3.setOpaque(false);
		labelCoffee3.setContentAreaFilled(false);
		labelCoffee3.setBorderPainted(false);
		coffeeSelect.add(labelCoffee3);
		labelCoffee3.setIcon(new ImageIcon(coffeeIcon3));
		

		
		JButton coffeeTag1 = new JButton("Regular: 1.99");
		coffeeTag1.setVerticalAlignment(SwingConstants.TOP);
		coffeeTag1.setHorizontalAlignment(SwingConstants.LEFT);
		coffeeTag1.setOpaque(false);
		coffeeTag1.setContentAreaFilled(false);
		coffeeTag1.setBorderPainted(false);
		coffeeSelect.add(coffeeTag1);
		
		JButton coffeeTag2 = new JButton("HQ: 2.99");
		coffeeTag2.setVerticalAlignment(SwingConstants.TOP);
		coffeeTag2.setHorizontalAlignment(SwingConstants.LEFT);
		coffeeTag2.setOpaque(false);
		coffeeTag2.setContentAreaFilled(false);
		coffeeTag2.setBorderPainted(false);
		coffeeSelect.add(coffeeTag2);
		
		JButton coffeeTag3 = new JButton("Milk Coffee: 3.99");
		coffeeTag3.setVerticalAlignment(SwingConstants.TOP);
		coffeeTag3.setHorizontalAlignment(SwingConstants.LEFT);
		coffeeTag3.setOpaque(false);
		coffeeTag3.setContentAreaFilled(false);
		coffeeTag3.setBorderPainted(false);
		coffeeSelect.add(coffeeTag3);
		
		coffee.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelMainSelection.removeAll();
        		panelMainSelection.add(coffeeSelect, BorderLayout.WEST);
        		revalidate();
                repaint();
        	}
        });
		
		//juice Selection
		
		juiceSelect.setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton labeljuice1 = new JButton("");
		labeljuice1.setVerticalAlignment(SwingConstants.TOP);
		labeljuice1.setHorizontalAlignment(SwingConstants.LEFT);
		labeljuice1.setOpaque(false);
		labeljuice1.setContentAreaFilled(false);
		labeljuice1.setBorderPainted(false);
		juiceSelect.add(labeljuice1);
		labeljuice1.setIcon(new ImageIcon(juiceIcon1));
		
		JButton labeljuice2 = new JButton("");
		labeljuice2.setVerticalAlignment(SwingConstants.TOP);
		labeljuice2.setHorizontalAlignment(SwingConstants.LEFT);
		labeljuice2.setOpaque(false);
		labeljuice2.setContentAreaFilled(false);
		labeljuice2.setBorderPainted(false);
		juiceSelect.add(labeljuice2);
		labeljuice2.setIcon(new ImageIcon(juiceIcon2));
		
		JButton labeljuice3 = new JButton("");
		labeljuice3.setVerticalAlignment(SwingConstants.TOP);
		labeljuice3.setHorizontalAlignment(SwingConstants.LEFT);
		labeljuice3.setOpaque(false);
		labeljuice3.setContentAreaFilled(false);
		labeljuice3.setBorderPainted(false);
		juiceSelect.add(labeljuice3);
		labeljuice3.setIcon(new ImageIcon(juiceIcon3));
		

		JButton juiceTag1 = new JButton("Orange: 1.99");
		juiceTag1.setVerticalAlignment(SwingConstants.TOP);
		juiceTag1.setHorizontalAlignment(SwingConstants.LEFT);
		juiceTag1.setOpaque(false);
		juiceTag1.setContentAreaFilled(false);
		juiceTag1.setBorderPainted(false);
		juiceSelect.add(juiceTag1);
		
		JButton juiceTag2 = new JButton("Mango: 1.99");
		juiceTag2.setVerticalAlignment(SwingConstants.TOP);
		juiceTag2.setHorizontalAlignment(SwingConstants.LEFT);
		juiceTag2.setOpaque(false);
		juiceTag2.setContentAreaFilled(false);
		juiceTag2.setBorderPainted(false);
		juiceSelect.add(juiceTag2);
		
		JButton juiceTag3 = new JButton("Coctail: 3.99");
		juiceTag3.setVerticalAlignment(SwingConstants.TOP);
		juiceTag3.setHorizontalAlignment(SwingConstants.LEFT);
		juiceTag3.setOpaque(false);
		juiceTag3.setContentAreaFilled(false);
		juiceTag3.setBorderPainted(false);
		juiceSelect.add(juiceTag3);

		
		
		juice.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelMainSelection.removeAll();
        		panelMainSelection.add(juiceSelect, BorderLayout.WEST);
        		revalidate();
                repaint();
        	}
        });
		
		sodaSelect.setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton labelSoda1 = new JButton("");
		labelSoda1.setVerticalAlignment(SwingConstants.TOP);
		labelSoda1.setHorizontalAlignment(SwingConstants.LEFT);
		labelSoda1.setOpaque(false);
		labelSoda1.setContentAreaFilled(false);
		labelSoda1.setBorderPainted(false);
		sodaSelect.add(labelSoda1);
		labelSoda1.setIcon(new ImageIcon(sodaIcon1));
		
		JButton labelSoda2 = new JButton("");
		labelSoda2.setVerticalAlignment(SwingConstants.TOP);
		labelSoda2.setHorizontalAlignment(SwingConstants.LEFT);
		labelSoda2.setOpaque(false);
		labelSoda2.setContentAreaFilled(false);
		labelSoda2.setBorderPainted(false);
		sodaSelect.add(labelSoda2);
		labelSoda2.setIcon(new ImageIcon(sodaIcon2));
		
		JButton labelSoda3 = new JButton("");
		labelSoda3.setVerticalAlignment(SwingConstants.TOP);
		labelSoda3.setHorizontalAlignment(SwingConstants.LEFT);
		labelSoda3.setOpaque(false);
		labelSoda3.setContentAreaFilled(false);
		labelSoda3.setBorderPainted(false);
		sodaSelect.add(labelSoda3);
		labelSoda3.setIcon(new ImageIcon(sodaIcon3));
		
		JButton sodaTag1 = new JButton("Coca~cola: 0.99");
		sodaTag1.setVerticalAlignment(SwingConstants.TOP);
		sodaTag1.setHorizontalAlignment(SwingConstants.LEFT);
		sodaTag1.setOpaque(false);
		sodaTag1.setContentAreaFilled(false);
		sodaTag1.setBorderPainted(false);
		sodaSelect.add(sodaTag1);
		
		JButton sodaTag2 = new JButton("Orange: 0.99");
		sodaTag2.setVerticalAlignment(SwingConstants.TOP);
		sodaTag2.setHorizontalAlignment(SwingConstants.LEFT);
		sodaTag2.setOpaque(false);
		sodaTag2.setContentAreaFilled(false);
		sodaTag2.setBorderPainted(false);
		sodaSelect.add(sodaTag2);
		
		JButton sodaTag3 = new JButton("Sprite: 0.99");
		sodaTag3.setVerticalAlignment(SwingConstants.TOP);
		sodaTag3.setHorizontalAlignment(SwingConstants.LEFT);
		sodaTag3.setOpaque(false);
		sodaTag3.setContentAreaFilled(false);
		sodaTag3.setBorderPainted(false);
		sodaSelect.add(sodaTag3);
		

		
		soda.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelMainSelection.removeAll();
        		panelMainSelection.add(sodaSelect, BorderLayout.WEST);
        		revalidate();
                repaint();
        	}
        });
		
		
		
		// Dessert Selection 
		
		dessertSelect.setLayout(new GridLayout(2, 4, 0, 0));
		
		JButton labelDessert1 = new JButton("");
		labelDessert1.setVerticalAlignment(SwingConstants.TOP);
		labelDessert1.setHorizontalAlignment(SwingConstants.LEFT);
		labelDessert1.setOpaque(false);
		labelDessert1.setContentAreaFilled(false);
		labelDessert1.setBorderPainted(false);
		dessertSelect.add(labelDessert1);
		labelDessert1.setIcon(new ImageIcon(dessertIcon1));
		
		JButton labelDessert2 = new JButton("");
		labelDessert2.setVerticalAlignment(SwingConstants.TOP);
		labelDessert2.setHorizontalAlignment(SwingConstants.LEFT);
		labelDessert2.setOpaque(false);
		labelDessert2.setContentAreaFilled(false);
		labelDessert2.setBorderPainted(false);
		dessertSelect.add(labelDessert2);
		labelDessert2.setIcon(new ImageIcon(dessertIcon2));
		
		JButton labelDessert3 = new JButton("");
		labelDessert3.setVerticalAlignment(SwingConstants.TOP);
		labelDessert3.setHorizontalAlignment(SwingConstants.LEFT);
		labelDessert3.setOpaque(false);
		labelDessert3.setContentAreaFilled(false);
		labelDessert3.setBorderPainted(false);
		dessertSelect.add(labelDessert3);
		labelDessert3.setIcon(new ImageIcon(dessertIcon3));
		
		JButton labelDessert4 = new JButton("");
		labelDessert4.setVerticalAlignment(SwingConstants.TOP);
		labelDessert4.setHorizontalAlignment(SwingConstants.LEFT);
		labelDessert4.setOpaque(false);
		labelDessert4.setContentAreaFilled(false);
		labelDessert4.setBorderPainted(false);
		dessertSelect.add(labelDessert4);
		labelDessert4.setIcon(new ImageIcon(dessertIcon4));
		

		

		JButton dessertTag1 = new JButton("Cupcake: 2.99");
		dessertTag1.setVerticalAlignment(SwingConstants.TOP);
		dessertTag1.setHorizontalAlignment(SwingConstants.LEFT);
		dessertTag1.setOpaque(false);
		dessertTag1.setContentAreaFilled(false);
		dessertTag1.setBorderPainted(false);
		dessertSelect.add(dessertTag1);
		
		JButton dessertTag2 = new JButton("Black Forrest: 3.99");
		dessertTag2.setVerticalAlignment(SwingConstants.TOP);
		dessertTag2.setHorizontalAlignment(SwingConstants.LEFT);
		dessertTag2.setOpaque(false);
		dessertTag2.setContentAreaFilled(false);
		dessertTag2.setBorderPainted(false);
		dessertSelect.add(dessertTag2);
		
		JButton dessertTag3 = new JButton("Almond: 4.99");
		dessertTag3.setVerticalAlignment(SwingConstants.TOP);
		dessertTag3.setHorizontalAlignment(SwingConstants.LEFT);
		dessertTag3.setOpaque(false);
		dessertTag3.setContentAreaFilled(false);
		dessertTag3.setBorderPainted(false);
		dessertSelect.add(dessertTag3);
		
		JButton dessertTag4 = new JButton("Blueberry: 2.99");
		dessertTag4.setVerticalAlignment(SwingConstants.TOP);
		dessertTag4.setHorizontalAlignment(SwingConstants.LEFT);
		dessertTag4.setOpaque(false);
		dessertTag4.setContentAreaFilled(false);
		dessertTag4.setBorderPainted(false);
		dessertSelect.add(dessertTag4);
		
		
		
		JMenuItem menuDesserts = new JMenuItem("DESSERTS");
		menuDesserts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSideMenu.removeAll();
				panelMainSelection.removeAll();
				panelMainSelection.add(dessertSelect,BorderLayout.CENTER);
                revalidate();
                repaint();
			}
		});
		menuBar.add(menuDesserts);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelLogo = new JPanel();
		contentPane.add(panelLogo, BorderLayout.NORTH);
		
		Image logo = new ImageIcon(order.class.getResource("/firstTry/foodlogo.png")).getImage().getScaledInstance(40, 35, Image.SCALE_DEFAULT);

		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBackground(Color.LIGHT_GRAY);
		panelLogo.add(label);
		label.setIcon(new ImageIcon(logo));
		
		JLabel lblOrderfoodcom = new JLabel("Orderfood.com");
		lblOrderfoodcom.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		panelLogo.add(lblOrderfoodcom);
		
		
		contentPane.add(panelSideMenu, BorderLayout.WEST);
		panelSideMenu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblThisIt = new JLabel("Start here");
		panelSideMenu.add(lblThisIt);
		
		
		
		contentPane.add(panelMainSelection, BorderLayout.CENTER);
		panelMainSelection.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblOrderHere = new JLabel("Order here");
		lblOrderHere.setPreferredSize(new Dimension(500, 300));
		panelMainSelection.add(lblOrderHere);
		
//	
		
		JPanel panelFooter = new JPanel();
		panelFooter.setMinimumSize(new Dimension(20, 20));
		panelFooter.setPreferredSize(new Dimension(700, 150));
		contentPane.add(panelFooter, BorderLayout.SOUTH);
		panelFooter.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lblTotal = new JLabel("Total :  				$0");
		lblTotal.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setVerticalAlignment(SwingConstants.BOTTOM);
		panelFooter.add(lblTotal);
		
		
		
		
		//// adding  pizzas to the total
		labelPizza1.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				pizzaPrice1.setText(String.format("%d * Hawaiian: 10.99  =	%.2f", count, count*10.99));
				panelFooter.add(pizzaPrice1);
				FoodApp.addOrder(pizza1);
				FoodApp.writeOrder();
				sub = sub + 10.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
				
			}
		});
		
		labelPizza2.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				pizzaPrice2.setText(String.format("%d * pepperoni: 12.99  =	%.2f", count, count*12.99));
				panelFooter.add(pizzaPrice2);
				FoodApp.addOrder(pizza2);
				FoodApp.writeOrder();
				sub = sub + 12.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		
		labelPizza3.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				pizzaPrice3.setText(String.format("%d * Veggie: 14.99  =	%.2f", count, count*14.99));
				panelFooter.add(pizzaPrice3);
				FoodApp.addOrder(pizza3);
				FoodApp.writeOrder();
				sub = sub + 14.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		


		
		////adding burger's to total
		labelBurger1.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				burgerPrice1.setText(String.format("%d * Cheese: 10.99  =	%.2f", count, count*10.99));
				panelFooter.add(burgerPrice1);
				FoodApp.addOrder(burger1);
				FoodApp.writeOrder();
				sub = sub + 10.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		
		labelBurger2.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				burgerPrice2.setText(String.format("%d * Chicken: 12.99 =	%.2f", count, count*12.99));
				panelFooter.add(burgerPrice2);
				FoodApp.addOrder(burger2);
				FoodApp.writeOrder();
				sub = sub + 12.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		
		labelBurger3.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				burgerPrice3.setText(String.format("%d * Fish: 14.99  =	%.2f", count, count*14.99));
				panelFooter.add(burgerPrice3);
				FoodApp.addOrder(burger1);
				FoodApp.writeOrder();
				sub = sub + 14.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		

		
		/////adding tacos
		labelTaco1.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				tacoPrice1.setText(String.format("%d * Fish: 5.99  =	%.2f", count, count*5.99));
				panelFooter.add(tacoPrice1);
				FoodApp.addOrder(taco1);
				FoodApp.writeOrder();
				sub = sub + 5.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		
		labelTaco2.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				tacoPrice2.setText(String.format("%d * Street: 2.99  =	%.2f", count, count*2.99));
				panelFooter.add(tacoPrice2);
				FoodApp.addOrder(taco2);
				FoodApp.writeOrder();
				sub = sub + 2.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		
		labelTaco3.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				count++;
				tacoPrice3.setText(String.format("%d * Veggies: 4.99  =	%.2f", count, count*4.99));
				panelFooter.add(tacoPrice3);
				FoodApp.addOrder(taco3);
				FoodApp.writeOrder();
				sub = sub + 4.99;
				lblTotal.setText(String.format("Total: $ %.2f", sub));
			}
		});
		

		
	/////adding Coffee
			labelCoffee1.addActionListener(new ActionListener() {
				int count = 0;
				public void actionPerformed(ActionEvent e) {
					count++;
					coffeePrice1.setText(String.format("%d * Regular: 1.99  =	%.2f", count, count*1.99));
					panelFooter.add(coffeePrice1);
					FoodApp.addOrder(coffee1);
					FoodApp.writeOrder();
					sub = sub + 1.99;
					lblTotal.setText(String.format("Total: $ %.2f", sub));
				}
			});
			
			labelCoffee2.addActionListener(new ActionListener() {
				int count = 0;
				public void actionPerformed(ActionEvent e) {
					count++;
					coffeePrice2.setText(String.format("%d * HQ: 2.99  =	%.2f", count, count*2.99));
					panelFooter.add(coffeePrice2);
					FoodApp.addOrder(coffee2);
					FoodApp.writeOrder();
					sub = sub + 2.99;
					lblTotal.setText(String.format("Total: $ %.2f", sub));
				}
			});
			
			labelCoffee3.addActionListener(new ActionListener() {
				int count = 0;
				public void actionPerformed(ActionEvent e) {
					count++;
					coffeePrice3.setText(String.format("%d * Milk Coffee: 3.99  =	%.2f", count, count*3.99));
					panelFooter.add(coffeePrice3);
					FoodApp.addOrder(coffee3);
					FoodApp.writeOrder();
					sub = sub + 3.99;
					lblTotal.setText(String.format("Total: $ %.2f", sub));
				}
			});
			
		
		/////adding Juice
					labeljuice1.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							juicePrice1.setText(String.format("%d * Orange: 1.99  =	%.2f", count, count*1.99));
							panelFooter.add(juicePrice1);
							FoodApp.addOrder(juice1);
							FoodApp.writeOrder();
							sub = sub + 1.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labeljuice2.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							juicePrice2.setText(String.format("%d * Mango: 1.99  =	%.2f", count, count*1.99));
							panelFooter.add(juicePrice2);
							FoodApp.addOrder(juice2);
							FoodApp.writeOrder();
							sub = sub + 1.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labeljuice3.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							juicePrice3.setText(String.format("%d * Coctail: 3.99  =	%.2f", count, count*3.99));
							panelFooter.add(juicePrice3);
							FoodApp.addOrder(juice3);
							FoodApp.writeOrder();
							sub = sub + 3.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					
				/////adding Juice
					labelSoda1.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							sodaPrice1.setText(String.format("%d * Coca~cola: 0.99  =	%.2f", count, count*1.99));
							panelFooter.add(sodaPrice1);
							FoodApp.addOrder(soda1);
							FoodApp.writeOrder();
							sub = sub + 1.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labelSoda2.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							sodaPrice2.setText(String.format("%d * Orange: 0.99  =	%.2f", count, count*1.99));
							panelFooter.add(sodaPrice2);
							FoodApp.addOrder(soda2);
							FoodApp.writeOrder();
							sub = sub + 1.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labelSoda3.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							sodaPrice3.setText(String.format("%d * Sprite: 0.99  =	%.2f", count, count*3.99));
							panelFooter.add(sodaPrice3);
							FoodApp.addOrder(soda3);
							FoodApp.writeOrder();
							sub = sub + 3.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});

			
		/////adding Desserts
					labelDessert1.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							dessertPrice1.setText(String.format("%d * Cupcake: 2.99  =	%.2f", count, count*2.99));
							panelFooter.add(dessertPrice1);
							FoodApp.addOrder(dessert1);
							FoodApp.writeOrder();
							sub = sub + 2.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labelDessert2.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							dessertPrice2.setText(String.format("%d * Black Forrest: 3.99  =	%.2f", count, count*3.99));
							panelFooter.add(dessertPrice2);
							FoodApp.addOrder(dessert2);
							FoodApp.writeOrder();
							sub = sub + 3.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labelDessert3.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							dessertPrice3.setText(String.format("%d * Almond: 4.99  =	%.2f", count, count*4.99));
							panelFooter.add(dessertPrice3);
							FoodApp.addOrder(dessert3);
							FoodApp.writeOrder();
							sub = sub + 3.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});
					
					labelDessert4.addActionListener(new ActionListener() {
						int count = 0;
						public void actionPerformed(ActionEvent e) {
							count++;
							dessertPrice4.setText(String.format("%d * Blueberry: 2.99  =	%.2f", count, count*2.99));
							panelFooter.add(dessertPrice4);
							FoodApp.addOrder(dessert4);
							FoodApp.writeOrder();
							sub = sub + 2.99;
							lblTotal.setText(String.format("Total: $ %.2f", sub));
						}
					});

			
			


	}
}