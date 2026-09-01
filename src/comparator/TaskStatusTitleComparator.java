package comparator;

import model.Task;

import java.util.Comparator;

public class TaskStatusTitleComparator implements Comparator<Task>{
    @Override
    public int compare (Task o1, Task o2){
        int compareStatus = o1.getTaskStatus().compareTo(o2.getTaskStatus());
        if(compareStatus != 0){
            return compareStatus;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
