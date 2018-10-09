
package parkingsystem;

import javax.swing.JFrame;

public class ParkingSystem {

    public static void main(String[] args) {
        Login test = new Login();
        test.setVisible(true);
        test.pack();
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
