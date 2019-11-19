
public class iterator2 {
public int[]t1;
	
	public static int current=0;
	public iterator2(int []t1) {
		this.t1 = t1;
	}
	
	public int First () {
		return t1[0];
	}
	public int Next() {
		while(t1[current+1]==0) {
			current=current+1;
		}
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
