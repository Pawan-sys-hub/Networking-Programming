import java.net.*;
import java.util.Enumeration;

public class Networkinsepector {
  public static void main(String[] args) {
    try {
      // network interfaces
      Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

      while (interfaces.hasMoreElements()) {
        NetworkInterface ni = interfaces.nextElement();
        System.out.println("\nInterface: " + ni.getName());

        // 1. get name
        System.out.println("Display Name: " + ni.getDisplayName());
        // 2. is up
        System.out.println("Is Up: " + ni.isUp());
        // 3. get inet addresses
        Enumeration<InetAddress> addresses = ni.getInetAddresses();
        while (addresses.hasMoreElements()) {
          InetAddress addr = addresses.nextElement();
          System.out.println("Address: " + addr.getHostAddress());

          // 4. get display name
          System.out.println("Host Name: " + addr.getHostName());

          // 5. loopback
          System.out.println("Is Loopback: " + addr.isLoopbackAddress());

          // 6. get MTU
          System.out.println("MTU: " + ni.getMTU());
        }
      }
    } catch (SocketException e) {
      e.printStackTrace();
    }
  }
}
