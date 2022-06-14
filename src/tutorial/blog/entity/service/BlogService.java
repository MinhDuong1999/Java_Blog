package tutorial.blog.entity.service;

public class BlogService {
	private BlogMemorDao  dao ;
	public BlogService() {
		
	};
	
	public BlogService(BlogMemorDao blog) {
		super();
		this.dao =blog ;
	};
}
