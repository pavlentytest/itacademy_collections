package ru.samsung.itschool.mdev;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Collection
        List-ы (Списки)
        ArrayList, LinkedList, Stack, Queue
        - упорядоченное множество. У каждого элемента есть номер.

        ArrayList - дин. список
        LinkedList - двухсвязн. список
        Stack - LIFO (Last in First out)
        Queue - FIFO (First in First out)

         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("New");
        arrayList.add("Test");
        arrayList.add(0,"RRR");

        String val = arrayList.get(0);

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s);
            queue.offer(s);
        }
        while(!stack.isEmpty()) {
            // печатем с конца элемент и удаляем
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        while(!queue.isEmpty()) {
            // печатаем сначала и удаляем
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList1.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList add to end  " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList1.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to end " + (endTime-startTime));


        // Добавляем в начало списков

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList1.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList add to begin  " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList1.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to begin " + (endTime-startTime));

        // ----------------------------------------------------------------

     /*   startTime = System.nanoTime();
        for(int i=50000;i<150000;i++) {
            arrayList1.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList get " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=50000;i<150000;i++) {
            linkedList1.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get " + (endTime-startTime));
*/

        List<String> list = new ArrayList<>();

        for(String s: list) System.out.println(s);

        int[] x = {34534,4,4,453,77,78,9,890};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        List<String> bbb = new ArrayList<>();
        Collections.addAll(bbb,"dfg","sdfgd","d","dfgdfgdf");

        List<Double> t = new ArrayList<>();
        Collections.addAll(t,5.5,7.8);
        Double[] t_ = t.toArray(new Double[t.size()]);
        System.out.println(Arrays.toString(t_));

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Petr");
        names.add("Maria");
        names.add("Anna");
        names.add("Anna");
        names.add("Anna");

        Collections.sort(names);

        class Student implements Comparable<Student>{
            private String name;
            private int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Student o) {
                return this.age - o.age;
            }
        }

        List<Student> student = new ArrayList<>();
        student.add(new Student("Ivan",-12));
        student.add(new Student("Petr",20));
        student.add(new Student("Maria",-18));
        student.add(new Student("Anna",16));

        Comparator<Student> rule = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               // return o2.age - o1.age;
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(student);
        for(Student s: student) System.out.println(s.age + " " + s.name);


        /*
        Set-ы (Множества)
        Неповторяющиеся (уникальные)
        Реализации:
        TreeSet, HashSet, SortedSet
         */

        TreeSet<String> treeSet = new TreeSet<>(names);

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        Деревья - структура данных в виде графа
        Корень дерева - самый верхний узел
        Ребро дерева - связь между узлами
        Потомок (ребенок) - узел, у которого есть родитель
        Лист - узел, у которого нет потомков
        Высота дерева - длина самого длиного пути к листу
        Глубина листа - длина пути к корню

        Бинарное дерево - дерево, у в котором у каждого узла не более 2 детей
        Полное бинарное дерево - у каждого узла ровно 2 потомка
        Сбалансированное бин. дерево - когда для каждой вершины поддеревьев высота не более 1

         */

        class User {
            private String name;
            private int mark;

            public User(String name, int mark) {
                this.name = name;
                this.mark = mark;
            }
        }

        int base = 50;
        TreeSet<User> users = new TreeSet<>();
        users.add(new User("Ivan",40));
        users.add(new User("Petr",89));
        users.add(new User("Maria",20));
        users.add(new User("Olga",36));
        users.add(new User("Max",61));


    }
}
