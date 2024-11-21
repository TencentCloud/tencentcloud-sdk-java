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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfirmVideoTranslateJobRequest extends AbstractModel {

    /**
    * 视频转译任务 ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 待确认文本
    */
    @SerializedName("TranslateResults")
    @Expose
    private TranslateResult [] TranslateResults;

    /**
     * Get 视频转译任务 ID 
     * @return JobId 视频转译任务 ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 视频转译任务 ID
     * @param JobId 视频转译任务 ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 待确认文本 
     * @return TranslateResults 待确认文本
     */
    public TranslateResult [] getTranslateResults() {
        return this.TranslateResults;
    }

    /**
     * Set 待确认文本
     * @param TranslateResults 待确认文本
     */
    public void setTranslateResults(TranslateResult [] TranslateResults) {
        this.TranslateResults = TranslateResults;
    }

    public ConfirmVideoTranslateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfirmVideoTranslateJobRequest(ConfirmVideoTranslateJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TranslateResults != null) {
            this.TranslateResults = new TranslateResult[source.TranslateResults.length];
            for (int i = 0; i < source.TranslateResults.length; i++) {
                this.TranslateResults[i] = new TranslateResult(source.TranslateResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArrayObj(map, prefix + "TranslateResults.", this.TranslateResults);

    }
}

