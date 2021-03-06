import java.util.Vector;

public class VectorAdapter implements List{
	Vector vector = new Vector();
	
	@Override
	public int count() {
		return vector.size();
	}

	@Override
	public Object getAt(int index) {
		return vector.get(index);
	}

	@Override
	public Object first() {
		return vector.get(0);
	}

	@Override
	public Object last() {
		return vector.get(vector.size()-1);
	}

	@Override
	public boolean include(Object x) {
		boolean isIncluded = false;
		if(vector.contains(x)){
			isIncluded = true;
		}
		return isIncluded;
	}

	@Override
	public void append(Object x) {
		vector.add(x);
	}

	@Override
	public void prepend(Object x) {
		vector.add(0, x);		
	}

	@Override
	public void delete(Object x) {
		vector.remove(x);
	}

	@Override
	public void deleteFirst() {
		vector.remove(0);
	}

	@Override
	public void deleteAll() {
		vector.clear();
	}

	@Override
	public void replace(int index, Object x) {
		vector.remove(index);
		vector.add(index, x);
	}

}
