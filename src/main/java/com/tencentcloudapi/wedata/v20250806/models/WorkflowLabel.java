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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowLabel extends AbstractModel {

    /**
    * <p>标签ID，入参时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelId")
    @Expose
    private Long LabelId;

    /**
    * <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>标签值ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValueId")
    @Expose
    private Long LabelValueId;

    /**
    * <p>标签值名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get <p>标签ID，入参时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelId <p>标签ID，入参时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签ID，入参时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelId <p>标签ID，入参时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelId(Long LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelName <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelName <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>标签值ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValueId <p>标签值ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set <p>标签值ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValueId <p>标签值ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValueId(Long LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    /**
     * Get <p>标签值名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValue <p>标签值名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set <p>标签值名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValue <p>标签值名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public WorkflowLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowLabel(WorkflowLabel source) {
        if (source.LabelId != null) {
            this.LabelId = new Long(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new Long(source.LabelValueId);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

