public  class Power{

    public int power(int a,int b){
        if(b==0){
            return 1;
        }
        return a*power(a, b-1);
    }
    public static void main(String[] args) {
        Power pow=new Power();
        System.out.println(pow.power(2, 5));
    }
}