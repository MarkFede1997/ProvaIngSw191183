package INGSW.EsameMarcoFedele;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil ordinatore;
	private static ArrayList<Integer> lista;
	
	@BeforeClass
	public static void prepare()
	{
		ordinatore = new MyListUtil();
	}
	
	@Before
	public void preparelist()
	{
		lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(5);
		lista.add(8);
		lista.add(7);
		
	}
	
	@Test
	public void ordinaCrescenteWorks()
	{
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), ordinatore.ordinaCrescente(lista));
	}

}
