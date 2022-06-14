package tutorial.blog.entity;

import java.sql.Timestamp;

//댓글 
public class BlogComment {

 // 댓글 아�?�디 
 private Integer id;

 // 게시글 아�?�디 
 private Integer postId;

 // �?본 댓글 아�?�디 
 private Integer isReplyToId;

 // 댓글 내용 
 private String commentContent;

 // 회�? 아�?�디 비회�? 댓글 가능
 private Integer userId;

 // �?��?� 표시 
 private Boolean markRead;

 // 활성화 여부 
 private Boolean enabled;

 // 등�?�?� 
 private Timestamp commentDate;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public Integer getPostId() {
     return postId;
 }

 public void setPostId(Integer postId) {
     this.postId = postId;
 }

 public Integer getIsReplyToId() {
     return isReplyToId;
 }

 public void setIsReplyToId(Integer isReplyToId) {
     this.isReplyToId = isReplyToId;
 }

 public String getCommentContent() {
     return commentContent;
 }

 public void setCommentContent(String commentContent) {
     this.commentContent = commentContent;
 }

 public Integer getUserId() {
     return userId;
 }

 public void setUserId(Integer userId) {
     this.userId = userId;
 }

 public Boolean getMarkRead() {
     return markRead;
 }

 public void setMarkRead(Boolean markRead) {
     this.markRead = markRead;
 }

 public Boolean getEnabled() {
     return enabled;
 }

 public void setEnabled(Boolean enabled) {
     this.enabled = enabled;
 }

 public Timestamp getCommentDate() {
     return commentDate;
 }

 public void setCommentDate(Timestamp commentDate) {
     this.commentDate = commentDate;
 }

 // BlogComment Copy model
 public void CopyData(BlogComment param)
 {
     this.id = param.getId();
     this.postId = param.getPostId();
     this.isReplyToId = param.getIsReplyToId();
     this.commentContent = param.getCommentContent();
     this.userId = param.getUserId();
     this.markRead = param.getMarkRead();
     this.enabled = param.getEnabled();
     this.commentDate = param.getCommentDate();
 }
}
