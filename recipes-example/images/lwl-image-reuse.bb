require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL_append = " usbutils"

#dropbear ssh server
IMAGE_FEATURES = "ssh-server-dropbear debug-tweaks read-only-rootfs splash tools-debug tools-sdk"

IMAGE_LINGUAS = "zh-cn"

IMAGE_NAME = "myimage"

IMAGE_INSTALL_append = " myhello-dbg myhello-lwl"

#IMAGE_INSTALL_append = " mygit"
