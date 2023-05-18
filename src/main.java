import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class main {

    public static void main(String[] args) throws IOException {
File f = new File("C:\\Users\\BAT2\\Desktop\\pen\\provaSort\\Alborosie - Herbalist.mp3");
        System.out.println("absolute: " + f.getAbsolutePath());
        System.out.println("path: " + Path.of(f.getPath()).getParent());
        System.out.println("name: " + f.getName());
        System.out.println("canonical: " + f.getCanonicalPath());


    }
}