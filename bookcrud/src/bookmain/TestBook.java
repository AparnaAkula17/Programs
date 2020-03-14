package bookmain;

import java.util.Scanner;
import dto.Book;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import dao.BookDAO;
import dto.Book;

public class TestBook {
public static void main(String args[]) throws SQLException
{
	BookDAO bookdao=new BookDAO("jdbc:mysql://localhost:3306/cts","root","root");
	bookdao.connect();
	Book book=new Book(1009,"data science","mathews",5650);
	Scanner s=new Scanner(System.in);
	while(true)
	{
				System.out.println("1.list all the books");
				System.out.println("2.delete the books");
				System.out.println("3.update the books");
				System.out.println("4.insert the books");
				System.out.println("5.quit");
				System.out.println("Enter the choice");
				int ch=s.nextInt();
				switch(ch)
				{
					case 1:List<Book> books=bookdao.listAllBooks();
					for(Book b:books)
					{
						System.out.println(b.getTitle()+" "+b.getAuthor());
					}
					break;
					case 2:
						System.out.println("Enter id to delete");
						int id2=s.nextInt();
						//Book book2=new Book();
						bookdao.deleteBook(id2);
						break;
					case 3:
						System.out.println("Enter name,author and price to update where id is");
						String name3=s.next();
						String author3=s.next();
						float price3=s.nextFloat();
						int id3=s.nextInt();
						Book book3=new Book(id3,name3,author3,price3);
						bookdao.updateBook(book3);
						System.out.println("book updated");
						break;
					case 4:
						System.out.println("Insert Book values");
						int id=s.nextInt();
						String name=s.next();
						String author=s.next();
						float price=s.nextFloat();
						Book book1=new Book(id,name,author,price);
						bookdao.insertBook(book1);
						System.out.println("book inserted");
						break;
					case 5:System.exit(0);
				}
	}
	}
}