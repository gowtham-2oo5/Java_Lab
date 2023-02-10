package wbpaeg92;

import java.util.*;

public class Library {
/*Array of books
 * Book count
 * addNewBook()
 * printAllBooks()
 * searchBookId()
 * searchBookName()
 * ModifyName()
 * */
	static Books b[]=new Books[100];
	static  int bcount=0;
	static void addNewBook()
	{
		b[bcount]=new Books();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the book: ");
		boolean a=b[bcount].setBName(sc.next());
		while(a==false) {
			System.out.println("Enter valid Name: ");
			a=b[bcount].setBName(sc.next());
		}
		System.out.println("Enter name of the Author: ");
		boolean bo=b[bcount].setBAuthor(sc.next());
		while(bo==false) {
			System.out.println("Enter valid Author name: ");
			bo=b[bcount].setBName(sc.next());
		}
		System.out.println("Enter book ID: ");
		boolean c=b[bcount].setBId(sc.nextLong());
		while(c==false) {
			System.out.println("Enter valid Id: ");
			c=b[bcount].setBId(sc.nextLong());
		}
		System.out.println("Enter YOP of the book: ");
		boolean d=b[bcount].setYop(sc.nextInt());
		while(d==false) {
			System.out.println("Enter valid Yop: ");
			d=b[bcount].setYop(sc.nextInt());
		}
		bcount++;
	}
	static void printAllDetails()
	{
		int i;
		for(i=0;i<bcount;i++) {
			System.out.println(b[i].toSrting());
		}
	}
	static boolean searchById() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID of book: ");
		long tid=s.nextLong();
		int i;
		for(i=0;i<bcount;i++)
		{
			if(tid==b[i].BId)
			{
				System.out.println("Found at :"+(i+1));
				return true;
			}
		}
		return false;
	}
	static boolean searchByName()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name of book: ");
		String tname=s.next();
		int i;
		for(i=0;i<bcount;i++)
		{
			if(tname.equals(tname))
			{
				System.out.println("Found at :"+(i+1));
				return true;
			}
		}
		return false;
	}
	static boolean modifyAuthor()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID of book: ");
		long tid=s.nextLong();
		int i;
		for(i=0;i<bcount;i++)
		{
			if(tid==b[i].BId)
			{
				System.out.println("Enter name of new Author: ");
				b[i].BAuthor=s.next();
				return true;
			}
		}
		return false;
	}
}
