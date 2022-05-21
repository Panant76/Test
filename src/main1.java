public class main1 {
    static char[] chrArr = new char[]{'а', 'я', 'у', 'о', 'е', 'ё', 'э', 'и', 'ы'};
    static String str = "Варила бабушка варенье";
    static String[] strArr = str.split(" ");
    static char[] strArrChr = str.toCharArray();

    public static void main(String[] args) {
        for (int i = 0; i < strArrChr.length; i++) {
            if (strArrChr[i]==' ' )continue;
            if (isValve(strArrChr[i]) ) {
                strArrChr[i] = '!';
            } else {
                strArrChr[i] = '_';
            }
        }
        String newStr = new String(strArrChr);
        System.out.println(newStr);
    }

    static boolean isValve(char str) {
        boolean x = false;
        for (char c : chrArr) {
            if (c == str) {
                x = true;
                break;
            }
        }
        return x;
    }
}
