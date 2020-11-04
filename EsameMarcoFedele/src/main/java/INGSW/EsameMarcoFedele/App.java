package INGSW.EsameMarcoFedele;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	//merged with dev branch
        System.out.println( "Hello World!" );
        MyListUtil ordinatore = new MyListUtil();
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(5);
        lista.add(3);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(8);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivere true per ordinare la lista in modo crescente, false altrimenti");
        boolean crescente = sc.nextBoolean();
        sc.close();
        
        ordinatore.decidiOrdinamento(crescente, lista);
        
        if (crescente)
        {
        System.out.println("Ordino la lista crescente: ");
        for (Integer I : lista)
        	System.out.println(I);
        }
        else
        {
        System.out.println("Ordino la lista decrescente: ");
        for (Integer I : lista)
        	System.out.println(I);
        }
    }
}
