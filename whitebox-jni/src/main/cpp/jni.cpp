#include <jni.h>
#include "org_aidamina_whitebox_WhiteboxNative.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_org_aidamina_whitebox_WhiteboxNative_test
  (JNIEnv * env, jclass target){
      printf("Hello\n");

}

