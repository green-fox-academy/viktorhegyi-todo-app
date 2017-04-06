import java.util.Arrays;

/**
 * Created by hegyi on 2017-04-06.
 */
public class App {

  public static void main(String[] args) {

    ToDoList toDoList = new ToDoList(args);

    if ( args.length == 0 ) {
      toDoList.Usage();
    } else if ( args[0].contains("-l")) {
      toDoList.ToDoList();
    } else if ( args[0].contains("-a")) {
      toDoList.addTodolist();
    }
  }

}