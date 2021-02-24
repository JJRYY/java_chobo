package java_chobo.ch08.exception_quiz;

public class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
