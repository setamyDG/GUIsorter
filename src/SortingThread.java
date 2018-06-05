import java.io.*;
import java.util.ArrayList;

public class SortingThread extends Thread {

    private Algorithm algorithm;
    private int threadID;

    public SortingThread(int i) {
        this.threadID = i;
        this.algorithm = new Algorithm();
    }

    public void run()
    {
        try {

            while (!ChooseFileButton.files.isEmpty())
            {
                File fileNow = ChooseFileButton.files.take();
                ArrayList<Integer> sortedNumbers = algorithm.insertionSort(getNumbersFromFile(fileNow), this.threadID);
                saveFile(sortedNumbers, fileNow.getName());
            }
            Sorter.setProgressBars(threadID, 1);
            Menu.progressBars.get(threadID).setOpacity(0.5);
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    public ArrayList<Integer> getNumbersFromFile(File fileToExtract) {

        ArrayList<Integer> numbersTemp = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileToExtract));
            String line;
            while ((line = in.readLine()) != null)
                numbersTemp.add(Integer.parseInt(line));
            in.close();
        } catch (Exception e) {
            System.out.println("Error parsing file to ArrayList<Integer> daya type");
        }
        return numbersTemp;
    }

    public void saveFile(ArrayList<Integer> sorted, String fileName) {
        try {
            File f = new File(Menu.savePath.getText() + "\\" + fileName );
            if (f.getParentFile().exists())
            {
                f.getParentFile().mkdirs();
            }
            f.createNewFile();
            PrintWriter writer = new PrintWriter(f);
            for (Integer number : sorted)
                writer.println(number);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


