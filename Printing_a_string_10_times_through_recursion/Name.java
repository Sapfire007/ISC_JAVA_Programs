class Name
{
    void name(int i)
    {
        if (i > 10)
        return;
        System.out.println("Saptarshi");
        name(i+1);
    }
    public static void main()
    {
        Name obj = new Name();
        int a  = 1;
        obj.name(a);
    }
}