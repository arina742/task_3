public class Main
{

        public static void main(String[] args)
        {
            int[] array = new int[99];
            System.out.println("Массив:");
            for (int i = 0; i < array.length; i++)
            {
                array[i] = i+2;
                System.out.println(array[i]);
            }
            System.out.println();
            System.out.println("Простые числа:");
            for (int i = 0; i < array.length; i++)
            {
                boolean simpleNumber = true;
                for (int j = 2; j < 10; j++)
                {
                    if (array[i] % j == 0)
                    {
                        simpleNumber = false;
                    }
                }

                if (simpleNumber == true)
                {
                    System.out.println(array[i]);
                }
            }

        }

}