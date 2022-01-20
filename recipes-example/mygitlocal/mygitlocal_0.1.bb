DESCRIPTION = "Simple helloworld C application from git repository"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git:///home/msainz/workspaces/udemy_courses/embedded_linux_using_yocto/part2/source/meta-mylayer/recipes-example/mygitlocal/repo/git_recipe;protocol=file"

S = "${WORKDIR}/git"

#SRCREV = "${AUTOREV} #The latest revision
SRCREV = "e90ffa9ee3e7958e4ab9f457afceba9ed0c844de"

do_compile() {
	${CC} userprog.c -o userprog ${LDFLAGS}
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 userprog ${D}${bindir}
}
