// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.download;

import org.chromium.components.offline_items_collection.ContentId;

/** Interface for classes implementing concrete implementation of UI behavior. */
public interface DownloadServiceDelegate {
    /**
     * Called to cancel a download.
     * @param id The {@link ContentId} of the download to cancel.
     * @param isOffTheRecord Whether the download is off the record.
     */
    void cancelDownload(ContentId id, boolean isOffTheRecord);

    /**
     * Called to pause a download.
     * @param id The {@link ContentId} of the download to pause.
     * @param isOffTheRecord Whether the download is off the record.
     */
    void pauseDownload(ContentId id, boolean isOffTheRecord);

    /**
     * Called to resume a paused download.
     * @param id The {@link ContentId} of the download to cancel.
     * @param item Download item to resume.
     * @param hasUserGesture Whether the resumption is triggered by user gesture.
     * TODO(fgorski): Update the interface to not require download item.
     */
    void resumeDownload(ContentId id, DownloadItem item, boolean hasUserGesture);

    /** Called to destroy the delegate, in case it needs to be destroyed. */
    void destroyServiceDelegate();
}
