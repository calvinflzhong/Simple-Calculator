import java.util.Scanner;

public class TestCalculator{
    public static void main (String[] args){
        //Declare variable for operator
        int operator = -1;
        
        //Declare variable for output
        double result;
        
        do {
            try {
                Scanner input = new Scanner(System.in);

                //Allow user to choose operation and enter two numbers to be calculated
                while (operator != 0) {
                    System.out.println("Please choose from the following operations by inputting the number beside it: " +
                            "\nAddition: 1\nSubtraction: 2\nMultiplication: 3\nDivision: 4\nExit: 0\nChoose your operation: ");
                    operator = input.nextInt();
                    if (operator == 0) {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }    
                    if(operator<0 || operator>4) {
                        System.out.println("Please enter numbers 0, 1, 2, 3, or 4");
                        continue;
                    }
                    
                    System.out.println("Please enter the two numbers to be calculated using the above operation separated by a space: ");
                    double number1 = input.nextDouble();
                    double number2 = input.nextDouble();

                    //Calculate and print result
                    switch (operator) {
                        case 1:
                            System.out.println(number1 + " + " + number2 + " = " + Calculator.add(number1, number2));
                            break;
                        case 2:
                            System.out.println(number1 + " - " + number2 + " = " + Calculator.subtract(number1, number2));
                            break;
                        case 3:
                            System.out.println(number1 + " * " + number2 + " = " + Calculator.multiply(number1, number2));
                            break;
                        case 4:
                            System.out.println(number1 + " / " + number2 + " = " + Calculator.divide(number1, number2));
                            break;
                    }
                }
                input.close();
            }

            //Catch exception and print exception handling message
            catch (Exception ex) {
                System.out.println(ex);
            }
        }while(operator != 0);    
    }
}
