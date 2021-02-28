package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicValTest {

    @Test
    void shouldSetToDynamicValTo0(){
        byte[] exceptedResult = {0x7E, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setValForDynamicMode(0);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
}
