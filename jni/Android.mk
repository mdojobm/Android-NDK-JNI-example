LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := jni_example
LOCAL_SRC_FILES := jni_part.cpp

include $(BUILD_SHARED_LIBRARY)
