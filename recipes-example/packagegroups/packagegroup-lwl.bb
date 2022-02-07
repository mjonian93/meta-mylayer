SUMMARY = "LWL Package Group"

inherit packagegroup

RDEPENDS_${PN} = "util-linux \
		  pciutils \
		  usbutils"
