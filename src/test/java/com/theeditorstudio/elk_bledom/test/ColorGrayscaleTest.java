package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.enums.GrayscaleEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColorGrayscaleTest {
    @Test
    void shouldChangeColorGrayscaleToGray(){
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x01, GrayscaleEnum.GRAY.grayscaleByte, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForGrayScaleMode(GrayscaleEnum.GRAY);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeColorGrayscaleToBlack(){
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x01, GrayscaleEnum.BLACK.grayscaleByte, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForGrayScaleMode(GrayscaleEnum.BLACK);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeColorGrayscaleToWhite(){
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x01, GrayscaleEnum.WHITE.grayscaleByte, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForGrayScaleMode(GrayscaleEnum.WHITE);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
}
