package prefixPostprefix;

public class PrefixPostprefix {

	public static void main(String[] args) {
		int x=5;
		
		//prefixow-wartość wyrażenia- wartość z przed wykonania operacji [6 i 6]
		System.out.println(++x);
		System.out.println(x);
		 
		System.out.println();
		
		//postprefix- wartość po wykonaniu operacji [6 i 7]
		System.out.println(x++);
		System.out.println(x);

		
/* System.out.println(++x) -> zwiększana jest wartość zmiennej x, nastepnie
 wartość ta jest odczytywana i wyświetlana, 
 System.out.println(x++) -> pobierana i wyświetlana wartość zmiennej x, potem
 wartość ta jest inkrementowana.  */		
		
		
	}

}
