import java.util.Scanner;

public class FirstIntegrationPoint {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            RPNCalculatorManager.processTokens(line.split(" "));
        }
    }
}
