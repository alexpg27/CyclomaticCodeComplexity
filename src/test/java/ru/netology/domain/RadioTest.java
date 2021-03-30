package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void changeNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prevStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void pushNextAfterMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pushPrevAfterMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void stationAboveMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void stationBelowMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

}