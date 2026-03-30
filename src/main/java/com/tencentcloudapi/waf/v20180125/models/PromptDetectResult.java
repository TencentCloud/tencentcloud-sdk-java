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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptDetectResult extends AbstractModel {

    /**
    * 检测结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
     * Get 检测结果 
     * @return Result 检测结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 检测结果
     * @param Result 检测结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 置信度 
     * @return Confidence 置信度
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度
     * @param Confidence 置信度
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    public PromptDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptDetectResult(PromptDetectResult source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

