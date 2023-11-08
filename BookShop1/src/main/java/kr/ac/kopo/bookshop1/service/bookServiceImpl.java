package kr.ac.kopo.bookshop1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookshop1.dao.BookDao;
import kr.ac.kopo.bookshop1.model.Book;
import kr.ac.kopo.bookshop1.pager.Pager;

@Service
public class bookServiceImpl implements BookService {

	@Autowired
	private BookDao dao;
	
	@Override
	public List<Book> list(Pager pager) throws Exception {
       int total = dao.total(pager);
       
       pager.setTotal(total);
		
       return dao.list(pager);
	}

	@Override
	public void add(Book item) throws Exception {
        dao.add(item);		
	}

	@Override
	public Book item(Long bookid) throws Exception {
		return dao.item(bookid);
	}

	@Override
	public void update(Long bookid) throws Exception {
            dao.update(bookid);		
	}

	@Override
	public void delete(Long bookid) throws Exception {
           dao.delete(bookid);		
	}

}
