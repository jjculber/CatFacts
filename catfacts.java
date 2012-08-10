import com.techventus.server.voice.Voice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

import sms;



public class catfacts {

  private static final int SEND_MSG = 1;
  private static final int RECV_MSG = 2;


  private static final int    ARG_OPTION = 1;
  private static final String ARG_OPTION_SEND = "-s";
  private static final String ARG_OPTION_RECV = "-r";

  private static void printUsage() {
    System.out.println("usage: java catfacts -s <gmail> <password> <dest num> <catfact>");
    System.out.println("usage: java catfacts -r <gmail> <pawssword>");
  }

  private boolean validSendArguments(String[] args) {
    if (args.len != 6)
      return false;

    /* check other arguments for string and stuff -- imma tired*/ 

    return true;
  }

  private boolean validRecvArguments(String[] args) {
    if (args.len != 4)
      return false;
    
    /* check other arguments for string and stuff -- imma tired*/ 

    return true;
  }

  private processArguments(String[] args) {
    if (args.len <= 2) {
      printUsage();
      System.exit(1);
    }

    switch (args[ARG_OPTION])
    {
      case ARG_OPTION_SEND:
        if (validSendArguments(args))
          return SEND_MSG;

        printUsage();
        System.exit(1);
        break;

      case ARG_OPTION_RECV:
        if (validRecvArguments(args))
          return RECV_MSG;
        
        printUsage();
        System.exit(1);
        break;

      default:
        printUsage();
        System.exit(1);
        break;
    }

  }

  private sendCatFact(String[] args) {
    sms Sms = new sms(args[2], args[3]);
    Sms.Send(args[4], args[5]);
  }

  private recvMsg(String[] args) {
    sms Sms = new sms(args[2], args[3]);
    System.out.println(Sms.Get());
  }

  public static void main(String[] args) {
    private int OPTION = processArguments(args);

    switch (OPTION) {
      case SEND_MSG:
        sendCatFact(args);
        break;

      case RECV_MSG:
        recvMsg(args);
        break;

      default:
        break;
    }


    
     

  }
}
