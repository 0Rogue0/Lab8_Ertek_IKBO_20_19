package Lists;

public class Test {
    public static void main(String[] args) {
        System.out.println("1FIRST1 ------ 1 ------ 1FIRST1");

        WaitList<Integer> list = new WaitList<>();

        System.out.println(list);
        System.out.println("isEmpty?   " + list.isEmpty());

        list.add(9);
        list.add(1);
        list.add(0);
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(41);

        System.out.println(list);
        System.out.println("isEmpty?   " + list.isEmpty());

        list.remove();
        list.remove();
        list.remove();

        System.out.println(list);

        System.out.println("2SECOND2 ------ 2 ------ 2SECOND2");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(9);

        System.out.println(list2);
        System.out.println("isEmpty?   " + list2.isEmpty());

        list2.add(9);
        list2.add(1);
        list2.add(0);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(9);
        list2.add(1);
        list2.add(41);

        System.out.println(list2);
        System.out.println("isEmpty?   " + list2.isEmpty());

        list2.remove();
        list2.remove();
        list2.remove();

        System.out.println(list2);

        System.out.println("3THIRD3 ------ 3 ------ 3THIRD3");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();

        System.out.println(list3);
        System.out.println("isEmpty?   " + list3.isEmpty());

        list3.add(9);
        list3.add(1);
        list3.add(0);
        list3.add(6);
        list3.add(2);
        list3.add(6);
        list3.add(9);
        list3.add(1);
        list3.add(41);

        System.out.println(list3);
        System.out.println("isEmpty?   " + list3.isEmpty());

        list3.remove(1);
        list3.remove(6);
        list3.remove(9);

        System.out.println(list3);
    }
}
