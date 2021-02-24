package java_chobo.ch07.abstarct01;

public class SubAbstractTest extends AbstractTest {

	@Override
	public void prnTest() {
		System.out.println("Sub");
	}
	
	
	@Override
	void prnTest2() {
		System.out.println("SubTest2");
	}
	
	public static void main(String[] args) {
		SubAbstractTest sat = new SubAbstractTest();
		sat.prnTest2();
		
		AbstractTest sat1 = new SubAbstractTest();
		sat1.prnTest2();
	}

}
