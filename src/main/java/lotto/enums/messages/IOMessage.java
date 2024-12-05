package lotto.enums.messages;

public enum IOMessage implements SystemMessage {
    INPUT_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    INPUT_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),

    INPUT_Y_N_TO_ONE_MORE_FREE("현재 %s은(는) 1개를 무료로 더 받을 수 있습니다. 추가하시겠습니까? (Y/N)"),
    INPUT_Y_N_TO_LACK_OF_QUANTITY("현재 %s %d개는 프로모션 할인이 적용되지 않습니다. 그래도 구매하시겠습니까? (Y/N)"),

    PRINT_STATISTIC_MESSAGE("당첨 통계."),
    PRINT_DELIMITER("---"),
    PRINT_TOTAL_RETURN_RATE("총 수익률은 %.1f%%입니다.");

    private final String message;

    IOMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
