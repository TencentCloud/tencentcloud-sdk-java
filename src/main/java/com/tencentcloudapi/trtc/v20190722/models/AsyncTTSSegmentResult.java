/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncTTSSegmentResult extends AbstractModel {

    /**
    * <p>分段文本</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音频下载url</p>
    */
    @SerializedName("AudioDownloadUrl")
    @Expose
    private String AudioDownloadUrl;

    /**
    * <p>音频时长</p><p>单位：ms</p>
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
     * Get <p>分段文本</p> 
     * @return Text <p>分段文本</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>分段文本</p>
     * @param Text <p>分段文本</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音频下载url</p> 
     * @return AudioDownloadUrl <p>音频下载url</p>
     */
    public String getAudioDownloadUrl() {
        return this.AudioDownloadUrl;
    }

    /**
     * Set <p>音频下载url</p>
     * @param AudioDownloadUrl <p>音频下载url</p>
     */
    public void setAudioDownloadUrl(String AudioDownloadUrl) {
        this.AudioDownloadUrl = AudioDownloadUrl;
    }

    /**
     * Get <p>音频时长</p><p>单位：ms</p> 
     * @return DurationMs <p>音频时长</p><p>单位：ms</p>
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>音频时长</p><p>单位：ms</p>
     * @param DurationMs <p>音频时长</p><p>单位：ms</p>
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    public AsyncTTSSegmentResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncTTSSegmentResult(AsyncTTSSegmentResult source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.AudioDownloadUrl != null) {
            this.AudioDownloadUrl = new String(source.AudioDownloadUrl);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "AudioDownloadUrl", this.AudioDownloadUrl);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);

    }
}

