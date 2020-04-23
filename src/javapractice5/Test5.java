
package javapractice5;

import java.util.function.Consumer;

interface Database2 {
	void open(String dbName);
}

public class Test5 {

	public static void main(String[] args) {
		Database2 db = (dbName) -> {
			System.out.println(dbName + "open");
		};
		Consumer<String> o = (dbName) -> {
			System.out.println(dbName + "open");
		};
		o.accept("Database");
		db.open("HAppy");
	}
}
