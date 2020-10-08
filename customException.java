public class CustomException extends Exception{
  String excuse;
  public CustomException(String excuse){
    this.excuse = reason;
  }

  public String toString(){
    return this.excuse;
  }
}
