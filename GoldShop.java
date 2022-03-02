import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//----------------------- Setting1 ring -------------------------

class Rings3 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Ring1.jpg");
ImageIcon i2 = new ImageIcon("Ring2.jpg");
ImageIcon i3 = new ImageIcon("Ring3.jpg");
ImageIcon i4 = new ImageIcon("Ring4.jpg");

JTextField t2 = Selling3.t2;

JTextField t3 = Selling3.t3;
JTextField t4 = Selling3.t4;
JTextField t5 = Selling3.t5;

JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);

/*
JButton b1 = new JButton("F-100");
JButton b2 = new JButton("F-101");
JButton b3 = new JButton("F-102");
JButton b4 = new JButton("F-103");
*/

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Rings3 ( ) { 
super("Ring");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "R-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "R-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=7;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "R-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "R-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=9;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 foot-chain -------------------------

class Foot3 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling3.t2;

JTextField t3 = Selling3.t3;
JTextField t4 = Selling3.t4;
JTextField t5 = Selling3.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("F-100");
JButton b2 = new JButton("F-101");
JButton b3 = new JButton("F-102");
JButton b4 = new JButton("F-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Foot3( ) { 
super("Foot-Chain");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "F-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "F-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "F-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "F-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=10;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 hand-chain -------------------------

class Hand3 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling3.t2;

JTextField t3 = Selling3.t3;
JTextField t4 = Selling3.t4;
JTextField t5 = Selling3.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("H-100");
JButton b2 = new JButton("H-101");
JButton b3 = new JButton("H-102");
JButton b4 = new JButton("H-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Hand3 ( ) { 
super("Hand-Chain");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "H-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=5;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "H-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "H-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=10;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "H-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 Necklace -------------------------

class Necklace3 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling3.t2;

JTextField t3 = Selling3.t3;
JTextField t4 = Selling3.t4;
JTextField t5 = Selling3.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("N-100");
JButton b2 = new JButton("N-101");
JButton b3 = new JButton("N-102");
JButton b4 = new JButton("N-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Necklace3 ( ) { 
super("Necklace");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "N-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "N-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=1;
		  net_pae_earrings=4;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "N-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "N-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 Earrings -------------------------

class Earrings3 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling3.t2;

JTextField t3 = Selling3.t3;
JTextField t4 = Selling3.t4;
JTextField t5 = Selling3.t5;


JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Earrings3 ( ) { 
super("Earrings");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "E-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=4;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "E-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=7;
		  net_ywe_earrings=1;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "E-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "E-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=5;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}

// --------------------------------------------------------------------

class Voucher3 extends JFrame {

double goldprice = MainFrame.goldprice;

double total_cost = Selling2.total_cost;

double pay = Selling2.pay;
double change = Selling2.change;

String name = Selling2.name;
String item = Selling2.item;

int net_kyat = Selling2.net_kyat;
int net_pae = Selling2.net_pae;
int net_ywe = Selling2.net_ywe;

int lose_kyat = Selling2.lose_kyat;
int lose_pae = Selling2.lose_pae;
int lose_ywe = Selling2.lose_ywe;

int total_kyat = Selling2.total_kyat;
int total_pae = Selling2.total_pae;
int total_ywe = Selling2.total_ywe;

int service = Selling2.service;

public Voucher3( ) { 

super("Voucher");
setBounds(200,0,700,700);

JPanel pane = new JPanel( );
pane.setLayout(null);
pane.setBackground(Color.WHITE);


JLabel na = new JLabel("Name : "+name);
na.setBounds(250,100,200,30);
pane.add(na);

JLabel it = new JLabel ("Item No : "+item);
it.setBounds(500,100,200,30);
pane.add(it);

JLabel net = new JLabel ("Net Weight : "+net_kyat+" / "+net_pae+" / "+net_ywe +"    (Kyat / Pae / Ywe)");
net.setBounds(250,150,300,30);
pane.add(net);

JLabel lose = new JLabel ("Lose Weight : "+lose_kyat+" / "+lose_pae+" / "+lose_ywe +"    (Kyat / Pae / Ywe)");
lose.setBounds(250,200,300,30);
pane.add(lose);

JLabel total = new JLabel ("Total Weight : "+total_kyat+" / "+total_pae+" / "+total_ywe +"    (Kyat / Pae / Ywe)");
total.setBounds(250,250,300,30);
pane.add(total);

JLabel ser = new JLabel("Service : "+service+"  (Kyats)");
ser.setBounds(250,300,150,30);
pane.add(ser);


JLabel sep = new JLabel(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
sep.setBounds(250,350,350,30);
pane.add(sep);

JLabel tot = new JLabel("Total Cost : "+total_cost+" Kyats");
tot.setBounds(300,400,200,30);
pane.add(tot);

JLabel pa = new JLabel("Paid : "+pay+" Kyats");
pa.setBounds(300,450,200,30);
pane.add(pa);

JLabel chg = new JLabel("Change : "+change+" Kyats");
chg.setBounds(300,500,200,30);
pane.add(chg);


ImageIcon i1 = new ImageIcon("LL_Theme6.jpg");
JLabel theme = new JLabel(i1);
theme.setBounds(-10,-10,900,847);
pane.add(theme);

setContentPane(pane);
setVisible(true);

} //constr

} // voucher


class Selling3 extends JFrame implements ActionListener { 

JButton rb1 = new JButton("Earrings");
JButton rb2 = new JButton("Necklace");
JButton rb3 = new JButton("Hand-Chain");
JButton rb4 = new JButton("Foot-Chain");
JButton rb5 = new JButton("Rings");


public static String name;
public static String item;
public static int net_kyat,net_pae,net_ywe;
public static int lose_kyat,lose_pae,lose_ywe;
public static int total_kyat,total_pae,total_ywe;
public static int service;

public static double pay,change;

public static double total_cost=0;
double one_pae,one_ywe;

public static JTextField t1 = new JTextField( );

public static JTextField t2 = new JTextField( );

public static JTextField t3 = new JTextField( );
public static JTextField t4 = new JTextField( );
public static JTextField t5 = new JTextField( );

JTextField t6 = new JTextField( );
JTextField t7 = new JTextField( );
JTextField t8 = new JTextField( );

JTextField t9 = new JTextField( );
JTextField t10 = new JTextField( );
JTextField t11 = new JTextField( );

JTextField t12 = new JTextField( );
JTextField t13 = new JTextField( );

JButton cal = new JButton("Calculate");

JButton back = new JButton("Back");

JButton reset = new JButton("Reset");

double gprice = MainFrame.paeye15;

public Selling3( ) { 

super("Gold");
setSize(1366,730);


JPanel pane = new JPanel( );
pane.setLayout(null);

JLabel l1 = new JLabel("Name :");
l1.setBounds(800,100,100,30);
pane.add(l1);

t1.setBounds(900,100,100,30);
t1.setOpaque(false);
pane.add(t1);

JLabel l2 = new JLabel("Item No :");
l2.setBounds(1050,100,100,30);
pane.add(l2);

t2.setBounds(1150,100,100,30);
t2.setEditable(false);
t2.setOpaque(false);
pane.add(t2);

JLabel kyat = new JLabel("Kyat");
kyat.setForeground(new Color(225,225,0));
kyat.setBounds(900,150,100,30);
pane.add(kyat);

JLabel pae = new JLabel("Pae");
pae.setForeground(new Color(225,225,0));
pae.setBounds(1000,150,100,30);
pane.add(pae);

JLabel ywe = new JLabel("Ywe");
ywe.setForeground(new Color(225,225,0));
ywe.setBounds(1100,150,100,39);
pane.add(ywe);

// --------------- net weight -------------------------

JLabel netweight = new JLabel("Net Weight :");
netweight.setBounds(800,200,100,30);
pane.add(netweight);

t3.setBounds(900,200,50,30);
t3.setOpaque(false);
pane.add(t3);

t4.setBounds(1000,200,50,30);
t4.setOpaque(false);
pane.add(t4);

t5.setBounds(1100,200,50,30);
t5.setOpaque(false);
pane.add(t5);

// ------------------------------------------------------

// ---------------- Lose Weight -------------------------

JLabel loseweight = new JLabel("Lose Weight :");
loseweight.setBounds(800,250,100,30);
pane.add(loseweight);

t6.setBounds(900,250,50,30);
t6.setOpaque(false);
pane.add(t6);

t7.setBounds(1000,250,50,30);
t7.setOpaque(false);
pane.add(t7);

t8.setBounds(1100,250,50,30);
t8.setOpaque(false);
pane.add(t8);


//-------------------------------------------------------

// ---------------- Total Weight -------------------------

JLabel tweight = new JLabel("Total Weight :");
tweight.setBounds(800,300,100,30);
pane.add(tweight);

t9.setBounds(900,300,50,30);
t9.setOpaque(false);
t9.setEditable(false);
pane.add(t9);

t10.setBounds(1000,300,50,30);
t10.setOpaque(false);
t10.setEditable(false);
pane.add(t10);

t11.setBounds(1100,300,50,30);
t11.setOpaque(false);
t11.setEditable(false);
pane.add(t11);


//-------------------------------------------------------

JLabel service = new JLabel("Service");
service.setBounds(800,350,100,30);
pane.add(service);

t12.setBounds(900,350,250,30);
t12.setOpaque(false);
pane.add(t12);

JLabel unit1 = new JLabel("Kyat");
unit1.setForeground(new Color(225,225,0));
unit1.setBounds(1200,350,100,30);
pane.add(unit1);

JLabel t_cost = new JLabel("Total Cost :");
t_cost.setBounds(800,400,100,30);
pane.add(t_cost);

JLabel unit2 = new JLabel("Kyat");
unit2.setForeground(new Color(225,225,0));
unit2.setBounds(1200,400,100,30);
pane.add(unit2);

t13.setBounds(900,400,250,30);
t13.setEditable(false);
t13.setOpaque(false);
pane.add(t13);


cal.addActionListener(this);
cal.setBounds(900,450,100,30);
cal.setOpaque(false);
pane.add(cal);

reset.addActionListener(this);
reset.setBounds(1050,450,100,30);
reset.setOpaque(false);
pane.add(reset);

back.addActionListener(this);
back.setBounds(970,500,100,30);
back.setOpaque(false);
pane.add(back);


rb1.addActionListener(this);
rb2.addActionListener(this);
rb3.addActionListener(this);
rb4.addActionListener(this);
rb5.addActionListener(this);

rb1.setBounds(100,100,100,30);
rb1.setOpaque(false);
pane.add(rb1);

rb2.setBounds(250,100,100,30);
rb2.setOpaque(false);
pane.add(rb2);

rb3.setBounds(100,150,100,30);
rb3.setOpaque(false);
pane.add(rb3);

rb4.setBounds(250,150,100,30);
rb4.setOpaque(false);
pane.add(rb4);

rb5.setBounds(170,200,100,30);
rb5.setOpaque(false);
pane.add(rb5);

ImageIcon i1 = new ImageIcon("LL_Theme4.jpg");
JLabel background = new JLabel(i1);
background.setBounds(-10,0,1366,730);
pane.add(background);

setContentPane(pane);
setVisible(true);

} // constr

public void actionPerformed(ActionEvent ae) { 

if (ae.getActionCommand().equals("Earrings")) { Earrings3 obj = new Earrings3(); } //rb1

if (ae.getActionCommand().equals("Necklace")) { Necklace3 obj = new Necklace3(); }

if (ae.getActionCommand().equals("Hand-Chain")) { Hand3 obj = new Hand3(); }

if (ae.getActionCommand().equals("Foot-Chain")) { Foot3 obj = new Foot3(); }

if (ae.getActionCommand().equals("Rings")) { Rings3 obj = new Rings3( ); } //rb5


if (ae.getActionCommand().equals("Reset")) { 

name = "";
item = "";

net_kyat = 0;
net_pae = 0;
net_ywe = 0;

lose_kyat = 0;
lose_pae = 0;
lose_ywe = 0;

total_kyat = 0;
total_pae = 0;
total_ywe = 0;

service = 0;

total_cost = 0;

t1.setText("");
t2.setText("");

t3.setText("");
t4.setText("");
t5.setText("");

t6.setText("");
t7.setText("");
t8.setText("");

t9.setText("");
t10.setText("");
t11.setText("");

t12.setText("");

t13.setText("");


 }


if (ae.getActionCommand().equals("Calculate")) { 

double goldprice = MainFrame.paeye15;
String s;

name = t1.getText();
item = t2.getText();

net_kyat = Integer.parseInt(t3.getText());
net_pae = Integer.parseInt(t4.getText());
net_ywe = Integer.parseInt(t5.getText());

lose_kyat = Integer.parseInt(t6.getText());
lose_pae = Integer.parseInt(t7.getText());
lose_ywe = Integer.parseInt(t8.getText());

service = Integer.parseInt(t12.getText());

total_kyat = net_kyat + lose_kyat;
total_pae = net_pae + lose_pae;
total_ywe = net_ywe + lose_ywe;

one_pae = goldprice / 16;
one_ywe = one_pae / 8;

t9.setText(""+total_kyat);
t10.setText(""+total_pae);
t11.setText(""+total_ywe);

total_cost = total_kyat * goldprice + total_pae * one_pae + total_ywe * one_ywe + service;

t13.setText(""+total_cost);

s = JOptionPane.showInputDialog(null,"Enter Your Payment","Payment",JOptionPane.PLAIN_MESSAGE);
pay = Double.parseDouble(s);

change = pay - total_cost;

Voucher3 v = new Voucher3();
						} //if

if (ae.getActionCommand().equals("Back")) { 

setVisible(false);
MainFrame f = new MainFrame();

} // if


} // action

} // Selling2 (Gold)



//----------------------- Setting1 ring -------------------------

class Rings2 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Ring1.jpg");
ImageIcon i2 = new ImageIcon("Ring2.jpg");
ImageIcon i3 = new ImageIcon("Ring3.jpg");
ImageIcon i4 = new ImageIcon("Ring4.jpg");

JTextField t2 = Selling2.t2;

JTextField t3 = Selling2.t3;
JTextField t4 = Selling2.t4;
JTextField t5 = Selling2.t5;

JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);

/*
JButton b1 = new JButton("F-100");
JButton b2 = new JButton("F-101");
JButton b3 = new JButton("F-102");
JButton b4 = new JButton("F-103");
*/

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Rings2 ( ) { 
super("Ring");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "R-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "R-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=7;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "R-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "R-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=9;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 foot-chain -------------------------

class Foot2 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling2.t2;

JTextField t3 = Selling2.t3;
JTextField t4 = Selling2.t4;
JTextField t5 = Selling2.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("F-100");
JButton b2 = new JButton("F-101");
JButton b3 = new JButton("F-102");
JButton b4 = new JButton("F-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Foot2( ) { 
super("Foot-Chain");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "F-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "F-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "F-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "F-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=10;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 hand-chain -------------------------

class Hand2 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling2.t2;

JTextField t3 = Selling2.t3;
JTextField t4 = Selling2.t4;
JTextField t5 = Selling2.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("H-100");
JButton b2 = new JButton("H-101");
JButton b3 = new JButton("H-102");
JButton b4 = new JButton("H-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Hand2 ( ) { 
super("Hand-Chain");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "H-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=5;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "H-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "H-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=10;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "H-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 Necklace -------------------------

class Necklace2 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling2.t2;

JTextField t3 = Selling2.t3;
JTextField t4 = Selling2.t4;
JTextField t5 = Selling2.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("N-100");
JButton b2 = new JButton("N-101");
JButton b3 = new JButton("N-102");
JButton b4 = new JButton("N-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Necklace2 ( ) { 
super("Necklace");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "N-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "N-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=1;
		  net_pae_earrings=4;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "N-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "N-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting2 Earrings -------------------------

class Earrings2 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling2.t2;

JTextField t3 = Selling2.t3;
JTextField t4 = Selling2.t4;
JTextField t5 = Selling2.t5;


JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Earrings2 ( ) { 
super("Earrings");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "E-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=4;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "E-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=7;
		  net_ywe_earrings=1;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "E-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "E-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=5;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}

// --------------------------------------------------------------------

class Voucher2 extends JFrame {

double goldprice = MainFrame.goldprice;

double total_cost = Selling2.total_cost;

double pay = Selling2.pay;
double change = Selling2.change;

String name = Selling2.name;
String item = Selling2.item;

int net_kyat = Selling2.net_kyat;
int net_pae = Selling2.net_pae;
int net_ywe = Selling2.net_ywe;

int lose_kyat = Selling2.lose_kyat;
int lose_pae = Selling2.lose_pae;
int lose_ywe = Selling2.lose_ywe;

int total_kyat = Selling2.total_kyat;
int total_pae = Selling2.total_pae;
int total_ywe = Selling2.total_ywe;

int service = Selling2.service;

public Voucher2( ) { 

super("Voucher");
setBounds(200,0,700,700);

JPanel pane = new JPanel( );
pane.setLayout(null);
pane.setBackground(Color.WHITE);


JLabel na = new JLabel("Name : "+name);
na.setBounds(250,100,200,30);
pane.add(na);

JLabel it = new JLabel ("Item No : "+item);
it.setBounds(500,100,200,30);
pane.add(it);

JLabel net = new JLabel ("Net Weight : "+net_kyat+" / "+net_pae+" / "+net_ywe +"    (Kyat / Pae / Ywe)");
net.setBounds(250,150,300,30);
pane.add(net);

JLabel lose = new JLabel ("Lose Weight : "+lose_kyat+" / "+lose_pae+" / "+lose_ywe +"    (Kyat / Pae / Ywe)");
lose.setBounds(250,200,300,30);
pane.add(lose);

JLabel total = new JLabel ("Total Weight : "+total_kyat+" / "+total_pae+" / "+total_ywe +"    (Kyat / Pae / Ywe)");
total.setBounds(250,250,300,30);
pane.add(total);

JLabel ser = new JLabel("Service : "+service+"  (Kyats)");
ser.setBounds(250,300,150,30);
pane.add(ser);


JLabel sep = new JLabel(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
sep.setBounds(250,350,350,30);
pane.add(sep);

JLabel tot = new JLabel("Total Cost : "+total_cost+" Kyats");
tot.setBounds(300,400,200,30);
pane.add(tot);

JLabel pa = new JLabel("Paid : "+pay+" Kyats");
pa.setBounds(300,450,200,30);
pane.add(pa);

JLabel chg = new JLabel("Change : "+change+" Kyats");
chg.setBounds(300,500,200,30);
pane.add(chg);


ImageIcon i1 = new ImageIcon("LL_Theme6.jpg");
JLabel theme = new JLabel(i1);
theme.setBounds(-10,-10,900,847);
pane.add(theme);

setContentPane(pane);
setVisible(true);

} //constr

} // voucher


class Selling2 extends JFrame implements ActionListener { 

JButton rb1 = new JButton("Earrings");
JButton rb2 = new JButton("Necklace");
JButton rb3 = new JButton("Hand-Chain");
JButton rb4 = new JButton("Foot-Chain");
JButton rb5 = new JButton("Rings");


public static String name;
public static String item;
public static int net_kyat,net_pae,net_ywe;
public static int lose_kyat,lose_pae,lose_ywe;
public static int total_kyat,total_pae,total_ywe;
public static int service;

public static double pay,change;

public static double total_cost=0;
double one_pae,one_ywe;

public static JTextField t1 = new JTextField( );

public static JTextField t2 = new JTextField( );

public static JTextField t3 = new JTextField( );
public static JTextField t4 = new JTextField( );
public static JTextField t5 = new JTextField( );

JTextField t6 = new JTextField( );
JTextField t7 = new JTextField( );
JTextField t8 = new JTextField( );

JTextField t9 = new JTextField( );
JTextField t10 = new JTextField( );
JTextField t11 = new JTextField( );

JTextField t12 = new JTextField( );
JTextField t13 = new JTextField( );

JButton cal = new JButton("Calculate");

JButton back = new JButton("Back");

JButton reset = new JButton("Reset");

double gprice = MainFrame.coin;

public Selling2( ) { 

super("Gold");
setSize(1366,730);


JPanel pane = new JPanel( );
pane.setLayout(null);

JLabel l1 = new JLabel("Name :");
l1.setBounds(800,100,100,30);
pane.add(l1);

t1.setBounds(900,100,100,30);
t1.setOpaque(false);
pane.add(t1);

JLabel l2 = new JLabel("Item No :");
l2.setBounds(1050,100,100,30);
pane.add(l2);

t2.setBounds(1150,100,100,30);
t2.setEditable(false);
t2.setOpaque(false);
pane.add(t2);

JLabel kyat = new JLabel("Kyat");
kyat.setForeground(new Color(225,225,0));
kyat.setBounds(900,150,100,30);
pane.add(kyat);

JLabel pae = new JLabel("Pae");
pae.setForeground(new Color(225,225,0));
pae.setBounds(1000,150,100,30);
pane.add(pae);

JLabel ywe = new JLabel("Ywe");
ywe.setForeground(new Color(225,225,0));
ywe.setBounds(1100,150,100,39);
pane.add(ywe);

// --------------- net weight -------------------------

JLabel netweight = new JLabel("Net Weight :");
netweight.setBounds(800,200,100,30);
pane.add(netweight);

t3.setBounds(900,200,50,30);
t3.setOpaque(false);
pane.add(t3);

t4.setBounds(1000,200,50,30);
t4.setOpaque(false);
pane.add(t4);

t5.setBounds(1100,200,50,30);
t5.setOpaque(false);
pane.add(t5);

// ------------------------------------------------------

// ---------------- Lose Weight -------------------------

JLabel loseweight = new JLabel("Lose Weight :");
loseweight.setBounds(800,250,100,30);
pane.add(loseweight);

t6.setBounds(900,250,50,30);
t6.setOpaque(false);
pane.add(t6);

t7.setBounds(1000,250,50,30);
t7.setOpaque(false);
pane.add(t7);

t8.setBounds(1100,250,50,30);
t8.setOpaque(false);
pane.add(t8);


//-------------------------------------------------------

// ---------------- Total Weight -------------------------

JLabel tweight = new JLabel("Total Weight :");
tweight.setBounds(800,300,100,30);
pane.add(tweight);

t9.setBounds(900,300,50,30);
t9.setOpaque(false);
t9.setEditable(false);
pane.add(t9);

t10.setBounds(1000,300,50,30);
t10.setOpaque(false);
t10.setEditable(false);
pane.add(t10);

t11.setBounds(1100,300,50,30);
t11.setOpaque(false);
t11.setEditable(false);
pane.add(t11);


//-------------------------------------------------------

JLabel service = new JLabel("Service");
service.setBounds(800,350,100,30);
pane.add(service);

t12.setBounds(900,350,250,30);
t12.setOpaque(false);
pane.add(t12);

JLabel unit1 = new JLabel("Kyat");
unit1.setForeground(new Color(225,225,0));
unit1.setBounds(1200,350,100,30);
pane.add(unit1);

JLabel t_cost = new JLabel("Total Cost :");
t_cost.setBounds(800,400,100,30);
pane.add(t_cost);

JLabel unit2 = new JLabel("Kyat");
unit2.setForeground(new Color(225,225,0));
unit2.setBounds(1200,400,100,30);
pane.add(unit2);

t13.setBounds(900,400,250,30);
t13.setEditable(false);
t13.setOpaque(false);
pane.add(t13);


cal.addActionListener(this);
cal.setBounds(900,450,100,30);
cal.setOpaque(false);
pane.add(cal);

reset.addActionListener(this);
reset.setBounds(1050,450,100,30);
reset.setOpaque(false);
pane.add(reset);

back.addActionListener(this);
back.setBounds(970,500,100,30);
back.setOpaque(false);
pane.add(back);


rb1.addActionListener(this);
rb2.addActionListener(this);
rb3.addActionListener(this);
rb4.addActionListener(this);
rb5.addActionListener(this);

rb1.setBounds(100,100,100,30);
rb1.setOpaque(false);
pane.add(rb1);

rb2.setBounds(250,100,100,30);
rb2.setOpaque(false);
pane.add(rb2);

rb3.setBounds(100,150,100,30);
rb3.setOpaque(false);
pane.add(rb3);

rb4.setBounds(250,150,100,30);
rb4.setOpaque(false);
pane.add(rb4);

rb5.setBounds(170,200,100,30);
rb5.setOpaque(false);
pane.add(rb5);

ImageIcon i1 = new ImageIcon("LL_Theme4.jpg");
JLabel background = new JLabel(i1);
background.setBounds(-10,0,1366,730);
pane.add(background);

setContentPane(pane);
setVisible(true);

} // constr

public void actionPerformed(ActionEvent ae) { 

if (ae.getActionCommand().equals("Earrings")) { Earrings2 obj = new Earrings2(); } //rb1

if (ae.getActionCommand().equals("Necklace")) { Necklace2 obj = new Necklace2(); }

if (ae.getActionCommand().equals("Hand-Chain")) { Hand2 obj = new Hand2(); }

if (ae.getActionCommand().equals("Foot-Chain")) { Foot2 obj = new Foot2(); }

if (ae.getActionCommand().equals("Rings")) { Rings2 obj = new Rings2( ); } //rb5


if (ae.getActionCommand().equals("Reset")) { 

name = "";
item = "";

net_kyat = 0;
net_pae = 0;
net_ywe = 0;

lose_kyat = 0;
lose_pae = 0;
lose_ywe = 0;

total_kyat = 0;
total_pae = 0;
total_ywe = 0;

service = 0;

total_cost = 0;

t1.setText("");
t2.setText("");

t3.setText("");
t4.setText("");
t5.setText("");

t6.setText("");
t7.setText("");
t8.setText("");

t9.setText("");
t10.setText("");
t11.setText("");

t12.setText("");

t13.setText("");


 }


if (ae.getActionCommand().equals("Calculate")) { 

double goldprice = MainFrame.coin;
String s;

name = t1.getText();
item = t2.getText();

net_kyat = Integer.parseInt(t3.getText());
net_pae = Integer.parseInt(t4.getText());
net_ywe = Integer.parseInt(t5.getText());

lose_kyat = Integer.parseInt(t6.getText());
lose_pae = Integer.parseInt(t7.getText());
lose_ywe = Integer.parseInt(t8.getText());

service = Integer.parseInt(t12.getText());

total_kyat = net_kyat + lose_kyat;
total_pae = net_pae + lose_pae;
total_ywe = net_ywe + lose_ywe;

one_pae = goldprice / 16;
one_ywe = one_pae / 8;

t9.setText(""+total_kyat);
t10.setText(""+total_pae);
t11.setText(""+total_ywe);

total_cost = total_kyat * goldprice + total_pae * one_pae + total_ywe * one_ywe + service;

t13.setText(""+total_cost);

s = JOptionPane.showInputDialog(null,"Enter Your Payment","Payment",JOptionPane.PLAIN_MESSAGE);
pay = Double.parseDouble(s);

change = pay - total_cost;

Voucher2 v = new Voucher2();
						} //if

if (ae.getActionCommand().equals("Back")) { 

setVisible(false);
MainFrame f = new MainFrame();

} // if


} // action

} // Selling2 (Gold)





// ------------------------------------------------- Original -----------------

//----------------------- Setting1 ring -------------------------

class Ring1 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Ring1.jpg");
ImageIcon i2 = new ImageIcon("Ring2.jpg");
ImageIcon i3 = new ImageIcon("Ring3.jpg");
ImageIcon i4 = new ImageIcon("Ring4.jpg");

JTextField t2 = Selling1.t2;

JTextField t3 = Selling1.t3;
JTextField t4 = Selling1.t4;
JTextField t5 = Selling1.t5;

JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);

/*
JButton b1 = new JButton("F-100");
JButton b2 = new JButton("F-101");
JButton b3 = new JButton("F-102");
JButton b4 = new JButton("F-103");
*/

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Ring1 ( ) { 
super("Ring");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "R-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "R-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=7;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "R-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "R-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=9;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting1 foot-chain -------------------------

class Foot1 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling1.t2;

JTextField t3 = Selling1.t3;
JTextField t4 = Selling1.t4;
JTextField t5 = Selling1.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("F-100");
JButton b2 = new JButton("F-101");
JButton b3 = new JButton("F-102");
JButton b4 = new JButton("F-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Foot1 ( ) { 
super("Foot-Chain");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "F-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "F-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "F-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=8;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "F-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=10;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting1 hand-chain -------------------------

class Hand1 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling1.t2;

JTextField t3 = Selling1.t3;
JTextField t4 = Selling1.t4;
JTextField t5 = Selling1.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("H-100");
JButton b2 = new JButton("H-101");
JButton b3 = new JButton("H-102");
JButton b4 = new JButton("H-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Hand1 ( ) { 
super("Hand-Chain");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "H-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=5;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "H-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "H-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=10;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "H-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting1 Necklace -------------------------

class Necklace1 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling1.t2;

JTextField t3 = Selling1.t3;
JTextField t4 = Selling1.t4;
JTextField t5 = Selling1.t5;

/*
JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);
*/

JButton b1 = new JButton("N-100");
JButton b2 = new JButton("N-101");
JButton b3 = new JButton("N-102");
JButton b4 = new JButton("N-103");

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Necklace1 ( ) { 
super("Necklace");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "N-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "N-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=1;
		  net_pae_earrings=4;
		  net_ywe_earrings=4;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "N-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=1;
		  net_pae_earrings=0;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "N-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=6;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}


//----------------------- Setting1 Earrings -------------------------

class Earrings1 extends JFrame implements ActionListener { 

ImageIcon i1 = new ImageIcon("Earring1.jpg");
ImageIcon i2 = new ImageIcon("Earring2.jpg");
ImageIcon i3 = new ImageIcon("Earring3.jpg");
ImageIcon i4 = new ImageIcon("Earring4.jpg");

JTextField t2 = Selling1.t2;

JTextField t3 = Selling1.t3;
JTextField t4 = Selling1.t4;
JTextField t5 = Selling1.t5;


JButton b1 = new JButton(i1);
JButton b2 = new JButton(i2);
JButton b3 = new JButton(i3);
JButton b4 = new JButton(i4);

//JButton ok = new JButton("OK");

public static String ear_items;

public static int net_kyat_earrings;
public static int net_pae_earrings;
public static int net_ywe_earrings;

public Earrings1 ( ) { 
super("Earrings");
setBounds(100,50,500,500);

JPanel pane = new JPanel( );
GridLayout gl = new GridLayout(2,2,10,10);
pane.setLayout(gl);
pane.setBackground(Color.WHITE);

b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
b4.setBackground(Color.WHITE);
b1.setBorder(BorderFactory.createEmptyBorder());
b2.setBorder(BorderFactory.createEmptyBorder());
b3.setBorder(BorderFactory.createEmptyBorder());
b4.setBorder(BorderFactory.createEmptyBorder());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


pane.add(b1);
pane.add(b2);
pane.add(b3);
pane.add(b4);
//pane.add(ok);


setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==b1) { setVisible(false); 
		  ear_items = "E-100";
		  t2.setText(""+ear_items);
		  net_kyat_earrings=0;
		  net_pae_earrings=4;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


if (source==b2) { setVisible(false); 
		  ear_items = "E-101";
		  t2.setText(""+ear_items);
 		  ear_items = "";
		  net_kyat_earrings=0;
		  net_pae_earrings=7;
		  net_ywe_earrings=1;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);
				
				 } // b1

if (source==b3) { setVisible(false); 
		  ear_items = "E-102";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=6;
		  net_ywe_earrings=2;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1

if (source==b4) { setVisible(false); 
		  ear_items = "E-103";
		  t2.setText(""+ear_items);
		  ear_items = "";

		  net_kyat_earrings=0;
		  net_pae_earrings=5;
		  net_ywe_earrings=3;

		  t3.setText(""+net_kyat_earrings);
		  t4.setText(""+net_pae_earrings);
		  t5.setText(""+net_ywe_earrings);

				 } // b1


}

}

// --------------------------------------------------------------------

class Voucher1 extends JFrame {

double goldprice = MainFrame.goldprice;

double total_cost = Selling1.total_cost;

double pay = Selling1.pay;
double change = Selling1.change;

String name = Selling1.name;
String item = Selling1.item;

int net_kyat = Selling1.net_kyat;
int net_pae = Selling1.net_pae;
int net_ywe = Selling1.net_ywe;

int lose_kyat = Selling1.lose_kyat;
int lose_pae = Selling1.lose_pae;
int lose_ywe = Selling1.lose_ywe;

int total_kyat = Selling1.total_kyat;
int total_pae = Selling1.total_pae;
int total_ywe = Selling1.total_ywe;

int service = Selling1.service;

public Voucher1( ) { 

super("Voucher");
setBounds(200,0,700,700);

JPanel pane = new JPanel( );
pane.setLayout(null);
pane.setBackground(Color.WHITE);


JLabel na = new JLabel("Name : "+name);
na.setBounds(250,100,200,30);
pane.add(na);

JLabel it = new JLabel ("Item No : "+item);
it.setBounds(500,100,200,30);
pane.add(it);

JLabel net = new JLabel ("Net Weight : "+net_kyat+" / "+net_pae+" / "+net_ywe +"    (Kyat / Pae / Ywe)");
net.setBounds(250,150,300,30);
pane.add(net);

JLabel lose = new JLabel ("Lose Weight : "+lose_kyat+" / "+lose_pae+" / "+lose_ywe +"    (Kyat / Pae / Ywe)");
lose.setBounds(250,200,300,30);
pane.add(lose);

JLabel total = new JLabel ("Total Weight : "+total_kyat+" / "+total_pae+" / "+total_ywe +"    (Kyat / Pae / Ywe)");
total.setBounds(250,250,300,30);
pane.add(total);

JLabel ser = new JLabel("Service : "+service+"  (Kyats)");
ser.setBounds(250,300,150,30);
pane.add(ser);


JLabel sep = new JLabel(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
sep.setBounds(250,350,350,30);
pane.add(sep);

JLabel tot = new JLabel("Total Cost : "+total_cost+" Kyats");
tot.setBounds(300,400,200,30);
pane.add(tot);

JLabel pa = new JLabel("Paid : "+pay+" Kyats");
pa.setBounds(300,450,200,30);
pane.add(pa);

JLabel chg = new JLabel("Change : "+change+" Kyats");
chg.setBounds(300,500,200,30);
pane.add(chg);


ImageIcon i1 = new ImageIcon("LL_Theme6.jpg");
JLabel theme = new JLabel(i1);
theme.setBounds(-10,-10,900,847);
pane.add(theme);

setContentPane(pane);
setVisible(true);

} //constr

} // voucher


class Selling1 extends JFrame implements ActionListener { 

JButton rb1 = new JButton("Earrings");
JButton rb2 = new JButton("Necklace");
JButton rb3 = new JButton("Hand-Chain");
JButton rb4 = new JButton("Foot-Chain");
JButton rb5 = new JButton("Rings");


public static String name;
public static String item;
public static int net_kyat,net_pae,net_ywe;
public static int lose_kyat,lose_pae,lose_ywe;
public static int total_kyat,total_pae,total_ywe;
public static int service;

public static double pay,change;

public static double total_cost=0;
double one_pae,one_ywe;

public static JTextField t1 = new JTextField( );

public static JTextField t2 = new JTextField( );

public static JTextField t3 = new JTextField( );
public static JTextField t4 = new JTextField( );
public static JTextField t5 = new JTextField( );

JTextField t6 = new JTextField( );
JTextField t7 = new JTextField( );
JTextField t8 = new JTextField( );

JTextField t9 = new JTextField( );
JTextField t10 = new JTextField( );
JTextField t11 = new JTextField( );

JTextField t12 = new JTextField( );
JTextField t13 = new JTextField( );

JButton cal = new JButton("Calculate");

JButton back = new JButton("Back");

JButton reset = new JButton("Reset");

double gprice = MainFrame.goldprice;

public Selling1( ) { 

super("Gold");
setSize(1366,730);


JPanel pane = new JPanel( );
pane.setLayout(null);

JLabel l1 = new JLabel("Name :");
l1.setBounds(800,100,100,30);
pane.add(l1);

t1.setBounds(900,100,100,30);
t1.setOpaque(false);
pane.add(t1);

JLabel l2 = new JLabel("Item No :");
l2.setBounds(1050,100,100,30);
pane.add(l2);

t2.setBounds(1150,100,100,30);
t2.setEditable(false);
t2.setOpaque(false);
pane.add(t2);

JLabel kyat = new JLabel("Kyat");
kyat.setForeground(new Color(225,225,0));
kyat.setBounds(900,150,100,30);
pane.add(kyat);

JLabel pae = new JLabel("Pae");
pae.setForeground(new Color(225,225,0));
pae.setBounds(1000,150,100,30);
pane.add(pae);

JLabel ywe = new JLabel("Ywe");
ywe.setForeground(new Color(225,225,0));
ywe.setBounds(1100,150,100,39);
pane.add(ywe);

// --------------- net weight -------------------------

JLabel netweight = new JLabel("Net Weight :");
netweight.setBounds(800,200,100,30);
pane.add(netweight);

t3.setBounds(900,200,50,30);
t3.setOpaque(false);
pane.add(t3);

t4.setBounds(1000,200,50,30);
t4.setOpaque(false);
pane.add(t4);

t5.setBounds(1100,200,50,30);
t5.setOpaque(false);
pane.add(t5);

// ------------------------------------------------------

// ---------------- Lose Weight -------------------------

JLabel loseweight = new JLabel("Lose Weight :");
loseweight.setBounds(800,250,100,30);
pane.add(loseweight);

t6.setBounds(900,250,50,30);
t6.setOpaque(false);
pane.add(t6);

t7.setBounds(1000,250,50,30);
t7.setOpaque(false);
pane.add(t7);

t8.setBounds(1100,250,50,30);
t8.setOpaque(false);
pane.add(t8);


//-------------------------------------------------------

// ---------------- Total Weight -------------------------

JLabel tweight = new JLabel("Total Weight :");
tweight.setBounds(800,300,100,30);
pane.add(tweight);

t9.setBounds(900,300,50,30);
t9.setOpaque(false);
t9.setEditable(false);
pane.add(t9);

t10.setBounds(1000,300,50,30);
t10.setOpaque(false);
t10.setEditable(false);
pane.add(t10);

t11.setBounds(1100,300,50,30);
t11.setOpaque(false);
t11.setEditable(false);
pane.add(t11);


//-------------------------------------------------------

JLabel service = new JLabel("Service");
service.setBounds(800,350,100,30);
pane.add(service);

t12.setBounds(900,350,250,30);
t12.setOpaque(false);
pane.add(t12);

JLabel unit1 = new JLabel("Kyat");
unit1.setForeground(new Color(225,225,0));
unit1.setBounds(1200,350,100,30);
pane.add(unit1);

JLabel t_cost = new JLabel("Total Cost :");
t_cost.setBounds(800,400,100,30);
pane.add(t_cost);

JLabel unit2 = new JLabel("Kyat");
unit2.setForeground(new Color(225,225,0));
unit2.setBounds(1200,400,100,30);
pane.add(unit2);

t13.setBounds(900,400,250,30);
t13.setEditable(false);
t13.setOpaque(false);
pane.add(t13);


cal.addActionListener(this);
cal.setBounds(900,450,100,30);
cal.setOpaque(false);
pane.add(cal);

reset.addActionListener(this);
reset.setBounds(1050,450,100,30);
reset.setOpaque(false);
pane.add(reset);

back.addActionListener(this);
back.setBounds(970,500,100,30);
back.setOpaque(false);
pane.add(back);


rb1.addActionListener(this);
rb2.addActionListener(this);
rb3.addActionListener(this);
rb4.addActionListener(this);
rb5.addActionListener(this);

rb1.setBounds(100,100,100,30);
rb1.setOpaque(false);
pane.add(rb1);

rb2.setBounds(250,100,100,30);
rb2.setOpaque(false);
pane.add(rb2);

rb3.setBounds(100,150,100,30);
rb3.setOpaque(false);
pane.add(rb3);

rb4.setBounds(250,150,100,30);
rb4.setOpaque(false);
pane.add(rb4);

rb5.setBounds(170,200,100,30);
rb5.setOpaque(false);
pane.add(rb5);

ImageIcon i1 = new ImageIcon("LL_Theme4.jpg");
JLabel background = new JLabel(i1);
background.setBounds(-10,0,1366,730);
pane.add(background);

setContentPane(pane);
setVisible(true);

} // constr

public void actionPerformed(ActionEvent ae) { 

if (ae.getActionCommand().equals("Earrings")) { Earrings1 obj = new Earrings1(); } //rb1

if (ae.getActionCommand().equals("Necklace")) { Necklace1 obj = new Necklace1(); }

if (ae.getActionCommand().equals("Hand-Chain")) { Hand1 obj = new Hand1(); }

if (ae.getActionCommand().equals("Foot-Chain")) { Foot1 obj = new Foot1(); }

if (ae.getActionCommand().equals("Rings")) { Rings1 obj = new Rings1( ); } //rb5


if (ae.getActionCommand().equals("Reset")) { 

name = "";
item = "";

net_kyat = 0;
net_pae = 0;
net_ywe = 0;

lose_kyat = 0;
lose_pae = 0;
lose_ywe = 0;

total_kyat = 0;
total_pae = 0;
total_ywe = 0;

service = 0;

total_cost = 0;

t1.setText("");
t2.setText("");

t3.setText("");
t4.setText("");
t5.setText("");

t6.setText("");
t7.setText("");
t8.setText("");

t9.setText("");
t10.setText("");
t11.setText("");

t12.setText("");

t13.setText("");


 }


if (ae.getActionCommand().equals("Calculate")) { 

double goldprice = MainFrame.goldprice;
String s;

name = t1.getText();
item = t2.getText();

net_kyat = Integer.parseInt(t3.getText());
net_pae = Integer.parseInt(t4.getText());
net_ywe = Integer.parseInt(t5.getText());

lose_kyat = Integer.parseInt(t6.getText());
lose_pae = Integer.parseInt(t7.getText());
lose_ywe = Integer.parseInt(t8.getText());

service = Integer.parseInt(t12.getText());

total_kyat = net_kyat + lose_kyat;
total_pae = net_pae + lose_pae;
total_ywe = net_ywe + lose_ywe;

one_pae = goldprice / 16;
one_ywe = one_pae / 8;

t9.setText(""+total_kyat);
t10.setText(""+total_pae);
t11.setText(""+total_ywe);

total_cost = total_kyat * goldprice + total_pae * one_pae + total_ywe * one_ywe + service;

t13.setText(""+total_cost);

s = JOptionPane.showInputDialog(null,"Enter Your Payment","Payment",JOptionPane.PLAIN_MESSAGE);
pay = Double.parseDouble(s);

change = pay - total_cost;

Voucher1 v = new Voucher1();
						} //if

if (ae.getActionCommand().equals("Back")) { 

setVisible(false);
MainFrame f = new MainFrame();

} // if


} // action

} // Selling1 (Gold)

// -------------------------------------------- Original Complete ---------------

// -------------------------- Pawn Process ---------------------------------

class Pawn extends JFrame implements ActionListener { 

JLabel na = new JLabel("Name :");
JTextField t1 = new JTextField( );

JLabel ra = new JLabel("Rate : ");
JTextField t2 = new JTextField();

JLabel net = new JLabel("Net Weight :");
JTextField t3 = new JTextField( );
JTextField t4 = new JTextField( );
JTextField t5 = new JTextField( );

JLabel want = new JLabel("Money that Customer Want :");
JTextField t6 = new JTextField( );

JLabel give = new JLabel("Give Money : ");
JTextField t7 = new JTextField( );

JLabel returnr = new JLabel("Total Return Money in 6 months :");
JTextField t8 = new JTextField( );

JLabel one = new JLabel ("Return Money Per Month : ");
JTextField t9 = new JTextField( );

JLabel original = new JLabel("Current Gold Price (Original) : "+MainFrame.goldprice+" Kyat");
JLabel paeye15 = new JLabel("Current Gold Price (15 Pae Ye) : "+MainFrame.paeye15+" Kyat");
JLabel coin = new JLabel("Current Gold Price (Coin Type) : "+MainFrame.coin+" Kyat");

JButton cal = new JButton("Calculate");

public Pawn( )  {

super("Pawn");
setSize(1366,730);

JPanel pane = new JPanel( );
pane.setLayout(null);

na.setBounds(300,50,100,30);
pane.add(na);

t1.setBounds(400,50,150,30);
t1.setOpaque(false);
pane.add(t1);

ra.setBounds(800,50,100,30);
pane.add(ra);

t2.setBounds(900,50,100,30);
pane.add(t2);
JLabel unt = new JLabel("%");
unt.setBounds(1005,50,50,30);
pane.add(unt);

net.setBounds(300,150,100,30);
pane.add(net);

t3.setBounds(400,150,50,30);
pane.add(t3);

t4.setBounds(450,150,50,30);
pane.add(t4);

t5.setBounds(500,150,50,30);
pane.add(t5);

JLabel unit = new JLabel (" (Kyat / Pae / Ywe) ");
unit.setBounds(550,150,150,30);
pane.add(unit);

original.setBounds(800,150,350,30);
pane.add(original);

paeye15.setBounds(800,200,350,30);
pane.add(paeye15);

coin.setBounds(800,250,350,30);
pane.add(coin);

want.setBounds(300,250,200,30);
pane.add(want);

t6.setBounds(300,300,160,30);
t6.setOpaque(false);
pane.add(t6);

JLabel unit1 = new JLabel("Kyat");
unit1.setBounds(480,300,80,30);
pane.add(unit1);

give.setBounds(300,350,200,30);
pane.add(give);

t7.setBounds(300,400,160,30);
t7.setEditable(false);
t7.setOpaque(false);
pane.add(t7);

JLabel unit2 = new JLabel("Kyat");
unit2.setBounds(480,400,80,30);
pane.add(unit2);

returnr.setBounds(300,450,300,30);
pane.add(returnr);

t8.setBounds(500,450,150,30);
t8.setEditable(false);
t8.setOpaque(false);
pane.add(t8);

one.setBounds(300,500,300,30);
pane.add(one);

t9.setBounds(500,500,150,30);
t9.setEditable(false);
t9.setOpaque(false);
pane.add(t9);

JLabel unit3 = new JLabel("Kyat");
unit3.setBounds(660,450,100,30);
pane.add(unit3);

JLabel unit4 = new JLabel("Kyat");
unit4.setBounds(660,500,100,30);
pane.add(unit4);

cal.setBounds(300,550,100,30);
cal.addActionListener(this);
cal.setOpaque(false);
pane.add(cal);

JLabel theme = new JLabel(new ImageIcon("LL_Theme1.jpg"));
theme.setBounds(-10,-10,1366,730);
pane.add(theme);

setContentPane(pane);
setVisible(true);

} // constr

public void actionPerformed(ActionEvent ae) { 

if (ae.getActionCommand().equals("Calculate")) { 

	String name = t1.getText();
	int kyat,pae,ywe;

	int rating = Integer.parseInt(t2.getText());

	long want_money;
	long give_money;
	
	long rate_per_month;
	long rate_per_six;	

	long return_money_six;	
	long return_money_one;

	kyat = Integer.parseInt(t3.getText());
	pae = Integer.parseInt(t4.getText());
	ywe = Integer.parseInt(t5.getText());

	want_money = Long.parseLong(t6.getText( ));		
	
	give_money = want_money / 2;

	rate_per_month = (give_money * rating) / 100;

	rate_per_six = rate_per_month * 6;	

	return_money_six = rate_per_six + give_money;
	
	return_money_one = return_money_six / 6;

	t7.setText(""+give_money);
	t8.setText(""+return_money_six);
	t9.setText(""+return_money_one);
							} // cal

} // action

} // pawn

// -------------------------- Pawn Process ---------------------------------

// ------------------------- Buying Process---------------------------------

class Buy_Voucher extends JFrame {

public Buy_Voucher( ) {

super("Voucher");
setBounds(450,140,550,400);

JPanel pane = new JPanel();
pane.setLayout(null);

JLabel na = new JLabel("Name : "+Buy.name);
na.setBounds(100,50,200,30);
pane.add(na);

JLabel it = new JLabel("Item : "+Buy.item);
it.setBounds(350,50,100,30);
pane.add(it);

JLabel net = new JLabel ("Net Weight :  "+Buy.kt+" / "+Buy.pe+" / "+Buy.ye+"  ( Kyat / Pae / Ywe )");
net.setBounds(100,100,250,30);
pane.add(net);

JLabel type = new JLabel ("Gold Type : "+Buy.type);
type.setBounds(100,150,200,30);
pane.add(type);

JLabel charge = new JLabel("Charges : "+Buy.pd);
charge.setBounds(100,200,200,30);
pane.add(charge);

ImageIcon i1 = new ImageIcon("LL_Theme1.jpg");
JLabel theme = new JLabel(i1);
theme.setBounds(-10,-10,1366,768);
pane.add(theme);

setContentPane(pane);
setVisible(true);

} // constr

} // buy voucher

class Buy extends JFrame implements ActionListener { 

public static String name;
public static int kt,pe,ye;
public static double pd;

public static double original_gold = MainFrame.goldprice;
public static double paeye15 = MainFrame.paeye15;
public static double coin = MainFrame.coin;

public static String item="";


JTextField t1 = new JTextField();

JTextField kyat = new JTextField( );

JTextField pa = new JTextField( );

JTextField yw = new JTextField( );


JLabel net = new JLabel("Net Weight :");
//JTextField t2 = new JTextField( );

JRadioButton rb1 = new JRadioButton("Earring");
JRadioButton rb2 = new JRadioButton("Necklace");
JRadioButton rb3 = new JRadioButton("Hand-Chain");
JRadioButton rb4 = new JRadioButton("Foot-Chain");
JRadioButton rb5 = new JRadioButton("Ring");

JCheckBox cb1 = new JCheckBox("Original");
JCheckBox cb2 = new JCheckBox("Coin Type");
JCheckBox cb3 = new JCheckBox("15 Pe Ye");


JLabel pad = new JLabel("Paid :");

JTextField paid = new JTextField( );

JButton buy = new JButton("Buy");
JButton back = new JButton("Back");

public static String type="";

public Buy( ) { 

super("Buying");
//setSize(1366,730);
setBounds(300,100,550,500);

JPanel pane = new JPanel( );
pane.setLayout(null);

JLabel na = new JLabel("Name :");
na.setBounds(50,50,100,30);
pane.add(na);

t1.setBounds(150,50,100,30);
t1.setOpaque(false);
pane.add(t1);

JLabel it = new JLabel("Item :");
it.setBounds(300,50,100,30);
pane.add(it);

ButtonGroup bg = new ButtonGroup( );
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
bg.add(rb5);

rb1.setBounds(350,50,100,30);
rb1.setForeground(Color.WHITE);
rb1.setOpaque(false);
pane.add(rb1);

rb2.setBounds(450,50,100,30);
rb2.setForeground(Color.WHITE);
rb2.setOpaque(false);
pane.add(rb2);

rb3.setBounds(350,100,100,30);
rb3.setForeground(Color.WHITE);
rb3.setOpaque(false);
pane.add(rb3);

rb4.setBounds(450,100,100,30);
rb4.setForeground(Color.WHITE);
rb4.setOpaque(false);
pane.add(rb4);

rb5.setBounds(430,150,100,30);
rb5.setForeground(Color.WHITE);
rb5.setOpaque(false);
pane.add(rb5);

ButtonGroup gg = new ButtonGroup( );
gg.add(cb1);
gg.add(cb2);
gg.add(cb3);

cb1.setBounds(400,200,100,30);
cb1.setForeground(Color.WHITE);
cb1.setOpaque(false);
pane.add(cb1);

cb2.setBounds(400,250,100,30);
cb2.setForeground(Color.WHITE);
cb2.setOpaque(false);
pane.add(cb2);

cb3.setBounds(400,300,100,30);
cb3.setForeground(Color.WHITE);
cb3.setOpaque(false);
pane.add(cb3);


JLabel kyt = new JLabel("Kyat");
kyt.setBounds(160,150,60,30);
pane.add(kyt);

JLabel pae = new JLabel("Pae");
pae.setBounds(220,150,60,30);
pane.add(pae);

JLabel ywe = new JLabel("Ywe");
ywe.setBounds(280,150,60,30);
pane.add(ywe);

kyat.setBounds(150,200,40,30);
kyat.setOpaque(false);
pane.add(kyat);

pa.setBounds(210,200,40,30);
pa.setOpaque(false);
pane.add(pa);

yw.setBounds(270,200,40,30);
yw.setOpaque(false);
pane.add(yw);

net.setBounds(50,200,100,30);
pane.add(net);

pad.setBounds(50,300,100,30);
pane.add(pad);

JLabel unit = new JLabel("Kyat");
unit.setBounds(270,300,100,30);
pane.add(unit);

paid.setBounds(150,300,100,30);
paid.setOpaque(false);
pane.add(paid);

buy.addActionListener(this);
back.addActionListener(this);

buy.setBounds(50,380,100,30);
buy.setOpaque(false);
pane.add(buy);

back.setBounds(250,380,100,30);
back.setOpaque(false);
pane.add(back);

JLabel theme = new JLabel (new ImageIcon("LL_Theme.jpg"));
theme.setBounds(-10,-10,1366,730);
pane.add(theme);

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

double price=0;
double one_pae,one_ywe;
double pp;

if (cb1.isSelected()) { type = "Original";
			price = original_gold; }

if (cb2.isSelected()) { type = "15 Pae Ye";
			price = paeye15; }

if (cb3.isSelected()) { type = "Coin Type";
			price = coin; }

if (rb1.isSelected()) { item = "Earring"; }
if (rb2.isSelected()) { item = "Necklace"; }
if (rb3.isSelected()) { item = "Hand-Chain"; }
if (rb4.isSelected()) { item = "Foot-Chain"; }
if (rb5.isSelected()) { item = "Ring"; }

if (ae.getActionCommand().equals("Buy")) {

name = t1.getText();

kt = Integer.parseInt(kyat.getText());
pe = Integer.parseInt(pa.getText());
ye = Integer.parseInt(yw.getText());

one_pae = price / 16;
one_ywe = one_pae / 8;

pd = price*kt + pe*one_pae + ye*one_ywe - 50000 ;

paid.setText(""+pd);

Buy_Voucher bv = new Buy_Voucher();

 } // buy

if (ae.getActionCommand().equals("Back")) { 

setVisible(false);

MainFrame mf = new MainFrame( );

} // back

}

} // Buy

// ------------------------- Buying Process---------------------------------

class Choice extends JFrame implements ActionListener { 

JButton b1 = new JButton("Original");

JButton b2 = new JButton("Coin Type");

JButton b3 = new JButton("15 Pae Ye");

public Choice( ) { 

super("Choice");

setBounds(450,200,400,330);

JPanel pane = new JPanel( );
pane.setLayout(null);

JLabel l1 = new JLabel("Please Choose Your Gold Type");
l1.setBounds(100,10,200,30);
pane.add(l1);

b1.addActionListener(this);
b1.setBounds(135,100,100,30);
b1.setBorder(BorderFactory.createEmptyBorder());
b1.setOpaque(false);
pane.add(b1);

b2.addActionListener(this);
b2.setBounds(135,150,100,30);
b2.setBorder(BorderFactory.createEmptyBorder());
b2.setOpaque(false);
pane.add(b2);

b3.addActionListener(this);
b3.setBounds(135,200,100,30);
b3.setBorder(BorderFactory.createEmptyBorder());
b3.setOpaque(false);
pane.add(b3);


ImageIcon i1 = new ImageIcon("LL_Theme5.jpg");
JLabel back = new JLabel(i1);
back.setBounds(-10,-10,400,300);
pane.add(back);

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

if (ae.getActionCommand().equals("Original")) { 

setVisible(false);

Selling1 obj = new Selling1( );

} // if

if (ae.getActionCommand().equals("Coin Type")) { 

setVisible(false);

Selling2 obj = new Selling2( );

} // if

if (ae.getActionCommand().equals("15 Pae Ye")) { 

setVisible(false);

Selling3 obj = new Selling3( );

} // if


}

}

class MainFrame extends JFrame implements ActionListener { 

public static double goldprice = GoldShop.goldprice;

public static double paeye15 = goldprice - 60000;

public static double coin = goldprice - 103000;

JRadioButton rb1 = new JRadioButton("BUY");
JRadioButton rb2 = new JRadioButton("Sales");
JRadioButton rb3 = new JRadioButton("Pawn");

JButton help = new JButton("HELP");

JCheckBox cb1 = new JCheckBox("Get Gold Price From Internet");

JButton exit = new JButton("EXIT");

public MainFrame ( ) { 

super("Gold Shop");
setSize(1366,730);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel pane = new JPanel( );
pane.setLayout(null);

Font f = new Font("Baskerville Old Face",Font.ITALIC,40);

JLabel l1 = new JLabel("Golden Butterfly");
l1.setFont(f);
l1.setForeground(new Color(225,225,0));
l1.setBounds(500,30,300,50);
pane.add(l1);

Font f1 = new Font("Bell MT",Font.ITALIC+Font.BOLD,20);

JLabel l2 = new JLabel("Gems & Jewellery");
l2.setFont(f1);
l2.setForeground(Color.RED);
l2.setBounds(560,80,250,50);
pane.add(l2);

ButtonGroup bg = new ButtonGroup( );
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);

rb1.addActionListener(this);
rb1.setBounds(500,300,100,30);
//rb1.setFont();
rb1.setOpaque(false);
pane.add(rb1);

rb2.addActionListener(this);
rb2.setBounds(700,300,100,30);
//rb1.setFont();
rb2.setOpaque(false);
pane.add(rb2);

rb3.addActionListener(this);
rb3.setBounds(600,350,100,30);
//rb1.setFont();
rb3.setOpaque(false);
pane.add(rb3);

help.setBounds(50,450,100,30);
help.setOpaque(false);
pane.add(help);

exit.setBounds(580,450,100,30);
exit.setOpaque(false);
pane.add(exit);

cb1.setBounds(50,350,200,30);
cb1.setOpaque(false);
//cb1.setEditable(false);
pane.add(cb1);



JLabel today = new JLabel("Today Gold Currency : "+goldprice+" Kyats");
today.setBounds(900,200,250,30);
pane.add(today);

JLabel today_coin = new JLabel("Coin Currency : "+coin+" Kyats");
today_coin.setBounds(900,250,250,30);
pane.add(today_coin);

JLabel today_pae = new JLabel("15 Pae Ye' Currency : "+paeye15+" Kyats");
today_pae.setBounds(900,300,250,30);
pane.add(today_pae);


ImageIcon i1 = new ImageIcon("LL_Theme2.jpg");
JLabel background = new JLabel(i1);
background.setBounds(-10,0,1366,730);
pane.add(background);

setContentPane(pane);
setVisible(true);

} // constr

public void actionPerformed(ActionEvent ae) { 

if (ae.getActionCommand().equals("Sales")) { setVisible(false); Choice c = new Choice( ); } // sales

if (ae.getActionCommand().equals("BUY")) { setVisible(false); Buy b = new Buy( ); } // Buy

if (ae.getActionCommand().equals("Pawn")) { setVisible(false); Pawn p = new Pawn(); } // Pawn

}

} // main

public class GoldShop { 

public static double goldprice;

public static void main (String args[ ]) { 

String s;

s = JOptionPane.showInputDialog(null,"Enter Today's Current Gold Price","Today Gold Price",JOptionPane.PLAIN_MESSAGE);
goldprice = Double.parseDouble(s);

MainFrame mf = new MainFrame( );

}

}