import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  
  JLabel firstLabel;
  JLabel secondLabel;
  JLabel resultLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField resultInput;

  JButton addButton;
  JButton subButton;
  JButton mulButton;
  JButton divButton;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    //initialize the mainJPanel
    mainPanel = new JPanel();
    //disable any layout helpers
    mainPanel.setLayout(null);
    //create side labels
    firstLabel = new JLabel("First Number");
    secondLabel = new JLabel("Second Number");
    resultLabel = new JLabel("Result");
    //layout the labels with their cordiantes and size
    firstLabel.setBounds(10,10,200,20);
    secondLabel.setBounds(10,40,200,20);
    resultLabel.setBounds(10,70,200,20);
    //add labels to the main panel
    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);
    mainPanel.add(resultLabel);
    //initialize text fields
    firstInput = new JTextField();
    secondInput = new JTextField();
    resultInput = new JTextField();
    //layout the text fields with their cordinates and size
    firstInput.setBounds(220,10,100,20);
    secondInput.setBounds(220,40,100,20);
    resultInput.setBounds(220,70,100,20);
    //add text fields to main panel
    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(resultInput);
    //initialize the buttons
    addButton = new JButton("Add");
    subButton = new JButton("Sub");
    mulButton = new JButton("Mul");
    divButton = new JButton("Div"); 
    //layout the buttons with their cordinates and size
    addButton.setBounds(50,100,100,20);
    subButton.setBounds(150,100,100,20);
    mulButton.setBounds(250,100,100,20);
    divButton.setBounds(350,100,100,20);
    //add buttons to the main panel 
    mainPanel.add(addButton);
    mainPanel.add(subButton);
    mainPanel.add(mulButton);
    mainPanel.add(divButton);
    //add action action listener to buttons
    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    divButton.addActionListener(this);
    //diable the text areas so the user cant type in them
    resultInput.setEnabled(false);
    //add main panel to the window
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if(command.equals("Add")){
      //get text from input box
      String firstText = firstInput.getText();
      //get text from input box
      String secondText = secondInput.getText();
      //change the string into an integer
      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);
      //add users numbers
      int total = first + second;
      //tell user their result
      resultInput.setText(" " + total);
    }
    if(command.equals("Sub")){
      //get text from input box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      //change the string into an integer
      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);
      //substract users numbers
      int total1 = first - second;
      
      //tell user their result
      resultInput.setText(" " + total1);

  }
     if(command.equals("Mul")){
      //get text from input box
      String firstText = firstInput.getText();
      //get text from input box
      String secondText = secondInput.getText();
      //change the string into an integer
      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);
      //multiply both numbers
      int total2 = first * second;
      resultInput.setText(" " + total2);
  }
     if(command.equals("Div")){
      //get text from input box
      String firstText = firstInput.getText();
      //get text from input box
      String secondText = secondInput.getText();
      //change the string into an integer
      int first = Integer.parseInt(firstText);
      int second = Integer.parseInt(secondText);
      //divide both numbers
      int total3 = first/second;
      //tell user their result
      resultInput.setText(" " + total3);
     }
  }
  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
     

  
