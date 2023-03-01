package JAdvanced._03StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> nav = new ArrayDeque<>();
        String inp = scanner.nextLine();

        while (!inp.equals("Home")){

            if (inp.equals("back")){

                if (nav.isEmpty() || nav.size()==1){
                    System.out.println("no previous URLs");
                    inp = scanner.nextLine();
                    continue;
                }else {
                    nav.pop();
                }

            } else {
                nav.push(inp);


            }

            System.out.println(nav.peek());
            inp = scanner.nextLine();
        }





    }
}
