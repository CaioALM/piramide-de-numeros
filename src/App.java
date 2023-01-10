public class App {
    public static void main(String[] args) throws Exception {
        
        String str = "" ;
        int[] arr = new int[5];
        for (int i =1 ; i<=5 ; i++ ){
            for (int j=0 ; j<i ; j++){
                arr[j] = i;
               str = str + i;
            }
            System.out.println(str);
            str = ""; 

        }
    }
}
