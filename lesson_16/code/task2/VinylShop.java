package task2;

public class VinylShop {
    public static void main(String[] args) {

        MusicRecord record1 = new MusicRecord();
        record1.author = "Michael Jackson";
        record1.name = "Thriller";
        record1.country = "US";
        record1.year = 1982;
        record1.genre = "Funk";
        record1.price = 34.99;


        printRecord(record1);



    }
    public static void printRecord(MusicRecord record){
        System.out.println(record.author + " - " + record.name + "\nCountry: " + record.country + ", "+ record.year + ", " + record.genre + "\n" + record.price + " dollars");
    }


}
