
package randommessagegenerator;


/**
 *
 * @author Daniel
 */
public class Startup {

    public static void main(String[] args) {
   
        
      RandomMessageGenerator m = new RandomMessageGenerator();
        

       m.addMessageToList("I dislike gin");
       m.addMessageToList("Good Morning");
       m.addMessageToList("I already ate");
       m.addMessageToList("Wutang is forever");
       m.addMessageToList("Good night");
       m.addMessageToList("I need a hair cut");
       m.addMessageToList("I dislike gin");
       m.addMessageToList("I already ate");

       
       System.out.println(m.getRandomMessage());
//       System.out.println(m.getMessageList());
    }
    
}
