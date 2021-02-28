package com.theeditorstudio.elk_bledom.enums;

public enum ModeEnum {
    /**
     * Can set led brightness
     */
    MODE_BRIGHTNESS(0x01),
    /**
     * Can set brightness and temperature(cold to warm white)
     */
    MODE_SPEED(0x02),
    /**
     * Auto color change, can set patterns, brightness and speed
     */
    MODE_EFFECT(0x03),
    /**
     * Change Power state
     */
    MODE_POWER(0x04),
    /**
     * Can set rgb values and brightness
     */
    MODE_RGB(0x05);

    public final byte modeByte;
    ModeEnum(int i) {
        this.modeByte = (byte) i;
    }
}
