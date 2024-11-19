package inheritance.abstractinterface;

public class InterfaceTest {

	public static void main(String[] args) {
		Device pdev[] = {new HPPrinter(), new USBMemory()};
		
		pdev[0].print();
		pdev[1].print();
		
		//연결 방법: USB, (내용)
		((Connectable) pdev[0]).connect();
		((Connectable) pdev[1]).connect();
		
		/*
		 pdev[0].connect(); -- 불가
		 pdev[1].connect(); -- 불가
		 */
	}

}
