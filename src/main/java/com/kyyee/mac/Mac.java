package com.kyyee.mac;

import java.util.Random;

/**
 * Created by kyyee on 2017/5/31.
 */
public class Mac {
    private static String SEPARATOR_OF_MAC = ":";

    /**
     * Generate a random MAC address.
     * Every fields are random, range from 0 to 255
     *
     * @return MAC address string
     */
    public String randomMac() {
        Random random = new Random();
        // qemu下mac地址前3位固定为 52:54:00
        String[] mac = {
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }

    /**
     * Generate a random MAC address with oui.
     * The OUI list is available at http://standards.ieee.org/regauth/oui/oui.txt.
     * The remaining 3 fields are random,  range from 0 to 255
     *
     * @param oui string[] like {52, 54, 00}
     * @return MAC address string
     */
    public String randomMacWithOui(Integer[] oui) {
        Random random = new Random();
        String[] mac = {
                Integer.toHexString(oui[0]),
                Integer.toHexString(oui[1]),
                Integer.toHexString(oui[2]),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }

    /**
     * Generate a random MAC address for qemu/kvm
     * 52-54-00 used by qemu/kvm
     * The remaining 3 fields are random,  range from 0 to 255
     *
     * @return MAC address string
     */
    public String randomMac4Qemu() {
        Random random = new Random();
        String[] mac = {
                Integer.toHexString(0x52),
                Integer.toHexString(0x54),
                Integer.toHexString(0x00),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }

    /**
     * Generate a random MAC address for xen
     * 00-16-3E allocated to xensource
     * The remaining 3 fields are random,  range from 0 to 255
     *
     * @return MAC address string
     */
    public String randomMac4Xen() {
        Random random = new Random();
        String[] mac = {
                Integer.toHexString(0x00),
                Integer.toHexString(0x16),
                Integer.toHexString(0x3e),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }

    /**
     * Generate a random MAC address for Apple
     * 00-cd-fe allocated to Apple
     * The remaining 3 fields are random,  range from 0 to 255
     *
     * @return MAC address string
     */
    public String randomMac4Apple() {
        Random random = new Random();
        String[] mac = {
                Integer.toHexString(0x00),
                Integer.toHexString(0xcd),
                Integer.toHexString(0xfe),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }

    /**
     * Generate a random MAC address for Huawei
     * 00-cd-fe used by Huawei
     * The remaining 3 fields are random,  range from 0 to 255
     *
     * @return MAC address string
     */
    public String randomMac4Huawei() {
        Random random = new Random();
        String[] mac = {
                Integer.toHexString(0x48),
                Integer.toHexString(0xad),
                Integer.toHexString(0x08),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff)),
                Integer.toHexString(random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }
}