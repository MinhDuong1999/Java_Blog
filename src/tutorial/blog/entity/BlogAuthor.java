package tutorial.blog.entity;

//ì €ìž? 
public class BlogAuthor {

 // ì €ìž? ì•„ì?´ë”” 
 private Integer id;

 // í•„ëª… 
 private String displayName;

 // ì„± 
 private String firstName;

 // ì?´ë¦„ 
 private String lastName;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public String getDisplayName() {
     return displayName;
 }

 public void setDisplayName(String displayName) {
     this.displayName = displayName;
 }

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }

 // BlogAuthor Copy model
 public void CopyData(BlogAuthor param)
 {
     this.id = param.getId();
     this.displayName = param.getDisplayName();
     this.firstName = param.getFirstName();
     this.lastName = param.getLastName();
 }
}