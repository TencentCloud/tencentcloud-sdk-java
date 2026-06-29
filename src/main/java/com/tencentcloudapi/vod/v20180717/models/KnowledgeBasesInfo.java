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

public class KnowledgeBasesInfo extends AbstractModel {

    /**
    * <p>当前媒资当导入的知识库列表</p>
    */
    @SerializedName("Bases")
    @Expose
    private String [] Bases;

    /**
    * <p>知识库中媒体分析信息</p>
    */
    @SerializedName("KnowledgeAnalysisInfos")
    @Expose
    private KnowledgeAnalysisInfo [] KnowledgeAnalysisInfos;

    /**
     * Get <p>当前媒资当导入的知识库列表</p> 
     * @return Bases <p>当前媒资当导入的知识库列表</p>
     */
    public String [] getBases() {
        return this.Bases;
    }

    /**
     * Set <p>当前媒资当导入的知识库列表</p>
     * @param Bases <p>当前媒资当导入的知识库列表</p>
     */
    public void setBases(String [] Bases) {
        this.Bases = Bases;
    }

    /**
     * Get <p>知识库中媒体分析信息</p> 
     * @return KnowledgeAnalysisInfos <p>知识库中媒体分析信息</p>
     */
    public KnowledgeAnalysisInfo [] getKnowledgeAnalysisInfos() {
        return this.KnowledgeAnalysisInfos;
    }

    /**
     * Set <p>知识库中媒体分析信息</p>
     * @param KnowledgeAnalysisInfos <p>知识库中媒体分析信息</p>
     */
    public void setKnowledgeAnalysisInfos(KnowledgeAnalysisInfo [] KnowledgeAnalysisInfos) {
        this.KnowledgeAnalysisInfos = KnowledgeAnalysisInfos;
    }

    public KnowledgeBasesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBasesInfo(KnowledgeBasesInfo source) {
        if (source.Bases != null) {
            this.Bases = new String[source.Bases.length];
            for (int i = 0; i < source.Bases.length; i++) {
                this.Bases[i] = new String(source.Bases[i]);
            }
        }
        if (source.KnowledgeAnalysisInfos != null) {
            this.KnowledgeAnalysisInfos = new KnowledgeAnalysisInfo[source.KnowledgeAnalysisInfos.length];
            for (int i = 0; i < source.KnowledgeAnalysisInfos.length; i++) {
                this.KnowledgeAnalysisInfos[i] = new KnowledgeAnalysisInfo(source.KnowledgeAnalysisInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Bases.", this.Bases);
        this.setParamArrayObj(map, prefix + "KnowledgeAnalysisInfos.", this.KnowledgeAnalysisInfos);

    }
}

