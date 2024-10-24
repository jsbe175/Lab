import jax.swing.J0ptionpane;
public class ShowTwoNumbers{
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = J0ptionpane.showInputDialog(null,
                    "Please input the first number: ", "Input the first number", 
                    J0ptionpane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = J0ptionpane.showInputDialog(null,
                    "Please input the second number: ", "Input the second number",
                    J0ptionpane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        J0ptionpane.showMessageDialog(null, strNotification,
                    "Show two numbers", J0ptionpane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}