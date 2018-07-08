package comportamental.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements Iterable<T> {
	
	private List<T> top10;
	
	public MyList(){
		this.top10 = new ArrayList<T>();
		
	}
	
	public T get(int pos){
		return top10.get(pos);
		
	}
	
	public void add(T obj){
		if( this.top10.size() < 10){
			this.top10.add(obj);
			
		}
		
	}
	
	public int size(){
		return this.top10.size();
		
	}
	
	public void print(){
		for(T obj : this.top10){
			System.out.println(obj);
			
		}
		
	}

	@Override
	public Iterator<T> criaIterator() {
		return new MyIterator<T>(this);
	}

}
