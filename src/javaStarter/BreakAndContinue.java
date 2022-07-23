package javaStarter;

public class BreakAndContinue {
    public static void main(String[] args) {
        breakEx();
        continueEx();
    }

    public static void breakEx(){
        int i = 0;
        while (true)
        {
            if (i == 150000){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");
    }


    public static void continueEx(){
            for(int i = 0; i <= 15; i++){
                if (i % 2 == 0){
                    continue;
                }
                System.out.println("Это нечетное число " + i);
            }
    }
}
