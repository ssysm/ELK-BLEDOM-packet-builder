package com.theeditorstudio.elk_bledom.test;

import com.theeditorstudio.elk_bledom.Controller;
import com.theeditorstudio.elk_bledom.enums.ColorTemperatureEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColorTemperatureTest {
    @Test
    void shouldChangeToColdWhite(){
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x02,ColorTemperatureEnum.COLD_WHITE.colorTemperatureByte, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForTemperatureMode(ColorTemperatureEnum.COLD_WHITE);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeToNaturalWhite(){
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x02, ColorTemperatureEnum.NATURAL_WHITE.colorTemperatureByte, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForTemperatureMode(ColorTemperatureEnum.NATURAL_WHITE);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }

    @Test
    void shouldChangeToWarmWhite(){
        byte[] exceptedResult = {0x7E, 0x00, 0x05, 0x02, ColorTemperatureEnum.WARM_WHITE.colorTemperatureByte, 0x00, 0x00, 0x00, (byte) 0xEF};
        byte[] testResult = Controller.setColorForTemperatureMode(ColorTemperatureEnum.WARM_WHITE);
        Assertions.assertArrayEquals(exceptedResult, testResult);
    }
}
