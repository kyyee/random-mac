# random-mac
Generate a random Mac address.
There are six method for you.

## Method introduction

 - randomMac() generate a totally random mac address.
 - randomMacWithOui() generate a random mac address with three number in the front like {0x32, 0x21, 0xa2}.
 - randomMac4Qemu() generate a random mac address for qemu/kvm, because the oui of qemu/kvm is {52, 54, 00}.
 - invoke randomMac4Xen(), randomMac4Apple(), randomMac4Huawei() reference randomMac4Qemu

## Reference

The [OUI][1] list is available.

[1]:http://standards.ieee.org/regauth/oui/oui.txt
