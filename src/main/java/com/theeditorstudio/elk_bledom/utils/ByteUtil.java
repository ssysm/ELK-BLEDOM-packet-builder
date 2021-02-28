package com.theeditorstudio.elk_bledom.utils;

public class ByteUtil {

    /**
     * The starting byte of the packet
     */
    public static final byte STARTING_BYTE = (byte) 0x7e;
    /**
     * The end byte of the packet
     */
    public static final byte END_BYTE = (byte) 0xEF;

    /**
     * This is a helper function that will construct all the packet.
     * The bytes will always be 9 bytes long.
     * @param commandID Command ID Byte
     * @param commandSubID Sub Command ID Bytes
     * @param arg1 Argument 1
     * @param arg2 Argument 2
     * @param arg3 Argument 3
     * @return built bytes
     */
    public static byte[] getCommandByte(byte commandID, byte commandSubID, byte arg1, byte arg2, byte arg3){
        byte[] commandByte = new byte[9];
        commandByte[0] = STARTING_BYTE;
        commandByte[1] = 0x00; // padding
        commandByte[2] = commandID;
        commandByte[3] = commandSubID;
        commandByte[4] = arg1;
        commandByte[5] = arg2;
        commandByte[6] = arg3;
        commandByte[7] = 0x00; // padding
        commandByte[8] = END_BYTE;
        return commandByte;
    }
}
