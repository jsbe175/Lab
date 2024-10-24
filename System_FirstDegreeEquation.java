import javax.swing.*;

public class LinearSystemGUI {
    public static void main(String[] args) {
        String inputA11 = JOptionPane.showInputDialog(null, "Input coefficient of x1 in the first equation):", "Input a11", JOptionPane.INFORMATION_MESSAGE);
        String inputA12 = JOptionPane.showInputDialog(null, "Input coefficient of x2 in the first equation):", "Input a12", JOptionPane.INFORMATION_MESSAGE);
        String inputB1 = JOptionPane.showInputDialog(null, "Input constant in the first equation):", "Input b1", JOptionPane.INFORMATION_MESSAGE);

        String inputA21 = JOptionPane.showInputDialog(null, "Input coefficient of x1 in the second equation):", "Input a21", JOptionPane.INFORMATION_MESSAGE);
        String inputA22 = JOptionPane.showInputDialog(null, "Input coefficient of x2 in the second equation):", "Input a22", JOptionPane.INFORMATION_MESSAGE);
        String inputB2 = JOptionPane.showInputDialog(null, "Input constant in the second equation):", "Input b2", JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(inputA11);
        double a12 = Double.parseDouble(inputA12);
        double b1 = Double.parseDouble(inputB1);
        double a21 = Double.parseDouble(inputA21);
        double a22 = Double.parseDouble(inputA22);
        double b2 = Double.parseDouble(inputB2);

        double D = a11 * a22 - a12 * a21;

        if (D == 0) {
            if ((a11 * b2 - a21 * b1) != 0 || (a12 * b2 - a22 * b1) != 0) {
                JOptionPane.showMessageDialog(null, "No solution.", "Show result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Infinitely many solutions.", "Show result", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        else {
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            double x1 = D1 / D;
            double x2 = D2 / D;

            JOptionPane.showMessageDialog(null, "The solution is x1 = " + x1 + " and x2 = " + x2, "Show result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
