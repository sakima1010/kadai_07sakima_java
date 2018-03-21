public class Person {
    public String name;
    public String born;

    public Person(String name, String born){
        this.name = name;
        this.born = born;
    }

    public void getSelfIntroduction(){
        System.out.println("私の名前は" + name + "です。" + born + "出身です。");
    }
}

