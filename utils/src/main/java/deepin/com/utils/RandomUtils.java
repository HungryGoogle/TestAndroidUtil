package deepin.com.utils;

import android.text.TextUtils;

import java.util.Random;

public class RandomUtils {
    /**
     * Returns a pseudo-random uniformly distributed {@code int}.
     * 返回伪随机均匀分布
     */
    public static int randomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    public static int randomInt(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    /**
     * Returns a pseudo-random uniformly distributed {@code int} in the half-open range [min, max].
     */
    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }


    public static int randomInt2(int n) {
        return (int) (System.currentTimeMillis() % n);
    }
    public static int randomInt3(int n) {
        return (int) (Math.random() * 100);
    }

    /**
     * Returns [0.0, 1.0).
     */
    public static float randomFloat() {
        Random random = new Random();
        return random.nextFloat();
    }

    /**
     * Returns [0.0, 1.0).

     */
    public static double randomDouble() {
        Random random = new Random();
        return random.nextDouble();
    }

    /**
     * Returns a pseudo-random uniformly distributed {@code long}.
     */
    public static long randomLong() {
        Random random = new Random();
        return random.nextLong();
    }

    /**
     * Returns a pseudo-random uniformly distributed {@code boolean}.
     */
    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    /**
     */
    public static double randomGaussian() {
        Random random = new Random();
        return random.nextGaussian();
    }

    /**
     * Fills {@code buf} with random bytes.
     *
     * @param buf
     */
    public static void randomBytes(byte[] buf) {
        Random random = new Random();
        random.nextBytes(buf);
    }

    /**
     * Get a random string
     * 得到一个随机字符串
     */
    public static String randomString(int length) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return TextUtils.isEmpty(source) ? null : randomString(source.toCharArray(), length);
    }

    /**
     * Get a random string
     * 得到一个随机字符串
     */
    public static String randomString(String source, int length) {
        return TextUtils.isEmpty(source) ? null : randomString(source.toCharArray(), length);
    }

    /**
     * Get a random string
     * 得到一个随机字符串
     */
    public static String randomString(char[] sourceChar, int length) {
        if (sourceChar == null || sourceChar.length == 0 || length < 0) {
            return null;
        }
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append(sourceChar[randomInt(sourceChar.length)]);
        }
        return builder.toString();
    }

    /**
     * Shuffling a int array
     * 重新排序数组
     */
    public static int[] shuffle(int[] intArray, int shuffleCount) {
        int length;
        if (intArray == null || shuffleCount < 0 || (length = intArray.length) < shuffleCount) {
            return null;
        }

        int[] out = new int[shuffleCount];
        for (int i = 1; i <= shuffleCount; i++) {
            int random = randomInt(length - i);
            out[i - 1] = intArray[random];
            int temp = intArray[length - i];
            intArray[length - i] = intArray[random];
            intArray[random] = temp;
        }
        return out;
    }
}
