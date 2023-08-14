public class Main {
    public static void main(String[] args) {

        // Make an array with ints
        SmartArray array = new SmartArray();
        int [] numbers = {1, 3, 4, 40, 100, 99};
        for (int i = 0; i < numbers.length; i++) {
            array.add(numbers[i]);
        }
        System.out.println(array);

        // Make an array with Class Objects
        SmartArrayObj newArray = new SmartArrayObj();
        Person [] people = {
            new Person("May"),
            new Person("Tom"),
            new Person("Gayle"),
            new Person("Shadowheart")
        };
        for (int i = 0; i < people.length; i++) {
            newArray.add(people[i]);
        }
        System.out.println(newArray);

        //Delete an element
        array.remove(4);
        newArray.removeById(2);
        newArray.removeById(3);
        System.out.println(array);
        System.out.println(newArray);



    }
}
