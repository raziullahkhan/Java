package Loop;
public class Unicode {
    public static void main(String[] args) {
        int i=0;
        while(i<=65536){
            
            System.out.print(i);
            char c=(char)i;
            System.out.println("---------"+c);
            i++;
        }
    }
}
