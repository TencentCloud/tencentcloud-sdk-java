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

public class KnowledgeAnalysisInfo extends AbstractModel {

    /**
    * <p>大模型解析模板号</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>大模型解析结果</p>
    */
    @SerializedName("AnalysisResults")
    @Expose
    private KnowledgeAnalysisResult [] AnalysisResults;

    /**
     * Get <p>大模型解析模板号</p> 
     * @return Definition <p>大模型解析模板号</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>大模型解析模板号</p>
     * @param Definition <p>大模型解析模板号</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>大模型解析结果</p> 
     * @return AnalysisResults <p>大模型解析结果</p>
     */
    public KnowledgeAnalysisResult [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set <p>大模型解析结果</p>
     * @param AnalysisResults <p>大模型解析结果</p>
     */
    public void setAnalysisResults(KnowledgeAnalysisResult [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    public KnowledgeAnalysisInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeAnalysisInfo(KnowledgeAnalysisInfo source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.AnalysisResults != null) {
            this.AnalysisResults = new KnowledgeAnalysisResult[source.AnalysisResults.length];
            for (int i = 0; i < source.AnalysisResults.length; i++) {
                this.AnalysisResults[i] = new KnowledgeAnalysisResult(source.AnalysisResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "AnalysisResults.", this.AnalysisResults);

    }
}

