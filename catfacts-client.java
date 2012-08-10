import com.techventus.server.voice.Voice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class catfacts-client {

  private static String filepath_catfacts = "./catfacts";
  private static String filepath_recvnums = "./recvnums";


  private static String[] LoadFacts(String filepath) { 
    List<String> facts = new ArrayList<String>();
    File file = new File(filepath);

    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        facts.add(scanner.nextLine());
       }
    }
    catch (Exception e) {
      System.out.println(e);
    }

    String[] FACTS = new String[facts.size()];
    facts.toArray(FACTS);

    return FACTS;
  }

  private static String[] LoadRecvNums(String filepath) {
    List<String> recv_nums = new ArrayList<String>();
    File file = new File(filepath);

    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        recv_nums.add(scanner.nextLine());
      }
    }
    catch (Exception e) {
      System.out.println(e);
    }

    String[] RECV_NUMS = new String[recv_nums.size()];
    recv_nums.toArray(RECV_NUMS);

    return RECV_NUMS;
  }
  
  public static void main(String[] args) {
    System.out.println("usage: java catfacts [-i] <det phone number>");


  }
}
