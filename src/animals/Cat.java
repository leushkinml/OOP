package animals;

import java.util.Arrays;

public class Cat extends Pet implements Trained{

    private static int count;

    public static int getCount() {
        return count;
    }



    public static class Breed {
        private String name;
        private String country;
        private String hairType;

        public Breed(String name, String country, String hairType) {
            this.name = name;
            this.country = country;
            this.hairType = hairType;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy {
        private String name;
        private String type;

        public FavToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getCatName() {
            return Cat.this.getName();
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }

    private Pet[] friends;

    private Breed breed;

    private FavToy toy;


    public Cat(String name) {

        this(name, 0);
    }
// LocalDate.now().getYear()
   public Cat(String name, int age) {
        super(name, age);

        friends = new Pet[0];

        count++;
   }

    @Override
    public void eat() {
        System.out.println("Насыпют кошачий корм в миску.");
        System.out.println("Ем корм.");
        System.out.println("Пью воду.");
    }


    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут " + getName());
        System.out.println("Мне " + getAge() + " лет.");
    }


    @Override
    public String[] getTrainedCommands() {
        return new String[0];
    }

    @Override
    public String[] getAllCommands() {
        return new String[0];
    }

    @Override
    public void train(String command) {

    }

    @Override
    public void doCommands(String command) {

    }
    public Pet[] getFriends() {
        if (friends == null) {
            friends = new Pet[0];
        }
        return friends;
    }

    public void addFriend(Pet friend) {
        this.friends = Arrays.copyOf(getFriends(),getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;

        System.out.println((getName() + " подружился с " + friend.getName()));

    }


    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
        }
    }

    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }
}
