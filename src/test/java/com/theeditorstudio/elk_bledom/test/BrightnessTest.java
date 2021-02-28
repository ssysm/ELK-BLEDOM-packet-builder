package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.exceptions.BrightnessViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BrightnessTest {

    @Test
    void shouldChangeBrightnessTo100() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x01, 0x64, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setBrightness(100);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeBrightnessTo50() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x01, 0x32, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setBrightness(50);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeBrightnessTo0() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setBrightness(0);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeBrightnessTo150AndThrowException() {
        Exception exception = Assertions.assertThrows(BrightnessViolationException.class, () -> Controller.setBrightness(150));
        String expectedMessage = "more than 100%";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldChangeBrightnessToNeg50AndThrowException() {
        Exception exception = Assertions.assertThrows(BrightnessViolationException.class, () -> Controller.setBrightness(-50));
        String expectedMessage = "lower than 0%";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
