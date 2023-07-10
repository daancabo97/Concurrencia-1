package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        //Download webs
        String link = "https://www.eltiempo.com/";
        URL url = new URL(link);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        String encoding = conn.getContentEncoding();

        InputStream input = conn.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        
        /*  
        String result = new BufferedReader(new InputStreamReader(input))
                 .lines().collect(Collectors.joining());

        System.out.println(result);
        
        */
    }
}

/* Las clases de BufferedReader y InputStreamReader permiten leer archivos, procesar flujos de informacion
   que se van descargando */
