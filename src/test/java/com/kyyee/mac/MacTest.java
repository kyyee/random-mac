package com.kyyee.mac;

import org.junit.Test;

/**
 * Created by kyyee on 2017/5/31.
 */
public class MacTest {
    @Test
    public void randomMacTest() {
        Mac mac = new Mac();
        System.out.println("randomMac:" + mac.randomMac());
        Integer[] oui = {0x32, 0x21, 0xa2};
        System.out.println("randomMacWithOui:" + mac.randomMacWithOui(oui));
        System.out.println("randomMac4Xen:" + mac.randomMac4Xen());
        System.out.println("randomMac4Qemu:" + mac.randomMac4Qemu());
    }
}
