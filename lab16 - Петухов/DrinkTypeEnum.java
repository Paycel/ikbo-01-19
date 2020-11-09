package com.company;

public enum DrinkTypeEnum {
    BEER("alcohol"),
    WINE("alcohol"),
    VODKA("alcohol"),
    BRANDY("alcohol"),
    CHAMPAGNE("alcohol"),
    WHISKEY("alcohol"),
    TEQUILA("alcohol"),
    RUM("alcohol"),
    VERMUTH("alcohol"),
    LIQUOR("alcohol"),
    JAGERMEISTER("alcohol"),
    JUICE("alcohol"),
    COFFEE("non-alcohol"),
    GREEN_TEA("non-alcohol"),
    BLACK_TEA("non-alcohol"),
    MILK("non-alcohol"),
    WATER("non-alcohol"),
    SODA("non-alcohol");
    private String drink;

    DrinkTypeEnum(String drink) {
        this.drink = drink;
    }

    public boolean isAlcohol(){
        return drink.equals("alcohol");
    }
}
