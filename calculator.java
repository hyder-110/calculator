import java.util.Scanner;
public class calculator {
    
    public static void main(String[] args) {
         int n1;
         int n2;
         int n3;
         int cal;
         int quotient;
         int remiander;
         System.out.println("Enter 2 number:- ");
         Scanner r=new Scanner (System.in);
         System.out.println("Enter First number:- ");
         n1=r .nextInt();
         System.out.println("Enter Second number:- ");
         n2=r .nextInt();
         System.out.println("Select Operation:- ");
         System.out.println("1 - Addition");
         System.out.println("2 - Subtraction");
         System.out.println("3 - Multiplication");
         System.out.println("4 - Division");
        System.out.println("Enter Operation number");
        Scanner s=new Scanner(System.in);
        n3=s .nextInt();

        if (n3==1){
            cal=n1+n2;
            System.out.println("sum of two numbers:-"+cal);
        }
        else if (n3==2) {
            cal=n1-n2;
            System.out.println("Difference Of two numbers:-"+cal);
        }
        else if (n3==3){
            cal=n1*n2;
            System.out.println("Product of two numbers:-"+cal);
        }
        else if (n3==4){
            quotient=n1/n2;
            remiander=n1%n2;
            System.out.println("Quotient of two numbers:-"+quotient);
        }
    }
}
