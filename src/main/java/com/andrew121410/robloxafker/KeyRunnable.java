package com.andrew121410.robloxafker;

import lombok.SneakyThrows;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

public class KeyRunnable extends TimerTask {

    private int lastKey = KeyEvent.VK_F;

    private int a;

    private RobloxAfker main;
    private Robot robot;

    @SneakyThrows
    public KeyRunnable(RobloxAfker main) {
        this.main = main;
        this.robot = new Robot();
    }

    @SneakyThrows
    @Override
    public void run() {
        if (a == 1) {
            robot.keyRelease(lastKey);
            a = 0;
        }

        int randomKey = numberToKey(getRandom(0, 3));
        robot.keyPress(randomKey);
        this.lastKey = randomKey;
        a = 1;
    }

    public static double getRandom(double min, double max) {
        return (Math.random() * (max + 1 - min)) + min;
    }

    public int numberToKey(double random) {
        int a = (int) random;
        switch (a) {
            case 0:
                return KeyEvent.VK_W;
            case 1:
                return KeyEvent.VK_A;
            case 2:
                return KeyEvent.VK_S;
            case 3:
                return KeyEvent.VK_D;
            default:
                return KeyEvent.VK_SPACE;
        }
    }
}
