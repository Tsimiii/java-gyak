package forummain;

import java.util.ArrayList;
import java.util.List;

public class ForumMain {

    public static void main(String[] args) {
       List<Forum> forums = new ArrayList<>();
       forums.add(new Forum("Valami"));
       forums.add(new Forum("Akármi"));
       
       forums.get(0).addNewTopic("Valami téma", "Timi", "Juhuuu, elindult egy topic!!!");
       forums.get(0).addNewTopic("Még1 téma", "Timi2", "Blablabla");
       
       forums.get(0).getTopics().get(0).writePost("Ember1", "Sziasztok!");
       forums.get(0).getTopics().get(1).writePost("Ember1", "Bliblibli!");
       
       System.out.println("Első fórum postjai: " + forums.get(0).getPostNum());
       System.out.println("Első fórumban az első topic válaszai: " + forums.get(0).getTopics().get(0).getReplies());
       System.out.println("Első forum utolsó postjának ideje: " + forums.get(0).getLastPost());
    }
    
}
