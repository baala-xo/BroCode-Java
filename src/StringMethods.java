public class StringMethods {
    public static void main(String[] args){

        String name ="Bala sanji";

        //int length = name.length();
        //char letter = name.charAt(1);
        //int index = name.indexOf("i");
        //int lastIndex = name.lastIndexOf("a");

        //System.out.println(length);
        //System.out.println(letter);
        //System.out.println(index);
        //System.out.println(lastIndex);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.replace(" ","x"));
        System.out.println(name.equalsIgnoreCase("bala sanji"));

    }
}