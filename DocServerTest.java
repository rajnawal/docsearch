import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocServerTest{
    @Test
    public void testFiles() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost:4000/");

    assertEquals(h.handleRequest(rootPath), "There are 1391 files to search");
    }
}