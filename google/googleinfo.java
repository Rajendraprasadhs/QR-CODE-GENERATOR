package google;
import java.util.Scanner;

public class googleinfo {
    
    public void currentstatus(){
        
        int s=345;
        int k=166;
        
        System.out.println("Here is the information on total "
                + "number of web apps in google".toUpperCase());                //STRING HANDLING FUNCTION(ToUpperCase)
         System.out.println("The total number of ios apps are : "+k);                     
          System.out.println("The total number of Android apps are : "+s);
                  
    }
    
    public void companyapp(){
        
        int h;
        String rr;
        
         System.out.println("Enter the name of your company : ");
         Scanner sc=new Scanner(System.in);
         rr=sc.nextLine();                                                      //READING CONSOLE(nextLine)
          System.out.println("Enter the total number of apps"
                  + " the comapny developed so far: ");
          h=sc.nextInt();                                                       //READING CONSOLE(nextInt)
          System.out.println("Enter the total number of ios apps Developed : ");
            int h1=sc.nextInt();                                               
          System.out.println("Enter the total number of Android apps are : ");
            int h2=sc.nextInt();
          
            System.out.println("Enter the CEO of the company: "); 
            String  rr1=sc.next();                                              //READING CONSOLE(next)
            
             System.out.println("Name of your company :".concat(rr));             //STRING HANDLING FUNCTION(concate)
              System.out.println("The CEO of the company: "+rr1.toUpperCase()); 
              System.out.println("The total number of apps the comapny developed so far :"+h);
             System.out.println("The total number of ios apps Developed : "+h1);
                System.out.println("The total number of Android apps are : "+h2);
                
    }
    
 }
