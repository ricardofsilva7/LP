public class Main {
    public class main
    {
        public static int somar (int a)
        {
            if(a==1)
                return 1;
            else
                return a-somar(a-1);

        }

        public static void main(String[] args)
        {
            int resultado = somar(5);
            System.out.println (resultado);
        }
    }


}