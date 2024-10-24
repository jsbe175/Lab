import javax.swing.*;

public class QuadraticEquationGUI {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog(null, "Input a (coefficient of x^2):", "Input a", JOptionPane.INFORMATION_MESSAGE);
        String inputB = JOptionPane.showInputDialog(null, "Input b (coefficient of x):", "Input b", JOptionPane.INFORMATION_MESSAGE);
        String inputC = JOptionPane.showInputDialog(null, "Input c (constant):", "Input c", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);
        double c = Double.parseDouble(inputC);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Not a quadratic equation. The solution is x = " + (-c / b), "Show result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2, "Show result", JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (discriminant == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "x = " + x, "Show result", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
                JOptionPane.showMessageDialog(null, "No roots.", "Show result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
