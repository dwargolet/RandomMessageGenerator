package randommessagegenerator;

import java.util.List;

/**
 *
 * @author dworgolet
 */
public interface MessageGenerator {

   public void addMessageToList(String newMessage);

    public List<String> getMessageList();

    public String getRandomMessage();

    public void removeMessage(String message);

    public void setMessageList(List<String> messageList);
    
}
