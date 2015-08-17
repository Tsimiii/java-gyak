package forummain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Topic {
    
    private List<Post> posts = new ArrayList<>();
    
    private String subject;
    private String author;
    private int replies;
    private String lastPost;
    
    private Forum forum;
      
    public Topic(String subject, String author, String starterMessage, Forum forum) {
        this.subject = subject;
        this.author = author;
        replies = posts.size();
        lastPost = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        this.forum = forum;
        posts.add(new Post(author, starterMessage, this));
        increasePostNumInForum();
    }
    
    public Post writePost(String author, String message) {
        Post post = new Post(author, message, this);
        replies++;
        increasePostNumInForum();
        forum.setLastPost(lastPost);
        return post;
    }
    
    public void increasePostNumInForum() {
        forum.setPostNum(forum.getPostNum() + 1);
    }

    public void setLastPost(String lastPost) {
        this.lastPost = lastPost;
    }

    public int getReplies() {
        return replies;
    }
    
}
