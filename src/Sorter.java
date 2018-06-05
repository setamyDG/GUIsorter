import java.util.ArrayList;
import java.util.List;

public class Sorter {

    public List<SortingThread> threadsSorting;

    public void createThreads() {
        this.threadsSorting = new ArrayList<SortingThread>();

        for (int i = 0; i<4 ; i++)
        {
            this.threadsSorting.add(i, new SortingThread(i));
        }
    }

    public void startThreads()
    {
        for (SortingThread s : this.threadsSorting)
        {
            s.start();
        }
    }

    public static void setProgressBars(int id, double progress)
    {
        Menu.progressBars.get(id).setProgress(progress);
    }
}
