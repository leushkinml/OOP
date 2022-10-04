import animals.Trained;

public class Trainer<A extends  Trained> {
//public class Trainer<A extends Pet & Trained> {

    private String name;
    private String grade;

    //private A animal;

    //private A[] animals;

    public Trainer(String name) {
        this.name = name;
    }


    public void train(A pet) {
//        System.out.println("Начинаю тренировку [" + pet.getName() + "]");

        for (String command : pet.getAllCommands()) {
            pet.train(command);
            System.out.println("бучаю команде " + command);
        }

//        System.out.println("Заканчиваю тренировку [" + pet.getName() + "]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
