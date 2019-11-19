
public class TableToIterate {
	
	private int[] len;
	public TableToIterate(int [] len) {
		this.len = len;
		System.out.println("init");
	}
	
	
	public void wr1(){									//wypelniam tablice z wartoscia 0
		len[0]=1;
		len[1]=99;
		len[2]=0;
		len[3]=3;
		len[4]=4;
		len[5]=5;
		len[6]=6;
		len[7]=7;
		len[8]=8;
		len[9]=9;
	}
	
	public int[] getTab(){							//zwracam tablice
		return len;
	}
	
	
	
	public int It1First() {
		iterator1 it1 = new iterator1(len);
		int first=it1.First();
		System.out.println();
		System.out.println("it1first: "+first);
		System.out.println();
		return first;
	}
	public int It2First() {
		iterator2 it2 = new iterator2(len);
		int first=it2.First();
		System.out.println();
		System.out.println("it2first: "+first);
		System.out.println();
		return first;
	}
	
	
	
	public int It1Next() {
		iterator1 it1 = new iterator1(len);
		int next=it1.Next();
		System.out.println();
		System.out.println("it1Next: "+next);
		System.out.println();
		return next;
	}
	public int It2Next() {
		iterator2 it2 = new iterator2(len);
		int next=it2.Next();
		System.out.println();
		System.out.println("it2Next: "+next);
		System.out.println();
		return next;
	}
	
	
	
	
	
	public int It1IsDone() {
		iterator1 it1 = new iterator1(len);
		int isDone=it1.IsDone();
		System.out.println();
		System.out.println("it1IsDone: "+isDone);
		System.out.println();
		return isDone;
	}
	
	public int It2IsDone() {
		iterator2 it2 = new iterator2(len);
		int isDone=it2.IsDone();
		System.out.println();
		System.out.println("it2IsDone: "+isDone);
		System.out.println();
		return isDone;
	}
	
	
	public int It1CurrentItem() {
		iterator1 it1 = new iterator1(len);
		int currentItem=it1.CurrentItem();
		System.out.println();
		System.out.println("it1currentitem: "+currentItem);
		System.out.println();
		return currentItem;
	}
	
	public int It2CurrentItem() {
		iterator2 it2 = new iterator2(len);
		int currentItem=it2.CurrentItem();
		System.out.println();
		System.out.println("it2currentitem: "+currentItem);
		System.out.println();
		return currentItem;
	}
	
}
