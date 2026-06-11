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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcAudioOutputVideoInfo extends AbstractModel {

    /**
    * <p>视频URL。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>视频时长。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get <p>视频URL。</p> 
     * @return Url <p>视频URL。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>视频URL。</p>
     * @param Url <p>视频URL。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>视频时长。</p> 
     * @return Duration <p>视频时长。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频时长。</p>
     * @param Duration <p>视频时长。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public AigcAudioOutputVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioOutputVideoInfo(AigcAudioOutputVideoInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

