package classwork;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean format = true;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        if(!format){
            return year + "." + month + "." + day;
        }else{
            return day + "." + month + "." + year;
        }
    }


    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return this.year;
    }


    public void setFormat(boolean format) {
        this.format = format;
    }
}
