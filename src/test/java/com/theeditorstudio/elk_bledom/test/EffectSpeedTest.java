package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.exceptions.SpeedViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EffectSpeedTest {
    @Test
    void shouldChangeSpeedTo100() throws SpeedViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x02, 0x64, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setEffectSpeed(100);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeSpeedTo50() throws SpeedViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x02, 0x32, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setEffectSpeed(50);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeSpeedTo0() throws SpeedViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setEffectSpeed(0);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeSpeedTo150AndThrowException() {
        Exception exception = Assertions.assertThrows(SpeedViolationException.class, () -> Controller.setEffectSpeed(150));
        String expectedMessage = "more than 100%";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldChangeSpeedToNeg50AndThrowException() {
        Exception exception = Assertions.assertThrows(SpeedViolationException.class, () -> Controller.setEffectSpeed(-50));
        String expectedMessage = "lower than 0%";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
