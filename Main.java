import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int x = -1;

      System.out.println("Hello!!\nI hope you are ready for your Canadian Quiz!!\n:)\nARE YOU READY?\n0 = Yes\n1 = No");
      
      while(true){
         try {
          x = console.nextInt();
          if (x == 0){
            System.out.println("Hope you didn't procastinate!");
            break;
          }
          if (x == 1){
            System.out.println("Bye\n:(");
            System.exit(0);
          }
          else {
            System.out.println("Invalid input, try again.");
            console.nextLine();
            x = 0;
          }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input, try again: ");
            console.nextLine();
          }
        catch (Exception e){
            System.out.println("This should never print");
          }
      }
      
      console.close();
    
    }
}
