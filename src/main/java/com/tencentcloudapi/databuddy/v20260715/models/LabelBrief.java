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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelBrief extends AbstractModel {

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelKey")
    @Expose
    private String LabelKey;

    /**
    * 标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * 标签名称ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelKeyId")
    @Expose
    private String LabelKeyId;

    /**
    * 标签值ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelKey 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelKey() {
        return this.LabelKey;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelKey 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelKey(String LabelKey) {
        this.LabelKey = LabelKey;
    }

    /**
     * Get 标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get 标签名称ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelKeyId 标签名称ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelKeyId() {
        return this.LabelKeyId;
    }

    /**
     * Set 标签名称ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelKeyId 标签名称ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelKeyId(String LabelKeyId) {
        this.LabelKeyId = LabelKeyId;
    }

    /**
     * Get 标签值ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValueId 标签值ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set 标签值ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValueId 标签值ID，可通过标签相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    public LabelBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelBrief(LabelBrief source) {
        if (source.LabelKey != null) {
            this.LabelKey = new String(source.LabelKey);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.LabelKeyId != null) {
            this.LabelKeyId = new String(source.LabelKeyId);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelKey", this.LabelKey);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "LabelKeyId", this.LabelKeyId);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);

    }
}

