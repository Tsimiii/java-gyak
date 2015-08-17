package forummain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    
    private String author;
    private String message;
    private String time;
    
    public Post(String author, String message, Topic topic) {
        this.author = author;
        this.message = message;
        this.time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        topic.setLastPost(this.time);
    }
}
