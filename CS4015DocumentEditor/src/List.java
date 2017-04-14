
public interface List {
	 public int count(); // return how many elements in the list
     public Object getAt(int index); // return the element at the given index in the list
     public Object first(); //return the first element of the list
     public Object last(); //return the last element of the list
     public boolean include(Object x); //return true if x is in the list
     public void append(Object x); //append x at the end of the list
     public void prepend(Object x); //insert x in front of the list
     public void delete(Object x); //remove the first appearance of x in the list
     public void deleteFirst(); //remove the first element of the list
     public void deleteAll(); //remove all elements of the list
     public void replace(int index, Object x); //replace the object at the index by x
}
