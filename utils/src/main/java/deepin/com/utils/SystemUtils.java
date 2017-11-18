package deepin.com.utils;

import android.os.Build;

public class SystemUtils {
    /**
     * DALVIK
     */
    public static boolean isDalvik() {
        final String vmVersion = System.getProperty("java.vm.version");
        return vmVersion != null && vmVersion.startsWith("1");
    }

    /**
     * ART
     */
    public static boolean isART() {
        final String vmVersion = System.getProperty("java.vm.version");
        return vmVersion != null && vmVersion.startsWith("2");
    }

    /**
     * Build.ID
     */
    public static String getID() {
        return Build.ID;
    }

    /**
     * The brand
     */
    public static String getBrand() {
        return Build.BRAND;
    }

    /**
     * The name of the board
     */
    public static String getBoard() {
        return Build.BOARD;
    }

    /**
     * The end-user-visible name for the end product
     */
    public static String getModel() {
        return Build.MODEL;
    }

    /**
     * The user-visible version string, like "6.1.2".
     *
     * @return
     */
    public static String getVersionRelease() {
        return Build.VERSION.RELEASE;
    }

    /**
     * The user-visible SDK version of the framework.
     *
     * @return
     */
    public static int getVersionSDK() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * A string that uniquely identifies this build. Do not attempt to parse this value.
     */
    public static String getFingerPrint() {
        return Build.FINGERPRINT;
    }

    /**
     * The name of the overall product
     */
    public static String getProduct() {
        return Build.PRODUCT;
    }

    /**
     * The manufacturer of the product/hardware
     */
    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    /**
     * The name of the industrial design
     */
    public static String getDevice() {
        return Build.DEVICE;
    }

    /**
     * A build ID string meant for displaying to the user
     */
    public static String getDisplay() {
        return Build.DISPLAY;
    }
}
