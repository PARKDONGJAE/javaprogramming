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
			Account customer1 = new Account("111-222-33333333","������",20000);
			Account customer2 = new Account("555-666-77777777","���ſ�",100000);
			System.out.println("�⺻ ������");
			printAccount(customer1);
			printAccount(customer2);
			System.out.println("�ѹ��� �����");
			customer1.deposit(1000000);
			customer2.withdraw(30000);
			printAccount(customer1);
			printAccount(customer2);
			System.out.println("�������� ���"); 
			Account.interest=0.05;
			customer1.addInterest(); //����� �ݾ�=����+����*������
			customer2.addInterest();//����� �ݾ�=����+����*������
			printAccount(customer1);
			printAccount(customer2);
			}
		static void printAccount(Account customer){
			System.out.println("���¹�ȣ:"+customer.getAccountNo());
			System.out.println("�������̸�:"+customer.getAccountName());
			System.out.println("�ܾ�:"+customer.getBalance());
			System.out.println();
			}
}



