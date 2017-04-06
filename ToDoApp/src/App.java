import java.util.Arrays;

/**
 * Created by hegyi on 2017-04-06.
 */
public class App {

  public static void main(String[] args) {

    ToDoList toDoList;
    Usage usage;

    if ( args.length == 0 ) {
      usage = new Usage();
        usage.toString();
    } else
      if ( Arrays.toString(args).contains("l")) {
      toDoList = new ToDoList();
        toDoList.toString();
    }
  }

}