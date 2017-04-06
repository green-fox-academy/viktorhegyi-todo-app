import java.lang.reflect.Array;
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

    List<String> usageFile = null;
    List<String> todolistFile = null;
    if( args.length == 0 ) {
      try {
        Path usagePath = Paths.get("usage.txt");
        usageFile = Files.readAllLines(usagePath);

      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Uh-oh, could not read the file!");
      }
      for (int i = 0; i < usageFile.size(); i++) {
        System.out.println(usageFile.get(i));
      }
    }

      if ( Arrays.toString(args).contains("l")) {
        try {
          Path todolistPath = Paths.get("todolist.txt");
          todolistFile = Files.readAllLines(todolistPath);

        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("Uh-oh, could not read the file!");
        }
        for (int i = 0; i <todolistFile.size() ; i++) {
          System.out.println((i+1) + " " + todolistFile.get(i));
        }
    }
  }
}
