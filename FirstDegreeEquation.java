import javax.swing.*;

public class FirstDegreeEquationGUI {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog(null, "Input a (coefficient of x):", "Input a", JOptionPane.INFORMATION_MESSAGE);
        String inputB = JOptionPane.showInputDialog(null, "Input b (constant):", "Input b", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Math Error", "Show result", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x, "Show result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
