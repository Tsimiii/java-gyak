package forummain;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    
    private List<Topic> topics = new ArrayList<>();
    private String name;
    private int postNum;
    private int topicNum;
    private String lastPost;
    
    
    public Forum(String name) {
        this.name = name;
        postNum = 0;
        topicNum = topics.size();
    }
    
    public void addNewTopic(String subject, String author, String starterMessage) {
        topics.add(new Topic(subject, author, starterMessage, this));
        topicNum++;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public void setLastPost(String lastPost) {
        this.lastPost = lastPost;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public String getLastPost() {
        return lastPost;
    }
}
