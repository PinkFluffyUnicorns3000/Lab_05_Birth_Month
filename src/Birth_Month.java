
/*
class BirthMonth
    main()
        int birthMonth
        output “What is your birth month? (1-12)”
        input birthMonth
        if brithMonth is <= 12 then
            if birthMonth >= 1 then
            output “Your birth month is “ + birthMonth
            else
            output “Your birth month is invalid”
            endIf
        endIf
     return
EndClass

 */

import java.util.Scanner;
public class Birth_Month {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);


        int birthMonth = 0;
        String trash = "";



        System.out.print("What is your birth month? (1-12) ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(birthMonth <= 12 && birthMonth >= 1){
                System.out.println("You said that your birth month is " + birthMonth);
            } else if (birthMonth > 12 || birthMonth < 1)
            {
                System.out.println("That is not a valid birth number! " + birthMonth);
            }
        } else
        {
            trash = in.nextLine();
            System.out.println("That is not a valid birth number! " + trash);
        }
    }
}