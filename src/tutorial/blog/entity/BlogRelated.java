package tutorial.blog.entity;

//연결정보 게시글과 연결�?� 다른 게시글
public class BlogRelated {

 // 게시글 아�?�디 
 private Integer blogPostId;

 // 연결�?� 게시글 아�?�디 
 private Integer blogRelatedPostId;

 public Integer getBlogPostId() {
     return blogPostId;
 }

 public void setBlogPostId(Integer blogPostId) {
     this.blogPostId = blogPostId;
 }

 public Integer getBlogRelatedPostId() {
     return blogRelatedPostId;
 }

 public void setBlogRelatedPostId(Integer blogRelatedPostId) {
     this.blogRelatedPostId = blogRelatedPostId;
 }

 // BlogRelated Copy model
 public void CopyData(BlogRelated param)
 {
     this.blogPostId = param.getBlogPostId();
     this.blogRelatedPostId = param.getBlogRelatedPostId();
 }
}
