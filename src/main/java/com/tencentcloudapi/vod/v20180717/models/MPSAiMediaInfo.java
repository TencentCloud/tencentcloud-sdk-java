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

public class MPSAiMediaInfo extends AbstractModel {

    /**
    * MPS处理后的智能媒体信息列表
    */
    @SerializedName("AiMediaList")
    @Expose
    private MPSAiMediaItem [] AiMediaList;

    /**
     * Get MPS处理后的智能媒体信息列表 
     * @return AiMediaList MPS处理后的智能媒体信息列表
     */
    public MPSAiMediaItem [] getAiMediaList() {
        return this.AiMediaList;
    }

    /**
     * Set MPS处理后的智能媒体信息列表
     * @param AiMediaList MPS处理后的智能媒体信息列表
     */
    public void setAiMediaList(MPSAiMediaItem [] AiMediaList) {
        this.AiMediaList = AiMediaList;
    }

    public MPSAiMediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiMediaInfo(MPSAiMediaInfo source) {
        if (source.AiMediaList != null) {
            this.AiMediaList = new MPSAiMediaItem[source.AiMediaList.length];
            for (int i = 0; i < source.AiMediaList.length; i++) {
                this.AiMediaList[i] = new MPSAiMediaItem(source.AiMediaList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AiMediaList.", this.AiMediaList);

    }
}

