package kr.ac.kopo.bookshop1.service;

import java.util.List;


import kr.ac.kopo.bookshop1.model.Book;
import kr.ac.kopo.bookshop1.pager.Pager;

public interface BookService {

	List<Book> list(Pager pager)throws Exception ;

	void add(Book item)throws Exception ;

	Book item(Long bookid)throws Exception ;

	void update(Long bookid)throws Exception ;

	void delete(Long bookid)throws Exception ;

}
