package com.andrew121410.robloxafker;

import lombok.SneakyThrows;

import java.util.Timer;

public class RobloxAfker {

    public static void main(String[] args) {
        new RobloxAfker(args);
    }

    @SneakyThrows
    private RobloxAfker(String[] args) {
        new KeyEvent(this);

        Timer timer = new Timer("okokok");
        timer.scheduleAtFixedRate(new KeyRunnable(this), 5000L, 1000L);
    }
}
