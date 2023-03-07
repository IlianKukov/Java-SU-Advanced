package JOOP._10InterfaceAndAbstractionEX._00_Review;

import JOOP._08InheritanceEX._02Zoo.zoo.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandParser {
    final String endCommand;
    List<Animal> animals;

    public CommandParser(String endCommand){
        this.endCommand = endCommand;
        this.animals = new ArrayList<>();
    }

    public boolean parse(String nextLine) {
        if (endCommand.equals(this.endCommand)){
            return true;
        }

        String[] animalParameters = endCommand.split("\\s+");
        // TODO:....
        switch (animalParameters[0]){
            case"Cat":
                //animals.add(Cat);
                break;
            default:
                throw new IllegalStateException("Unknown Animal " + animalParameters[0]);
        }
        return false;
    }

    public List<Animal> getAnimals(){
        return Collections.unmodifiableList(animals);
    }


}
