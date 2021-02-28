package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrayscaleTest {
    @Test
    void shouldChangeToGrayscale(){
        byte[] exceptedResult = {0x7E, 0x00, 0x03, 0x00, 0x01, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeGrayscale();
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
}
