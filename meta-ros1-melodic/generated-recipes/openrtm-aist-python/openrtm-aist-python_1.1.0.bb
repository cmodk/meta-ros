# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>Python binding of OpenRTM-AIST (see <a href="http://www.ros.org/wiki/openrtm_aist">openrtm_aist</a> for     further information).</p>     <p><i>OpenRTM-aist is an <a href="http://ieeexplore.ieee.org/xpl/login.jsp?tp=&amp;arnumber=1545521&amp;url=http%3A%2F%2Fieeexplore.ieee.org%2Fiel5%2F10375%2F32977%2F01545521.pdf%3Farnumber%3D1545521">RT-Middleware</a>-baseed,    component-oriented software platform to robotics development that    is made and maintained in AIST (National Institute of Advanced    Industrial Science and Technology) in Japan </i> (<a href="http://openrtm.org/openrtm/en/content/introduction-0">excerpts from here</a>)</p>"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Shinji Kurihara <shinji.kurihara@aist.go.jp>"
HOMEPAGE = "http://ros.org/wiki/openrtm_aist"
SECTION = "devel"
LICENSE = "EPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=b1456987590b6d6fb15d36f398651b8b"

ROS_CN = "openrtm_aist_python"
ROS_BPN = "openrtm_aist_python"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-setuptools \
    ${ROS_UNRESOLVED_DEP-python-omniorb} \
    doxygen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-omniorb} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-omniorb} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/openrtm_aist_python-release/archive/release/melodic/openrtm_aist_python/1.1.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/openrtm_aist_python"
SRC_URI = "git://github.com/tork-a/openrtm_aist_python-release;${ROS_BRANCH};protocol=https"
SRCREV = "f88805f139b723ac9b861a88b8d9807a4edb4dfa"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
