import java.net.InetAddress;
import java.net.UnknownHostException;

public class SimpleDNSLookup {
    public static void main(String[] args) {
        // Define the host to resolve
        String hostName = "www.pawan-pokharel.com.np";

        try {
            // Resolve the host to an array of IP addresses
            InetAddress[] addresses = InetAddress.getAllByName(hostName);

            System.out.println("IP addresses for " + hostName + ":");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.err.println("Could not find IP address for: " + hostName);
            e.printStackTrace();
        }
    }
}   
//methods (getAllByName, getHostAddress,getHostName,getbyname) are used to perform the DNS lookup and retrieve the IP addresses associated with the specified hostname.

// This program performs a simple DNS lookup for the specified hostname (in this case, "google.com") and prints out all associated IP addresses. It uses the `InetAddress` class from the `java.net` package to resolve the hostname. If the hostname cannot be resolved, it catches the `UnknownHostException` and prints an error message.