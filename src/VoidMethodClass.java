import java.util.*;
public class VoidMethodClass {

    private List persons = new ArrayList<>();
    public void add(String person){
        persons.add(person);
    }

    public void remove(String person){
        if(!persons.contains(person)){
            throw new NoSuchElementException();
        }
        persons.remove(person);
    }

    public  int size(){
        return persons.size();
    }
    public void removeAll(){
        persons.clear();
    }
}
