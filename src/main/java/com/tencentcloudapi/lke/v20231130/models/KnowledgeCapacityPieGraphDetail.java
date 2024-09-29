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
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * 应用占比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

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
     * Get 应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCharSize 应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set 应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCharSize 应用使用的字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get 应用占比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proportion 应用占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set 应用占比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proportion 应用占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);

    }
}

