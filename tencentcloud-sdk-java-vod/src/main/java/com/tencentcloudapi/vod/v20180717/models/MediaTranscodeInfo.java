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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTranscodeInfo extends AbstractModel{

    /**
    * 各规格的转码信息集合，每个元素代表一个规格的转码结果。
    */
    @SerializedName("TranscodeSet")
    @Expose
    private MediaTranscodeItem [] TranscodeSet;

    /**
     * Get 各规格的转码信息集合，每个元素代表一个规格的转码结果。 
     * @return TranscodeSet 各规格的转码信息集合，每个元素代表一个规格的转码结果。
     */
    public MediaTranscodeItem [] getTranscodeSet() {
        return this.TranscodeSet;
    }

    /**
     * Set 各规格的转码信息集合，每个元素代表一个规格的转码结果。
     * @param TranscodeSet 各规格的转码信息集合，每个元素代表一个规格的转码结果。
     */
    public void setTranscodeSet(MediaTranscodeItem [] TranscodeSet) {
        this.TranscodeSet = TranscodeSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TranscodeSet.", this.TranscodeSet);

    }
}

