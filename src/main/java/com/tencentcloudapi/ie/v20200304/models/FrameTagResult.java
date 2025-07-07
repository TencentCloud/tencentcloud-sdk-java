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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameTagResult extends AbstractModel {

    /**
    * 帧标签结果数组
    */
    @SerializedName("FrameTagItems")
    @Expose
    private FrameTagItem [] FrameTagItems;

    /**
     * Get 帧标签结果数组 
     * @return FrameTagItems 帧标签结果数组
     */
    public FrameTagItem [] getFrameTagItems() {
        return this.FrameTagItems;
    }

    /**
     * Set 帧标签结果数组
     * @param FrameTagItems 帧标签结果数组
     */
    public void setFrameTagItems(FrameTagItem [] FrameTagItems) {
        this.FrameTagItems = FrameTagItems;
    }

    public FrameTagResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameTagResult(FrameTagResult source) {
        if (source.FrameTagItems != null) {
            this.FrameTagItems = new FrameTagItem[source.FrameTagItems.length];
            for (int i = 0; i < source.FrameTagItems.length; i++) {
                this.FrameTagItems[i] = new FrameTagItem(source.FrameTagItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FrameTagItems.", this.FrameTagItems);

    }
}

