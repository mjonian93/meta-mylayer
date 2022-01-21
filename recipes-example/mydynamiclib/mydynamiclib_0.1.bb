DESCRIPTION = "Simple helloworld dynamic library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://print.c \
	   file://arith.c \
	   file://mylib.h"

S = "${WORKDIR}"

do_compile() {
	${CC} -c -fPIC print.c
	${CC} -c -fPIC arith.c
	${CC} ${LDFLAGS} -shared -o liblwl.so *.o
}

do_install() {
	install -d ${D}${libdir}
	install -m 0755 liblwl.so ${D}${libdir}
	install -d ${D}${includedir}
	install -m 0644 mylib.h ${D}${includedir}
}

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
#ALLOW_EMPTY_${PN} = "1"
