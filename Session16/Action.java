package Session16;

import java.time.LocalDateTime;

public class Action {
    String description;
    LocalDateTime time;

    public Action(String description ){
        this.description = description;
        this.time = LocalDateTime.now(); ;
    }

    @Override
    public String toString(){
        return time + " - " + description;
    }
}
