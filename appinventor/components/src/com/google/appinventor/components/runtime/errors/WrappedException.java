import com.google.appinventor.components.runtime.Form;

import java.util.List;

import java.lang.Exception;

public class WrappedException extends Exception {
  private String errorType;
  private List<String> stackTrace;

  public WrappedException(String message, String errorType) {
    super(message);
    this.errorType = errorType;
    this.stackTrace = Form.getActiveForm().$getBlockStack();
  }

}
