package cmpe.dos.exception;

public class AppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6421943159463138912L;
	private ErrorCode errorCode;
	private String msg;

	public AppException (ErrorCode errorCode, Exception e) {
		this.errorCode = errorCode;
		this.msg = e.getMessage();
		this.setStackTrace(e.getStackTrace());
	}
	
	@Override
	public String getMessage(){
		return this.msg;
	}
	
	public ErrorCode getErrorCode(){
		return this.errorCode;
	}
	
}
