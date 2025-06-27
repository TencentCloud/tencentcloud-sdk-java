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

public class KnowledgeCapacityPieGraphDetail extends AbstractModel {

    /**
    * 当前应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 当前应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * 当前应用对于总用量的占比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

    /**
    * 知识库类型:0默认1共享
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
     * Get 当前应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 当前应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 当前应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 当前应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 当前应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCharSize 当前应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set 当前应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCharSize 当前应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get 当前应用对于总用量的占比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proportion 当前应用对于总用量的占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set 当前应用对于总用量的占比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proportion 当前应用对于总用量的占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
    }

    /**
     * Get 知识库类型:0默认1共享 
     * @return KnowledgeType 知识库类型:0默认1共享
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set 知识库类型:0默认1共享
     * @param KnowledgeType 知识库类型:0默认1共享
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    public KnowledgeCapacityPieGraphDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeCapacityPieGraphDetail(KnowledgeCapacityPieGraphDetail source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.Proportion != null) {
            this.Proportion = new Float(source.Proportion);
        }
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);

    }
}

