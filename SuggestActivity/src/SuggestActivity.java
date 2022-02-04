 import java.util.Scanner ;
public class SuggestActivity {
    public static void main(String[] args) {

        int heat ;
        Scanner input = new Scanner(System.in);

        System.out.print("Please write the heat : ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("You can ski. ");
        }
        else if (heat >= 5 && heat < 15){
            System.out.println("You can go to the cinema. ");
        }
        else if (heat >= 15 && heat< 25){
            System.out.println("You can go to picnic.");
        }
        else if (heat >= 25){
            System.out.println("You can swim.");
        }
    }
}
