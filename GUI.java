import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class GUI
{
  private JFrame frame;
  private JPanel panel;
  
  public GUI()
  {
    frame = new JFrame();
    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout(0, 1));

    //text field for name
    JTextField person = new JTextField(20);
    person.setEditable(true);
    JLabel name = new JLabel("Name: ");
    panel.add(name);
    panel.add(person);

    //radiobutton for order method
    JLabel orderMethod = new JLabel("How are you ordering?");
    panel.add(orderMethod);
    ButtonGroup method = new ButtonGroup();
    JRadioButton pickUp = new JRadioButton("Pick Up");
    pickUp.setMnemonic(KeyEvent.VK_B);
    pickUp.setActionCommand("Pick Up");
    pickUp.setSelected(true);
    JRadioButton delivery = new JRadioButton("Delivery");
    delivery.setMnemonic(KeyEvent.VK_C);
    delivery.setActionCommand("Delivery");
    method.add(pickUp);
    method.add(delivery);
    panel.add(pickUp);
    panel.add(delivery);

    //radiobutton for size
    JLabel whatSize = new JLabel("Pick a size: ");
    panel.add(whatSize);
    ButtonGroup size = new ButtonGroup();
    JRadioButton small = new JRadioButton("Small");
    small.setMnemonic(KeyEvent.VK_B);
    small.setActionCommand("Small");
    small.setSelected(true);
    JRadioButton medium = new JRadioButton("Medium");
    medium.setMnemonic(KeyEvent.VK_C);

    medium.setActionCommand("Medium");
    JRadioButton large = new JRadioButton("Large");
    large.setMnemonic(KeyEvent.VK_D);
    large.setActionCommand("Large");
    size.add(small);
    size.add(medium);
    size.add(large);
    panel.add(small);
    panel.add(medium);
    panel.add(large);

    //checkbox list for toppings
    JLabel whatToppings = new JLabel("Choose your toppings:");
    panel.add(whatToppings);
    JCheckBox moreCheese = new JCheckBox("More Cheese");
    moreCheese.setMnemonic(KeyEvent.VK_C);
    moreCheese.setSelected(false);
    panel.add(moreCheese);
    JCheckBox onions = new JCheckBox("Onions");
    onions.setMnemonic(KeyEvent.VK_C);
    onions.setSelected(false);
    panel.add(onions);
    JCheckBox olives = new JCheckBox("Olives");
    olives.setMnemonic(KeyEvent.VK_C);
    olives.setSelected(false);
    panel.add(olives);
    JCheckBox pepporoni = new JCheckBox("Pepporoni");
    pepporoni.setMnemonic(KeyEvent.VK_C);
    pepporoni.setSelected(false);
    panel.add(pepporoni);
    JCheckBox mushrooms = new JCheckBox("Mushrooms");
    mushrooms.setMnemonic(KeyEvent.VK_C);
    mushrooms.setSelected(false);
    panel.add(mushrooms);
    JCheckBox bellPeppers = new JCheckBox("Bell Peppers");
    bellPeppers.setMnemonic(KeyEvent.VK_C);
    bellPeppers.setSelected(false);
    panel.add(bellPeppers);

    //place order button
    JButton placeOrder = new JButton("Place Your Order");
    panel.add(placeOrder);

    //print
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Pizza Palace");
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args)
  {
    new GUI();
  }
}
