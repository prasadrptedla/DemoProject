import java.net.InetAddress;
import java.net.UnknownHostException;


public class First {
	  
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress myIP=InetAddress.getLocalHost();
		 
	      /* public String getHostAddress(): Returns the IP 
	       * address string in textual presentation.
	       */
	      System.out.println("My IP Address is:");
	      System.out.println(myIP.getHostAddress());
	}
	
	
}
