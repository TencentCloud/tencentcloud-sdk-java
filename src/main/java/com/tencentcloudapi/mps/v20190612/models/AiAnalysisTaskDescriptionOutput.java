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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskDescriptionOutput extends AbstractModel {

    /**
    * 视频智能描述列表。
    */
    @SerializedName("DescriptionSet")
    @Expose
    private MediaAiAnalysisDescriptionItem [] DescriptionSet;

    /**
     * Get 视频智能描述列表。 
     * @return DescriptionSet 视频智能描述列表。
     */
    public MediaAiAnalysisDescriptionItem [] getDescriptionSet() {
        return this.DescriptionSet;
    }

    /**
     * Set 视频智能描述列表。
     * @param DescriptionSet 视频智能描述列表。
     */
    public void setDescriptionSet(MediaAiAnalysisDescriptionItem [] DescriptionSet) {
        this.DescriptionSet = DescriptionSet;
    }

    public AiAnalysisTaskDescriptionOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDescriptionOutput(AiAnalysisTaskDescriptionOutput source) {
        if (source.DescriptionSet != null) {
            this.DescriptionSet = new MediaAiAnalysisDescriptionItem[source.DescriptionSet.length];
            for (int i = 0; i < source.DescriptionSet.length; i++) {
                this.DescriptionSet[i] = new MediaAiAnalysisDescriptionItem(source.DescriptionSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DescriptionSet.", this.DescriptionSet);

    }
}

