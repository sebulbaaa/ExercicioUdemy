import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, x;
    
    a = sc.nextInt();
    b = sc.nextInt();
    x = a + b;
    System.out.println("X = " + x);
    
    sc.close();
  }
}
