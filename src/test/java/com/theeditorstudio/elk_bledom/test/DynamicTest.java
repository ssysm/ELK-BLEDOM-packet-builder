package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicTest {

    @Test
    void shouldSetToDynamic(){
        byte[] exceptedResult = {0x7E, 0x00, 0x03, 0x00, 0x04, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeDynamicExternalMic();
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
}
