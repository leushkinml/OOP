import animals.*;

public class Main {
    public static void main(String[] args) {

//        Cat.Breed brShBreed = new Cat.Breed("British Shorthair", "GB", "short");

       Cat murzik = new Cat("Мурзик");
//        murzik.setBreed(brShBreed);
//
//        Cat.FavToy murzikFavToy = murzik.new FavToy("рыбка", "заводная");
//
//        System.out.println(murzikFavToy.getCatName());

//        murzik.talk();
//        murzik.eat();

        Dog sharik = new Dog("Шарик");
//        sharik.talk();
//        sharik.eat();

//        Parrot kesha = new Parrot("Кеша");
//        kesha.talk();

//        murzik.age = 3;
//        murzik.meow();

//        System.out.println("murzik.getName() = " + murzik.getName());

//        Cat begemot = new Cat("Бегемот", -5);
//        begemot.meow();
//
////        System.out.println("У кота " + murzik.name + " " +
////                murzik.getFriends().length + " друзей.");
//
//        murzik.addFriend(begemot);
//        murzik.addFriend(sharik);
//        murzik.addFriend(kesha);

// Приведение типов. Уточнение классов.
//        for (Pet friend : murzik.getFriends()) {
//            if (friend instanceof Cat) {
//                Cat cat = (Cat) friend;
//                cat.meow();
//            } else if (friend.getClass() == Parrot.class) {
//                ((Parrot) friend).talk();
//            } else {
//                System.out.println(friend);
//            }
//        }

//        System.out.println("У кота " + murzik.getName() + " " +
//                murzik.getFriends().length + " друзей.");
//
////        murzik.friends[0].meow();
//
//        System.out.println(Cat.getCount());

        Tiger tiger = new Tiger();

//        sharik.train(Dog.CMD_FETCH);
//        sharik.train(Dog.CMD_SIT);
//
//        checkTrained(sharik, tiger, new Dog("fhkjdhf"));

        Trainer<Dog> alex = new Trainer<>("Alex");
        alex.train(sharik);

        Trainer<Cat> mike = new Trainer<Cat>("Mike");
        mike.train(murzik);

        Trainer bob = new Trainer<>("Bob");
        bob.train(tiger);
        bob.train(sharik);
        bob.train(murzik);

    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String command : animal.getTrainedCommands()) {
                animal.doCommands(command);
            }
        }
    }
}