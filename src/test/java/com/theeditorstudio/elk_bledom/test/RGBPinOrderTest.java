package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.enums.RGBPinOrderEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RGBPinOrderTest {

    @Test
    void shouldSetToRGB(){
        byte[] exceptedResult = {0x7E, 0x00, (byte) 0x81, 0x10, 0x20, 0x30, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setRGBPinOrder(RGBPinOrderEnum.RGB);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldSetToRBG(){
        byte[] exceptedResult = {0x7E, 0x00, (byte) 0x81, 0x10, 0x30, 0x20, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setRGBPinOrder(RGBPinOrderEnum.RBG);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldSetToGRB(){
        byte[] exceptedResult = {0x7E, 0x00, (byte) 0x81, 0x20, 0x10, 0x30, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setRGBPinOrder(RGBPinOrderEnum.GRB);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldSetToGBR(){
        byte[] exceptedResult = {0x7E, 0x00, (byte) 0x81, 0x20, 0x30, 0x10, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setRGBPinOrder(RGBPinOrderEnum.GBR);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldSetToBRG(){
        byte[] exceptedResult = {0x7E, 0x00, (byte) 0x81, 0x30, 0x10, 0x20, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setRGBPinOrder(RGBPinOrderEnum.BRG);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldSetToBGR(){
        byte[] exceptedResult = {0x7E, 0x00, (byte) 0x81, 0x30, 0x20, 0x10, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setRGBPinOrder(RGBPinOrderEnum.BGR);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }


}
