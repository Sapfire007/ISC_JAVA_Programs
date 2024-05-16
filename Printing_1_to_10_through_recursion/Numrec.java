class Numrec
{
    void num(int i)
    {
        if (i>10) 
        return;
        System.out.println(i);
        num(i+1);
    }
    public static void main()
    {
        Numrec obj = new Numrec();
        obj.num(1);
    }
}