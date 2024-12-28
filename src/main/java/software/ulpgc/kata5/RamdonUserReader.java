package software.ulpgc.kata5;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

import static org.jsoup.Connection.Method.GET;

public class RamdonUserReader implements UserReader{
    @Override
    public String read() {
        try {
            return read("https://randomuser.me/api/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String read(String url) throws IOException {
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .header("accept", "text/*")
                .method(GET)
                .execute();

        return response.body();
    }
}
