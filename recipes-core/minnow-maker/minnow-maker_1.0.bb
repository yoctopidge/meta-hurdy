DESCRIPTION = "Minnow maker"
HOMEPAGE = "http://pyserial.sourceforge.net/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c07d4c0b0db8232869dd2c16340c13f2"

SRCNAME = "minnow-maker"
PR = "r0"

SRC_URI = "https://github.com/MinnowBoard/${SRCNAME}/archive/master.zip"
S = "${WORKDIR}/${SRCNAME}-master"

inherit setuptools

SRC_URI[md5sum] = "4249ee2861faa8f6d4266006b0b81b9d"
SRC_URI[sha256sum] = "b7545150658b6f869b72a9fadace2cca24bbf23526862ad0394d6e0045a33bc3"


