package randommessagegenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Daniel
 */
public class RandomMessageGenerator implements MessageGenerator {
    
    
    
    private List<String> messageList;


    public RandomMessageGenerator(List<String> messageList) {
        this.messageList = messageList;
    }

    public RandomMessageGenerator(){
        this.messageList = new ArrayList<>();
        messageList.add("I like java");
        messageList.add("Noodles are good");
    }

    
    private void removeDuplicateMessage(){
      Set<String> dupes = new HashSet<>(messageList);
      messageList = new ArrayList<>(dupes);
    }
    
    
    @Override
   public void removeMessage(String message){
       for(String s : messageList){
           if(s.equals(message)){
               messageList.remove(s);
           }
       }
   }
       
    @Override
    public void addMessageToList(String newMessage){
        messageList.add(newMessage);
        removeDuplicateMessage();
    }
    
    @Override
    public String getRandomMessage(){
        Random rand = new Random(System.nanoTime());
        int num = rand.nextInt(messageList.size());
        return messageList.get(num);
    }

    @Override
    public void setMessageList(List<String> messageList){
        this.messageList = messageList;
    }
    
    @Override
    public List<String> getMessageList(){
        return messageList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.messageList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomMessageGenerator other = (RandomMessageGenerator) obj;
        if (!Objects.equals(this.messageList, other.messageList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RandomMessageGenerator";
    }
    

    
    
    
}
