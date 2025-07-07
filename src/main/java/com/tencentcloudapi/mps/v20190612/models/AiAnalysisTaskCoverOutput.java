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

public class AiAnalysisTaskCoverOutput extends AbstractModel {

    /**
    * 智能封面列表。
    */
    @SerializedName("CoverSet")
    @Expose
    private MediaAiAnalysisCoverItem [] CoverSet;

    /**
    * 智能封面的存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get 智能封面列表。 
     * @return CoverSet 智能封面列表。
     */
    public MediaAiAnalysisCoverItem [] getCoverSet() {
        return this.CoverSet;
    }

    /**
     * Set 智能封面列表。
     * @param CoverSet 智能封面列表。
     */
    public void setCoverSet(MediaAiAnalysisCoverItem [] CoverSet) {
        this.CoverSet = CoverSet;
    }

    /**
     * Get 智能封面的存储位置。 
     * @return OutputStorage 智能封面的存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 智能封面的存储位置。
     * @param OutputStorage 智能封面的存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskCoverOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskCoverOutput(AiAnalysisTaskCoverOutput source) {
        if (source.CoverSet != null) {
            this.CoverSet = new MediaAiAnalysisCoverItem[source.CoverSet.length];
            for (int i = 0; i < source.CoverSet.length; i++) {
                this.CoverSet[i] = new MediaAiAnalysisCoverItem(source.CoverSet[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CoverSet.", this.CoverSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

