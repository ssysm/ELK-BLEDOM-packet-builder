package com.theeditorstudio.elk_bledom.enums;

public enum RGBPinOrderEnum {
    RGB(0x10, 0x20, 0x30),
    RBG(0x10, 0x30, 0x20),
    GRB(0x20, 0x10, 0x30),
    GBR(0x20, 0x30, 0x10),
    BRG(0x30, 0x10, 0x20),
    BGR(0x30, 0x20, 0x10);

    public final byte pin1Byte, pin2Byte, pin3Byte;
    RGBPinOrderEnum(int pin1, int pin2, int pin3) {
        this.pin1Byte = (byte) pin1;
        this.pin2Byte = (byte) pin2;
        this.pin3Byte = (byte) pin3;
    }
}
