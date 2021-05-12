/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamClipProjectInput extends AbstractModel{

    /**
    * 直播流播放地址，目前仅支持 HLS 和 FLV 格式。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 直播流录制时长，单位为秒，最大值为 7200。
    */
    @SerializedName("StreamRecordDuration")
    @Expose
    private Long StreamRecordDuration;

    /**
     * Get 直播流播放地址，目前仅支持 HLS 和 FLV 格式。 
     * @return Url 直播流播放地址，目前仅支持 HLS 和 FLV 格式。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 直播流播放地址，目前仅支持 HLS 和 FLV 格式。
     * @param Url 直播流播放地址，目前仅支持 HLS 和 FLV 格式。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 直播流录制时长，单位为秒，最大值为 7200。 
     * @return StreamRecordDuration 直播流录制时长，单位为秒，最大值为 7200。
     */
    public Long getStreamRecordDuration() {
        return this.StreamRecordDuration;
    }

    /**
     * Set 直播流录制时长，单位为秒，最大值为 7200。
     * @param StreamRecordDuration 直播流录制时长，单位为秒，最大值为 7200。
     */
    public void setStreamRecordDuration(Long StreamRecordDuration) {
        this.StreamRecordDuration = StreamRecordDuration;
    }

    public LiveStreamClipProjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamClipProjectInput(LiveStreamClipProjectInput source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.StreamRecordDuration != null) {
            this.StreamRecordDuration = new Long(source.StreamRecordDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StreamRecordDuration", this.StreamRecordDuration);

    }
}

