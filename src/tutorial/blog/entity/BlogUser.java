package tutorial.blog.entity;

//íšŒì›? 
public class BlogUser {

 // íšŒì›? ì•„ì?´ë”” 
 private Integer userId;

 // íšŒì›? ì?´ë¦„ 
 private String name;

 // íšŒì›? ì?´ë©”ì?¼ 
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
