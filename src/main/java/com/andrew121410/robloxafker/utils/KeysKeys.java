package com.andrew121410.robloxafker.utils;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;

public class KeysKeys {

    public static final int[] W_KEY = {2401, 0, 87, 17};
    public static final int[] A_KEY = {2401, 0, 65, 30};
    public static final int[] S_KEY = {2401, 0, 83, 31};
    public static final int[] D_KEY = {2401, 0, 68, 32};
    public static final int[] SPACE_KEY = {2401, 0, 32, 57};

    public static void wKey() {
        GlobalScreen.postNativeEvent(new NativeKeyEvent(2401, 0, 87, 17, NativeKeyEvent.CHAR_UNDEFINED));
    }

    public static void aKey() {
        GlobalScreen.postNativeEvent(new NativeKeyEvent(2401, 0, 65, 30, NativeKeyEvent.CHAR_UNDEFINED));
    }

    public static void sKey() {
        GlobalScreen.postNativeEvent(new NativeKeyEvent(2401, 0, 83, 31, NativeKeyEvent.CHAR_UNDEFINED));
    }

    public static void dKey() {
        GlobalScreen.postNativeEvent(new NativeKeyEvent(2401, 0, 68, 32, NativeKeyEvent.CHAR_UNDEFINED));
    }

    public static void spaceKey() {
        GlobalScreen.postNativeEvent(new NativeKeyEvent(2401, 0, 32, 57, NativeKeyEvent.CHAR_UNDEFINED));
    }
}
