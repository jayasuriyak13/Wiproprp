public class Array4 {
    public static void main(String args[]){
        int numbers[] = {65, 120, 98, 75, 115};
        String str =null;
        for(int i: numbers){
            str = Character.toString((char)i);
            System.out.print(str);
        }
    }
}