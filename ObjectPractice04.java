public class ObjectPractice04 extends Person{
    public ObjectPractice04(String name, String born) {
        super(name, born);
    }

    public static void main(String[] args) {
        Person sakima = new Person("佐喜真","沖縄");

        sakima.getSelfIntroduction();
    }
}
