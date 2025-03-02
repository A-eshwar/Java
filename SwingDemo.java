/*eligibilty to vote using GUI*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo implements ActionListener{
    JFrame frame;
    //JCheckBox checkBox;
    JTextField textField,textField2,textField3;
    //JTextArea textArea;
    JRadioButton radioButton,radioButton2;
    JButton button;
    SwingDemo() {
        frame = new JFrame("SWING DEMO");
        JLabel l=new JLabel("ENTER YOUR NAME:");
        JLabel l2=new JLabel("ENTER YOUR AGE:");
        JLabel l3=new JLabel("RESULT:");
        textField = new JTextField();
        textField.setColumns(50);
        textField2 = new JTextField();
        textField2.setColumns(50);
        ButtonGroup bg = new ButtonGroup();
        radioButton = new JRadioButton("MALE");
        radioButton2 = new JRadioButton("FEMALE");
        bg.add(radioButton);
        bg.add(radioButton2);
        button = new JButton("Submit");
        textField3 = new JTextField();
        textField3.setColumns(50);
        button.addActionListener(this);
        radioButton.addActionListener(this);
        radioButton2.addActionListener(this);
        textField.addActionListener(this);
        textField2.addActionListener(this);
        frame.add(l);frame.add(textField);frame.add(radioButton);frame.add(radioButton2);
        frame.add(l2);frame.add(textField2);
        frame.add(button);frame.add(l3);
        frame.add(textField3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER ,1000,10));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n= Integer.parseInt(textField2.getText());
        if(n>=18){
            textField3.setText("ELIGIBLE TO VOTE");
        }
        else {
            textField3.setText("NOT ELIGIBLE TO VOTE");
        }
    }
    public static void main(String[] args) throws NumberFormatException {
        new SwingDemo();
    }
}
/*
Explanation:
->Graphical User Interface (GUI) Layout:
->A JFrame titled "SWING DEMO" with a default size of 300x300 pixels.
->Contains the following components:
->Label 1: "ENTER YOUR NAME:"
->Text Field 1: To enter the name.
->Radio Buttons: "MALE" and "FEMALE" (Only one can be selected).
->Label 2: "ENTER YOUR AGE:"
->Text Field 2: To enter age.
->Button: "Submit"
->Label 3: "RESULT:"
->Text Field 3: Displays whether the person is eligible to vote.
*/