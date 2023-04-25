import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random()*3);
        int b = (int) (Math.random()*3);
        int c = (int) (Math.random()*3);
        for (int i = 2; i != 0; i--){
            System.out.println("Введіть послідовність з трьох чисел. Кількість спроб: " + i);
            int one = sc.nextInt();
            if (one == a) {
                int two = sc.nextInt();
                if(two == b){
                    int three = sc.nextInt();
                    if(three == c){
                        System.out.println("Правильно, ви вгадали!");
                    }else System.out.println(i > 1? "Не вірно, спробуйте ще" : "Нажаль не вградали, дякую за гру!");
                }else System.out.println(i > 1? "Не вірно, спробуйте ще" : "Нажаль не вградали, дякую за гру!");
            }else System.out.println(i > 1? "Не вірно, спробуйте ще" : "Нажаль не вградали, дякую за гру!");
        }
    }
}
