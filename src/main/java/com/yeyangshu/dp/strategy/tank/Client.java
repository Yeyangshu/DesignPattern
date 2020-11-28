package com.yeyangshu.dp.strategy.tank;

import java.util.Arrays;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 10:25
 */
public class Client {

    public static void main(String[] args) {
        // int[] a = {9, 2, 3, 5, 7, 1, 4};
        Cat[] cats1 = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        Cat[] cats2 = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        Dog[] dogs = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter<Cat> catSorterHeight = new Sorter<>();
        Sorter<Cat> catSorterWeight = new Sorter<>();
        Sorter<Dog> dogSorter = new Sorter<>();
        catSorterHeight.sort(cats1, new CatHeightComparator());
        catSorterWeight.sort(cats2, new CatWeightComparator());
        dogSorter.sort(dogs, new DogComparator());
//        sorter.sort(a, (o1, o2) -> {
//            if (o1.weight < o2.weight) {
//                return -1;
//            } else if (o1.weight > o2.weight) {
//                return 1;
//            } else {
//                return 0;
//            }
//        });
        System.out.println(Arrays.toString(cats1));
        System.out.println(Arrays.toString(cats2));
        System.out.println(Arrays.toString(dogs));
    }

}
