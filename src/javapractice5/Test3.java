package javapractice5;

interface Database {
	void open();
}

public class Test3 {
static void test(Database d) {d.open();}
public static void main(String[] args) {
	
	Database db = new Database() {
		public void open() {System.out.println("Database");
	}
	
};
		db.open();
		Database db2 = () -> {System.out.println("Database");};
		db2.open();
		test(db2);
		test(()-> {System.out.println("Database open");});
}
}
