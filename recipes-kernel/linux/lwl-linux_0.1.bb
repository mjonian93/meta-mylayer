DESCRIPTION = "LWL Linux Kernel Recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit kernel

SRC_URI = "https://cdn.kernel.org/pub/linux/kernel/v5.x/linux-5.7.tar.xz;name=kernel \
	   file://defconfig "

S = "${WORKDIR}/linux-5.7"

SRC_URI[kernelmd5sum] = "f63ed18935914e1ee3e04c2a0ce1ba3b"
SRC_URI[kernel.sha256sum] = "de8163bb62f822d84f7a3983574ec460060bf013a78ff79cd7c979ff1ec1d7e0"

