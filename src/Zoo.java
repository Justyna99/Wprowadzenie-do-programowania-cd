public class Zoo {
    public static void main(String[] args) {

        String[] zwierzaki;
        zwierzaki = new String[]{"ssaki", "gady", "ptaki", "plazy", "rybki"};
//        for(int i=0; i< zwierzaki.length -1; i++ ){
//            System.out.println(zwierzaki[i]);

        for (String zwierzak : zwierzaki) {
            System.out.println(zwierzak);


        }
    }
}
