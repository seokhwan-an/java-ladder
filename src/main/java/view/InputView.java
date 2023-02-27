package view;

import java.util.List;
import java.util.Scanner;
import validation.InputValidator;

public class InputView {

    private static final String DELIMITER = ",";
    private static final String PLAYER_NAME_INPUT_GUIDE_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String LADDER_HEIGHT_INPUT_GUIDE_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final String PRIZE_NAME_INPUT_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String WANTED_RESULT_PLAYER_INPUT = "결과를 보고 싶은 사람은?";

    private final Scanner scanner = new Scanner(System.in);
    private final InputValidator inputValidator = new InputValidator();

    public List<String> readPlayerName() {
        printPlayerNameInputGuideMessage();

        String playerName = scanner.nextLine();

        inputValidator.validateNullOrBlankInput(playerName);
        return List.of(playerName.split(DELIMITER));
    }

    public int readLadderHeight() {
        printLadderHeightGuideMessage();

        String ladderHeight = scanner.nextLine();

        inputValidator.validateLadderHeightInput(ladderHeight);
        return Integer.parseInt(ladderHeight);
    }

    public List<String> readPrizeName() {
        printPrizeNameInputGuideMessage();

        String prizeName = scanner.nextLine();

        inputValidator.validateNullOrBlankInput(prizeName);
        return List.of(prizeName.split(DELIMITER));
    }

    public String readWantedResultPlayer() {
        printWantedResultPlayerInputGuideMessage();

        String playerName = scanner.nextLine();

        inputValidator.validateNullOrBlankInput(playerName);

        return playerName.trim();
    }

    private void printPlayerNameInputGuideMessage() {
        System.out.println(PLAYER_NAME_INPUT_GUIDE_MESSAGE);
    }

    private void printLadderHeightGuideMessage() {
        System.out.println();
        System.out.println(LADDER_HEIGHT_INPUT_GUIDE_MESSAGE);
    }

    private void printPrizeNameInputGuideMessage() {
        System.out.println();
        System.out.println(PRIZE_NAME_INPUT_MESSAGE);
    }

    private void printWantedResultPlayerInputGuideMessage() {
        System.out.println();
        System.out.println(WANTED_RESULT_PLAYER_INPUT);
    }
}
