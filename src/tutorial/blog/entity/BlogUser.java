package tutorial.blog.entity;

//회�? 
public class BlogUser {

 // 회�? 아�?�디 
 private Integer userId;

 // 회�? �?�름 
 private String name;

 // 회�? �?�메�?� 
 private String email;

 public Integer getUserId() {
     return userId;
 }

 public void setUserId(Integer userId) {
     this.userId = userId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 // BlogUser Copy model
 public void CopyData(BlogUser param)
 {
     this.userId = param.getUserId();
     this.name = param.getName();
     this.email = param.getEmail();
 }
}
