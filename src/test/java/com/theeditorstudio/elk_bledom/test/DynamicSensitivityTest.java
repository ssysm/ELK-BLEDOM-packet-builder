package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicSensitivityTest {

    @Test
    void shouldSetDynamicSensitivityTo0(){
        byte[] exceptedResult = {0x7E, 0x00, 0x07, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setSensitivityForDynamicMode(0);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

}
