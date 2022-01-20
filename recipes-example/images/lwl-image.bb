SUMMARY = "A small boot image for LWL learners"
inherit core-image
LICENSE = "MIT"
IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL+= "usbutils"
