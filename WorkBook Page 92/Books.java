package wbpaeg92;

public class Books {
	String BName,BAuthor;
	long BId;
	int yop;
	boolean setBName(String name) {
		int i,fl=0;
		for(i=0;i<name.length();i++)
		{
			if(Character.isAlphabetic(name.charAt(i)) || name.charAt(i)=='-')
				fl++;
		}
		if(fl==name.length())
		{
			BName=name;
			return true;
		}
		return false;
	}
	boolean setBAuthor(String author) {
		int i,fl=0;
		for(i=0;i<author.length();i++)
		{
			if(Character.isAlphabetic(author.charAt(i))==false)
				fl++;
		}
		if(fl==0)
		{
			BAuthor=author;
			return true;
		}
		return false;
	}
	boolean setBId(long id) {
		BId=id;
		return true;
	}
	boolean setYop(int yop) {
		int k=yop,count=0;
		while(k!=0)
		{
			count++;
			k/=10;
		}
		if(count==4) {
			this.yop=yop;
			return true;
		}
		return false;
	}
	String getBName() {
		return "Book Name: "+BName;
	}
	String getBAuthor() {
		return "Author: "+BAuthor;
	}
	String getBId() {
		return "Book ID: "+BId;
	}
	String getYop() {
		return "Year of publication: "+yop;
	}
	public String toSrting() {
		return getBName()+"\n"+getBAuthor()+"\n"+getBId()+"\n"+getYop()+"\n";
	}
}
