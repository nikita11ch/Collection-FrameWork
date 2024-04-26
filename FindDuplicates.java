package CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    private List<Integer> numberList;

    public FindDuplicates(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public FindDuplicates() {
        this.numberList = new ArrayList<>();
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getDuplicatesList() {
        if (numberList == null || numberList.isEmpty()) {
            return null;
        }

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicatesSet = new HashSet<>();
        List<Integer> duplicatesList = new ArrayList<>();

        for (Integer num : numberList) {
            if (!uniqueElements.add(num)) {
                // If the element is already in the set, it's a duplicate
                duplicatesSet.add(num);
            }
        }

        // Convert set of duplicates to list
        duplicatesList.addAll(duplicatesSet);

        return duplicatesList;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(33);
        l1.add(45);
        l1.add(67);
        l1.add(89);
        l1.add(33);
        l1.add(47);
        l1.add(21);
        l1.add(45);
        FindDuplicates fd1 = new FindDuplicates(l1);
        System.out.println("Duplicates in l1: " + fd1.getDuplicatesList());

        List<Integer> l2 = new ArrayList<>();
        l2.add(66);
        l2.add(66);
        l2.add(77);
        l2.add(66);
        l2.add(66);
        FindDuplicates fd2 = new FindDuplicates(l2);
        System.out.println("Duplicates in l2: " + fd2.getDuplicatesList());

        FindDuplicates fd3 = new FindDuplicates();
        System.out.println("Duplicates in empty list: " + fd3.getDuplicatesList());
    }
}
