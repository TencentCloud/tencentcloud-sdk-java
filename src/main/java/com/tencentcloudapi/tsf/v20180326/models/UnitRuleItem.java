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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnitRuleItem extends AbstractModel{

    /**
    * 逻辑关系：AND/OR
    */
    @SerializedName("Relationship")
    @Expose
    private String Relationship;

    /**
    * 目的地命名空间ID
    */
    @SerializedName("DestNamespaceId")
    @Expose
    private String DestNamespaceId;

    /**
    * 目的地命名空间名称
    */
    @SerializedName("DestNamespaceName")
    @Expose
    private String DestNamespaceName;

    /**
    * 规则项名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 单元化规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitRuleId")
    @Expose
    private String UnitRuleId;

    /**
    * 规则顺序，越小优先级越高：默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitRuleTagList")
    @Expose
    private UnitRuleTag [] UnitRuleTagList;

    /**
     * Get 逻辑关系：AND/OR 
     * @return Relationship 逻辑关系：AND/OR
     */
    public String getRelationship() {
        return this.Relationship;
    }

    /**
     * Set 逻辑关系：AND/OR
     * @param Relationship 逻辑关系：AND/OR
     */
    public void setRelationship(String Relationship) {
        this.Relationship = Relationship;
    }

    /**
     * Get 目的地命名空间ID 
     * @return DestNamespaceId 目的地命名空间ID
     */
    public String getDestNamespaceId() {
        return this.DestNamespaceId;
    }

    /**
     * Set 目的地命名空间ID
     * @param DestNamespaceId 目的地命名空间ID
     */
    public void setDestNamespaceId(String DestNamespaceId) {
        this.DestNamespaceId = DestNamespaceId;
    }

    /**
     * Get 目的地命名空间名称 
     * @return DestNamespaceName 目的地命名空间名称
     */
    public String getDestNamespaceName() {
        return this.DestNamespaceName;
    }

    /**
     * Set 目的地命名空间名称
     * @param DestNamespaceName 目的地命名空间名称
     */
    public void setDestNamespaceName(String DestNamespaceName) {
        this.DestNamespaceName = DestNamespaceName;
    }

    /**
     * Get 规则项名称 
     * @return Name 规则项名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则项名称
     * @param Name 规则项名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 规则项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 规则项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 单元化规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitRuleId 单元化规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnitRuleId() {
        return this.UnitRuleId;
    }

    /**
     * Set 单元化规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitRuleId 单元化规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitRuleId(String UnitRuleId) {
        this.UnitRuleId = UnitRuleId;
    }

    /**
     * Get 规则顺序，越小优先级越高：默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 规则顺序，越小优先级越高：默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则顺序，越小优先级越高：默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 规则顺序，越小优先级越高：默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitRuleTagList 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UnitRuleTag [] getUnitRuleTagList() {
        return this.UnitRuleTagList;
    }

    /**
     * Set 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitRuleTagList 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitRuleTagList(UnitRuleTag [] UnitRuleTagList) {
        this.UnitRuleTagList = UnitRuleTagList;
    }

    public UnitRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnitRuleItem(UnitRuleItem source) {
        if (source.Relationship != null) {
            this.Relationship = new String(source.Relationship);
        }
        if (source.DestNamespaceId != null) {
            this.DestNamespaceId = new String(source.DestNamespaceId);
        }
        if (source.DestNamespaceName != null) {
            this.DestNamespaceName = new String(source.DestNamespaceName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.UnitRuleId != null) {
            this.UnitRuleId = new String(source.UnitRuleId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UnitRuleTagList != null) {
            this.UnitRuleTagList = new UnitRuleTag[source.UnitRuleTagList.length];
            for (int i = 0; i < source.UnitRuleTagList.length; i++) {
                this.UnitRuleTagList[i] = new UnitRuleTag(source.UnitRuleTagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Relationship", this.Relationship);
        this.setParamSimple(map, prefix + "DestNamespaceId", this.DestNamespaceId);
        this.setParamSimple(map, prefix + "DestNamespaceName", this.DestNamespaceName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UnitRuleId", this.UnitRuleId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "UnitRuleTagList.", this.UnitRuleTagList);

    }
}

