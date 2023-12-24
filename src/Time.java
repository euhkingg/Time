public class Time {
    private int hours;
    private int minuets;
    private int seconds;
    public Time(int hours, int minuets, int seconds) {
        this.hours = hours;
        this.minuets = minuets;
        this.seconds = seconds;
    }

    public int getHours() {return hours;}

    public int getMinuets() {return minuets;}

    public int getSeconds() {return seconds;}

    public void updateTime() {
        if (seconds >= 60) {
            seconds -= 60;
            minuets++;
        }
        if (minuets >= 60) {
            minuets -= 60;
            hours++;
        }
        if (hours >= 24) {
            hours -= 24;
        }
    }

    public String format(int num) {
        if(num < 10) {
            return String.format("%02d", num);
        }
        return String.valueOf(num);
    }

    public String info() {
        return format(hours) + ":" + format(minuets) + ":" + format(seconds);
    }

    public void tick() {
        seconds++;
        updateTime();
    }

    public void add(Time time) {
        hours += time.getHours();
        minuets += time.getMinuets();
        seconds += time.getSeconds();
        updateTime();
    }
}
