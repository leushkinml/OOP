package animals;

public abstract interface Trained {

    // Все переменные в интерфейсе public и static final
    // public static final boolean TRAINED = false;

    // Все методы в интерфейсе public и abstract
    // public abstract String[] getTrainedCommands();

    String[] getTrainedCommands();

    String[] getAllCommands();

    void train(String command);

    void doCommands(String command);

}
