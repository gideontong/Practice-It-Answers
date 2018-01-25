// Creator: Gideon Tong

public class TimeSpan {
    private int hours;
    private int minutes;
    
    public TimeSpan(int x, int y) {
        hours = x;
        minutes = y;
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public void add(int x, int y) {
        int mins = hours*60+minutes;
        mins += x*60+y;
        this.hours = mins / 60;
        this.minutes = mins%60;
    }
    
    public void add(TimeSpan x) {
        int mins = hours*60+minutes+x.getHours()*60+x.getMinutes();
        hours = mins/60;
        minutes = mins%60;
    }
    
    public double getTotalHours() {
        double mins = hours*60+minutes;
        return mins/60;
    }
    
    public String toString() {
        return hours + "h" + minutes + "m";
    }
}