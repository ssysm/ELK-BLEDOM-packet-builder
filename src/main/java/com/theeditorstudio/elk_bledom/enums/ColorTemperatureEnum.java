package com.theeditorstudio.elk_bledom.enums;

public enum ColorTemperatureEnum {
    COLD_WHITE(0x80),
    NATURAL_WHITE(0x85),
    WARM_WHITE(0x8a);

    public final byte colorTemperatureByte;
    ColorTemperatureEnum(int i) {
        this.colorTemperatureByte = (byte) i;
    }
}
