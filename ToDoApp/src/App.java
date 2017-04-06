import java.util.Arrays;

/**
 * Created by hegyi on 2017-04-06.
 */
public class App {

  public static void main(String[] args) {

    ToDoList toDoList = new ToDoList();

    if ( args.length == 0 ) {
      toDoList.Usage();
    } else
      if ( Arrays.toString(args).contains("l")) {
      toDoList.ToDoList();
    }
  }

}