class MyArrayList
{
    private Object[] arr;
    private int length;
    private int size;

    //Constructs an empty list with an initial capacity of ten.
    MyArrayList(){
        arr = new Object[10];
        length=0;
        size=10;
    }

    //Constructs an empty list with the specified initial capacity
    MyArrayList(int size){
        arr = new Object[size];
        length=0;
        this.size=size;
    }

    //Constructs a list containing the elements of the specified collection , in the order they are returned by the collection's iterator.
    /*ArrayList(Collection<? extends E> c){
        //find the size of the collection and create a new Arraylist with all the elements
    }*/

    //Appends the specified element to the end of this list.
    public boolean add(Object o){
        if(length>=size)
        {
            resize();
        }
        arr[length]=o;
        length++;

        return true;
    }

    private void resize(){
        size=size+10;
        Object[] new_arr = new Object[size];
        int i=0;
        for(Object o : arr){
            new_arr[i++] = o;
        }
        arr=new_arr;
        length=i;

    }

    //Inserts the specified element at the specified position in this list
    public void add(int index , Object element)
    {
        //code
    }

    //Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
    /*public boolean addAll(Collection<? extends E> c)
    {
        //
    }
    */
    //Inserts all of the elements in the specified collection into this list, starting at the specified position.
    /*
    public boolean addAll(int index, Collection<? extends  E> c){
        //code
    }
    */
    //Removes all of the elements from this list.
    public void clear()
    {
        //
    }

    //Returns a shallow copy of this ArrayList instance.
    /*
    public Object clone(){
        //
    }
    */
    //Returns true if this list contains the specified element.
    public boolean contains(Object o){
        for(Object obj:arr){
            if(obj.equals(o)){
                //System.out.println(o);
                return true;
            }
        }
        return false;
    }

    //Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
    public void ensureCapacity(int minCapacity){
        //
    }

    //Returns the element at the specified position in this list.
    public Object get(int index){
        if(index<=length){
            return arr[index];
        }
        else
            return null;
    }
    /*
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
    */
    //Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
    protected void removeRange(int fromIndex , int toIndex){
        int  i=0;
        if(fromIndex<=length && toIndex<=length-1)
        {
            //int diff=toIndex-
            for(i=fromIndex;toIndex<length;i++){
                arr[i++]=arr[toIndex++];
            }
            while(i<length)
                arr[i++]=null;
            length=length-(toIndex-fromIndex);
            //length=;
        }
        else{
            System.out.println("Elements not present at those index");
        }
    }

    //Retains only the elements in this list that are contained in the specified collection.
    public boolean retainAll(MyArrayList c){
        int c_size=c.size();
        int i=0;
        Object[] new_arr = new Object[size];
        for(int j=0;j<c_size;j++){
            if(contains(c.get(j))){
                new_arr[i++]=c.get(j);
            }
        }
        if(i!=0){
            arr=new_arr;
            length=i;
            return true;
        }
        else
            return false;
    }

    //Replaces the element at the specified position in this list with the specified element.
    public Object set(int index, Object element){
        if(index<0)
            return null;
        if(index>length)
            return null;
        int j=length;
        if(length==size)
        {
            resize();
        }
        while(j!=index)
        {
            arr[j]=arr[j-1];
            j--;
        }
        arr[j]=element;
        length++;
        return element;
    }
    public int size(){
        return length;
    }
    //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
    public MyArrayList subList(int fromIndex, int toIndex){

        if(fromIndex<0||fromIndex>length)
            return null;
        if(toIndex<fromIndex||toIndex>=length)
            return null;
        MyArrayList new_arr = new MyArrayList(toIndex-fromIndex+1);

        for(int i=fromIndex;i<=toIndex;i++)
            new_arr.add(arr[i]);

        return new_arr;
    }

    //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
    public Object[] toArray(){
        Object[] new_arr = new Object[length];
        int i=0;
        for(Object o: arr){
            new_arr[i]=arr[i];
            i++;
        }
        return new_arr;
    }

    //Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
    /*
    public Object[] toArray(Object[] a){
        //
    }

    //Trims the capacity of this ArrayList instance to be the list's current size.
    public void trimToSize(){
        //
    }
    */
    public static void main(String[] args){
        MyArrayList arr = new MyArrayList(10);
        for(int i=0;i<20;i++){
            arr.add(i);
        }
        //Integer[] int_arr = (Integer[]) arr.toArray();
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }

}