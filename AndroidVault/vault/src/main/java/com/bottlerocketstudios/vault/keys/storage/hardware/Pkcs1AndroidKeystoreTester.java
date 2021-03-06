/*
 * Copyright (c) 2016. Bottle Rocket LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bottlerocketstudios.vault.keys.storage.hardware;

import android.content.Context;

import com.bottlerocketstudios.vault.keys.wrapper.AbstractAndroidKeystoreSecretKeyWrapper;
import com.bottlerocketstudios.vault.keys.wrapper.AndroidKeystoreSecretKeyWrapper;

import java.security.GeneralSecurityException;

/**
 * Created on 9/21/16.
 */
public class Pkcs1AndroidKeystoreTester extends AndroidKeystoreTester {
    public Pkcs1AndroidKeystoreTester(Context context, String keystoreAlias, int currentSdkInt) {
        super(context, keystoreAlias, currentSdkInt);
    }

    @Override
    protected String getAndroidKeystoreTestStateSharedPreferenceKey(String keystoreAlias) {
        return PREF_COMPAT_FACTORY_ANDROID_KEYSTORE_TEST_STATE_ROOT + keystoreAlias + ".pkcs1.";
    }

    @Override
    protected AbstractAndroidKeystoreSecretKeyWrapper createKeystoreSecretKeyWrapper(Context context, String testKeystoreAlias) throws GeneralSecurityException {
        return new AndroidKeystoreSecretKeyWrapper(context, testKeystoreAlias);
    }
}
