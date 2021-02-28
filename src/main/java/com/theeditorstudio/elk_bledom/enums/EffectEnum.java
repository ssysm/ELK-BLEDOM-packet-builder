package com.theeditorstudio.elk_bledom.enums;

public enum EffectEnum {
    RED(0x80),
    GREEN(0x81),
    BLUE(0x82),
    YELLOW(0x83),
    CYAN(0x84),
    MAGENTA(0x85),
    WHITE(0x86),
    JUMP_RGB(0x87),
    JUMP_RGBYCMW(0x88),
    GRADIENT_RGB(0x89),
    GRADIENT_RGBYCMW(0x8a),
    GRADIENT_R(0x8b),
    GRADIENT_G(0x8C),
	GRADIENT_B(0X8D),
	GRADIENT_Y(0X8E),
	GRADIENT_C(0X8F),
	GRADIENT_M(0X90),
	GRADIENT_W(0X91),
	GRADIENT_RG(0X92),
	GRADIENT_RB(0X93),
	GRADIENT_GB(0X94),
	BLINK_RGBYCMW(0X95),
	BLINK_R(0X96),
	BLINK_G(0X97),
	BLINK_B(0X98),
	BLINK_Y(0X99),
	BLINK_C(0X9A),
	BLINK_M(0X9B),
	BLINK_W(0X9C);

    public final byte effectByte;
    EffectEnum(int i) {
        this.effectByte = (byte) i;
    }
}
