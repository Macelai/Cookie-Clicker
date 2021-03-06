import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Window extends JFrame {
    Window() { //Cookie Clicker Game Object
        //creation of window that will contain all game objects
        setTitle("Cookie Clicker");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Display of details involving number of cookies per second and 
        JLabel cookie = new JLabel("0 Cookies");
        cookie.setFont(new Font("Monospace", Font.BOLD, 16));
        JLabel cookieLPer = new JLabel("0 Cookies/s");
        cookieLPer.setFont(new Font("Monospace", Font.BOLD, 12));
        //set details of the game itself, including background, layout of game objects, etc.
        Counter counter = new Counter(cookie,cookieLPer);

        setLayout(new BorderLayout());
        JPanel q1 = new JPanel();
        q1.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(q1,BorderLayout.NORTH);
        q1.add(cookie);
        q1.setBackground(Color.white);
        //creation of cookie object to be clicked on by the player
        JPanel q2 = new JPanel();
        q2.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(q2,BorderLayout.CENTER);
        ImageIcon imgCookie = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/cookie.jpg");//Get cookie image and insert it into game as an interactable object
        //associate the code for clicking on the cookie to the actual cookie object
        JButton b = new JButton();
        b.setIcon(imgCookie);
        b.setBorder(null);
        q2.add(b);
        b.addActionListener(counter);
        b.setActionCommand("ADD");
        q2.setBackground(Color.white);

        JPanel q3 = new JPanel();
        q3.setLayout(new GridLayout(9,0));
        add(q3, BorderLayout.AFTER_LINE_ENDS);
        q3.setBackground(Color.white);

        //Creation of button to allow player to buy additional cursor autoclicker objects
        JButton b1 = new JButton();
        ImageIcon imgCursor = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/CursorIcon.png");
        b1.setIcon(imgCursor);
        b1.setBorder(null);
        q3.add(b1);
        b1.addActionListener(counter);
        b1.setActionCommand("CURSOR");
        //Creation of button to allow player to buy additional Grandma autoclicker objects
        JButton b2 = new JButton();
        ImageIcon imgGrandma = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/GrandmaIcon.png");
        b2.setIcon(imgGrandma);
        b2.setBorder(null);
        q3.add(b2);
        b2.addActionListener(counter);
        b2.setActionCommand("GRANDMA");
        //Creation of button to allow player to buy additional Farm autoclicker objects
        JButton b3 = new JButton();
        ImageIcon imgFarm = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/FarmIcon.png");
        b3.setIcon(imgFarm);
        b3.setBorder(null);
        q3.add(b3);
        b3.addActionListener(counter);
        b3.setActionCommand("FARM");
        //Creation of button to allow player to buy additional Mine autoclicker objects
        JButton b4 = new JButton();
        ImageIcon imgMine = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/MineIcon.png");
        b4.setIcon(imgMine);
        b4.setBorder(null);
        q3.add(b4);
        b4.addActionListener(counter);
        b4.setActionCommand("MINE");
        //Creation of button to allow player to buy additional Factory autoclicker objects
        JButton b7 = new JButton();
        ImageIcon imgFactory = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/FactoryIcon.png");
        b7.setIcon(imgFactory);
        b7.setBorder(null);
        q3.add(b7);
        b7.addActionListener(counter);
        b7.setActionCommand("FACTORY");
        //Creation of button to allow player to buy additional bank autoclicker objects
        JButton b5 = new JButton();
        ImageIcon imgBank = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/BankIcon.png");
        b5.setIcon(imgBank);
        b5.setBorder(null);
        q3.add(b5);
        b5.addActionListener(counter);
        b5.setActionCommand("BANK");
        //Creation of button to allow player to buy additional Temple autoclicker objects
        JButton b6 = new JButton();
        ImageIcon imgTemple = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/Temple.png");
        b6.setIcon(imgTemple);
        b6.setBorder(null);
        q3.add(b6);
        b6.addActionListener(counter);
        b6.setActionCommand("TEMPLE");
        //Creation of button to allow player to buy additional Rocket Shipment autoclicker objects
        JButton b8 = new JButton();
        ImageIcon imgShipment = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/Shipment.png");
        b8.setIcon(imgShipment);
        b8.setBorder(null);
        q3.add(b8);
        b8.addActionListener(counter);
        b8.setActionCommand("SHIPMENT");
        //Creation of button to allow player to buy additional Time Machine autoclicker objects
        JButton b9 = new JButton();
        ImageIcon imgTimeMachine = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/TimeMachine.png");
        b9.setIcon(imgTimeMachine);
        b9.setBorder(null);
        q3.add(b9);
        b9.addActionListener(counter);
        b9.setActionCommand("TIMEMACHINE");
        
        JPanel q4 = new JPanel();
        q4.setLayout(new FlowLayout(FlowLayout.TRAILING));
        add(q4,BorderLayout.SOUTH);
        q4.add(cookieLPer);
        q4.setBackground(Color.white);

        //Instantiate the timers / counters so that the game will actually operate while the player is idle
        counter.att();
        counter.att1();
    }

}

