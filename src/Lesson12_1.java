public class Lesson12_1 {


    public static void main(String[] args) {
        printResult();
    }

    static void printResult() {
        chooseAction.chooseAction("Начало дня");
        new printResultActionList(chooseAction.resultActionList);
        String result = chooseAction.lickyIndex>chooseAction.badIndex ? "Ден был хороший " : "День не задолся";
        System.out.println(result);
    }
}

