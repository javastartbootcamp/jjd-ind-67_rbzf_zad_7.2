package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int elementNumber = inputArray.length;
        int compareCount = 0;
        while (elementNumber > 1) {
            int swapCount = 0;
            for (int i = 0; i < elementNumber - 1; i++) {
                compareCount++;
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0) {
                break;
            }
            elementNumber--;
        }
        return compareCount;
    }
}

