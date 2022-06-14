package tutorial.blog.entity.service;

import java.util.ArrayList;
import java.util.List;

import tutorial.blog.entity.BlogCategory;
import tutorial.blog.entity.BlogPost;
/**
 * 
 * 	data store in memory
 * 
 * DAO has method 
 * Create : new data store                --  need data object
 * Read(Retrieve) : get data , view ,search  -- select by keyword
 * Update : change data value 					-- data object has id 
 * Delete : Remove  data 					--  id						
 * 
 * @author william mario standford  jang
 * @version 0.0.1  Tranning
 * */
public class BlogMemorDao {
	private List<BlogPost> postRepo ;
	private List<BlogCategory> cateRepo ;
	
	public BlogMemorDao() {
		super();
		postRepo = new ArrayList<BlogPost>();
		cateRepo = new ArrayList<BlogCategory>();
	}
	
}
