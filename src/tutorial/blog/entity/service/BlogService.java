package tutorial.blog.entity.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BlogService {
	private BlogMemorDao  dao ;
	public BlogService() {
		
	};
	
	public BlogService(BlogMemorDao blog) {
		super();
		this.dao =blog ;
	}

	public Map<String, String> process(String cmd) {
		// TODO Auto-generated method stub
		Map<String, String > model = new HashMap< String , String >();
		if(! cmd.contains("?")) {
			
		}else {
			
//		has query string , regex : * \ () [] de kiem tra ky hieu phai them 2 dau \\ 
		String[] req = cmd.split("\\?");
		System.out.println(req.length);
		if(req.length==2) {
				String command = req[0];
				String parameter = req[1];
				
				StringTokenizer tokenizer = new StringTokenizer(parameter,"&");
             while( tokenizer.hasMoreTokens()) {
					
					System.out.println(tokenizer.nextToken());
					while( tokenizer.hasMoreTokens()) {
						
						System.out.println(tokenizer.nextToken("="));
					}
				}
				
		}else {
				
		registPost(model);
			getPostAll(model);
			getPostById(model);
			getPostWithCategory(model);
			getPostByString(model);
			updatePost(model);
			deletePost(model);
			
			registCategory(model);
			getCategoryAll(model);
			getCategoryById(model);
			getCategoryWithCategory(model);
			getCategoryByString(model);
			updateCategory(model);
			deleteCategory(model);
		  }
		}
		return model;
	}

	private void deleteCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void updateCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getCategoryByString(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getCategoryById(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getCategoryWithCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getCategoryAll(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void registCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void deletePost(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void updatePost(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getPostByString(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getPostWithCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getPostById(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void getPostAll(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	}

	private void registPost(Map<String, String> model) {
		// TODO Auto-generated method stub
		
	};
}
