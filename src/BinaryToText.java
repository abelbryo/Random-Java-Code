public class BinaryToText{
    public static void main(String [] args){
        String str = "01100001 01101100 01101100 00100000 01101111 01101110 01100101 01110011 00100000 01100001 01101110 01100100 00100000 01111010 01100101 01110010 01101111 01110011 00100000 01100001 01101110 01100100 00100000 01101110 01101111 00100000 01110100 01110111 01101111 01110011 00100000 01101101 01100001 01101011 01100101 00100000 01101000 01100101 01101001 01101011 01101011 01101001 00100000 01100001 00100000 01100100 01110101 01101100 01101100 00100000 01100010 01101111 01111001";

        String [] arr = str.split(" ");
            
        for (String i : arr)
            System.out.print(convert(i));
        System.out.print("\n");

    }

    public static char convert(String str) {
        int c = Integer.parseInt(str, 2);
        return ((char) c);
    }

}
