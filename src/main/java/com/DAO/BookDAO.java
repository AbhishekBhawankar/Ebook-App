package com.DAO;

import java.util.List;

import com.entity.Book_details;

public interface BookDAO {
	public boolean addBooks(Book_details b);

	public List<Book_details> getAllBooks();

	public Book_details getBookById(int id);

	public boolean updateEditBooks(Book_details b);

	public boolean deleteBooks(int id);

	public List<Book_details> getNewBook();
	
	public List<Book_details> getRecentBooks();
	
	public List<Book_details> getOldBooks();
	
	public List<Book_details> getAllRecentBook();
	
	public List<Book_details> getAllNewBook();
	
	public List<Book_details> getAllOldBook();
	
	public List<Book_details> getBookByOld(String email, String cate);
	
	public boolean oldBookDelete(String email, String cate,int id);
	
	public List<Book_details> getBookBySearch(String ch);
}
