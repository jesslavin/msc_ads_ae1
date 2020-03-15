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

        AssessmentSLL<String> numbers1 = new AssessmentSLL<String>();

        numbers1.insertTail("1");
        numbers1.insertTail("2");
        numbers1.insertTail("3");

        System.out.println(" ");
        System.out.println("Create first list of numbers:");
        System.out.println("-----------------------------");
        numbers1.printFirstToLast();

        AssessmentSLL<String> numbers2 = new AssessmentSLL<String>();

        numbers2.insertTail("3");
        numbers2.insertTail("4");
        numbers2.insertTail("5");

        System.out.println(" ");
        System.out.println("Create second list of numbers:");
        System.out.println("------------------------------");
        numbers2.printFirstToLast();

        AssessmentSLL<String>mergeList = new AssessmentSLL<String>().merge(numbers1, numbers2);
        System.out.println(" ");
        System.out.println("Prints merged list:");
        System.out.println("-----------------------------");
        mergeList.printFirstToLast();

    }
}
