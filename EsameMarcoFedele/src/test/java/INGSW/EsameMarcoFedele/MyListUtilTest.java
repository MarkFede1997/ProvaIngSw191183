package INGSW.EsameMarcoFedele;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
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
		
		System.out.println("Inizio test: " + DateTime.now());
	}
	
	@AfterClass
	public static void printEndTestTime()
	{
		System.out.println("Fine test: " + DateTime.now());
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
		
		System.out.println("Testo la funzione: " + DateTime.now());
	}
	
	@After
	public void printEndFunctionTime()
	{
		System.out.println("Fine del test funzione: " + DateTime.now());
	}
	
	@Test
	public void ordinaCrescenteWorks()
	{
		System.out.println("Test di ordinaCrescente");
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), ordinatore.ordinaCrescente(lista));
		
		lista.clear();
		for (int i=5; i>0; i--)
			lista.add(i);
		
		assertEquals(Arrays.asList(1,2,3,4,5), ordinatore.ordinaCrescente(lista));
			
	}

	@Test
	public void ordinaDecrescenteWorks()
	{
		System.out.println("Test di ordinaDecrescente");
		assertEquals(Arrays.asList(8,7,6,5,4,3,2,1), ordinatore.ordinaDecrescente(lista));
	
		lista.clear();
		for (int i=0; i<5; i++)
			lista.add(i);
		
		assertEquals(Arrays.asList(4,3,2,1,0), ordinatore.ordinaDecrescente(lista));
	}
	
	@Test
	public void decidiOrdinamentoWorks()
	{
		System.out.println("Test di decidiOrdinamento");
		ordinatore.decidiOrdinamento(true, lista);
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), lista);
		ordinatore.decidiOrdinamento(false, lista);
		assertEquals(Arrays.asList(8,7,6,5,4,3,2,1), lista);
	}
}
