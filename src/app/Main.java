package app;

public class Main {
    public static void main(String[] args) {
        DataRepository data = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        uiOperator.getOutput(handler.formListOutput(data.getData()));
        uiOperator.getOutput(handler.formOutput(data.getData(),2));
    }
}
