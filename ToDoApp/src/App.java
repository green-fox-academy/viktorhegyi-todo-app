import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hegyi on 2017-04-06.
 */
public class App {

  public static void main(String[] args) {
    Path filePath = Paths.get("usage.txt");

    List<String> lines = null;
    if( args.length == 0 )
      try {
        lines = Files.readAllLines(filePath);

      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Uh-oh, could not read the file!");
      }

      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }

    }
  }
