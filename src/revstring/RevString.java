package revstring;
import java.util.Scanner;
/**
 * This class +++ Insert class description here +++
 *
 * @author Volodymyr Suprun
 */
public class RevString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input a string");
        String randomString = scan.nextLine();
        char[] list1 = new char[randomString.length()];
        for (int i = 0; i < randomString.length(); i++) {
            list1[i] = randomString.charAt(i);
        }
        for (int i = randomString.length() - 1; i >= 0; i--) {
            System.out.print(list1[i]);  
        }
        /* This is a test 
        ---------------
        ------------
        --------------
        ---------
        -----------------
        ------------
        another change*/
    }

}
