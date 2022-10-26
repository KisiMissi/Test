package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Request {

    private static final String DATA_URL = "https://raw.githubusercontent.com/thewhitesoft/student-2022-assignment/main/data.json";

    public List<String> dataRequest() throws IOException {

        final URL url = new URL(DATA_URL);
        final HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setConnectTimeout(4000);
        con.setReadTimeout(2000);

        try (final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            List<String> dataList = new ArrayList<>();
            while ((inputLine = in.readLine()) != null) {
                inputLine = inputLine.replaceAll("\"", "");

                if (inputLine.equals("[") || inputLine.equals("]")) continue;

                dataList.add(inputLine);
            }
            return dataList;
        } catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
