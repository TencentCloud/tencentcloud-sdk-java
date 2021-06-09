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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSuperResolution extends AbstractModel{

    /**
    * 超分视频类型：可选值：lq,hq
lq: 针对低清晰度有较多噪声视频的超分;
hq: 针对高清晰度视频超分;
默认取值：lq。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 超分倍数，可选值：2。
注意：当前只支持两倍超分。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 超分视频类型：可选值：lq,hq
lq: 针对低清晰度有较多噪声视频的超分;
hq: 针对高清晰度视频超分;
默认取值：lq。 
     * @return Type 超分视频类型：可选值：lq,hq
lq: 针对低清晰度有较多噪声视频的超分;
hq: 针对高清晰度视频超分;
默认取值：lq。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 超分视频类型：可选值：lq,hq
lq: 针对低清晰度有较多噪声视频的超分;
hq: 针对高清晰度视频超分;
默认取值：lq。
     * @param Type 超分视频类型：可选值：lq,hq
lq: 针对低清晰度有较多噪声视频的超分;
hq: 针对高清晰度视频超分;
默认取值：lq。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 超分倍数，可选值：2。
注意：当前只支持两倍超分。 
     * @return Size 超分倍数，可选值：2。
注意：当前只支持两倍超分。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 超分倍数，可选值：2。
注意：当前只支持两倍超分。
     * @param Size 超分倍数，可选值：2。
注意：当前只支持两倍超分。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public VideoSuperResolution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSuperResolution(VideoSuperResolution source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

