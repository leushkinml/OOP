package animals;

import java.util.Arrays;

public class Dog extends Pet implements Trained{

    public static final String CMD_SIT = "Сидеть";
    public static final String CMD_VOICE = "Голос";
    public static final String CMD_FETCH = "Апорт";

    public static final String[] ALL_TRAINED_COMMANDS = {CMD_SIT, CMD_VOICE, CMD_FETCH};

    private String[] trainedCommands = new String[0];

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Насыпать собачий корм в миску.");
        System.out.println("Дают команду.");
        System.out.println("Ем корм.");
    }

    @Override
    public String[] getTrainedCommands() {
        return trainedCommands;
    }
//    public String[] getTrainedCommands() {
//        return new String[0];
//    }

    @Override
    public String[] getAllCommands() {
        return ALL_TRAINED_COMMANDS;
    }

    @Override
    public void train(String command) {
        trainedCommands = Arrays.copyOf(trainedCommands,trainedCommands.length + 1);
        trainedCommands[trainedCommands.length - 1] = command;

    }
//    public String[] getAllCommands() {
//        return new String[0];
//    }


    @Override
    public void doCommands(String command) {
        System.out.println("Выполняю команду " + command);
        switch (command) {
            case CMD_SIT:
                System.out.println("Собака садиться на пол.");
                break;
            case CMD_FETCH:
                System.out.println("Собака побежала за палкой.");
                System.out.println("Собака принесла утку.");
                break;
            case CMD_VOICE:
                talk();
                break;
            default:
                System.out.println("Нет такой команды");
        }
    }
}
