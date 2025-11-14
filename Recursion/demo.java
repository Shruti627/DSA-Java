public class demo {

    public void printNum(int n){
        if(n == 0){
            return;        // base case
        }
        printNum(n - 1);   // recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {

        demo d = new demo();  
        d.printNum(5);        
    }

}
