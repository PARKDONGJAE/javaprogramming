package workshop;
class BBSItem{
	static int seqNo=0; 			//일련번호 필드
	String writer; 			//작성자 필드
	String writtenDate;			//작성일자 필드
	String title;			//제목필드
	String content;			//내용필드
	public BBSItem(String writer, String writtenDate, 
			String title, String content){//생성자
		seqNo = seqNo+1;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
	}
	
}
public class Workshop3 {
	public static void main(String[] args)
	{
		BBSItem a = new BBSItem("asd", "Asd", "Asd", "Asd");
		printinfo(a);
		BBSItem a1 = new BBSItem("assda", "Asdda", "Asdaa", "Asdda");
		printinfo(a1);
		BBSItem a2 = new BBSItem("asdaa", "Asdaa", "Asdda", "Asada");
		printinfo(a2);
		BBSItem a3 = new BBSItem("asdad", "Asdad", "Asada", "Adsda");
		printinfo(a3);
		
	}
	public static void printinfo(BBSItem x) {
		System.out.println(x.seqNo);
	}
}
