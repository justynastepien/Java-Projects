import java.util.*;
import java.io.*;
import java.net.*;

public class Main {


    public static void main(String[] args) {

            Server server = new Server();
            server.waitForClients();
            server.run();
    }
}
