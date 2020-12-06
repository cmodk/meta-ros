# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Gazebo package for Fetch."
AUTHOR = "Alex Moriarty <amoriarty@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/fetch_gazebo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_gazebo"
ROS_BPN = "fetch_gazebo"

ROS_BUILD_DEPENDS = " \
    angles \
    boost \
    control-toolbox \
    gazebo-plugins \
    gazebo-ros \
    gazebo-rosdev \
    robot-controllers \
    robot-controllers-interface \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    control-toolbox \
    gazebo-plugins \
    gazebo-ros \
    robot-controllers \
    robot-controllers-interface \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    actionlib \
    boost \
    control-msgs \
    control-toolbox \
    depth-image-proc \
    fetch-description \
    gazebo-plugins \
    gazebo-ros \
    image-proc \
    nodelet \
    rgbd-launch \
    robot-controllers \
    robot-controllers-interface \
    sensor-msgs \
    trajectory-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo/0.9.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fetch_gazebo"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_gazebo-release;${ROS_BRANCH};protocol=https"
SRCREV = "837b0d7a355c6cd49d73faae6d9e0f69f78e2d0b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
