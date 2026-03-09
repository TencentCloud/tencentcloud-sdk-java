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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGovernanceLaneGroup extends AbstractModel {

    /**
    * 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 泳道组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 泳道入口服务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficEntries")
    @Expose
    private LaneTrafficEntry [] TrafficEntries;

    /**
    * 泳道服务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destinations")
    @Expose
    private GovernanceServiceDestination [] Destinations;

    /**
    * 泳道组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则内容摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 规则一致性状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Consistency")
    @Expose
    private String Consistency;

    /**
    * 泳道规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private GovernanceLaneRule [] Rules;

    /**
     * Get 泳道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 泳道组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 泳道组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 泳道组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 泳道组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 泳道入口服务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficEntries 泳道入口服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LaneTrafficEntry [] getTrafficEntries() {
        return this.TrafficEntries;
    }

    /**
     * Set 泳道入口服务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficEntries 泳道入口服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficEntries(LaneTrafficEntry [] TrafficEntries) {
        this.TrafficEntries = TrafficEntries;
    }

    /**
     * Get 泳道服务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destinations 泳道服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovernanceServiceDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set 泳道服务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destinations 泳道服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinations(GovernanceServiceDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get 泳道组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 泳道组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 泳道组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 泳道组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则内容摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revision 规则内容摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 规则内容摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revision 规则内容摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 规则一致性状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Consistency 规则一致性状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsistency() {
        return this.Consistency;
    }

    /**
     * Set 规则一致性状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Consistency 规则一致性状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsistency(String Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get 泳道规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 泳道规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovernanceLaneRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 泳道规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 泳道规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(GovernanceLaneRule [] Rules) {
        this.Rules = Rules;
    }

    public DeleteGovernanceLaneGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGovernanceLaneGroup(DeleteGovernanceLaneGroup source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.TrafficEntries != null) {
            this.TrafficEntries = new LaneTrafficEntry[source.TrafficEntries.length];
            for (int i = 0; i < source.TrafficEntries.length; i++) {
                this.TrafficEntries[i] = new LaneTrafficEntry(source.TrafficEntries[i]);
            }
        }
        if (source.Destinations != null) {
            this.Destinations = new GovernanceServiceDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new GovernanceServiceDestination(source.Destinations[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Consistency != null) {
            this.Consistency = new String(source.Consistency);
        }
        if (source.Rules != null) {
            this.Rules = new GovernanceLaneRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new GovernanceLaneRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArrayObj(map, prefix + "TrafficEntries.", this.TrafficEntries);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Consistency", this.Consistency);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

