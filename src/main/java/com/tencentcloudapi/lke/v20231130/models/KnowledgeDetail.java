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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeDetail extends AbstractModel {

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 已用字符数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * 使用占比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

    /**
    * 超量字符数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceedCharSize")
    @Expose
    private String ExceedCharSize;

    /**
    * 是否共享知识库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSharedKnowledge")
    @Expose
    private Boolean IsSharedKnowledge;

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 已用字符数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCharSize 已用字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set 已用字符数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCharSize 已用字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get 使用占比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proportion 使用占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set 使用占比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proportion 使用占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
    }

    /**
     * Get 超量字符数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceedCharSize 超量字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceedCharSize() {
        return this.ExceedCharSize;
    }

    /**
     * Set 超量字符数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceedCharSize 超量字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceedCharSize(String ExceedCharSize) {
        this.ExceedCharSize = ExceedCharSize;
    }

    /**
     * Get 是否共享知识库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSharedKnowledge 是否共享知识库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSharedKnowledge() {
        return this.IsSharedKnowledge;
    }

    /**
     * Set 是否共享知识库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSharedKnowledge 是否共享知识库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSharedKnowledge(Boolean IsSharedKnowledge) {
        this.IsSharedKnowledge = IsSharedKnowledge;
    }

    public KnowledgeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeDetail(KnowledgeDetail source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.Proportion != null) {
            this.Proportion = new Float(source.Proportion);
        }
        if (source.ExceedCharSize != null) {
            this.ExceedCharSize = new String(source.ExceedCharSize);
        }
        if (source.IsSharedKnowledge != null) {
            this.IsSharedKnowledge = new Boolean(source.IsSharedKnowledge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);
        this.setParamSimple(map, prefix + "ExceedCharSize", this.ExceedCharSize);
        this.setParamSimple(map, prefix + "IsSharedKnowledge", this.IsSharedKnowledge);

    }
}

