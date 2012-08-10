
public class sms {



  private String email;
  private String passwd;
  private Voice voice;

  public sms() {
    email = "";
    passwd = "";
    voice = null;
  }

  public sms(String email, String passwd) {
    this.email = email;
    this.passwd = passwd;
    this.voice = Login();
  }

  /* propabaly not needed 
  public void SetEmail(String email) {
    this.email = email;
  }

  public void SetPasswd(String passwd) {
    this.passwd = passwd;
  }
  */

  private Voice Login() {
    
    try {
      Voice voice = new Voice(this.email, this.passwd);
    }
    catch (Exception e) {
      System.out.println(e);
      return null;
    }
    return voice;
  }

  public void Login(String email, String passwd) {
    this.email = email;
    this.passwd = passwd;
    this.voice = Login();
  }

  public void Login(String email, String passwd) {
    try {
      Voice v = new Voice(email, passwd);
    }
    catch (Exception e) {
      System.out.println(e);
      return;
    }
    this.voice = v;
  }

  public void Send(String phone_num, String msg) {
    try {
      this.voice.sendSMS(phone_num, msg);
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }

  public String Get() {
    String msg = "";
    try {
      msg = this.voice.getSMS();
    }
    catch (Exception e) {
      System.out.println(e);
      return;
    }
    return msg;
  }
}

