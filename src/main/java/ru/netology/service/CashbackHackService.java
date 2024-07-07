package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 100;

    public int remain(int amout) {
        return boundary - amout % boundary;
    }
}
