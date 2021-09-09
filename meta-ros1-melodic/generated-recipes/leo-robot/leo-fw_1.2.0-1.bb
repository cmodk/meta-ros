# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Firmware binary releases and update script for Leo Rover"
AUTHOR = "Fictionlab <support@fictionlab.pl>"
ROS_AUTHOR = "Błażej Sowa <blazej@fictionlab.pl>"
HOMEPAGE = "http://wiki.ros.org/leo_fw"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "leo_robot"
ROS_BPN = "leo_fw"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ${PYTHON_PN}-setuptools-native \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-rospkg \
    ${ROS_UNRESOLVED_DEP-python-whichcraft} \
    rosgraph \
    rosmon-msgs \
    rosnode \
    rospy \
    rosservice \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fictionlab-gbp/leo_robot-release/archive/release/melodic/leo_fw/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/leo_fw"
SRC_URI = "git://github.com/fictionlab-gbp/leo_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "92a063bcc5b3005fdf86b7c35c27cd60072032d6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}