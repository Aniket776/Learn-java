import java.util.Scanner;
import java.io.FileWriter;
class Demo{
    static String name ="rohan";
    static String mobile="7895186118";
    static int balance=20000;
    static int pin;
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("* Abc Bank */n");
        System.out.print("enter your pin: ");
        pin  =sc.nextInt();
         if(pin==7895){
             int flage=1;
             while(flage==1){
                 System.out.println("/n1. Check Blance");
                 System.out.println("2. Change pin ");
                 System.out.println("3.Withdrawl ");
                 System.out.println("4.Deposit ");
                 System.out.println("5. Exit");
                 System.out.println("enter your choice");
                 int choice=sc.nextInt();
                 switch (choice){
                     case 1:
                    CheckBalance();
                         System.out.print("press 1 to print: ");
                         int val=sc.nextInt();
                         if(val==1)
                            Print(0,0);
                            break;
                            case 2:
                            ChangePin();
                            break;
                            case 3:
                            Withdrawl();
                            break;
                            case 4:
                            Deposit();
                            break;
                            case 5:
                            System.out.print("bye bye customer");
                            flage=0;
                            break;
                            default: 
                             System.out.print("wrongEntered!");
                            
                   }
                 
                       
                     }
               }else{
                 System.out.println("wrong pin");
                 
             }
         }
        public static void CheckBalance(){
		System.out.println("Your Balance is : "+balance);
        	}
        public static void ChangePin(){
		System.out.print("Enter New Pin : ");
		int newPin = sc.nextInt();
		System.out.print("Re-Enter New Pin : ");
		int RePin = sc.nextInt();
		if(newPin==RePin)
		{
			pin = newPin;
			System.out.println("Pin Changed Successfully!");
		}else{
			System.out.println("Pin Changed Failed!");
		}
	}
	public static void Withdrawl(){
		System.out.print("(Withdrawl)\nEnter Amount : ");
		int amt = sc.nextInt();
		if(amt<=balance){
			balance=balance-amt;
			System.out.println("Withdrawl Success Rs "+amt);
			System.out.println("Current Balance : "+balance);
			System.out.print("Press 1 To Print : ");
					int val = sc.nextInt();
					if(val==1)
						Print(amt,0);
		}else{
			System.out.println("Insufficient Balance!");
		}
	}
	public static void Deposit(){
		System.out.print("(Deposit)\nEnter Amount : ");
		int amt = sc.nextInt();
		balance=balance+amt;
		System.out.println("Deposit Success Rs : "+amt);
		System.out.println("Current Balance : "+balance);
		System.out.print("Press 1 To Print : ");
					int val = sc.nextInt();
					if(val==1)
						Print(0,amt);
	}
	public static void Print(int with,int dep){
		try{
			FileWriter w = new FileWriter("Demo.txt");
			String str ="\nCustomer Name "+name+
						"\nCustomer Mobile : "+mobile+
						"\nWithdrawl : "+with+
						"\nDeposit : "+dep+
						"\nCurrent Balance : "+balance+
						"\nThank You!";
			w.write(str);
			System.out.println(str);
			w.close();
		}catch(Exception e){
			System.out.println("File Error!");
		}
    }
}
