// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.vr;

import android.os.Bundle;

import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.vr_shell.VrShellDelegate;

/**
 * This is the VR equivalent of {@link ChromeLauncherActivity}. It exists only because the Android
 * platform doesn't inherently support hybrid VR apps (like Chrome). All VR intents for Chrome
 * should eventually be routed through this activity as its manifest entry contains VR specific
 * attributes to ensure a smooth transition into Chrome VR.
 *
 * More specifically, a special VR theme disables the Preview Window feature to prevent the system
 * UI from showing up while Chrome prepares to enter VR mode. The android:enabledVrMode attribute
 * ensures that the system doesn't kick us out of VR mode during the transition as this as this can
 * result in a screen brightness flicker. Both of these sound minor but look jarring from a VR
 * headset.
 */
public class VrMainActivity extends ChromeLauncherActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // This Launcher may be launched through an alias, which leads to vrmode not being correctly
        // set, so we need to set it here as a fallback. b/65271215
        VrShellDelegate.setVrModeEnabled(this);
        super.onCreate(savedInstanceState);
    }
}
