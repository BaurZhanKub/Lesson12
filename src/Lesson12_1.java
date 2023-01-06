public class Lesson12_1 {


    public static void main(String[] args) {
        printResult();
    }

    static void printResult() {
        chooseAction.chooseAction("Начало дня");
        new printResultActionList(chooseAction.resultActionList);
        System.out.println(chooseAction.badIndex);
        System.out.println(chooseAction.lickyIndex);
        System.out.println("Получилось");
    }
}

