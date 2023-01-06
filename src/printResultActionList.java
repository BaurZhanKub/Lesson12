public class printResultActionList {
    public printResultActionList(String[] resultActionList) {
        System.out.println(" # " + "|" + "  Действие ");
        System.out.println("---|-----------------------------------");
        for (int i = 0; i < resultActionList.length; i++) {
            if (resultActionList[i] == null) {
                break;
            } else {
                System.out.printf(" %d | %s \n", i + 1, resultActionList[i]);
            }
        }
    }
}
