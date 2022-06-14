package tutorial.blog1;

import java.util.Scanner;

import tutorial.blog.entity.service.BlogMemorDao;
import tutorial.blog.entity.service.BlogService;

/**
 * this is simple 
 * @author william  standford  mario  jang
 * @email minhduong@gmail.com
 * */
public class App1 {
		public static void main(String[] args) {
			App1.run(new BlogService(new BlogMemorDao()));
		}
		
		public static void run(BlogService  service) {
				Scanner sc = new Scanner(System.in);
				String cmd ; 
				do {
						System.out.println("cmd >");
						cmd = sc.nextLine();
				}while(!"exit".equalsIgnoreCase(cmd));
				System.out.println("terminal");
				sc.close();
		}
}	
