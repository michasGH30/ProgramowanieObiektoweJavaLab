public class Czas {
    private int hours;
    private int minutes;

    public Czas() {
        hours = 12;
        minutes = 24;
    }

    public Czas(int h, int m) {
        hours = h;
        minutes = m;
    }

    public Czas(String text) {
        String[] tab = text.split(" ");
        hours = Integer.parseInt(tab[0]);
        minutes = Integer.parseInt(tab[2]);
    }

    public String toString() {
        return hours + " h " + minutes + " min";
    }

    public Czas add(Czas c) {
        return new Czas((c.hours + hours + ((c.minutes + minutes) / 60)) % 24, (c.minutes + minutes) % 60);
    }

    public Czas substract(Czas c) {
        return new Czas(hours - c.hours - (minutes - c.minutes < 0 ? 1 : 0),
                minutes - c.minutes >= 0 ? minutes - c.minutes : 60 + (minutes - c.minutes));
    }

    public Czas multiply(int times) {
        return new Czas((hours * times + (minutes * times) / 60) % 24, (minutes * times) % 60);
    }

    public void sumOfTimes(Czas[] arr) {
        Czas temp = new Czas(hours, minutes);
        for (Czas czas : arr) {
            temp = temp.add(czas);
        }
        hours = temp.hours;
        minutes = temp.minutes;
    }
}
