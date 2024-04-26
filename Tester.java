package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

class ArrayToList {
    public static List<String> convertToList(String[] inputArray) {
        if (inputArray == null) {
            System.out.println("Error: Input array is null.");
            return null;
        }
        
        List<String> resultList = new ArrayList<>();
        if (inputArray.length == 0) {
            System.out.println("Warning: Input array is empty.");
            return resultList;
        }

        for (String element : inputArray) {
            resultList.add(element);
        }
        return resultList;
    }
}

class Tester {
    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "orange", "grape"};
        List<String> resultList = ArrayToList.convertToList(inputArray);
        System.out.println("Result List: " + resultList);

        String[] emptyArray = {};
        List<String> emptyResultList = ArrayToList.convertToList(emptyArray);
        System.out.println("Result List (Empty Array): " + emptyResultList);

        String[] nullArray = null;
        List<String> nullResultList = ArrayToList.convertToList(nullArray);
        System.out.println("Result List (Null Array): " + nullResultList);
    }
}
