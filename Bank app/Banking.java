package Dinesh;
import java.util.Scanner;
  interface User_input                    //Using Interface 
 {   
   public void User_data();              //User_data declaration
 } 

   class User implements User_input      //Using inheritance to inherited User-input by a class User
    {
      Scanner obj1=new Scanner(System.in);
      String name;
      int acno;
      int bal=100;                        //initializing Balance value=100
   
   public void User_data()               //Interface User_data definition
    {
       System.out.println("Name:");
       name=obj1.nextLine();
       System.out.println("Enter the account number of "+name);
       acno=obj1.nextInt();
   }
 }


    public class Banking extends User    //inherited User class by Public Class Banking
   {
     Banking()                           //Using Consructor here
      { 
        System.out.println("Let's Banking with us");
      }
     int wamount,damount;
     public void deposit()              //Method deposit here to perform deposit operations
        {
          System.out.println("Enter amount");
          damount=obj1.nextInt();
          bal=bal+damount;
          System.out.println("DEPOSITED");
     
        }

     public void withdrawel()          //Method withdrawel here to perform withdrawel operations
        {
       if(bal==100)
        {
          System.out.println("Only have minimum balance : " + bal);
         }
       else if(bal<100)
        {
          System.out.println("Below minimum balance :" + bal);
         }
     else{ 
        System.out.println("Enter amount");
        wamount=obj1.nextInt();
       if(wamount<bal)
     {
        bal=bal-wamount;
        System.out.println("Wiwhdrawelled");
      }
      else
     {
       System.out.println("You dont withdraw minimum or excessive amount");
      }
 }
} 
    public void check_balance()                 //Method Check_balance here to perform view balance operations
   {
       System.out.println("Total balance amount : "+bal);
    }
   public void check_balance(int minimum)      //Using the concept of Method overloading perform Ministatment operation
   {
   if(minimum==1)
   {
    int balance=bal-100;
   
    int balan=0;
    if(bal<100){balan=bal-100;}
    if(balance<0){balance=0;}
    System.out.println("Canara Bank");
    System.out.println("NAME : "+name);
    System.out.println("ACCOUNT NUMBER : "+acno);
    System.out.println("BALANCE : "+ balance +" -Minimum Balance Deposit :" + balan*-1);
    
  }
  else
   {
    int bala=0;
    if(bal<100){bala=bal-100;}
    System.out.println("Canara Bank");
    System.out.println("NAME : "+name);
    System.out.println("ACCOUNT NUMBER : "+acno);
    System.out.println("BALANCE : "+bal +" -Minimum Balance Deposit :" + bala*-1);
    
  }
	
 }
     public static void main(String args[])
     {
     int c,minimum,minimum1;
     Banking d=new Banking();                //	Creating Object for public Class Banking also call the Constructor.
     Scanner obj=new Scanner(System.in);     //Getting user input
     System.out.println("\nWelcome to Canara Bank\n1.Balance Check \n2.Deposit \n3.Withdrawl \n4.Ministatement\n5.END\n");
     System.out.println("enter service");
     c=obj.nextInt();
     d.User_data();
    do
      {
       switch(c)
        {
          case 1:
                  d.check_balance();
                  break;
          case 2:
                  d.deposit();
                  break;
          case 3:
                  d.withdrawel();
                  break;
          case 4:
                {
                 System.out.println("Balance with Minimum amount:0     Balance without Minimum amount:1");
                 minimum=obj.nextInt();
                 d.check_balance(minimum);
                 break;
                }
          case 5:
                  System.out.println("Good bye");
                  break;
          default:
                  System.out.println("Please enter the correct choice..");
                  break;
      }
      System.out.println("enter service");
      c=obj.nextInt();
     } while(c!=5);
     System.out.println("Thank you");
  }
 }