package workshop;
class Account{
	private String acc;
	private String name;
	private double cash;
	static double interest;
	
	public Account(String ac, String name, int cash) {
		acc =ac;
		this.name=name;
		this.cash=cash;
		
	}
	public double deposit(double a) {
		cash +=a;
		return cash;
	}
	public double withdraw(double b) {
		cash -= b;
		return cash;
		
	}
	public double addInterest() {
		cash = cash + cash * interest;
		return (int)cash;
	}
	public String getAccountNo() {
		return acc;
		
	}
	public String getAccountName() {
		return name;
		
	}
	public int getBalance() {
		return (int)cash;
	}
}
public class Workshop {
		public static void main(String[] args){
			Account customer1 = new Account("111-222-33333333","최은희",20000);
			Account customer2 = new Account("555-666-77777777","남매월",100000);
			System.out.println("기본 적립금");
			printAccount(customer1);
			printAccount(customer2);
			System.out.println("한번의 입출금");
			customer1.deposit(1000000);
			customer2.withdraw(30000);
			printAccount(customer1);
			printAccount(customer2);
			System.out.println("이자율의 계산"); 
			Account.interest=0.05;
			customer1.addInterest(); //저축된 금액=원금+원금*이자율
			customer2.addInterest();//저축된 금액=원금+원금*이자율
			printAccount(customer1);
			printAccount(customer2);
			}
		static void printAccount(Account customer){
			System.out.println("계좌번호:"+customer.getAccountNo());
			System.out.println("예금주이름:"+customer.getAccountName());
			System.out.println("잔액:"+customer.getBalance());
			System.out.println();
			}
}



