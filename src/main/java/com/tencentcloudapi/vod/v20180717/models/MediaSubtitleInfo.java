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

public class MediaSubtitleInfo extends AbstractModel{

    /**
    * 字幕信息列表。
    */
    @SerializedName("SubtitleSet")
    @Expose
    private MediaSubtitleItem [] SubtitleSet;

    /**
     * Get 字幕信息列表。 
     * @return SubtitleSet 字幕信息列表。
     */
    public MediaSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 字幕信息列表。
     * @param SubtitleSet 字幕信息列表。
     */
    public void setSubtitleSet(MediaSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    public MediaSubtitleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubtitleInfo(MediaSubtitleInfo source) {
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new MediaSubtitleItem[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new MediaSubtitleItem(source.SubtitleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);

    }
}

