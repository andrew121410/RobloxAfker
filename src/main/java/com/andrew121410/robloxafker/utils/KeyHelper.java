package com.andrew121410.robloxafker.utils;

import com.andrew121410.CCUtils.utils.Clipboard;
import org.jnativehook.keyboard.NativeKeyEvent;

import java.awt.datatransfer.StringSelection;

public class KeyHelper {

    public static void getCopyKeyData(NativeKeyEvent nativeKeyEvent) {
        String findData = nativeKeyEvent.getID() + "," + nativeKeyEvent.getModifiers() + "," + nativeKeyEvent.getRawCode() + "," + nativeKeyEvent.getKeyCode();
        StringSelection stringSelection = new StringSelection(findData);
        Clipboard.set(stringSelection, null);
    }
}
