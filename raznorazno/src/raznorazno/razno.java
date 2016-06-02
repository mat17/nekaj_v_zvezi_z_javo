package raznorazno;

public class razno {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int p = prastevilo(n);
		System.out.println(p);

	}

	private static int prastevilo(int n) {
		int[] pra = new int[n];
		pra[0] = 2;
		int p = 3;
		for (int i = 1; i < n; i+=1) {
			int j = 0;
			while (pra[i]==0){
				if (p%pra[j]!=0 && j==i-1){
					pra[i]=p;
				}
				else if (j==i-1 || p%pra[j]==0){
					j=-1;
					p+=2;
				}
				j+=1;
			}
			p+=2;
		}
		return pra[n-1];
	}

}
