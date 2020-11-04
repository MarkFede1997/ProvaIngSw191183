package INGSW.EsameMarcoFedele;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
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
        
        ordinatore.ordinaCrescente(lista);
        
        System.out.println("Ordino la lista crescente: ");
        for (Integer I : lista)
        	System.out.println(I);
        
        ordinatore.ordinaDecrescente(lista);
        
        System.out.println("Ordino la lista decrescente: ");
        for (Integer I : lista)
        	System.out.println(I);
    }
}
