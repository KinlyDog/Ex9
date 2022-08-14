public class Level1 {
      public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        int str = h1 - h2 + 1;
        int stlb = w1 - w2 + 1;

        int x = 0;
        int y = 0;
        int i = 0;
        int j = 0;

        while (x != str) {

            for (i = 0; i < h2; i++) {
                for (j = 0; j < w2; j++) {
                    if (str2[i].charAt(j) != str1[i + x].charAt(j + y)) {
                        y++;

                        i = h2;
                        j = w2;
                    }
                }
            }

            if (i == h2 && j == w2) {
                return true;
            }

            if (y == stlb) {
                y = 0;
                x++;
            }
        }

        return false;
    }

}
