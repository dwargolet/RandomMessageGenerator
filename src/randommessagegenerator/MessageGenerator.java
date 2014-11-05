package randommessagegenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Daniel
 */
public class MessageGenerator {
    
    
    
    List<String> messageList;


    public MessageGenerator(List<String> messageList) {
        this.messageList = messageList;

    }

    public MessageGenerator(){
        this.messageList = new ArrayList<>();
    }

    
    private void removeDuplicateMessage(){
      Set<String> dupes = new HashSet<>(messageList);
      messageList = new ArrayList<>(dupes);
    }
    
    
   public void removeMessage(String message){
       for(String s : messageList){
           if(s.equals(message)){
               messageList.remove(s);
           }
       }
   }
       
    public void addMessageToList(String newMessage){
        messageList.add(newMessage);
        removeDuplicateMessage();
    }
    
    public String getRandomMessage(){
        Random rand = new Random(System.nanoTime());
        int num = rand.nextInt(messageList.size());
        return messageList.get(num);
    }

    public void setMessageList(List<String> messageList){
        this.messageList = messageList;
    }
    
    public List<String> getMessageList(){
        return messageList;
    }
    

    
    
    
}
