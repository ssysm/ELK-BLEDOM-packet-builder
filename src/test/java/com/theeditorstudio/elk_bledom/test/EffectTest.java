package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.enums.EffectEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EffectTest {
    @Test
    void shouldChangeEffectToRed() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x80, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.RED);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGreen() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x81, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GREEN);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlue() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x82, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLUE);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToYellow() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x83, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.YELLOW);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToCyan() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x84, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.CYAN);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToMagenta() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x85, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.MAGENTA);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToWhite() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x86, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.WHITE);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToJumpRGB() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x87, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.JUMP_RGB);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToJumpRGBYCMW() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x88, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.JUMP_RGBYCMW);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientRGB() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x89, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_RGB);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientRGBYCMW() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x8a, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_RGBYCMW);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientRed() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x8b, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_R);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientGreen() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x8c, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_G);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientBlue() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x8d, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_B);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientYellow() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x8e, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_Y);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientCyan() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x8f, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_C);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientMagenta() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x90, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_M);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientWhite() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x91, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_W);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientRG() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x92, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_RG);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientRB() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x93, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_RB);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToGradientGB() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x94, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.GRADIENT_GB);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlinkRGBYCMW() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x95, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_RGBYCMW);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlinkRed() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x96, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_R);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlinkGreen() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x97, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_G);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }@Test
    void shouldChangeEffectToBlinkBlue() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x98, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_B);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }@Test
    void shouldChangeEffectToBlinkYellow() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x99, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_Y);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlinkCyan() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x9A, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_C);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlinkMagenta() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x9B, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_M);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
    @Test
    void shouldChangeEffectToBlinkWhite() {
        byte[] exceptedResult = {0x7E, 0x00, 0x03, (byte) 0x9C, 0x03, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setModeEffect(EffectEnum.BLINK_W);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

}
