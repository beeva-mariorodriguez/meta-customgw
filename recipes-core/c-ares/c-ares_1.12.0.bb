SUMMARY = "C library for asynchronous DNS requests"
HOMEPAGE = "https://c-ares.haxx.se/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f4b026880834eb01c035c5e5cb47ccac"

SRC_URI = "https://c-ares.haxx.se/download/c-ares-1.12.0.tar.gz"

# COMPATIBLE_HOST = "(i.86|x86_64|aarch64|arm|powerpc|powerpc64).*-linux"

EXTRA_OEMAKE = "-e MAKEFLAGS="

inherit autotools-brokensep

do_install() {
    oe_runmake DESTDIR="${D}" install
}

SRC_URI[md5sum] = "2ca44be1715cd2c5666a165d35788424"
SRC_URI[sha256sum] = "8692f9403cdcdf936130e045c84021665118ee9bfea905d1a76f04d4e6f365fb"

PACKAGE_ARCH = "${MACHINE_ARCH}"

