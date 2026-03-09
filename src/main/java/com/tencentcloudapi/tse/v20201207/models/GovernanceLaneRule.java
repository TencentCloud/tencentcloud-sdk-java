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

public class GovernanceLaneRule extends AbstractModel {

    /**
    * 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 泳道所属泳道组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneGroup")
    @Expose
    private String LaneGroup;

    /**
    * 泳道规则启用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 流量标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficLabels")
    @Expose
    private Argument [] TrafficLabels;

    /**
    * 多个流量标签匹配方式
AND：与
OR：或
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficMatchMode")
    @Expose
    private String TrafficMatchMode;

    /**
    * 泳道匹配方式
STRICT：严格匹配
PERMISSIVE：宽松匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneMatchMode")
    @Expose
    private String LaneMatchMode;

    /**
    * 泳道灰度规则
    */
    @SerializedName("TrafficGray")
    @Expose
    private TrafficGray TrafficGray;

    /**
    * 泳道规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 泳道标签内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneLabelValue")
    @Expose
    private String LaneLabelValue;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 启用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 泳道规则优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 规则摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
     * Get 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

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
     * Get 泳道所属泳道组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneGroup 泳道所属泳道组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneGroup() {
        return this.LaneGroup;
    }

    /**
     * Set 泳道所属泳道组
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneGroup 泳道所属泳道组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneGroup(String LaneGroup) {
        this.LaneGroup = LaneGroup;
    }

    /**
     * Get 泳道规则启用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 泳道规则启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 泳道规则启用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 泳道规则启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 流量标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficLabels 流量标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Argument [] getTrafficLabels() {
        return this.TrafficLabels;
    }

    /**
     * Set 流量标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficLabels 流量标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficLabels(Argument [] TrafficLabels) {
        this.TrafficLabels = TrafficLabels;
    }

    /**
     * Get 多个流量标签匹配方式
AND：与
OR：或
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficMatchMode 多个流量标签匹配方式
AND：与
OR：或
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrafficMatchMode() {
        return this.TrafficMatchMode;
    }

    /**
     * Set 多个流量标签匹配方式
AND：与
OR：或
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficMatchMode 多个流量标签匹配方式
AND：与
OR：或
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficMatchMode(String TrafficMatchMode) {
        this.TrafficMatchMode = TrafficMatchMode;
    }

    /**
     * Get 泳道匹配方式
STRICT：严格匹配
PERMISSIVE：宽松匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneMatchMode 泳道匹配方式
STRICT：严格匹配
PERMISSIVE：宽松匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneMatchMode() {
        return this.LaneMatchMode;
    }

    /**
     * Set 泳道匹配方式
STRICT：严格匹配
PERMISSIVE：宽松匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneMatchMode 泳道匹配方式
STRICT：严格匹配
PERMISSIVE：宽松匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneMatchMode(String LaneMatchMode) {
        this.LaneMatchMode = LaneMatchMode;
    }

    /**
     * Get 泳道灰度规则 
     * @return TrafficGray 泳道灰度规则
     */
    public TrafficGray getTrafficGray() {
        return this.TrafficGray;
    }

    /**
     * Set 泳道灰度规则
     * @param TrafficGray 泳道灰度规则
     */
    public void setTrafficGray(TrafficGray TrafficGray) {
        this.TrafficGray = TrafficGray;
    }

    /**
     * Get 泳道规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 泳道规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 泳道规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 泳道规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 泳道标签内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneLabelValue 泳道标签内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneLabelValue() {
        return this.LaneLabelValue;
    }

    /**
     * Set 泳道标签内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneLabelValue 泳道标签内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneLabelValue(String LaneLabelValue) {
        this.LaneLabelValue = LaneLabelValue;
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
     * Get 启用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableTime 启用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set 启用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableTime 启用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
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
     * Get 泳道规则优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 泳道规则优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 泳道规则优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 泳道规则优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 规则摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revision 规则摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 规则摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revision 规则摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    public GovernanceLaneRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceLaneRule(GovernanceLaneRule source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LaneGroup != null) {
            this.LaneGroup = new String(source.LaneGroup);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.TrafficLabels != null) {
            this.TrafficLabels = new Argument[source.TrafficLabels.length];
            for (int i = 0; i < source.TrafficLabels.length; i++) {
                this.TrafficLabels[i] = new Argument(source.TrafficLabels[i]);
            }
        }
        if (source.TrafficMatchMode != null) {
            this.TrafficMatchMode = new String(source.TrafficMatchMode);
        }
        if (source.LaneMatchMode != null) {
            this.LaneMatchMode = new String(source.LaneMatchMode);
        }
        if (source.TrafficGray != null) {
            this.TrafficGray = new TrafficGray(source.TrafficGray);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LaneLabelValue != null) {
            this.LaneLabelValue = new String(source.LaneLabelValue);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LaneGroup", this.LaneGroup);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "TrafficLabels.", this.TrafficLabels);
        this.setParamSimple(map, prefix + "TrafficMatchMode", this.TrafficMatchMode);
        this.setParamSimple(map, prefix + "LaneMatchMode", this.LaneMatchMode);
        this.setParamObj(map, prefix + "TrafficGray.", this.TrafficGray);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LaneLabelValue", this.LaneLabelValue);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Revision", this.Revision);

    }
}

