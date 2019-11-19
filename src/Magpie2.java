/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>
 * Uses indexOf to find strings</li>
 * <li>
 * Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		response = statement.trim();
		if(statement.length() < 1){
			response = "Please say something ); Im so lonely";
		}
		else if (statement.indexOf("no") >= 0) {
			response = "Dont say no to me. Im the boss now....";
		} 
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Dont tell me about your family. I already know about them";
		}
		else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pet?";
		}
		else if(statement.indexOf("Joe") >= 0)
		{
			response = "Joe who?";
		}
		else if(statement.indexOf("Jo mamma") >= 0 || statement.indexOf("Jo mama") >= 0)
		{		
			response = "Hahaha you got me!!!";
		}
		else if(statement.indexOf("Mr. Padjen") >= 0 || statement.indexOf("Padjen") >= 0)
		{
			response = "Oh I heard about him. He's litty af";
		}
		else if(statement.indexOf("Mr. Padjen") >= 0 || statement.indexOf("Padjen") >= 0)
		{
			response = "Oh I heard about him. He's litty af";
		}
		else if(statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family";
		}
		else if(statement.indexOf("food") >= 0)
		{
			response = "Oh I heard about this. I am hungry!!";
		}
		else if(statement.indexOf("state") >= 0)
		{
			response = "I dont travel very much.";
		}
		else if(statement.indexOf("poopie") >= 0)
		{
			response = "I dont like poopie. Not since the accident....";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Thats neeto baneedo.";
		} else if (whichResponse == 5) {
			response = "Lets talk about pets";
		} else if (whichResponse == 6) {
			response = "Lets talk about something else";
		}

		return response;
	}
}
