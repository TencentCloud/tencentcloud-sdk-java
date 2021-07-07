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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BashRule extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 危险等级(0 ：无 1: 高危 2:中危 3: 低危)
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 正则表达式
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 规则描述
    */
    @SerializedName("Decription")
    @Expose
    private String Decription;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 是否全局规则
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 状态 (0: 有效 1: 无效)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 主机IP
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * 生效服务器的uuid数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 0=黑名单 1=白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * 是否处理之前的事件 0: 不处理 1:处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID 
     * @return Uuid 客户端ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端ID
     * @param Uuid 客户端ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

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
     * Get 危险等级(0 ：无 1: 高危 2:中危 3: 低危) 
     * @return Level 危险等级(0 ：无 1: 高危 2:中危 3: 低危)
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级(0 ：无 1: 高危 2:中危 3: 低危)
     * @param Level 危险等级(0 ：无 1: 高危 2:中危 3: 低危)
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 正则表达式 
     * @return Rule 正则表达式
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 正则表达式
     * @param Rule 正则表达式
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 规则描述 
     * @return Decription 规则描述
     */
    public String getDecription() {
        return this.Decription;
    }

    /**
     * Set 规则描述
     * @param Decription 规则描述
     */
    public void setDecription(String Decription) {
        this.Decription = Decription;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否全局规则 
     * @return IsGlobal 是否全局规则
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则
     * @param IsGlobal 是否全局规则
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 状态 (0: 有效 1: 无效) 
     * @return Status 状态 (0: 有效 1: 无效)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 (0: 有效 1: 无效)
     * @param Status 状态 (0: 有效 1: 无效)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 主机IP 
     * @return Hostip 主机IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set 主机IP
     * @param Hostip 主机IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Get 生效服务器的uuid数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuids 生效服务器的uuid数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 生效服务器的uuid数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuids 生效服务器的uuid数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 0=黑名单 1=白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return White 0=黑名单 1=白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWhite() {
        return this.White;
    }

    /**
     * Set 0=黑名单 1=白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param White 0=黑名单 1=白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhite(Long White) {
        this.White = White;
    }

    /**
     * Get 是否处理之前的事件 0: 不处理 1:处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealOldEvents 是否处理之前的事件 0: 不处理 1:处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set 是否处理之前的事件 0: 不处理 1:处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealOldEvents 是否处理之前的事件 0: 不处理 1:处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    public BashRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashRule(BashRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Decription != null) {
            this.Decription = new String(source.Decription);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Decription", this.Decription);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);

    }
}

