DESCRIPTION = "Scikits Samplerate"
HOMEPAGE = "http://www.scikits.org"
SECTION = "devel/python"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRCNAME = "samplerate"
PR = "r0"

# SETUP DEPENDS
DEPENDS += " libsamplerate0 python-dev python-numpy python-pygame"

SRC_URI = "https://github.com/cournape/samplerate/archive/${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}"

BBCLASSEXTEND = "native"

inherit distutils

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

do_configure_prepend() {
     touch ${S}/site.cfg
     rm ${S}/site.cfg
     echo "[samplerate]" >> ${S}/site.cfg
     echo "library_dirs = ${STAGING_LIBDIR}" >> ${S}/site.cfg
     echo "include_dirs = ${STAGING_INCDIR}" >> ${S}/site.cfg
}

SRC_URI[md5sum] = "78020e08af5c1fab8dd71b7e846b8fc8"
SRC_URI[sha256sum] = "f97df7ed18380775076d97a1f9ff175854a6c853fde66dc245a674f581791677"

