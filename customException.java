public class CustomException extends Exception{
  // you gotta have an excuse for this
  String excuse;

  public CustomException(String excuse){
    this.excuse = reason;
  }

  public String toString(){
    return this.excuse;
  }
}
