/*
 * ITT786: Test 2 
 * Author: Rafi Faizal Bin Zainal Abidin
 * Matrix No: 2014854008
 * Email Address: roughfee89@gmail.com
 * Github Account: https://github.com/rafi2014854008 
 */
package curl.in.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CurlInJava {

  
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        URL url = new URL("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
        for (String line; (line = reader.readLine()) != null;) {
        System.out.println(line);
    }
}
    }
    
}
