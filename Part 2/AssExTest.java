public class AssExTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("///// DOGS TO TEST INSERT TAIL METHOD /////");

        AssessmentSLL dogs = new AssessmentSLL();

        dogs.insertTail("pug");
        dogs.insert("border collie");

        System.out.println(" ");
        System.out.println("Insert pug and border collie:");
        System.out.println("-----------------------------");
        dogs.printFirstToLast();

        dogs.insertTail("greyhound");
        dogs.insert("yorkshire terrier");

        System.out.println(" ");
        System.out.println("Insert yorkshire terrier at head and greyhound at tail:");
        System.out.println("-------------------------------------------------------");
        dogs.printFirstToLast();

        System.out.println(" ");
        System.out.println("///// ANIMALS TO TEST DELETE ALTERNATE METHOD /////");

        AssessmentSLL animals = new AssessmentSLL();

        animals.insertTail("ant");
        animals.insertTail("badger");
        animals.insertTail("cat");
        animals.insertTail("dog");
        animals.insertTail("elephant");
        animals.insertTail("rat");

        System.out.println(" ");
        System.out.println("Create list of animals:");
        System.out.println("-----------------------");
        animals.printFirstToLast();

        animals.deleteAlternate();

        System.out.println(" ");
        System.out.println("Delete alternates from list of animals:");
        System.out.println("---------------------------------------");
        animals.printFirstToLast();

        System.out.println(" ");
        System.out.println("///// NUMBERS TO TEST MERGE METHOD /////");

        AssessmentSLL list1 = new AssessmentSLL();

        list1.insertTail("7");
        list1.insertTail("8");
        list1.insertTail("9");

        System.out.println(" ");
        System.out.println("Create first list of numbers:");
        System.out.println("-----------------------------");
        list1.printFirstToLast();

        AssessmentSLL list2 = new AssessmentSLL();

        list2.insertTail("6");
        list2.insertTail("7");
        list2.insertTail("8");

        System.out.println(" ");
        System.out.println("Create second list of numbers:");
        System.out.println("------------------------------");
        list2.printFirstToLast();

        AssessmentSLL list3 = new AssessmentSLL();
        list3.insertTail("4");
        list3.insertTail("5");
        list3.insertTail("6");

        System.out.println(" ");
        System.out.println("Create third list of numbers:");
        System.out.println("------------------------------");
        list3.printFirstToLast();

        System.out.println(" ");
        System.out.println("Prints merged lists:");
        System.out.println("-----------------------------");
        list3 = list3.merge(list1, list2);
        list3.printFirstToLast();
    }
}
