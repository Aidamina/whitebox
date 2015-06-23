public class WhiteboxNative {
    static {
        System.loadLibrary("whitebox-jni");
    }
    public static native void test();
}