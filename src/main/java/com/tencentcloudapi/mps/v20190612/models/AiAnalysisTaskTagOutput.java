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

public class AiAnalysisTaskTagOutput extends AbstractModel {

    /**
    * 视频智能标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisTagItem [] TagSet;

    /**
     * Get 视频智能标签列表。 
     * @return TagSet 视频智能标签列表。
     */
    public MediaAiAnalysisTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 视频智能标签列表。
     * @param TagSet 视频智能标签列表。
     */
    public void setTagSet(MediaAiAnalysisTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    public AiAnalysisTaskTagOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskTagOutput(AiAnalysisTaskTagOutput source) {
        if (source.TagSet != null) {
            this.TagSet = new MediaAiAnalysisTagItem[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new MediaAiAnalysisTagItem(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

