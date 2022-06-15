package edu.escuelaing.arsw.networking.webServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        }catch (IOException e){
            System.err.println("No pudo escuchar en puerto: 35000.");
            System.exit(1);
        }
        boolean flag = true;
        while (flag) {
            Socket clientSocket = null;
            try {
                System.out.println("Listo para recibir ...");
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine, outputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Receive: " + inputLine);
                if (!in.ready()) break;
            }
            outputLine = "HTTP/1.1 200 OK\r\n"
                    + "Content-Type: text/html\r\n"
                    + "\r\n";
            outputLine += LoaderFiles.LoadFile(new File("resources/index.html"));
//            outputLine = "HTTP/1.1 200 OK\r\n"
//                    + "Content-Type: text/html\r\n"
//                    + "\r\n"
//                    + "<!DOCTYPE html>"
//                    + "<html>"
//                    + "<head>"
//                    + "<meta charset=\"UTF-8\">"
//                    + "<title>Title of the document</title>\n" + "</head>"
//                    + "<body>"
//                    + "My Web Site"
//                    + "<img src=\"https://i0.wp.com/hipertextual.com/wp-content/uploads/2016/03/Clash-Royale.jpg\">"
//                    + "</body>"
//                    + "</html>" + inputLine;
            outputLine += inputLine;
            System.out.println(outputLine);
            out.println(outputLine);
            out.close();
            in.close();
            clientSocket.close();
        }
        serverSocket.close();
    }


}