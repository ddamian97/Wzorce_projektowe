
public class iterator1 {
//	public iterator1(int[] t1) {
//		System.out.println("iterator1:");
//		for(int i=0; i<10; i++) {
//			System.out.println(t1[i]);
//		}
//		System.out.println("");
//	}
	public int[]t1;
	
	public static int current;
	public iterator1(int []t1) {
		this.t1 = t1;
	}
	
	public int First () {
		return t1[0];
	}
	public int Next() {
		current=current+1;
		return t1[current];
	}
	public int IsDone() {
		if(current>=t1.length) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public int CurrentItem() {
		return t1[current];
	}
}

