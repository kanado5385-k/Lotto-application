package lotto.enums.messages;

import lotto.enums.constants.LottoConstants;

public enum ErrorMessage implements SystemMessage {
    INVALID_INPUT_MONEY_UNIT("입력하신 금액의 단위가"
        + LottoConstants.LTTO_PRICE.getLottoPrice() 
        + "아닙니다. 다시 입력해 주세요."),
    INVALID_INT_NUMBER("숫자가 아닌 것이 입력 되었습니다. 다시 시도해주세요."),
    INVALID_INPUT_MONEY("입력하신 금액이 0원 이상이여야합니다. 다시 시도해주세요."),
    INVALID_LOTTO_QUANTITY("로또 번호는 6개여야 합니다. 다시 시도 해보겠습니다."),  
    NOT_NATURAL_NUMBER("자연수가 아닌 숫자입니다. 다시 시도해주세요."),
    INVALID_WINNING_NUMBERS_QUANTITY("입력하신 당첨 번호 수량이 6개가 아닙니다. 다시 시도해주세요."),
    INVALID_WINNING_NUMBER("입력하신 당첨 번호 중에 1~45 범위를 벗어난 숫자가 있습니다. 다시 시도해주세요."),
    DUPLICATE_WINNING_NUMBER("입력하신 당첨 번호 중에 중복이 있습니다. 다시 시도해주세요."),
    INVALID_BONUS_NUMBER("입력하신 보너스 번호가 1~45 범위를 벗어났습니다. 다시 시도해주세요."),
    DUPLICATE_BONUS_NUMBER("입력하신 보너스 번호가 당첨 번호들과 중복이 있습니다. 다시 시도해주세요.");

    private static final String ERROR_LOG_LEVEL = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return ERROR_LOG_LEVEL + message;
    }
}
