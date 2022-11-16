# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A vendor package for JSON schema validator for JSON for Modern C++"
AUTHOR = "Grey <grey@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & MIT License"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=90960aa57caec7a7bf3c3aa0ed98b90a"

ROS_CN = "nlohmann_json_schema_validator_vendor"
ROS_BPN = "nlohmann_json_schema_validator_vendor"

ROS_BUILD_DEPENDS = " \
    nlohmann-json \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    nlohmann-json \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nlohmann-json \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/nlohmann_json_schema_validator_vendor-release/archive/release/humble/nlohmann_json_schema_validator_vendor/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/nlohmann_json_schema_validator_vendor"
SRC_URI = "git://github.com/ros2-gbp/nlohmann_json_schema_validator_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "9232e57d134867f6477959550de0cf6cbb8aa32c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
