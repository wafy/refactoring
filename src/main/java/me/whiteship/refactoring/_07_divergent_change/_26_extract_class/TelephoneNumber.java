package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {
    private String areaCode;
    private String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }


    public String getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return this.areaCode + " "+ this.number;
    }
}
