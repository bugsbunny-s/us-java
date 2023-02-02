import java.util.Scanner;
public class us {
    public static void main(String[] args) throws Exception {
        int n,us=-1,us2=-1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır sayısı giriniz : ");
        n = inp.nextInt();

        for(int i = 1; i <= n; i*=4){
            
            us++ ;
            System.out.println("4 ^ "+ us + " = " + i);
        }

         System.out.println("-----------");
         
            for(int j = 1; j <= n; j *= 5){
                us2++;
                System.out.println("5 ^ "+ us2 + " = " + j);
            }
        }
    }