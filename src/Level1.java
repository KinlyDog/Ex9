public class Level1 {
    public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        if (h2 > h1 || w2 > w1) {
            return false;
        }

        String[] str = s2.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (!s1.contains(str[i])) {
                break;
            }

            if (i == str.length - 1) {
                return true;
            }
        }

        return false;
    }
}
