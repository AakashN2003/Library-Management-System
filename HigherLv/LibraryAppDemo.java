
import java.util.ArrayList;
import java.util.ArrayList;

import con.lms.dto.Book;
import con.lms.util.Helper;
import con.lms.dto.Member;
import con.lms.dto.Staff;
import con.lms.app.Library;

public class LibraryAppDemo 
{

    public static void main(String args[])
    {
        int service;

        while (true) 
        {
            System.out.println("\n** Library Menu **");
            System.out.println("1. Search");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. List");
            System.out.println("6. Pay Slip");
            System.out.println("5. Display");
            System.out.println("7. Exit Menu");
            System.out.println("Enter the option (1-7): ");

            service = Helper.getI(); 
            String bookName = null;
            String category = null;
            String author = null;
            int bookId = 0; 
            int memberId = 0; 
            int staffId = 0;
            Book searchedBook = null;
            String issueToName =null;
            ArrayList<Book> searchedBooks = new ArrayList<>();
            ArrayList<Member> searchedMembers = new ArrayList<>();
            ArrayList<Staff> searchedStaff = new ArrayList<>();

            switch (service) 
            {
                case 1:
                    int serachNo;

                    while (true) 
                    {
                        System.out.println("\n** Search Menu **");
                        System.out.println("1. Search Book By Name ");
                        System.out.println("2. Search Book By Author");
                        System.out.println("3. Search Book By Category");
                        System.out.println("4. Search Member By Name/Email/MobileNumber");
                        System.out.println("5. Search Staff By Name/Email/MobileNumber");
                        System.out.println("6. Exit Menu");
                        System.out.println("Enter the option (1-6): ");
                        serachNo = Helper.getI();
                        switch(serachNo)
                        {
                            case 1:
                                System.out.println("Enter the Book Name : ");
                                bookName = Helper.getS();
                                searchedBook = getBookDetails(bookName);
                                searchedBooks = Library.searchBook(bookName, "bookName");
                                if (searchedBooks.isEmpty()) {
                                    System.out.println("No books found with the name: " + bookName);
                                } else {
                                    System.out.println("Books found:");
                                    for (Book book : searchedBooks) {
                                        System.out.println(book);
                                    }
                                } 
                                break;


                            case 2:
                                System.out.println("Enter the Book Author : ");
                                author = Helper.getS();
                                searchedBook = getBookDetails(author);
                                searchedBooks = Library.searchBook(author, "author");
                                if (searchedBooks.isEmpty()) {
                                    System.out.println("No books found with the name: " + author);
                                } else {
                                    System.out.println("Books found:");
                                    for (Book book : searchedBooks) {
                                        System.out.println(book);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Enter the Book Category : ");
                                category = Helper.getS();
                                searchedBook = getBookDetails(category);
                                searchedBooks = Library.searchBook(category, "category");
                                if (searchedBooks.isEmpty()) {
                                    System.out.println("No books found with the name: " + category);
                                } else {
                                    System.out.println("Books found:");
                                    for (Book book : searchedBooks) {
                                        System.out.println(book);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Enter Member Name/Email/MobileNumber : ");
                                String memberKeyword = Helper.getS();
                                searchedMembers = Library.searchMember(memberKeyword);
                                if (searchedMembers.isEmpty()) {
                                    System.out.println("No members found with the keyword: " + memberKeyword);
                                } else {
                                    System.out.println("Members found:");
                                    for (Member member : searchedMembers) {
                                        System.out.println(member);
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Enter Staff Name/Email/MobileNumber : ");
                                String staffKeyword = Helper.getS();
                                searchedStaff = Library.searchStaff(staffKeyword);
                                if (searchedStaff.isEmpty()) {
                                    System.out.println("No staff found with the keyword: " + staffKeyword);
                                } else {
                                    System.out.println("Staff found:");
                                    for (Staff staff : searchedStaff) {
                                        System.out.println(staff);
                                    }
                                }
                                break;
                            case 6:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option. Please enter a number from 1 to 6.");
                                break;
                       }
                    }
                    break;




                case 2:
                    System.out.println("Enter the BookId : ");
                    bookId = Helper.getI();
                    System.out.println("Enter the MemberId : ");
                    memberId = Helper.getI();
                    System.out.println("Enter the StaffId : ");
                    staffId = Helper.getI();
                    Library.issueBook(bookId,memberId,staffId);
                    
                    break;



                case 3:
                    System.out.println("Enter the BookId : ");
                    bookId = Helper.getI();
                    System.out.println("Enter the MemberId : ");
                    memberId = Helper.getI();
                    System.out.println("Enter the StaffId : ");
                    staffId = Helper.getI();
                    Library.returnBook(bookId,memberId,staffId);
                   
                    break;




                case 4:
                    int listNo;
                    while(true)
                    {
                        System.out.println("\n** List Menu **");
                        System.out.println("1. List Books");
                        System.out.println("2. List Members");
                        System.out.println("3. List Staff");
                        System.out.println("4. Exit Menu");
                        System.out.println("Enter the option (1-4): ");
                        listNo = Helper.getI(); 
                        switch(listNo){
                        case 1:

                            break;


                        case 2:
                            
                            break;

                        case 3:
                            
                            break;

                        case 4:
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid option. Please enter a number from 1 to 4a.");
                            break;
                        } 
                    }
                   
                	break;




                case 5:
                    
                    break;





                case 6:
                     break;





                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number from 1 to 6.");
                    break;
            }
        }
    }

    public static void displayAllBook() 
    {
        System.out.println("### BOOK DETAILS ###\n");

        for (Book book : books) {
            System.out.println("Book ID : " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println("Status : " + (book.getStatus() ? "Available" : "Issued"));
            System.out.println("Issued To : " + (book.getIssuedTo() == null ? "Available" : book.getIssuedTo()));
            System.out.println("");
        }
    }

    public static Book getBookDetails(String bookName) 
    {
        Book availableBook = null;

        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                availableBook = book;
                break;
            }
        }


        return availableBook;
    }
    public static Book getBookDetails(int bookId) 
    {
        Book availableBook = null;
        try
        {
            for (Book book : books) {
                if (book.getBookId()==bookId) {
                    availableBook = book;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error : LibraryAppDemo :  getBookDetails(int bookId)");
        }
        return availableBook;
    }

}