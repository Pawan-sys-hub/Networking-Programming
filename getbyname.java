import java.net.InetAddress;
import java.net.UnknownHostException;

public class getbyname{
  public static void main(String[] args) {
    try {
      InetAddress address = InetAddress.getByName("142.250.143.100");
      System.out.println("IP Address: " + address.getHostName());
    } catch (UnknownHostException e) {
      System.out.println("Host not found: " + e.getMessage());
    }
  }
}