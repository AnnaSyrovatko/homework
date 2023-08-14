package task3;

public class Cart {
    private int size=0;
    private Goods[] receipt = new Goods[5];

    public void add(Goods element){
        if(size>=receipt.length) {
            increaseArray();
        }
        receipt[size] = element;
        size++;
    }

    private void increaseArray(){
        Goods[] tempArray = new Goods[receipt.length*2];
        for (int i=0; i<receipt.length;i++){
            tempArray[i]=receipt[i];
        }
        receipt = tempArray;
    }

    public String toString(){
        String res="";
        for (int i=0;i<size;i++){
            res+= receipt[i] +"\n";
        }
        return res;
    }
    public String getTotalPrice(){
        double total = 0;
        for (int i=0;i<size;i++){
            total += receipt[i].getPrice();
        }
        return "Total: " + total + " USD";
    }

    public void remove(int index){
        if(index >= 0 && index < size){
            for (int i = index + 1; i < size; i++){
                receipt[i-1] = receipt[i];
            }
            size--;
        }
    }
    public void removeByID(int id){
        int index = getIndexById(id);
        remove(index);
    }
    public int getIndexById(int id){
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (receipt[i].getId() == id) return i;
        }
        return res;
    }

}
