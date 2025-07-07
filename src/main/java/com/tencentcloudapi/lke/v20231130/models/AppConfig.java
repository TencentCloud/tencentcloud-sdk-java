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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppConfig extends AbstractModel {

    /**
    * 知识问答管理应用配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeQa")
    @Expose
    private KnowledgeQaConfig KnowledgeQa;

    /**
    * 知识摘要应用配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private SummaryConfig Summary;

    /**
    * 标签提取应用配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Classify")
    @Expose
    private ClassifyConfig Classify;

    /**
     * Get 知识问答管理应用配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeQa 知识问答管理应用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaConfig getKnowledgeQa() {
        return this.KnowledgeQa;
    }

    /**
     * Set 知识问答管理应用配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeQa 知识问答管理应用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeQa(KnowledgeQaConfig KnowledgeQa) {
        this.KnowledgeQa = KnowledgeQa;
    }

    /**
     * Get 知识摘要应用配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 知识摘要应用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SummaryConfig getSummary() {
        return this.Summary;
    }

    /**
     * Set 知识摘要应用配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 知识摘要应用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(SummaryConfig Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 标签提取应用配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Classify 标签提取应用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassifyConfig getClassify() {
        return this.Classify;
    }

    /**
     * Set 标签提取应用配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Classify 标签提取应用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassify(ClassifyConfig Classify) {
        this.Classify = Classify;
    }

    public AppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppConfig(AppConfig source) {
        if (source.KnowledgeQa != null) {
            this.KnowledgeQa = new KnowledgeQaConfig(source.KnowledgeQa);
        }
        if (source.Summary != null) {
            this.Summary = new SummaryConfig(source.Summary);
        }
        if (source.Classify != null) {
            this.Classify = new ClassifyConfig(source.Classify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KnowledgeQa.", this.KnowledgeQa);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Classify.", this.Classify);

    }
}

