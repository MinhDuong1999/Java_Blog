package tutorial.blog1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import tutorial.blog.entity.service.BlogMemorDao;
import tutorial.blog.entity.service.BlogService;

/**
 * this is simple 
 * @author william  standford  mario  jang
 * @email minhduong@gmail.com
 * */
public class App1 {
//	 Set iterator
		public static void main(String[] args) {
			App1.run(new BlogService(new BlogMemorDao()));
		}
		
		public static void run(BlogService  service) {
				Scanner sc = new Scanner(System.in);
				String cmd ; 
				do {
						System.out.println("cmd >");
						cmd = sc.nextLine();
						Map<String, String> map = service.process(cmd);
						 Set<String> keys = map.keySet();
//						 enhanced for 
//						tim xem trong Set va Map no khac nhau va giong nhau nhu nao ve method
//						 Set iterator
					
//						 for (String key : keys) {
//							 System.out.println(key + map.get(key));
//						 }
						 
						 
				}while(!"exit".equalsIgnoreCase(cmd));
				System.out.println("terminal");
				sc.close();
				
				
		}
}	
