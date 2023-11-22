class Fibonacci {
    public static void main(String[]args){
        int count = 10;
        int f0 = 0;
        int f1 = 1;

        for(int i = 0; i < count; i++){
          System.out.println(f0);
          int f2 = f0 + f1;
          f0 = f1;
          f1 = f2;
      }

    }
}