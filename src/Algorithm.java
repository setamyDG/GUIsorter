import java.util.ArrayList;

public class Algorithm {
    public Algorithm() {
    }

    public ArrayList<Integer> insertionSort(ArrayList<Integer> numbers, int threadID) {
        for(int i = 1; i < numbers.size(); ++i) {
            int j = i;

            int v;
            for(v = (Integer)numbers.get(i); j > 0 && (Integer)numbers.get(j - 1) > v; --j) {
                numbers.set(j, (Integer)numbers.get(j - 1));
            }

            numbers.set(j, v);
            Sorter.setProgressBars(threadID, (double)i / (double)numbers.size());
        }

        return numbers;
    }
}
