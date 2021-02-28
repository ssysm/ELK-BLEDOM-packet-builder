package com.theeditorstudio.elk_bledom.enums;

public enum GrayscaleEnum {
    BLACK(0x00),
    GRAY(0x32),
    WHITE(0x64);

    public final byte grayscaleByte;
    GrayscaleEnum(int i) {
        this.grayscaleByte = (byte) i;
    }
}
