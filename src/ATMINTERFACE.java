import java.util.Scanner;

public class ATMINTERFACE {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int Balance=75643 ;
        int ATMPin=1234;
        System.out.println("----------||Welcome To Bank O f India ATM||----------");
        System.out.println("Insert the ATM Card");
        System.out.print("Enter Your Pin:");
        int Pin=ob.nextInt();
        if(ATMPin==Pin) {
            System.out.println("Validation Is Done!");
        }
        else {
            System.out.print("Password Is Incorrect Please Try Again!");
            System.exit(0);
        }
        while(true)
        {
            System.out.println("Choose 1 For Withraw");
            System.out.println("Choose 2 For Deposite");
            System.out.println("Choose 3 For Check Balance");
            System.out.println("Choose 4 For Change Password");
            System.out.println("Choose 5 For Exit");
            System.out.print("Choose The Operation You Want To Perform:");
            int choice=ob.nextInt();

            switch(choice)
            {


                case 1:
                    System.out.println("Only 500 Credintials Are Available");
                    System.out.println("Enter Amount to be Withdraw:");
                    int Withdraw=ob.nextInt();

                    if(Balance>=Withdraw)
                    {
                        Balance=Balance-Withdraw;
                        System.out.println("Please Collect Your Money");
                    }
                    else
                    {
                        System.out.println("Insufficient Amount In Your Account");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Deposite Your Amount:");
                    int Deposite=ob.nextInt();
                    Balance=Balance+Deposite;
                    System.out.println("Your Money Succesfully Deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance:"+Balance);
                    Balance=ob.nextInt();
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Change Pin");
                    Pin=ob.nextInt();
                    System.out.println("");
                case 5:
                    System.out.println("Thank You For Using Bank Of India ATM!!! Please Visite Again!");
                    System.exit(0);
            }
        }

    }
}







