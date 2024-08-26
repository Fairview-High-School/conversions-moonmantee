import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Feet to Miles");
        System.out.println("8. Miles to Feet");
        System.out.println("9. Yards to Feet");
        System.out.println("10. Feet to Yards");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection=-1;
        do{
            selection = keyboard.nextInt();
            keyboard.nextLine();  //go past the endline and be ready for more input
            System.out.println("Enter a valid number");
        }while(selection>10 || selection<1);

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        else if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double num = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = (num-32)*5.0/9.0;
            System.out.println(num + " degrees fahrenheit is " + fahrenheit + " degrees celsius");
        }
        else if(selection==3){
            System.out.println("Enter Feet:");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double meter=num*0.3048;
            System.out.println(num+" feet is "+meter+" meters");
        }
        else if(selection==4){
            System.out.println("Enter Meters:");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double feet=num*3.28084;
            System.out.println(num+" meters is "+feet+" feet");
        }
        else if(selection==5){
            System.out.println("Enter Ounces:");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters=num*29.5735;
            System.out.println(num +" ounces is "+milliliters+" Milliliters");
        }
        else if(selection==6){
            System.out.println("Enter Milliliters:");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = num*0.033814;
            System.out.println(num+" milliliters is "+ounces+" Ounces");
        }
        else if(selection==7){
            System.out.println("Enter Feet: ");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double miles=num/5280;
            System.out.println(num+" feet is "+miles+" miles");
        }
        else if(selection==8){
            System.out.println("Enter Miles: ");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double feet=num*5280;
            System.out.println(num+" Miles is "+feet+" Feet");
        }
        else if(selection==9){
            System.out.println("Enter Yards: ");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double feet=num*3;
            System.out.println(num+" Yards is "+feet+" Feet");
        }
        else{
            System.out.println("Enter Feet: ");
            double num=keyboard.nextDouble();
            keyboard.nextLine();
            double yards=num/3;
            System.out.println(num+" Feet is "+yards+" Yards");
        }
        keyboard.close();
    }
}