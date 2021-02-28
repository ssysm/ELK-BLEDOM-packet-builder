package com.theeditorstudio.elk_bledom.enums;

public enum StateEnum {
    /**
     * LEDs show current mode colors
     */
    ON(0x10),
    /**
     * LEDs are off (current mode is saved)
     */
    OFF(0x00);

    public final byte stateByte;
    StateEnum(int i) {
        this.stateByte = (byte) i;
    }
}
