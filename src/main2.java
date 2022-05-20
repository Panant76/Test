public class main2 {
    public static void main(String[] args) {
        String str = "Операция 'Ы'! Чтоб никто не догадался.";
        String[] strArr = str.split(" ");
        char[] strArrChr = str.toCharArray();

        System.out.println(isShift(strArrChr));
        System.out.println(noShift(strArrChr));
    }

    static String isShift(char[] strArrChr) {
        for (int i = 0; i < strArrChr.length; i++) {
            if (strArrChr[i] > 192) {
                strArrChr[i] = (char) (strArrChr[i] + 5);
            }
        }
        return new String(strArrChr);
    }
    static String noShift(char[] strArrChr) {
        for (int i = 0; i < strArrChr.length; i++) {
            if (strArrChr[i] < 192) {
                continue;
            }
            strArrChr[i] = (char) (strArrChr[i] - 5);
        }
        return new String(strArrChr);
    }
}
