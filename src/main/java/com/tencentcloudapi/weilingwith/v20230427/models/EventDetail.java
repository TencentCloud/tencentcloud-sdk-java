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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDetail extends AbstractModel {

    /**
    * 事件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 事件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件触发类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 事件触发条件，返回为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerCondition")
    @Expose
    private String TriggerCondition;

    /**
    * 有效期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidPeriod")
    @Expose
    private String ValidPeriod;

    /**
    * 关联规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkRuleSet")
    @Expose
    private LinkRule [] LinkRuleSet;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 设备类型，当触发类型为deviceType时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 设备的wid，当触发类型是device返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
     * Get 事件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 事件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 事件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 事件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件触发类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 事件触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 事件触发类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 事件触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 事件触发条件，返回为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerCondition 事件触发条件，返回为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerCondition() {
        return this.TriggerCondition;
    }

    /**
     * Set 事件触发条件，返回为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerCondition 事件触发条件，返回为x-json后的字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerCondition(String TriggerCondition) {
        this.TriggerCondition = TriggerCondition;
    }

    /**
     * Get 有效期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidPeriod 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidPeriod() {
        return this.ValidPeriod;
    }

    /**
     * Set 有效期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidPeriod 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidPeriod(String ValidPeriod) {
        this.ValidPeriod = ValidPeriod;
    }

    /**
     * Get 关联规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkRuleSet 关联规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkRule [] getLinkRuleSet() {
        return this.LinkRuleSet;
    }

    /**
     * Set 关联规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkRuleSet 关联规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkRuleSet(LinkRule [] LinkRuleSet) {
        this.LinkRuleSet = LinkRuleSet;
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
     * Get 设备类型，当触发类型为deviceType时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 设备类型，当触发类型为deviceType时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，当触发类型为deviceType时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 设备类型，当触发类型为deviceType时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 设备的wid，当触发类型是device返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WID 设备的wid，当触发类型是device返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备的wid，当触发类型是device返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param WID 设备的wid，当触发类型是device返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    public EventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDetail(EventDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.TriggerCondition != null) {
            this.TriggerCondition = new String(source.TriggerCondition);
        }
        if (source.ValidPeriod != null) {
            this.ValidPeriod = new String(source.ValidPeriod);
        }
        if (source.LinkRuleSet != null) {
            this.LinkRuleSet = new LinkRule[source.LinkRuleSet.length];
            for (int i = 0; i < source.LinkRuleSet.length; i++) {
                this.LinkRuleSet[i] = new LinkRule(source.LinkRuleSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "TriggerCondition", this.TriggerCondition);
        this.setParamSimple(map, prefix + "ValidPeriod", this.ValidPeriod);
        this.setParamArrayObj(map, prefix + "LinkRuleSet.", this.LinkRuleSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "WID", this.WID);

    }
}

