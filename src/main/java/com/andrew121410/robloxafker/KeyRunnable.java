package com.andrew121410.robloxafker;

import lombok.SneakyThrows;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

public class KeyRunnable extends TimerTask {

    private final RobloxAfker main;
    private final Robot robot;

    private final boolean randomWalking;

    private int lastKey = KeyEvent.VK_F;
    private boolean needToRelease = false;

    @SneakyThrows
    public KeyRunnable(RobloxAfker main, boolean randomWalking) {
        this.main = main;
        this.robot = new Robot();
        this.randomWalking = randomWalking;
    }

    @Override
    public void run() {
        if (randomWalking) {
            randomWalkingRun();
        } else {
            autoJumperRun();
        }
    }

    public void randomWalkingRun() {
        if (needToRelease) {
            robot.keyRelease(lastKey);
            this.needToRelease = false;
        }

        int random = (int) getRandom(0, 3);
        int numberToKey = numberToKey(random);

        robot.keyPress(numberToKey);
        this.lastKey = numberToKey;
        this.needToRelease = true;
    }

    private void autoJumperRun() {
        if (this.needToRelease) {
            robot.keyRelease(lastKey);
            this.needToRelease = false;
            return;
        }

        int key = KeyEvent.VK_SPACE;
        robot.keyPress(key);
        this.needToRelease = true;
    }

    public static double getRandom(double min, double max) {
        return (Math.random() * (max + 1 - min)) + min;
    }

    public int numberToKey(double random) {
        int a = (int) random;
        return switch (a) {
            case 0 -> KeyEvent.VK_W;
            case 1 -> KeyEvent.VK_S;
            case 2 -> KeyEvent.VK_A;
            case 3 -> KeyEvent.VK_D;
            default -> KeyEvent.VK_SPACE;
        };
    }
}
