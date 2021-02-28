package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.exceptions.BrightnessViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColorRGBTest {
    @Test
    void shouldChangeRGBTor255g255b255() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x03, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForRGBMode(255,255,255);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeRGBTor0g255b255() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x03, (byte) 0x00, (byte) 0xff, (byte) 0xff, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForRGBMode(0,255,255);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeRGBTor0g0b255() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x03, (byte) 0x00, (byte) 0x00, (byte) 0xff, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForRGBMode(0,0,255);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeRGBTor255g255b0() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x03, (byte) 0xff, (byte) 0xff, (byte) 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForRGBMode(255,255,0);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeRGBTor255g0b255() throws BrightnessViolationException {
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x03, (byte) 0xff, (byte) 0x00, (byte) 0xff, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForRGBMode(255,0,255);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
}
