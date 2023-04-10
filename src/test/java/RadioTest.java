import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setCurrentStationZero() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationUnderLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(-5);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationOverLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(20);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentWithinTheLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        int expected = 5;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationWithinTheLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(6);
        cond.next();
        int expected = 7;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationOnTheUpperLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.next();
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationOnTheUnderLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.next();
        int expected = 1;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWithinTheLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(7);
        cond.prev();
        int expected = 6;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevAtTheLimit() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.prev();
        int expected = 9;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMax() {
        Radio cond = new Radio();
        cond.setVolume(100);
        int expected = 100;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMin() {
        Radio cond = new Radio();
        cond.setVolume(0);
        int expected = 0;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundWithinLimits() {
        Radio cond = new Radio();
        cond.setVolume(32);
        int expected = 32;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundBelowLimit() {
        Radio cond = new Radio();
        cond.setVolume(-5);
        int expected = 0;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundAboveLimit() {
        Radio cond = new Radio();
        cond.setVolume(114);
        int expected = 0;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundUpperLimitValue() {
        Radio cond = new Radio();
        cond.setVolume(99);
        int expected = 99;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundLowerLimitValue() {
        Radio cond = new Radio();
        cond.setVolume(1);
        int expected = 1;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundAtMinimum() {
        Radio cond = new Radio();
        cond.setVolume(0);
        cond.upVolume();
        int expected = 1;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundAtMaximum() {
        Radio cond = new Radio();
        cond.setVolume(99);
        cond.upVolume();
        int expected = 100;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeAboveTheMaximum() {
        Radio cond = new Radio();
        cond.setVolume(100);
        cond.upVolume();
        int expected = 100;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceSoundAtMaximum() {
        Radio cond = new Radio();
        cond.setVolume(100);
        cond.downVolume();
        int expected = 99;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceTheSoundAtTheLowerLimit() {
        Radio cond = new Radio();
        cond.setVolume(1);
        cond.downVolume();
        int expected = 0;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceSoundAtMinimum() {
        Radio cond = new Radio();
        cond.setVolume(0);
        cond.downVolume();
        int expected = 0;
        int actual = cond.setVolume();
        Assertions.assertEquals(expected, actual);
    }
}