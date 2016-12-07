class ArrayList
{
    private Object[] array;
    private int len=0;

    //Constructs an empty list with an initial capacity of ten.
    ArrayList(){
        array = new Object[10];
    }

    //Constructs an empty list with the specified initial capacity
    ArrayList(int initialCapacity){
        array = new Object[initialCapacity];
    }

    //Constructs a list containing the elements of the specified collection , in the order they are returned by the collection's iterator.
    ArrayList(Collection<? extends E> c){
        //find the size of the collection and create a new Arraylist with all the elements
    }

    //Appends the specified element to the end of this list.
    public boolean add(Object o)
    {
        array[len++] = o;
        len++;
    }

    //Inserts the specified element at the specified position in this list
    public void add(int indes , E element)
    {
        //code
    }

    //Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
    public boolean addAll(Collection<? extends E> c)
    {
        //
    }

    //Inserts all of the elements in the specified collection into this list, starting at the specified position.
    public boolean addAll(int index, Collection<? extends  E> c){
        //code
    }

    //Removes all of the elements from this list.
    public void clear()
    {
        //
    }

    //Returns a shallow copy of this ArrayList instance.
    public Object clone(){
        //
    }

    //Returns true if this list contains the specified element.
    public boolean contains(Object o){
        //
    }

    //Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
    public boid ensureCapacity(int minCapacity){
        //
    }

    //Returns the element at the specified position in this list.
    public E get(int index){
        //
    }

    //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    public int indexOf(Object o){
        //
    }

    //Returns true if this list contains no elements.
    public boolean isEmpty(){
        //
    }

    //Returns an iterator over the elements in this list in proper sequence.
    public Iterator<E> iterator(){
        //
    }

    //Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    public int lastIndexOf(Object o){
        //
    }

    //Returns a list iterator over the elements in this list (in proper sequence).
    public ListIterator<E> listIterator(){
        //
    }

    //
    public ListIterator<E> 	listIterator(int index){
        //
    }

    //Removes the element at the specified position in this list.
    public Object remove(int index)
    {
       //
    }

    //Removes the element at the specified position in this list.
    public boolean remove(Object o){
        //
    }

    //Removes from this list all of its elements that are contained in the specified collection.
    public boolean removeAll(Collection<?> c){
        //
    }

    //Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
    protected void removeRange(int fromIndex , int toIndex){
        //
    }

    //Retains only the elements in this list that are contained in the specified collection.
    public boolean retainAll(Collection <?> c){
        //
    }

    //Replaces the element at the specified position in this list with the specified element.
    public E set(int index, E element){
        //
    }

    //Returns the number of elements in this list.
    public int size(){
        //
    }

    //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
    public List<E> subList(int fromIndex, int toIndex){
        //
    }

    //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
    public Object[] toArray(){
        //
    }

    //Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
    public <T> T[] toArray(T[] a){
        //
    }

    //Trims the capacity of this ArrayList instance to be the list's current size.
    public void trimToSize(){
        //
    }

}