package numbers;

public class DecimalToBinary {

    public static void main(String[] args) {
        int no = 5;
        final String decimalToBinary = decimalToBinary(no);
        System.out.println(decimalToBinary);
        System.out.println(binaryToDecimal(decimalToBinary));
        System.out.println("Number of one in " + no + " :" + countNoOfOneInBinary(no));


    }

    private static String decimalToBinary(int no) {
        if (no == 0) {
            return "0";
        }

        String str = new String();
        while (no != 0) {
            int rem = no % 2;
            str = rem + str;
            no = no / 2;
        }
        return str;
    }

    private static int binaryToDecimal(String binary) {
        int dec = 0;
        int last = binary.length() - 1;
        for (int i = last; i >= 0; i--) {
            int x = (int) Math.pow(2, last - i);
            int y = Integer.parseInt(String.valueOf(binary.charAt(i)));
            dec = dec + (x * y);
        }
        return dec;
    }

    private static int countNoOfOneInBinary(int no) {
        int sum = 0;
        while (no > 0) {
            sum = sum + (no & 1);
            no = no >> 2;
        }
        return sum;
    }
}
