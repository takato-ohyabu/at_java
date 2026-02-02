package AT_Unit1.Question1;

public class T extends S
{
    public void methodS()
    {
        System.out.print("U");
    }
    public void methodT()
    {
        super.methodS();
        System.out.print("R");
    }
}
