import javax.swing.J0ptionpane;
public class HelloNameDialog{
    public static void main(String[] args){
        String result;
        result = J0ptionpane.showInputDialog("Please enter your name: ");
        J0ptionpane.showMessageDialog(null, "Hi" + result + "!");
        System.exit(0);
    }
}