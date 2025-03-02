/*Basic producer consumer problem using threads and basically it is known as inter thread communication*/
class Bank
{
	double balance=10000;
	synchronized void withdraw(int w)
	{
		if(balance<w)
		{
			System.out.println("Insufficient Balance;Waiting for deposit");
			try{
				wait();
			}
			catch(Exception e){}
		}
			balance-=w;
			System.out.println("Withdraw complete:"+w+"\nNew Balance:"+balance);
	}
	synchronized void deposit(int dep)
	{
		System.out.println("Deposit amount:"+dep);
		balance+=dep;
		System.out.println("Deposit done\nNew balance:"+balance);
		notify();          
	}
}
public class InterThreadDemo
{
	public static void main(String args[])
	{
		Bank b=new Bank();
		new Thread(){public void run(){
			b.withdraw(15000);}
		}.start();
		new Thread(){public void run(){
			b.deposit(20000);}
		}.start();
	}
}
/*output:
Insufficient Balance;Waiting for deposit
Deposit amount:20000
Deposit done
New balance:30000.0
Withdraw complete:15000
New Balance:15000.0
*/
/*Explanation:
This program demonstrates Inter-Thread Communication using the Producer-Consumer Problem in a bank scenario.
Bank Class (Shared Resource):
->Has an initial balance of ₹10,000.
withdraw(int w):
->If the balance is less than the withdrawal amount, the thread waits for a deposit (wait()).
->Once a deposit is made, it deducts the withdrawal amount and displays the new balance.
deposit(int dep):
->Adds money to the balance.
->Notifies any waiting thread (notify()) that it can proceed.
InterThreadDemo (Main Class):
Creates two threads:
->One tries to withdraw ₹15,000 (more than the available balance).
->The other deposits ₹20,000, allowing the withdrawal to proceed.
key points:
-->Thread Synchronization: synchronized ensures only one thread accesses the balance at a time.
-->Inter-Thread Communication: wait() makes the withdrawal thread pause until notify() wakes it up.
-->Producer-Consumer Problem: Deposit (producer) adds money, enabling withdrawal (consumer).
*/