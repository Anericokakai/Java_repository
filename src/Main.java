import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("ENTER EMPLOYEE NUMBER:");
        int empNo=scanner.nextInt();
        System.out.print("enter your name:");
        String empName=scanner.next();
        System.out.print("enter your designation :");
        String empDesg=scanner.nextLine();
        scanner.next();
        System.out.print("enter the days worked:");
        int days=scanner.nextInt();
        System.out.print("enter the pay rate:");
        int payrate=scanner.nextInt();
        System.out.print("enter generation date :");
        String gendate=scanner.nextLine();

        int basicPay=days*payrate;
        System.out.print(basicPay);
        int pf=basicPay/10;
       final double proftax=0.2*basicPay;
        double totalDeduct= proftax+pf;
        double netPay=totalDeduct;

        System.out.println("\t \t \t\tSHREE KRISHNA CHEMIST AND DRUGGIST");
        System.out.println("\t \t \t\t \tSALARY MONTH 9 2013");
        System.out.print("EMP.NO :"+empNo+" \t\t \t EMP.NAME:"+empName+" \t\t \t DESIGNATION:"+empDesg+" ");
        System.out.println();
        System.out.print("DAYS WORKED:"+days+" \t\t \t PAY RATE:"+payrate+"\t\t \t GEN.DATE:"+gendate+" ");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("EARNINGS  \t\t \t \tAMOUNT (RS.)\t\t \t\t DEDUCTIONS \t\t \t AMOUNT" );
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------" );
        System.out.print("BASIC PAY  \t\t \t \t"+ basicPay +" \t\t \t\t\t\t P.F\t\t\t \t \t "+pf+" " );
        System.out.println();

        System.out.print("\t\t\t\t \t\t \t \t\t\t \t\t\t PROF .TAX\t\t\t \t "+proftax+" " );
        System.out.println();

        System.out.println("-----------------------------------------------------------------------------------" );

        System.out.print("GROSS EARN  \t\t \t "+ basicPay +" \t\t \t\t\t\t TOTAL DEDUCTION\t\t\t \t "+totalDeduct+" " );
        System.out.println();

        System.out.print("\t\t\t\t \t\t \t \t\t\t \t\t\t NET PAY\t\t\t \t "+netPay+" " );
    }
}