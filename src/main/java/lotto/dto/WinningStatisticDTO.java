package lotto.dto;

public class WinningStatisticDTO {
    private final Integer firstPlace;
    private final Integer secondPlace;
    private final Integer thirdPlace;
    private final Integer fourthPlace;
    private final Integer fifthPlace;

    public WinningStatisticDTO(Integer firstPlace, Integer secondPlace, 
        Integer thirdPlace, Integer fourthPlace, Integer fifthPlace) {
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
        this.fourthPlace = fourthPlace;
        this.fifthPlace = fifthPlace;
    }

    public Integer getFirstPlace() {
        return this.firstPlace;
    }

    public Integer getSecondPlace() {
        return this.secondPlace;
    }

    public Integer getThirdPlace() {
        return this.thirdPlace;
    }

    public Integer getFourthPlace() {
        return this.fourthPlace;
    }

    public Integer getFifthPlace() {
        return this.fifthPlace;
    }
}
