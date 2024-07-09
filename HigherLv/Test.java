package con.lms.test;

import java.util.ArrayList;

import con.lms.dto.*;
import con.lms.util.*;
import con.lms.app.Library;

public class Test
{
	public static void main(String args[])
	{
		/*Staff s1 = new Staff(101,"anson","922214","abcfh");
		//System.out.println(s1);
		Member m1 = new Member(2011,"roy","65655","hgzxcv",2);
		//System.out.println(m1);
		Staff s2 = new Staff(102,"moy","623651","jhgfd");
		//System.out.println(s2);
		Book b1 = new Book (1011,"aa","abc","vaa");
		b1.setIssuedTo(m1);
		b1.setIssuedBy(s1);
		//b1.setReceivedBy(s2);
		System.out.println(b1);
		*/
		Library.books[0].setIssuedTo(Library.members[0]);
		Library.books[0].setIssuedBy(Library.staffs[0]);
		Library.books[2].setIssuedBy(Library.staffs[0]);

		Library.books[1].setIssuedTo(Library.members[0]);
		Library.books[2].setIssuedTo(Library.members[1]);
		/*
		System.out.println("Enter member no:");
		int no;
		no = Helper.getI();
		Book books[] = Library.getBooksByMember(Library.members[no].getEmail());
		int count = 0;
		for(int i=0; i<books.length; i++){
			if(books[i] != null){
				System.out.println(books[i]);
				count ++;
			}
		}
		if(count ==0)
		{
			System.out.println("No Book were issued to This Memeber");
		}


	*/
		System.out.println("Using ArrayList");

		ArrayList<Book> bookList = Library.getBooksByMember(Library.members[0].getEmail(), "memberEmail");

		for(Book book : bookList){
			System.out.println(book);
		}

		Book books[] = Library.getBooksByStaff(Library.staffs[0].getEmail());

		for(int i=0; i<books.length; i++){
			if(books[i] != null){
				System.out.println(books[i]);
			}
		}
		
		System.out.println("Using ArrayList");

		ArrayList<Book> bookList = Library.getBooksByStaff(Library.staffs[0].getEmail(), "memberEmail");

		for(Book book : bookList){
			System.out.println(book);
		}
		ArrayList<Book> bookList1 = Library.getBooksByStaff(Library.staffs[0].getName(),"staffName");

			for(Book book : bookList){
			System.out.println(book);
		}
	}
}