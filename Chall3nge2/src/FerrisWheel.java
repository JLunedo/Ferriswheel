import java.util.ArrayList;
import java.util.List;
public class FerrisWheel {

    List<String> ferrisWheel;

    public FerrisWheel(){
        this.ferrisWheel = new ArrayList<>();
        for (int i = 0; i < 18; i++){
            this.ferrisWheel.add("(empty)");
        }
    }

    public void board(int i, Child child, Child child1){
        if(child.getAge() > 11 && child1.getAge() > 11){
            this.ferrisWheel.add(i-1,child.getName() + " and " + child1.getName());
        }
        else if(child.getAge() > 11 && child1 == null){
            this.ferrisWheel.add(i-1,"only " + child.getName());
        }
        else{
            System.out.println("ERROR: children less than 12 must be accompanied by one of their parents");
        }
    }

    public void board(int i, Child child1, Adult parent){
        this.ferrisWheel.add(i-1, child1.getName() + " and " + parent.getName());
    }


    public void status(){
        System.out.println("* Gondola Status\n" +
                " * ------- -----------------------");
        for(int i = 0; i < 18; i++){
            System.out.println((i+1) + " " + ferrisWheel.get(i));
        }
    }

}
