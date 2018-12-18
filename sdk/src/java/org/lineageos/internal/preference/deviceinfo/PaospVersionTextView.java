/*
 * Copyright (C) 2018 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.internal.preference.deviceinfo;

import android.content.Context;
import android.os.SystemProperties;
import android.util.AttributeSet;
import android.widget.TextView;

import org.lineageos.platform.internal.R;

public class PaospVersionTextView extends TextView {
    private static final String TAG = "PaospVersionTextView";

    private static final String KEY_PAOSP_VERSION_PROP = "ro.paosp.version";

    public PaospVersionTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(SystemProperties.get(KEY_PAOSP_VERSION_PROP));
    }
}
