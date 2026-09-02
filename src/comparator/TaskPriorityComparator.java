package comparator;

import model.Task;
import model.TaskStatus;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        boolean firstIsDone = (o1.getTaskStatus() == TaskStatus.DONE);
        boolean secondIsDone = (o2.getTaskStatus() == TaskStatus.DONE);
        if (firstIsDone && !secondIsDone) {
            return 1;
        }
        if (!firstIsDone && secondIsDone) {
            return -1;
        }
        int priorityCompare = Integer.compare(o1.getPriority(), o2.getPriority());
        if (priorityCompare != 0) {
            return priorityCompare;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
