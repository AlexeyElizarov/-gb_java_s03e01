public class Main {

    public static void main(String[] args) {


        Box<Apple> appleBox = new Box<>();
        appleBox.load(
                new Apple(),
                new Apple());
        System.out.println(appleBox.getWeight());


        Box<Orange> orangeBox = new Box<>();
        orangeBox.load(
                new Orange(),
//                new Apple(),
                new Orange(),
                new Orange());
        System.out.println(orangeBox.getWeight());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.repack(appleBox);
        System.out.println(appleBox1.getContents());
        System.out.println(appleBox.getContents());

//        Will generate a problem
//        appleBox1.repack(orangeBox);

    }

}
