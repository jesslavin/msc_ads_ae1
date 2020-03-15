public class AssExTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("///// DOGS TO TEST INSERT TAIL METHOD /////");

        AssessmentSLL<String> dogs = new AssessmentSLL<String>();

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

        AssessmentSLL<String> animals = new AssessmentSLL<String>();

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

        AssessmentSLL<String> list1 = new AssessmentSLL<String>();

        list1.insertTail("7");
        list1.insertTail("8");
        list1.insertTail("9");

        System.out.println(" ");
        System.out.println("Create first list of numbers:");
        System.out.println("-----------------------------");
        list1.printFirstToLast();

        AssessmentSLL<String> list2 = new AssessmentSLL<String>();

        list2.insertTail("4");
        list2.insertTail("5");
        list2.insertTail("6");

        System.out.println(" ");
        System.out.println("Create second list of numbers:");
        System.out.println("------------------------------");
        list2.printFirstToLast();

        AssessmentSLL<String>list3 = new AssessmentSLL<String>().merge(list1, list2);
        list3.insertTail("1");
        list3.insertTail("2");
        list3.insertTail("3");
        System.out.println(" ");
        System.out.println("Prints merged list:");
        System.out.println("-----------------------------");
        list3.printFirstToLast();

    }
}
