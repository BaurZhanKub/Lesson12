import java.util.Random;

public class chooseAction {
    static Random random = new Random();
    static int index = 0;
    static int lickyIndex = 0;
    static int badIndex = 0;
    static String[] resultActionList = new String[15];
    static String[] variants = {
            "Начало дня",
            "Поднимаюсь с кровати с левой ноги",
            "Поднимаюсь с кровати с правой ноги",
            "Падаю с кровати",
            "Пробежка по аллее",
            "Физ. зарядка на балконе",
            "Варю крепкий кофе",
            "Готовлю плотный завтрак",
            "Достаю вчерашний салат",
            "Спустило колесо",
            "Добираюсь на работу пешком",
            "Добираюсь на работу на маршрутке",
            "Добираюсь на работу на своем авто",
            "Прихожу вовремя",
            "Опаздываю на работу",
            "Конец"
    };

    public static int chooseVariant(int i, int i1) {
        int x = random.nextInt(i1) + 1 <= i ? 1 : 2;
        return x;
    }

    public static boolean actionListIf(int i, int b) {
        boolean result = chooseVariant(i, b) == 1 ? true : false;
        return result;
    }

    public static int actionList(int[] b) {
        if (chooseVariant(b[0], b[1]) == 1) {
            return b[4];
        } else {
            if (chooseVariant(b[2], b[3]) == 1) {
                return b[5];
            } else {
                return b[6];
            }
        }
    }

    public static void setResultActionList(String resultActionUser) {
        resultActionList[index] = resultActionUser;
        index++;
    }

    static void chooseAction(String previousAction) {
        int[] optionsForAction = new int[7];
        switch (previousAction) {
            case "Начало дня":
                previousAction = (chooseVariant(1, 2) == 1) ? variants[1] : variants[2];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                break;
            case "Поднимаюсь с кровати с левой ноги":
                optionsForAction = new int[]{7, 10, 4, 6, 3, 4, 5};
                previousAction = variants[actionList(optionsForAction)];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                badIndex++;
                break;
            case "Поднимаюсь с кровати с правой ноги":
                previousAction = (chooseVariant(4, 6) == 1) ? variants[4] : variants[5];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Падаю с кровати":
                optionsForAction = new int[]{8, 12, 1, 4, 6, 7, 8};
                previousAction = variants[actionList(optionsForAction)];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                badIndex++;
                break;
            case "Пробежка по аллее":
                optionsForAction = new int[]{8, 12, 1, 4, 6, 7, 8};
                previousAction = variants[actionList(optionsForAction)];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Физ. зарядка на балконе":
                optionsForAction = new int[]{8, 12, 1, 4, 6, 7, 8};
                previousAction = variants[actionList(optionsForAction)];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Варю крепкий кофе":
                previousAction = (chooseVariant(2, 5) == 1) ? variants[9] : variants[12];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Готовлю плотный завтрак":
                previousAction = (chooseVariant(2, 5) == 1) ? variants[9] : variants[12];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Достаю вчерашний салат":
                previousAction = (chooseVariant(2, 5) == 1) ? variants[9] : variants[12];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                badIndex++;
                break;
            case "Спустило колесо":
                previousAction = (chooseVariant(2, 8) == 1) ? variants[10] : variants[11];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                badIndex++;
                break;
            case "Добираюсь на работу пешком":
                previousAction = variants[chooseVariant(2, 8) == 1 ? 13 : 14];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                badIndex++;
                break;
            case "Добираюсь на работу на маршрутке":
                previousAction = variants[chooseVariant(1, 2) == 1 ? 13 : 14];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Добираюсь на работу на своем авто":
                previousAction = variants[chooseVariant(5, 8) == 1 ? 13 : 14];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Прихожу вовремя":
                previousAction = variants[15];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                lickyIndex++;
                break;
            case "Опаздываю на работу":
                previousAction = variants[15];
                setResultActionList(previousAction);
                chooseAction(previousAction);
                badIndex++;
                break;
            default:
                break;

        }

    }


}

