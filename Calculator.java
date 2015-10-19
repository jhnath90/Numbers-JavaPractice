import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me two numbers");
    String stringNumber = myConsole.readLine();
    String stringNumber2 = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber);
    Integer yourNumber2 = Integer.parseInt(stringNumber2);
    Integer yourAddNumber = yourNumber + yourNumber2;
    Integer yourSubNumber = yourNumber - yourNumber2;
    Integer yourMulNumber = yourNumber * yourNumber2;
    Integer yourDivNumber = yourNumber / yourNumber2;

    String stringAddNumber = Integer.toString(yourAddNumber);
    String stringSubNumber = Integer.toString(yourSubNumber);
    String stringMulNumber = Integer.toString(yourMulNumber);
    String stringDivNumber = Integer.toString(yourDivNumber);

    System.out.println("I added your numbers for you " + stringAddNumber);
    System.out.println("I subtracted your numbers for you " + stringSubNumber);
    System.out.println("I multiplied your numbers for you " + stringMulNumber);
    System.out.println("I divided your numbers for you " + stringDivNumber);
  }
}