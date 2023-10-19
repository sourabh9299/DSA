class Box
{
    int l,b,h;
    Box()
    {}
    void show()
    {
        System.out.println("Volume:"+l*b*h);
    }

    public static void main(String[] args)
    {
        Box b1=new Box();
        b1.l=10;
        b1.b=10;
        b1.h=10;
        b1.show();


    }

}