/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjavaclass4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tyler
 */
public class AdvJavaClass4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("Date Difference ");
        System.out.println("---------------");
        
       LocalDate TJT = LocalDate.of(1987, 3, 9);
       LocalDate RAH = LocalDate.of(1988, 10, 10);
       
       Period total = Period.between(TJT, RAH);
       
       
       int y1 = total.getYears();
       int m1 = total.getMonths();
       int d1 = total.getDays();
       
    LocalDate final1 = RAH.plusDays(d1).plusMonths(m1).plusYears(y1);
 
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    String format = final1.format(dtf);

        System.out.println("The album The Joshua Tree came out on " + TJT);
        System.out.println("The album Rattle and Hum came out on " + RAH);
        System.out.println("The time between The Joshua Tree and Rattle and Hum is: " + d1 + " day "+m1+" months and "+y1+" year");
        System.out.println("");
        System.out.println("Using the same period of time the next album after Rattle and Hum would of come out on ");
        System.out.println(format);
 
        
        
        
        System.out.println("");
        System.out.println("Enum");
        System.out.println("-------");
        
        System.out.println("Pick a team or a city for the NFL, NFC North:  ");
        Scanner scan = new Scanner(System.in);
        String something =  scan.nextLine().substring(0, 3);
        String some = something.toLowerCase();
      
        
      
       switch(some)
               {
           case "gre":
           case "pac":
               System.out.println("");
               System.out.println( Teams.PACKERS.getCity()+" "+ Teams.PACKERS.getTeam());
               break;
           case "vik":
            case" min":
                System.out.println("");
                System.out.println(Teams.VIKINGS.getCity() + " "+ Teams.VIKINGS.getTeam());
                break;
            case"det":
            case"lio":
                System.out.println("");
                System.out.println(Teams.LIONS.getCity() + " "+ Teams.LIONS.getTeam());
                break;
            case"bea":
            case"chi":
                System.out.println("");
                System.out.println(Teams.BEARS.getCity() + " "+ Teams.BEARS.getTeam());
                break;
            default:
                System.out.println("");
                System.out.println("Try again: ");
                something= scan.nextLine().toLowerCase();
                some = something.substring(0, 3);
                
               }
        
        System.out.println("");
        System.out.println("Wrapper");
        System.out.println("--------");
        System.out.println("");
        
        System.out.println("Enter a number and I'll tell you what type it falls under: ");
       long dome = scan.nextLong();
        
        if(dome <= Byte.MAX_VALUE && dome >= Byte.MIN_VALUE)
        {
            
            System.out.println("Byte");
        }
        else if(dome <= Short.MAX_VALUE && dome >= Short.MIN_VALUE)
        {
            System.out.println("Short");
        }
        else if(dome <= Integer.MAX_VALUE && dome >= Integer.MIN_VALUE)
        {
            System.out.println("Integer");
        }
        else if(dome <= Long.MAX_VALUE&& dome >= Long.MIN_VALUE)
        {
            System.out.println("Long");
        }

        System.out.println("");
        System.out.println("BigNumbers");
        System.out.println("-------------");
        BigInteger wp = new BigInteger("5726398");
        BigInteger cp = new BigInteger("38041430");
         BigInteger tp = new BigInteger("26059203");
          BigDecimal copies = new BigDecimal("3.23");
         
         System.out.println("Every Wisconsin letters to Every Cali is: ");
          BigInteger total1 = wp.multiply(cp);
          System.out.println(total1);
          System.out.println("That total but only to everyone in texas now: ");
           BigInteger total2 = total1.multiply(tp);
           System.out.println(total2);
           System.out.println("What if it cost the Texans $3.23 for every letter: ");
            BigInteger total3 = copies.toBigInteger().multiply(total2);
            System.out.println("$"+ total3);



    }
      
    
     
}
