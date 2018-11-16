public class sortRace {
    int [] tobeSorted;

    /**
     * Will construct an array of integers to be sorted the range of random numbers and the length of the array is to be determined
     * @param arrayLength will make the array as long as desired
     * @param numberrange the random numbers in the array places ranges is to be desired the range should be between 1 and the desired number range
     */
    public sortRace(int arrayLength, int numberrange){
        tobeSorted = new int[arrayLength];
        for(int i = 0;i<tobeSorted.length;i++){
            tobeSorted[i] = (int)(Math.random() * numberrange) + 1;
        }
    }

    /**
     *
     * @param list
     */
    public static void insertionSort(int[] list){

    }

    /**
     *
     * @param list
     */
    public static void selectionSort(int[] list){
        int swapPos = 0;
        int currentMin = 0;

        for(int index = 0;index < list.length; index++){
            swapPos = index;
            currentMin = list[index];

            for(int index2 = 0;index2 < list.length; index2++){
                if(list[index2] < currentMin){
                    swapPos = index2;
                    currentMin = list[index2];
                }
            }
            swap(list,index,swapPos);
        }
    }

    /**
     *
     * @param list
     */
    public static void bubbleSort(int[] list){
        int numOfSwaps = 1;
        while(numOfSwaps != 0){
            numOfSwaps = 0;
            for(int index = 0;index < list.length; index++){
                if(list[index] < list[index + 1]){
                    swap(list,list[index],list[index + 1]);
                    numOfSwaps++;
                }
            }
        }
    }

    public static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos2];
        arr[pos2] = arr[pos1];
        arr[pos1] = temp;
    }
}
