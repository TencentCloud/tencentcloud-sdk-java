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

public class UnitRule extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 网关实体ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 使用状态：enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitRuleItemList")
    @Expose
    private UnitRuleItem [] UnitRuleItemList;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 网关实体ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayInstanceId 网关实体ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayInstanceId 网关实体ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
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
     * Get 使用状态：enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 使用状态：enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 使用状态：enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 使用状态：enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitRuleItemList 规则项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UnitRuleItem [] getUnitRuleItemList() {
        return this.UnitRuleItemList;
    }

    /**
     * Set 规则项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitRuleItemList 规则项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitRuleItemList(UnitRuleItem [] UnitRuleItemList) {
        this.UnitRuleItemList = UnitRuleItemList;
    }

    public UnitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnitRule(UnitRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UnitRuleItemList != null) {
            this.UnitRuleItemList = new UnitRuleItem[source.UnitRuleItemList.length];
            for (int i = 0; i < source.UnitRuleItemList.length; i++) {
                this.UnitRuleItemList[i] = new UnitRuleItem(source.UnitRuleItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "UnitRuleItemList.", this.UnitRuleItemList);

    }
}

