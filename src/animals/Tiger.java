package animals;

public class Tiger implements Trained {

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
}
