package com.andrew121410.robloxafker;

import lombok.SneakyThrows;

import java.util.Timer;

public class RobloxAfker {

    public static void main(String[] args) {
        new RobloxAfker(args);
    }

    @SneakyThrows
    private RobloxAfker(String[] args) {
        boolean randomWalking = false;

        if (args.length == 0) {
            System.out.println("Please enter a argument.");
            System.exit(0);
        } else if (args[0].equalsIgnoreCase("randomWalking")) {
            System.out.println("Starting randomWalking...");
            randomWalking = true;
        }

        new KeyEvent(this);

        Timer timer = new Timer("okokok");
        timer.scheduleAtFixedRate(new KeyRunnable(this, randomWalking), 5000L, 1000L);
    }
}
