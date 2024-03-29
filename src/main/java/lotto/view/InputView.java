package lotto.view;

import lotto.domain.NumberException;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int inputPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        try {
            return Integer.parseInt(SCANNER.nextLine().replaceAll(" ", ""));
        } catch (NumberFormatException e) {
            throw new NumberException();
        }
    }

    public static String inputWinningLotto() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return SCANNER.nextLine().replaceAll(" ", "");
    }

    public static int inputBonusNumber() {
        System.out.println("보너스 볼을 입력해주세요.");
        try {
            return Integer.parseInt(SCANNER.nextLine().replaceAll(" ", ""));
        } catch (NumberFormatException e) {
            throw new NumberException();
        }
    }

    public static int inputManualPurchaseCount() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        try {
            return Integer.parseInt(SCANNER.nextLine().replaceAll(" ", ""));
        } catch (NumberFormatException e) {
            throw new NumberException();
        }
    }

    public static String inputManualLottoNumbers() {
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
        return SCANNER.nextLine().replaceAll(" ", "");
    }
}
