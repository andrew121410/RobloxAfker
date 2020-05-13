package com.andrew121410.robloxafker;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyEvent implements NativeKeyListener {

    private RobloxAfker main;

    public KeyEvent(RobloxAfker main) {
        this.main = main;

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(e.getMessage());
            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(this);
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        if (nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_DELETE) {
            try {
                GlobalScreen.unregisterNativeHook();
                System.out.println("RobloxAfker has closed correctly.");
                System.exit(1);
            } catch (NativeHookException e) {
                e.printStackTrace();
            }
        }
//        KeyHelper.getCopyKeyData(nativeKeyEvent);
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {

    }
}
