package edu.escuelaing.arsw.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) throws Exception {
         URL google = new URL("https://www.google.com/");
         try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
             String inputLine = null;
             while ((inputLine = reader.readLine()) != null) {
                 System.out.println(inputLine);
            }
            } catch (IOException x) {
                System.err.println(x);
         }
    }

}
