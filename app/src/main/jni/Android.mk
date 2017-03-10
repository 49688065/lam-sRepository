LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := MyLibrary
LOCAL_SRC_FILES =: MyLibrary.c
include $(BUILD_SHARED_LIBRARY)