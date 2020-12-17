# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "IKFast package for NEXTAGE Open"
AUTHOR = "IK Fast Plugin Creater <support@opensouce-robotics.tokyo.jp>"
ROS_AUTHOR = "TORK Developer 534o <534o@opensouce-robotics.tokyo.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtmros_nextage"
ROS_BPN = "nextage_ik_plugin"

ROS_BUILD_DEPENDS = " \
    lapack \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    lapack \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lapack \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtmros_nextage-release/archive/release/melodic/nextage_ik_plugin/0.8.6-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nextage_ik_plugin"
SRC_URI = "git://github.com/tork-a/rtmros_nextage-release;${ROS_BRANCH};protocol=https"
SRCREV = "dacb6cb991d8f9cf3f75caa3b50cf6c347ab246e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}