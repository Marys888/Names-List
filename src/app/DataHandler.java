package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {
    public String formListOutput(List<String> namesList) {
        StringBuilder listBuilder = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(1);
        for(String name:namesList){
            listBuilder.append(String.format("%d) %s%n",counter.getAndIncrement(),name));
        }
        return "\nNames:\n" + listBuilder.toString();

    }

    public String formOutput(List<String> namesList, int index) {
        try {
            String name = namesList.get(index);
            return "Name: " + name + " " + "is in index" + " " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }
}
