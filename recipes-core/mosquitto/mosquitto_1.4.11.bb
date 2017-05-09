SUMMARY = "MQTT Broker"
HOMEPAGE = "https://mosquitto.org"
LICENSE = "Eclipse"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=62ddc846179e908dc0c8efec4a42ef20"

DEPENDS = "c-ares openssl"
RDEPENDS_mosquitto = "c-ares openssl"

SRC_URI = "https://mosquitto.org/files/source/mosquitto-1.4.11.tar.gz"

EXTRA_OEMAKE = "-e MAKEFLAGS="
INHIBIT_PACKAGE_STRIP = "1"

# do_configure_prepend() {
#     sed -i -e 's:prefix=/usr/local:prefix=/usr:' ${S}/config.mk
#     sed -i -e 's:STRIP?=strip::' ${S}/config.mk
# }

do_install() {
    sed -i -e 's:prefix=/usr/local:prefix=/usr:' ${S}/config.mk
    sed -i -e 's:STRIP?=strip::' ${S}/config.mk
    oe_runmake DESTDIR="${D}" install
}

SRC_URI[md5sum] = "c217dea4bdc7573a2eaea8387c18a19e"
SRC_URI[sha256sum] = "ca47533bbc1b7c5e15d6e5d96d3efc59677f2515b6692263c34b7c48f33280c5"

PACKAGE_ARCH = "${MACHINE_ARCH}"

