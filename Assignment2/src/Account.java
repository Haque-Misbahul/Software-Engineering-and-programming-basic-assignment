public class Account 
{
    
    int accountnumber, pin;
    double balance;
    public Account(int acc_num,int pin_num)
        {
          accountnumber = acc_num;
          pin=dochecksum(pin_num);
          balance = 0.0;
        } 
    
    public void getAccountNumber()
        {
         System.out.println(accountnumber);
        }
    
    public void getPin()
        {
         System.out.println(pin);
        }
    
    public  void getBalance()
        {
         System.out.println(balance);
        }
    
    public  double credit(double money)
        {
         return this.balance += money;
        }
    
    public void debit(double money, int pin_num)
        {
            int pin2 = dochecksum(pin_num);
            String msg="";
            if(pin2==this.pin)
            {
                if(money<=this.balance)
                {
                    this.balance=this.balance-money;
               
                    msg = "true";
                }
                else
                    msg = "False";
            }
            else
            {
                System.out.print("pin does not match ");
            
                msg = "(false)";
            }
                System.out.println(msg);
        }
    public void transferTo(Account name,double money, int pin_num)
        {
            int receivedPin = dochecksum(pin_num);
            String msg="";
                if(receivedPin==this.pin)
                {
                    if(money<=this.balance)
                    {
                        this.balance=this.balance-money;
                        name.balance=name.balance+money;
                        msg = "true";
                    }
                    else
                        msg = "False";
                }
                else
                {
                    System.out.print("pin does not match ");
                    msg = "(false)";
                }
                System.out.println(msg);
        }
    public int dochecksum(int value)
    {
        int checksum=0;
        int temp = 0;
        while (value > 0)
            {
             
             temp = value % 10;  
             checksum = checksum + temp;
             value = value  / 10;
                
            }
           return checksum; 
    }
}
