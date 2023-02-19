package view;

import domain.Line;
import domain.Players;

import java.util.List;

public class OutputView {
    public static final String FIRST_FORMAT = "%-5s";
    public static final String MIDDLE_FORMAT = "%6s";
    public static final String LAST_FORMAT = "%5s";
    public static final String VERTICAL_BAR = "|";

    private static void middlePlayersPrint(List<String> names, int index) {
        if (isMiddlePlayer(names, index)) {
            System.out.print(String.format(MIDDLE_FORMAT, names.get(index)));
        }
    }

    private static boolean isMiddlePlayer(List<String> names, int index) {
        return 0 < index && index < names.size() - 1;
    }

    public void printNames(Players players) {
        List<String> names = players.getPlayersName();
        for (int i = 0; i < names.size(); i++) {
            firstPlayerPrint(names, i);
            lastPlayerPrint(names, i);
            middlePlayersPrint(names, i);
        }
    }

    private void firstPlayerPrint(List<String> names, int index) {
        if (isFirstPlayer(index)) {
            System.out.print(String.format(FIRST_FORMAT, names.get(index)));
        }
    }

    private static boolean isFirstPlayer(int i) {
        return i == 0;
    }

    private void lastPlayerPrint(List<String> names, int index) {
        if (isLastPlayer(names, index)) {
            System.out.print(String.format(LAST_FORMAT, names.get(index)));
        }
    }

    private static boolean isLastPlayer(List<String> names, int index) {
        return index == names.size() - 1;
    }

    public void printLadders(List<Line> lines) {
        System.out.println();
        for (Line line : lines) {
            printLine(line);
        }
    }

    private void printLine(Line line) {
        List<String> ladders = BlockType.getBlockTypes(line);
        System.out.println("    " + VERTICAL_BAR + String.join(VERTICAL_BAR, ladders) + VERTICAL_BAR);
    }
}
