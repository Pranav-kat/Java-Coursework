import javax.swing.JOptionPane;
 public class SentinelValueUsingConfirmDialog {
 public static void main(String[] args) {
 int sum = 0;
 // Keep reading data until the user answers No
 int option = JOptionPane.YES_OPTION; 
 while (option == JOptionPane.YES_OPTION) {
 // Read the next data
 String dataString = JOptionPane.showInputDialog(
 "Enter an integer: ");
 int data = Integer.parseInt(dataString);

 sum += data;

 option = JOptionPane.showConfirmDialog(null, "Continue?");
 }

 JOptionPane.showMessageDialog(null, "The sum is " + sum); 
 }
 }