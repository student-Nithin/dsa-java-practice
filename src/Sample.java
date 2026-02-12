public class Sample {
    public static void main(String[] args) {
        printName(1,5);
    }

    public static void printName(int i,int n) {
        if (i>n) {
            return;
        }
        else {
            printName(i+1,n);
            System.out.print(i + " ");
        }
    }
}