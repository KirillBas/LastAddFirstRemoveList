package ru.basharin;

public class Main {
    public static void main(String[] args) {
        FirstAddLastRemoveList mal = new FirstAddLastRemoveList(4);
        mal.add(1);
        mal.add(2);
        mal.add(3);
        mal.add(4);
        mal.add(5);
        mal.add(6);
        mal.add(7);

        for (int i =0; i<mal.getSize(); i++) {
            System.out.println(mal.getIndex(i));
        }

        System.out.println("========");

        System.out.println(mal.getValue(7));
        System.out.println("========");
    }
}
