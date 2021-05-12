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

public class SubtitleResult extends AbstractModel{

    /**
    * 语音字幕数组
    */
    @SerializedName("SubtitleItems")
    @Expose
    private SubtitleItem [] SubtitleItems;

    /**
     * Get 语音字幕数组 
     * @return SubtitleItems 语音字幕数组
     */
    public SubtitleItem [] getSubtitleItems() {
        return this.SubtitleItems;
    }

    /**
     * Set 语音字幕数组
     * @param SubtitleItems 语音字幕数组
     */
    public void setSubtitleItems(SubtitleItem [] SubtitleItems) {
        this.SubtitleItems = SubtitleItems;
    }

    public SubtitleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleResult(SubtitleResult source) {
        if (source.SubtitleItems != null) {
            this.SubtitleItems = new SubtitleItem[source.SubtitleItems.length];
            for (int i = 0; i < source.SubtitleItems.length; i++) {
                this.SubtitleItems[i] = new SubtitleItem(source.SubtitleItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubtitleItems.", this.SubtitleItems);

    }
}

