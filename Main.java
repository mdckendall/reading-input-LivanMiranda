import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String x;
    System.out.println("Enter a word:");
    
   Scanner obj = new Scanner(System.in);
    x = obj.nextLine();
    
    System.out.println(x.length());
    
  }
}