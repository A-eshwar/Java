/*calculate factorial of a given number using GUI*/
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class FactorialGuiDemo extends Frame implements ActionListener {
    Frame f;
    TextField tf,result;
    Button b;
    FactorialGuiDemo() {
        f = new Frame("Factorial Demo");
        tf = new TextField(10);
        b = new Button("FACTORIAL");
        result=new TextField(30);
        Label l=new Label("ENTER AN POSITIVE INTEGER:");
        Label l1=new Label("FACTORIAL OF GIVEN INTEGER:");
        b.addActionListener(this);
        tf.addActionListener(this);
        result.setEditable(false);
        f.setBackground(Color.cyan);
        f.add(l);f.add(tf);f.add(b);f.add(l1);f.add(result);
        f.setSize(400,400);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 0));
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n,pro=1;
        n=Integer.parseInt(tf.getText());
        for(int i=n;i>0;i--)
        {
            pro*=i;
        }
        if(n>0) {
            result.setText(String.valueOf(pro));
        } else if (n==0) {
            result.setText("1");
        } else {
            result.setText("NOT ABLE TO GENERATE FACTORIAL");
        }
    }

    public static void main(String[] args) {
        new FactorialGuiDemo();

    }
}
/*Explanation:
Graphical User Interface (GUI) Behavior:
->A window (Frame) appears with a cyan background.
->It displays:
->A label: "ENTER A POSITIVE INTEGER:"
->A text field for user input.
->A button labeled "FACTORIAL"
->Another label: "FACTORIAL OF GIVEN INTEGER:"
->A non-editable text field to display the result.
->User Interaction and Expected Outputs:
->Case 1: Enter a Positive Integer (n = 5)
->User enters: 5
->Clicks "FACTORIAL" Button

->Displayed Output: 120
->Case 2: Enter Zero (n = 0)
->User enters: 0
->Clicks "FACTORIAL" Button
->Displayed Output: 1
->Case 3: Enter a Negative Number (n = -3)
->User enters: -3
->Clicks "FACTORIAL" Button
->Displayed Output: "NOT ABLE TO GENERATE FACTORIAL"
*/
