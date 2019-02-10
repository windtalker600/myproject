package com.max.lottery;


import java.util.HashSet;
import java.util.Set; //按Alt+Enter可以新增import

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate(); //有abstract表示繼承的人要自己實作喔!!
    public boolean validate() {
        if (numbers.size() == numberCount )
            return true;
        else
            return false;
    }
}
