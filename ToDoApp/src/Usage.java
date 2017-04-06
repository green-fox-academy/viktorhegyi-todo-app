import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by hegyi on 2017-04-06.
 */
public class Usage {

  List<String> usageFile = null;

  public Usage() {
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

}
