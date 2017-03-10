#include "com_zhangyp_higo_myndk_MyNdk.h"

JNIEXPORT jstring JNICALL Java_com_zhangyp_higo_myndk_MyNdk_getString
  (JNIEnv * env, jobject obj){
   return (*env).NewStringUTF("This is mylibrary !!!");
  }