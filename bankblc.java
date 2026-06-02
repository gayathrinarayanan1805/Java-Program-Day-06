class bankacc{
String Name;
int accNo;
int balance;
void display(){
System.out.println("Name:"+Name);
System.out.println("Account No:"+accNo);
System.out.println("Bank Balance:"+balance);
}
}

public class bankblc{
public static void main(String[] args){
bankacc b1 = new bankacc();
b1.Name = "Gayathri";
b1.accNo = 17042000;
b1.balance = 17000;
b1.display();
}
}
