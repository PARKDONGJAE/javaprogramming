package workshop;

class SubscriberInfo{
	String name;
	String id;
	String pw;
	String ph;
	String ad;
	
	public SubscriberInfo(String name, String id, String pw) {
		this.name= name;
		this.id=id;
		this.pw =pw;
	}
	public SubscriberInfo(String name, String id, String pw, String ph, String ad) {
		this.name= name;
		this.id=id;
		this.pw =pw;
		this.ph=ph;
		this.ad=ad;
	}
	public SubscriberInfo() {
		
	}
	public String setAddress(String a){
		ad = a;
		return ad;
	}
	public String setPhoneNo(String b) {
		ph = b;
		return ph;
	}
}
public class Workshop2 {
	public static void main(String[] args)
	{
		SubscriberInfo obj1, obj2,obj3;
		obj1=new SubscriberInfo("박유신","1017db","daewi");
		obj2=new SubscriberInfo("백곰","baekom","white", 			"200-000-0000","north pole");
		obj3=new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("교직원1숙사");
		obj1.setPhoneNo("133-1234-5678");
		printSubscriberInfo(obj1);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("이름:"+obj.name);
		System.out.println("아이디:"+obj.id);
		System.out.println("패스워드:"+obj.pw);
		System.out.println("전화번호:"+obj.ph);
		System.out.println("주소:"+obj.ad);
		System.out.println();
	}

}
