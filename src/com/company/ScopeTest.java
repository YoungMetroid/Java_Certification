public class ScopeTest
{
    private String[] args = new String[0];


    public static void main(String[] args)
    {
        args = new String[args.length];
        for(String arg : args)
        {
            System.out.println(arg);
        }
        String arg = args[0];
        System.out.println(arg);
    }
}