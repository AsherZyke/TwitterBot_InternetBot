package customer_service_bot;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Defines the behavior for the CustomerServiceBot class.
 * Used to tweet at customer service accounts when certain conditions are met.
 * 
 * @author Benjamin Zich
 *
 */
public class CustomerServiceBot {
	
	public static void main(String[] args) throws TwitterException {
		
		//access the twitter API using twitter4j.properties file
		Twitter twitter = TwitterFactory.getSingleton();
		
		//send a tweet
		Status status = twitter.updateStatus("hello world");
		
		//print a message so we know when the bot finishes
		System.out.print("Done.");
	}

}
