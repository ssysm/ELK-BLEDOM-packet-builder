package com.theeditorstudio.elk_bledom;

import com.theeditorstudio.elk_bledom.enums.*;
import com.theeditorstudio.elk_bledom.exceptions.*;
import com.theeditorstudio.elk_bledom.utils.*;

public class Controller {

    /**
     * Change LED Brightness
     *
     * Does not work on:
     * mode_effect: jump gradient blink
     * mode_grayscale
     * mode_dynamic
     * @param brightness brightness percentage (0%-100%)
     * @return bytes
     * @throws BrightnessViolationException throw when brightness passed in is more than 100% or less than 0%
     */
    public static byte[] setBrightness(int brightness) throws BrightnessViolationException {
        if(brightness > 100){
            throw new BrightnessViolationException("Brightness can not exceed more than 100%!");
        }
        if(brightness < 0){
            throw new BrightnessViolationException("Brightness can not be lower than 0%!");
        }
        return ByteUtil.getCommandByte((byte) 0x01, (byte) brightness,
                (byte) 0x00, (byte) 0x00, (byte) 0x00);
    }

    /**
     * Change LED effect speed
     * @param speed speed percentage (0% - 100%)
     * @return bytes
     * @throws SpeedViolationException throw when speed exceed 100%
     */
    public static byte[] setEffectSpeed(int speed) throws SpeedViolationException {
        if(speed > 100){
            throw new SpeedViolationException("Effect speed can not exceed more than 100%!");
        }
        if(speed < 0){
            throw new SpeedViolationException("Effect speed can not exceed lower than 0%!");
        }
        return ByteUtil.getCommandByte((byte) 0x02, (byte) speed,
                (byte) 0x00, (byte) 0x00, (byte) 0x00);
    }

    /**
     * Change mode to grayscale mode
     * LED will show last grayscale color
     * @return bytes
     */
    public static byte[] setModeGrayscale(){
        return ByteUtil.getCommandByte((byte) 0x03, (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00);
    }

    /**
     * Change LED color temperature.
     * @param temperatureEnum color temperature enum
     * @return bytes
     */
    public static byte[] setModeTemperature(ColorTemperatureEnum temperatureEnum){
        return ByteUtil.getCommandByte((byte) 0x03, temperatureEnum.colorTemperatureByte, (byte) 0x02,
                (byte) 0x00, (byte) 0x00);
    }

    /**
     * Change LED effect mode
     * @param effectEnum Effect enum
     * @return bytes
     */
    public static byte[] setModeEffect(EffectEnum effectEnum){
        return ByteUtil.getCommandByte((byte) 0x03, effectEnum.effectByte, (byte) 0x03,
                (byte) 0x00, (byte) 0x00);
    }

    /**
     * Set External Mic Dynamic Mode.
     * This mode requires the controller to have a mic.
     * @return bytes
     */
    public static byte[] setModeDynamicExternalMic(){
        return ByteUtil.getCommandByte((byte) 0x03, (byte) 0x00, (byte) 0x04,
                (byte) 0x00, (byte) 0x00);
    }

    /**
     * Set LED Power
     * @param stateEnum LED state enum
     * @return bytes
     */
    public static byte[] setPower(StateEnum stateEnum){
        return ByteUtil.getCommandByte((byte) 0x04, stateEnum.stateByte,
                (byte) 0x00, (byte) 0x00, (byte) 0x00);
    }

    /**
     * change grayscale
     * @param grayscaleEnum grayscaleEnum
     * @return bytes
     */
    public static byte[] setColorForGrayScaleMode(GrayscaleEnum grayscaleEnum){
        return ByteUtil.getCommandByte((byte) 0x05, (byte) 0x01, grayscaleEnum.grayscaleByte,
                (byte) 0x00, (byte) 0x00);
    }

    /**
     * Change color temperature
     * @param temperatureEnum color temperature enum
     * @return bytes
     */
    public static byte[] setColorForTemperatureMode(ColorTemperatureEnum temperatureEnum){
        return ByteUtil.getCommandByte((byte) 0x05, (byte) 0x02, temperatureEnum.colorTemperatureByte,
                (byte) 0x00, (byte) 0x00);
    }

    /**
     * Set led to rgb mode and define brightness from 0 to 255.
     * @param r Red brightness
     * @param g Green Brightness
     * @param b Blue brightness
     * @return bytes
     * @throws BrightnessViolationException throw when brightness exceed 255 or less than 0
     */
    public static byte[] setColorForRGBMode(int r, int g, int b) throws BrightnessViolationException {
        if(r > 255 || r < 0){
            throw new BrightnessViolationException("Red brightness cannot exceed more than 255!");
        }
        if(g > 255 || g < 0){
            throw new BrightnessViolationException("Green brightness cannot exceed more than 255!");
        }
        if(b > 255 || b < 0){
            throw new BrightnessViolationException("Blue brightness cannot exceed more than 255!");
        }
        return ByteUtil.getCommandByte((byte) 0x05, (byte) 0x03, (byte) r, (byte) g, (byte) b);
    }

    /**
     * Set Val for dynamic mode, requires external mic.
     * @param val val
     * @return bytes
     */
    public static byte[] setValForDynamicMode(int val){
        return ByteUtil.getCommandByte((byte) 0x06, (byte) val,
                (byte) 0x00, (byte) 0x00, (byte) 0x00);
    }

    /**
     * Set mic sensitivity for dynamic mode.
     * @param sensitivity sensitivity value.
     * @return bytes
     */
    public static byte[] setSensitivityForDynamicMode(int sensitivity){
        return ByteUtil.getCommandByte((byte) 0x07, (byte) sensitivity,
                (byte) 0x00, (byte) 0x00, (byte) 0x00);
    }

    /**
     * Set RGB Connector Pin order
     * @param pinOrderEnum pin order enum
     * @return bytes
     */
    public static byte[] setRGBPinOrder(RGBPinOrderEnum pinOrderEnum){
        return ByteUtil.getCommandByte((byte) 0x81, pinOrderEnum.pin1Byte,
                pinOrderEnum.pin2Byte, pinOrderEnum.pin3Byte, (byte) 0x00);
    }
}
