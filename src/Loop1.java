import java.util.Scanner;
public class Loop1 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if(number>= 1 && number<=10){
                for(int i= 1 ; i<11 ; i++){
                    System.out.println(number+" x "+i+" = "+(number*i));
                }
            }

        }
    }



