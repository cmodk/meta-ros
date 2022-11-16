# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "swri_image_util"
AUTHOR = "P. J. Reed <preed@swri.org>"
ROS_AUTHOR = "Kris Kozak"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_image_util"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    boost \
    camera-calibration-parsers \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    libeigen \
    message-filters \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    rclpy \
    std-msgs \
    swri-geometry-util \
    swri-math-util \
    swri-opencv-util \
    swri-roscpp \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    boost \
    camera-calibration-parsers \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    libeigen \
    message-filters \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    rclpy \
    std-msgs \
    swri-geometry-util \
    swri-math-util \
    swri-opencv-util \
    swri-roscpp \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    boost \
    camera-calibration-parsers \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    libeigen \
    message-filters \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    rclpy \
    std-msgs \
    swri-geometry-util \
    swri-math-util \
    swri-opencv-util \
    swri-roscpp \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/marti_common-release/archive/release/humble/swri_image_util/3.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/swri_image_util"
SRC_URI = "git://github.com/ros2-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "ee90b2ae54abd68c926e04a9cff824240f9f4396"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
