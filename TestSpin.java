import java.util.concurrent.TimeUnit;
import java.util.HashMap;

public class TestSpin {
        public static void main(String[] args){
            HashMap<Integer, String> items = new HashMap<Integer, String>();
            items.put(0, "A");
            items.put(1, "B");
            items.put(2, "C");
            items.put(3, "D");
            items.put(4, "E");
            String item1;
            String item2;
            String item3;
            //have run randomized in regular code
            int run = 100;
            for(int j = 0; j < run; j++){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                item1 = items.get(j%5);
                if(j >= (run/3)){
                    item1 = items.get((run/3)%5);
                }
                item2 = items.get(j%5);
                if(j >= (run/2)){
                    item2 = items.get((run/2)%5);
                }
                item3 = items.get(j%5);
                if(j == run-1){
                    item3 = items.get((run-1)%5);
                }
                System.out.print("[" + item1 + "] [" + item2 + "] [" + item3 + "]");
                try{
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        
        }
        
}
