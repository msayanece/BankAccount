/**
 * version 1.0
 */
package ip;

/**
 * @author Sayan
 *
 */
public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String arg0;
	/**
	 * 
	 */
	public MyException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public MyException(String arg0) {
		this.arg0 = arg0;
	}

	/**
	 * @param arg0
	 */
	public MyException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public MyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public MyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage(){
		return arg0;
	}
	
	public String toString(){
		return "MyException: "+arg0;
	}
	
	public void printStackTrace(){
		super.printStackTrace();
	}

}
