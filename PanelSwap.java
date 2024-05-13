/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSwap {
        public static void main(String[] args)
        {
            JFrame frame = new JFrame("Final Project Panel Swapping");
            frame.setSize(400, 430);
            frame.setLocation(20, 20);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new CalculatorPanel());
            frame.setVisible(true);
        }
    }

    class CalculatorPanel extends JPanel {
        JLabel number1;  //These are fields so that the action listeners can access them.
        JPanel number2;
        JPanel number3;
        JPanel number4;
        JPanel Surgeons;

        JLabel mult;
        JLabel add;
        JLabel sub;
        JLabel div;
        JTextField UserInput;
        JTextField UserInput1;
        String ok = "Enter Numbers";

        public CalculatorPanel() {
            setLayout(new BorderLayout());

            //Create a title and add it to the north region of the BorderLayout.
            //This is not a field because it never needs to be modified.
            JLabel title = new JLabel("Calculator");
            title.setFont(new Font("Serif", Font.BOLD, 20));
            title.setHorizontalAlignment(SwingConstants.CENTER);
            add(title, BorderLayout.NORTH);


            //Create instructions and add to the south region of the BorderLayout.
            JLabel bottom = new JLabel(ok);
            bottom.setFont(new Font("Serif", Font.BOLD, 12));
            bottom.setHorizontalAlignment(SwingConstants.CENTER);
            add(bottom, BorderLayout.SOUTH);

            number1 = new JLabel("0.0");
            number1.setFont(new Font("Serif", Font.BOLD, 80));
            number1.setHorizontalAlignment(SwingConstants.CENTER);
            add(number1, BorderLayout.CENTER);

            number2 = new JPanel();
            number2.setLayout(new GridLayout(4,2));
            JLabel EnterAddend = new JLabel("Enter A Number");
            EnterAddend.setVerticalAlignment(SwingConstants.BOTTOM);
            EnterAddend.setHorizontalAlignment(SwingConstants.CENTER);
            UserInput = new JTextField("0.0", 10);
            UserInput.setHorizontalAlignment(SwingConstants.CENTER);

            number2.add(EnterAddend);
            number2.add(UserInput);
            number2.setFont(new Font("Serif", Font.BOLD, 80));
            add(number2, BorderLayout.WEST);  //Automatically adds to the center region if no second arg is given.

            number4 = new JPanel();
            number4.setLayout(new GridLayout(4,2));
            JLabel EnterAugend = new JLabel("Enter A Number");
            EnterAugend.setVerticalAlignment(SwingConstants.BOTTOM);
            EnterAugend.setHorizontalAlignment(SwingConstants.CENTER);
            UserInput1 = new JTextField("0.0", 10);
            UserInput1.setHorizontalAlignment(SwingConstants.CENTER);
            number4.add(EnterAugend);
            number4.add(UserInput1);
            number4.setFont(new Font("Serif", Font.BOLD, 80));
            add(number4, BorderLayout.EAST);  //Automatically adds to the center region if no second arg is given.


            number3 = new JPanel();
            number3.setLayout(new GridLayout(1,4));

            JButton MultiplyMultiply = new JButton("Multiply");
            MultiplyMultiply.addActionListener(new Multiply());


            number3.add(MultiplyMultiply);

            JButton AddAdd = new JButton("Add");
            AddAdd.addActionListener(new ADD());
            number3.add(AddAdd);

            JButton SubSubtract = new JButton("Subtract");
            SubSubtract.addActionListener(new Subtract());
            number3.add(SubSubtract);

            JButton DivDivide = new JButton("Divide");
            DivDivide.addActionListener(new Divide());
            number3.add(DivDivide);
            number3.setFont(new Font("Serif", Font.BOLD, 80));
            add(number3, BorderLayout.SOUTH);  //Automatically adds to the center region if no second arg is given.

            //Create a button that will add 1 to "num" and refresh the central JLabel.
            //Add to the west region of the BorderLayout.



        }

        //ActionListener for the add 1 button.
        //Note ActionListener is an interface!  We must implement "public void actionPerformed(ActionEvent e)".
        private class Multiply implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                //These two lines of code work because "num" and "number" are fields.

                number1.setText("" + (Double.parseDouble(UserInput.getText())*Double.parseDouble(UserInput1.getText())));
            }
        }

        //ActionListener for the add 5 button.
        private class ADD implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                number1.setText("" +(Double.parseDouble(UserInput.getText())+Double.parseDouble(UserInput1.getText())));
            }
        }

        private class Subtract implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                //These two lines of code work because "num" and "number" are fields.

                number1.setText("" + (Double.parseDouble(UserInput.getText())-Double.parseDouble(UserInput1.getText())));
            }
        }

        //ActionListener for the add 5 button.
        private class Divide implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(UserInput1.getText()) != 0) {
                    number1.setText("" + (Double.parseDouble(UserInput.getText())/Double.parseDouble(UserInput1.getText())));
                }
                else {
                    System.exit(749);
                }
            }
        }
    }
}
*/