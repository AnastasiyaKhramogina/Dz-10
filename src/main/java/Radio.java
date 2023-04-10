public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;

    public int getCurrentStation() {
        return currentRadioStationNumber;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentStation;
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber--;
        }
    }

    public int setVolume() {
        return soundVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        soundVolume = newVolume;
    }

    public void upVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void downVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}