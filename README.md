-- The table order was sorted considering the relationship to prevent error from occurring if all are run at once.

-- blog_author Table Create SQL
CREATE TABLE blog_author
(
    `id`            INT            NOT NULL    AUTO_INCREMENT COMMENT '저자 아이디', 
    `display_name`  VARCHAR(45)    NOT NULL    COMMENT '필명', 
    `first_name`    VARCHAR(45)    NULL        COMMENT '성', 
    `last_name`     VARCHAR(45)    NULL        COMMENT '이름', 
    CONSTRAINT PK_blog_author PRIMARY KEY (id)
);

ALTER TABLE blog_author COMMENT '저자';

CREATE INDEX blog_author_Index_2
    ON blog_author(display_name);

CREATE INDEX blog_author_Index_1
    ON blog_author(id);


-- blog_user Table Create SQL
CREATE TABLE blog_user
(
    `user_id`  INT            NOT NULL    AUTO_INCREMENT COMMENT '회원 아이디', 
    `name`     VARCHAR(45)    NULL        COMMENT '회원 이름', 
    `email`    VARCHAR(45)    NULL        COMMENT '회원 이메일', 
    CONSTRAINT PK_blog_user PRIMARY KEY (user_id)
);

ALTER TABLE blog_user COMMENT '회원';

CREATE INDEX blog_user_Index_2
    ON blog_user(email);

CREATE INDEX blog_user_Index_1
    ON blog_user(user_id);


-- blog_post Table Create SQL
CREATE TABLE blog_post
(
    `id`                INT             NOT NULL    AUTO_INCREMENT COMMENT '게시글 아이디', 
    `title`             VARCHAR(144)    NOT NULL    COMMENT '게시글 제목', 
    `article`           TEXT            NULL        COMMENT '게시글 내용', 
    `title_clean`       VARCHAR(144)    NULL        COMMENT '수정된 게시글 제목', 
    `file`              VARCHAR(45)     NULL        COMMENT '첨부 파일', 
    `author_id`         INT             NULL        COMMENT '저자 미상 포스트 가능', 
    `date_published`    TIMESTAMP       NOT NULL    COMMENT '공개 일자', 
    `banner_image`      VARCHAR(144)    NULL        COMMENT '광고 이미지', 
    `featured`          TINYINT(1)      NOT NULL    COMMENT '특징', 
    `enabled`           TINYINT(1)      NOT NULL    COMMENT '활성화 여부', 
    `comments_enabled`  TINYINT(1)      NOT NULL    COMMENT '댓글 가능 여부', 
    `views`             INT             NOT NULL    COMMENT '읽은 횟수', 
    CONSTRAINT PK_blog_post PRIMARY KEY (id)
);

ALTER TABLE blog_post COMMENT '게시글';

CREATE INDEX blog_post_Index_2
    ON blog_post(author_id);

CREATE INDEX blog_post_Index_1
    ON blog_post(id);

CREATE INDEX blog_post_Index_3
    ON blog_post(title_clean);

ALTER TABLE blog_post
    ADD CONSTRAINT FK_blog_post_author_id_blog_author_id FOREIGN KEY (author_id)
        REFERENCES blog_author (id) ON DELETE RESTRICT ON UPDATE RESTRICT;


-- blog_category Table Create SQL
CREATE TABLE blog_category
(
    `id`            INT            NOT NULL    AUTO_INCREMENT COMMENT '카테고리 아이디', 
    `name`          VARCHAR(45)    NOT NULL    COMMENT '카테고리 이름', 
    `name_clean`    VARCHAR(45)    NULL        COMMENT '수정된 카테고리 이름', 
    `enabled`       TINYINT        NOT NULL    COMMENT '활성화 여부', 
    `date_created`  TIMESTAMP      NULL        COMMENT '등록일', 
    CONSTRAINT PK_blog_category PRIMARY KEY (id)
);

ALTER TABLE blog_category COMMENT '카테고리';

CREATE INDEX blog_category_Index_1
    ON blog_category(id);

CREATE INDEX blog_category_Index_2
    ON blog_category(name_clean);


-- blog_user_detail Table Create SQL
CREATE TABLE blog_user_detail
(
    `user_id`       INT            NOT NULL    COMMENT '회원 아이디', 
    `phonenumber`   VARCHAR(11)    NULL        COMMENT '전화번호', 
    `website`       VARCHAR(45)    NULL        COMMENT '웹사이트', 
    `user_picture`  VARCHAR(45)    NULL        COMMENT '회원 사진', 
     PRIMARY KEY (user_id)
);

ALTER TABLE blog_user_detail COMMENT '회원 상세';

ALTER TABLE blog_user_detail
    ADD CONSTRAINT FK_blog_user_detail_user_id_blog_user_user_id FOREIGN KEY (user_id)
        REFERENCES blog_user (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT;


-- blog_related Table Create SQL
CREATE TABLE blog_related
(
    `blog_post_id`          INT    NOT NULL    COMMENT '게시글 아이디', 
    `blog_related_post_id`  INT    NOT NULL    COMMENT '연결된 게시글 아이디', 
    CONSTRAINT PK_blog_related PRIMARY KEY (blog_post_id)
);

ALTER TABLE blog_related COMMENT '게시글과 연결된 다른 게시글';

CREATE INDEX blog_related_Index_1
    ON blog_related(blog_post_id);

ALTER TABLE blog_related
    ADD CONSTRAINT FK_blog_related_blog_post_id_blog_post_id FOREIGN KEY (blog_post_id)
        REFERENCES blog_post (id) ON DELETE RESTRICT ON UPDATE RESTRICT;


-- blog_tag Table Create SQL
CREATE TABLE blog_tag
(
    `id`         INT            NOT NULL    AUTO_INCREMENT COMMENT '테그 아이디', 
    `post_id`    INT            NOT NULL    COMMENT '게시글 아이디', 
    `tag`        VARCHAR(45)    NOT NULL    COMMENT '테그 내용', 
    `tag_clean`  VARCHAR(45)    NOT NULL    COMMENT '수정된 태그 내용', 
    CONSTRAINT PK_blog_tag PRIMARY KEY (id)
);

ALTER TABLE blog_tag COMMENT '테그';

CREATE INDEX blog_tag_Index_1
    ON blog_tag(id);

CREATE INDEX blog_tag_Index_2
    ON blog_tag(post_id);

CREATE INDEX blog_tag_Index_3
    ON blog_tag(tag_clean);

ALTER TABLE blog_tag
    ADD CONSTRAINT FK_blog_tag_post_id_blog_post_id FOREIGN KEY (post_id)
        REFERENCES blog_post (id) ON DELETE RESTRICT ON UPDATE RESTRICT;


-- blog_comment Table Create SQL
CREATE TABLE blog_comment
(
    `id`               INT           NOT NULL    AUTO_INCREMENT COMMENT '댓글 아이디', 
    `post_id`          INT           NOT NULL    COMMENT '게시글 아이디', 
    `is_reply_to_id`   INT           NOT NULL    COMMENT '원본 댓글 아이디', 
    `comment_content`  TEXT          NOT NULL    COMMENT '댓글 내용', 
    `user_id`          INT           NULL        COMMENT '비회원 댓글 가능', 
    `mark_read`        TINYINT(1)    NULL        COMMENT '읽음 표시', 
    `enabled`          TINYINT(1)    NOT NULL    COMMENT '활성화 여부', 
    `comment_date`     TIMESTAMP     NULL        COMMENT '등록일', 
    CONSTRAINT PK_blog_comment PRIMARY KEY (id)
);

ALTER TABLE blog_comment COMMENT '댓글';

CREATE INDEX blog_comment_Index_1
    ON blog_comment(id);

CREATE INDEX blog_comment_Index_2
    ON blog_comment(post_id);

CREATE INDEX blog_comment_Index_3
    ON blog_comment(user_id);

ALTER TABLE blog_comment
    ADD CONSTRAINT FK_blog_comment_user_id_blog_user_user_id FOREIGN KEY (user_id)
        REFERENCES blog_user (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE blog_comment
    ADD CONSTRAINT FK_blog_comment_post_id_blog_post_id FOREIGN KEY (post_id)
        REFERENCES blog_post (id) ON DELETE RESTRICT ON UPDATE RESTRICT;


-- blog_post_to_category Table Create SQL
CREATE TABLE blog_post_to_category
(
    `category_id`  INT    NOT NULL    COMMENT '카테고리 아이디', 
    `post_id`      INT    NOT NULL    COMMENT '게시글 아이디', 
    CONSTRAINT PK_blog_post_to_category PRIMARY KEY (category_id, post_id)
);

ALTER TABLE blog_post_to_category COMMENT '게시글 카테고리';

CREATE INDEX blog_post_to_category_Index_1
    ON blog_post_to_category(category_id);

CREATE INDEX blog_post_to_category_Index_2
    ON blog_post_to_category(post_id);

ALTER TABLE blog_post_to_category
    ADD CONSTRAINT FK_blog_post_to_category_category_id_blog_category_id FOREIGN KEY (category_id)
        REFERENCES blog_category (id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE blog_post_to_category
    ADD CONSTRAINT FK_blog_post_to_category_post_id_blog_post_id FOREIGN KEY (post_id)
        REFERENCES blog_post (id) ON DELETE RESTRICT ON UPDATE RESTRICT;


