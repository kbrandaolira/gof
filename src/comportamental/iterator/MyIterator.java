package comportamental.iterator;

public class MyIterator<X> implements Iterator<X> {

	private MyList<X> myList;
	
	private int pos = -1;
	
	public MyIterator(MyList<X> myList){
		this.myList = myList;
		
	}
	
	@Override
	public boolean hasNext() {
		int posAux = pos + 1;
		
		if( posAux < this.myList.size() ){
			return true;
		}
		
		return false;
	}

	@Override
	public X next() {
		return this.myList.get(++this.pos);
		
	}

}
