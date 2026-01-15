public class ProgressDemo{
    public static void main(string[]args)throws Exception {
        for(int i =0 ; i <= 100 ; i += 20 ){
            system.out.println("\rProgress:"+i+"%");
            Tread.sleep(500);
        }
    }
}