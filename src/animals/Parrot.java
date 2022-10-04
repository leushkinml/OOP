package animals;

public class Parrot extends Pet {

    private boolean talking;
    private String breed;

    public Parrot(String name) {
        this(name, 0);
    }
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void talk() {
        System.out.println("Hello!");
        super.talk();
    }
    public void talk(String word) {
        System.out.println(word);
        talk();
    }

    public void talk(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
        talk();
    }


    public String getName() {
        return super.getName().toUpperCase();
    }
    @Override
    public void eat() {
        System.out.println("Ем корм из кормушки.");
    }


    public boolean isTalking() {
        return talking;
    }

    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
