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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersistenceCompleteTask extends AbstractModel {

    /**
    * 固化生成的媒体 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 剪辑固化的来源，有以下三种。
<li>SimpleHlsClip：来自简单 HLS 剪辑；</li>
<li>FastEditMedia：来自快速媒体编辑；</li>
<li>LiveRealTimeClip:来自直播即时剪辑。</li>
    */
    @SerializedName("PersistenceSource")
    @Expose
    private String PersistenceSource;

    /**
     * Get 固化生成的媒体 ID。 
     * @return FileId 固化生成的媒体 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 固化生成的媒体 ID。
     * @param FileId 固化生成的媒体 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 剪辑固化的来源，有以下三种。
<li>SimpleHlsClip：来自简单 HLS 剪辑；</li>
<li>FastEditMedia：来自快速媒体编辑；</li>
<li>LiveRealTimeClip:来自直播即时剪辑。</li> 
     * @return PersistenceSource 剪辑固化的来源，有以下三种。
<li>SimpleHlsClip：来自简单 HLS 剪辑；</li>
<li>FastEditMedia：来自快速媒体编辑；</li>
<li>LiveRealTimeClip:来自直播即时剪辑。</li>
     */
    public String getPersistenceSource() {
        return this.PersistenceSource;
    }

    /**
     * Set 剪辑固化的来源，有以下三种。
<li>SimpleHlsClip：来自简单 HLS 剪辑；</li>
<li>FastEditMedia：来自快速媒体编辑；</li>
<li>LiveRealTimeClip:来自直播即时剪辑。</li>
     * @param PersistenceSource 剪辑固化的来源，有以下三种。
<li>SimpleHlsClip：来自简单 HLS 剪辑；</li>
<li>FastEditMedia：来自快速媒体编辑；</li>
<li>LiveRealTimeClip:来自直播即时剪辑。</li>
     */
    public void setPersistenceSource(String PersistenceSource) {
        this.PersistenceSource = PersistenceSource;
    }

    public PersistenceCompleteTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersistenceCompleteTask(PersistenceCompleteTask source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.PersistenceSource != null) {
            this.PersistenceSource = new String(source.PersistenceSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PersistenceSource", this.PersistenceSource);

    }
}

