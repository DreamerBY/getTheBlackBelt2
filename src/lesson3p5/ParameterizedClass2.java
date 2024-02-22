package Comparation.lesson3p5;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Privet", 20);
        System.out.println("Zna4enie paru: value 1 = " + pair1.getFirstValue() + ", value2 = " + pair1.getSecondValue());


        Pair<Integer, Double> pair2 = new Pair<>(50, 35.53);
        System.out.println("Zna4enie paru: value 1 = " + pair2.getFirstValue() + ", value2 = " + pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("OK", "Poka");
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;


    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public <V> /*Уже можем не писать так как джава это знает из строки №36 */ V abc(V val){
        return val;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}

