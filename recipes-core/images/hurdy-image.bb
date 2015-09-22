DESCRIPTION = "Hurdy Gurdy Image"

IMAGE_FEATURES += "package-management hwcodecs dev-pkgs ssh-server-openssh"

IMAGE_INSTALL = "\
    minnow-maker \
    python-pyserial \
    libsamplerate0 \
    python-numpy \
    python-pip \
    scikits-samplerate \
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image

LICENSE_FLAGS_WHITELIST = "commercial_gst-fluendo-mp3 \
                           commercial_gst-openmax \
                           commercial_gst-plugins-ugly \
                           commercial_lame \
                           commercial_libmad \
                           commercial_libomxil \
                           commercial_mpeg2dec \
                           commercial_qmmp"
PREFERRED_PROVIDER_virtual/kernel = "linux-yocto-rt"
