class ArrayList
{
    private Object[] array;
    private int len=0;

    ArrayList(){
        array = new Object[10];
    }

    ArrayList(int size){
        array = new Object[size];
    }
    public void add(Object o)
    {
        array[len++] = o;
        len++;
    }

    public Object remove(int index)
    {
        int i , len2;
        if(obj == null)
            return;
        if(index > len)
            return;
        for(i=0;i<index;i++);
        while(i<len)
        {
            arr[i]=arr[++i];
        }
        arr[i]=arr[len];
        len--;
    }

    public void printAll()
    {
        for(int i=0;i<=len;i++)
            System.out.println(arr[i]);
    }

}