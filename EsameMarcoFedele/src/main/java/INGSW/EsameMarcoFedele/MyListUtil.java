package INGSW.EsameMarcoFedele;
import java.util.ArrayList;
import java.util.Comparator;

public class MyListUtil {
	
	
	public ArrayList<Integer> ordinaCrescente(ArrayList<Integer> lista){
		lista.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2)
					return 1;
				
				return -1;
			}
			
		});
		
		return lista;
	}
	
	public ArrayList<Integer> ordinaDecrescente(ArrayList<Integer> lista){
		lista.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2)
					return 1;
				
				return -1;
			}
			
		});
		
		return lista;
	}
	
}
