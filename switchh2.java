import java.util.*;
public class switchh2 {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);


        int day = sc.nextInt();
        //int day =0;
        //if(a>=18)
           //day=1;

        switch (day) {
            case 1:
                
                System.out.println("monday");
                break;

            case 2:
                System.out.println(" tuesday"); 
                
                break;
            
            case 3:
                System.out.println("wednesday");
                break;      
            case 4:
                System.out.println(" thursday"); 
                break;
            case 5:
                System.out.println(" friday"); 
                break;
            case 6:
                System.out.println(" saurday");
                break; 
            case 7:
                System.out.println(" sunday");  
                break;   



            default:
                break;
        }

    }
    
}
