package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.BonusService;

public class BonusServiceTest {



    @Test
    void calculateBonus(){
        BonusService service = new BonusService();

        int amount = 2000;

        int actual = service.calculateBonus(amount);
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}
