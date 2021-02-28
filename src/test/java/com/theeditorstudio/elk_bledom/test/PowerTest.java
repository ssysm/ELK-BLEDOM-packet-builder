package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.enums.StateEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTest {

    @Test
    void shouldPowerOffLED(){
        byte[] exceptedResult = {0x7E, 0x00, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setPower(StateEnum.OFF);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldTurnOnLED(){
        byte[] exceptedResult = {0x7E, 0x00, 0x04, 0x10, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setPower(StateEnum.ON);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

}
