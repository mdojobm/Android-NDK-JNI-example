#include <jni.h>

extern "C" {
	JNIEXPORT jint JNICALL Java_com_example_test04jni_MainActivity_callJni(JNIEnv*, jclass, jint);

	JNIEXPORT jint JNICALL Java_com_example_test04jni_MainActivity_callJni(JNIEnv* je, jclass jc, jint i)
	{
		return (i * i);
	}
}
