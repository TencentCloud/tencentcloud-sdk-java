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

public class DstSubtitleInput extends AbstractModel {

    /**
    * <p>外部翻译字幕信息。</p>
    */
    @SerializedName("DstSubtitleInfo")
    @Expose
    private MediaInputInfo DstSubtitleInfo;

    /**
     * Get <p>外部翻译字幕信息。</p> 
     * @return DstSubtitleInfo <p>外部翻译字幕信息。</p>
     */
    public MediaInputInfo getDstSubtitleInfo() {
        return this.DstSubtitleInfo;
    }

    /**
     * Set <p>外部翻译字幕信息。</p>
     * @param DstSubtitleInfo <p>外部翻译字幕信息。</p>
     */
    public void setDstSubtitleInfo(MediaInputInfo DstSubtitleInfo) {
        this.DstSubtitleInfo = DstSubtitleInfo;
    }

    public DstSubtitleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DstSubtitleInput(DstSubtitleInput source) {
        if (source.DstSubtitleInfo != null) {
            this.DstSubtitleInfo = new MediaInputInfo(source.DstSubtitleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DstSubtitleInfo.", this.DstSubtitleInfo);

    }
}

