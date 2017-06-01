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
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff))
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
                String.format("%02x", oui[0]),
                String.format("%02x", oui[1]),
                String.format("%02x", oui[2]),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff))
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
                String.format("%02x", 0x52),
                String.format("%02x", 0x54),
                String.format("%02x", 0x00),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff))
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
                String.format("%02x", 0x00),
                String.format("%02x", 0x16),
                String.format("%02x", 0x3e),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff))
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
                String.format("%02x", 0x00),
                String.format("%02x", 0xcd),
                String.format("%02x", 0xfe),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff))
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
                String.format("%02x", 0x48),
                String.format("%02x", 0xad),
                String.format("%02x", 0x08),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff)),
                String.format("%02x", random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }
}