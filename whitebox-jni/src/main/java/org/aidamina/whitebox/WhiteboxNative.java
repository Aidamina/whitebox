package org.aidamina.whitebox;

public class WhiteboxNative {
    static {
		System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("whitebox-jni");
    }
    public static native void test();
}