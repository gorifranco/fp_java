import java.io.IOException;
import java.nio.file.Path;


public class main {
    public static void main(String[] args) throws IOException {
        Path f = Path.of("C:\\Users\\BAT2\\Desktop\\pen\\provaSort");

        System.out.println(f.getFileName());
    }
}