SUMMARY = "Tool for writing very fast and very flexible scanners"
HOMEPAGE = "http://re2c.sourceforge.net/"
AUTHOR = "Marcus Börger <helly@users.sourceforge.net>"
SECTION = "devel"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64eca4d8a3b67f9dc7656094731a2c8d"

SRC_URI =  "git://github.com/skvadrik/re2c.git \
            file://cve-2020-11958.patch \
           "

# rev of 1.3 tag
#
SRCREV = "e1901b71c6414c510f10f4cc30c0a05600e55ed1"
PV = "1.3"

inherit autotools

# override the default S
#
S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

