package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(0, 1, 2);

        System.out.println(set1 + " " + set2);
        System.out.println("Symmetric difference: " + symmetricDifference(set1,set2));

    }

    private static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        Set<Integer> difference = new HashSet<>();
        difference.addAll(set1);
        difference.addAll(set2);
        difference.removeAll(intersection);
        return difference;
    }
}