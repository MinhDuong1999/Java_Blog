package tutorial.blog.entity;

//íė? ė?ė¸
public class BlogUserDetail {

 // íė? ėė?´ë
 private Integer userId;

 // ė íë˛í¸
 private String phonenumber;

 // ėšėŦė?´í¸
 private String website;

 // íė? ėŦė§
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