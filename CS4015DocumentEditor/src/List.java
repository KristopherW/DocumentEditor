
public interface List<T> {
	 public int count(); // return how many elements in the list
     public T getAt(int index); // return the element at the given index in the list
     public T first(); //return the first element of the list
     public T last(); //return the last element of the list
     public boolean include(T x); //return true if x is in the list
     public void append(T x); //append x at the end of the list
     public void prepend(T x); //insert x in front of the list
     public void delete(T x); //remove the first appearance of x in the list
     public void deleteFirst(); //remove the first element of the list
     public void deleteAll(); //remove all elements of the list
     public void replace(int index, T x); //replace the object at the index by x
}
