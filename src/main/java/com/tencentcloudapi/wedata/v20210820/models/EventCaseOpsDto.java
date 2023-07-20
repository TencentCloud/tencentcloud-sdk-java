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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventCaseOpsDto extends AbstractModel{

    /**
    * 案例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * 案例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 时间格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
    * 消费者id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 案例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaseId 案例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set 案例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaseId 案例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get 案例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 案例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 案例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 案例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 时间格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimension 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimension 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTimestamp 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTimestamp 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get 消费者id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerId 消费者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set 消费者id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerId 消费者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EventCaseOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseOpsDto(EventCaseOpsDto source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

