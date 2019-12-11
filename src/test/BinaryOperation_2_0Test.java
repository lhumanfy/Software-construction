package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.addsub.AddOperation;
import com.addsub.BinaryOperation_2_0;
import com.addsub.SubOperation;

public class BinaryOperation_2_0Test {
	BinaryOperation_2_0 aop;
	BinaryOperation_2_0 sop;
	Class<BinaryOperation_2_0> cla=BinaryOperation_2_0.class;
	
	@Before
	public void setUp() throws Exception {
		aop = new AddOperation();
		sop = new SubOperation();
	}
	
	@Test
	public void testCalculate1() {
		assertEquals(aop.calculate(2, 2), 4);
	}
	
	@Test
	public void testCalculate2() {
		assertEquals(sop.calculate(3,2), 1);
	}
	
	@Test
	public void testChecking1() {
		assertEquals(aop.checking(50), false);
	}

	@Test
	public void testChecking2() {
		assertEquals(sop.checking(-2), true);
	}
	@Test
	public void testGenerateBinaryOperation() {
		System.out.println("�ӷ�ϰ��Ϊ��");
		for (int i = 0; i < 10; i++) {
			aop=new AddOperation();
			System.out.println(aop);
		}
		System.out.println("����ϰ��Ϊ��");
		for (int i = 0; i < 10; i++) {
			aop=new SubOperation();
			System.out.println(aop);
		}
	}
}