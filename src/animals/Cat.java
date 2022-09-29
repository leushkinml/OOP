package animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {

    private String name;
    private int birthYear;

    private Cat[] friends;

    public Cat(String name) {

        this(name, 0);
    }
// LocalDate.now().getYear()
   public Cat(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);

        }
        friends = new Cat[0];

    }


    public void meow() {

        System.out.println("Мяу!");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + getAge() + " лет.");
    }

    public Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }

    public void addFriend(Cat friend) {
        Cat[] friends = new Cat[getFriends().length +1];
        this.friends = Arrays.copyOf(this.friends,
                getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Кот";
        }
    }
    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

}