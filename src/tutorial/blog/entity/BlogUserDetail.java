package tutorial.blog.entity;

//íšŒì›? ìƒ?ì„¸
public class BlogUserDetail {

 // íšŒì›? ì•„ì?´ë””
 private Integer userId;

 // ì „í™”ë²ˆí˜¸
 private String phonenumber;

 // ì›¹ì‚¬ì?´íŠ¸
 private String website;

 // íšŒì›? ì‚¬ì§„
 private String userPicture;

 public Integer getUserId() {
     return userId;
 }

 public void setUserId(Integer userId) {
     this.userId = userId;
 }

 public String getPhonenumber() {
     return phonenumber;
 }

 public void setPhonenumber(String phonenumber) {
     this.phonenumber = phonenumber;
 }

 public String getWebsite() {
     return website;
 }

 public void setWebsite(String website) {
     this.website = website;
 }

 public String getUserPicture() {
     return userPicture;
 }

 public void setUserPicture(String userPicture) {
     this.userPicture = userPicture;
 }

 // BlogUserDetail Copy model
 public void CopyData(BlogUserDetail param)
 {
     this.userId = param.getUserId();
     this.phonenumber = param.getPhonenumber();
     this.website = param.getWebsite();
     this.userPicture = param.getUserPicture();
 }
}