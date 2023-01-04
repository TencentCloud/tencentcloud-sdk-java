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

public class BaselineItem extends AbstractModel{

    /**
    * 项Id
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * 项名称
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 检测项分类
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 项描述
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * 修复方法
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * 所属规则
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 检测结果描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectResultDesc")
    @Expose
    private String DetectResultDesc;

    /**
    * 危险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 检测状态：0 未通过，1：忽略，3：通过，5：检测中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * 主机ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最近出现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 是否可以修复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanBeFixed")
    @Expose
    private Long CanBeFixed;

    /**
    * 主机安全uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 项Id 
     * @return ItemId 项Id
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set 项Id
     * @param ItemId 项Id
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 项名称 
     * @return ItemName 项名称
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 项名称
     * @param ItemName 项名称
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 检测项分类 
     * @return CategoryId 检测项分类
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 检测项分类
     * @param CategoryId 检测项分类
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 项描述 
     * @return ItemDesc 项描述
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set 项描述
     * @param ItemDesc 项描述
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get 修复方法 
     * @return FixMethod 修复方法
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 修复方法
     * @param FixMethod 修复方法
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get 所属规则 
     * @return RuleName 所属规则
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 所属规则
     * @param RuleName 所属规则
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 检测结果描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectResultDesc 检测结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetectResultDesc() {
        return this.DetectResultDesc;
    }

    /**
     * Set 检测结果描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectResultDesc 检测结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectResultDesc(String DetectResultDesc) {
        this.DetectResultDesc = DetectResultDesc;
    }

    /**
     * Get 危险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 危险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 危险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 检测状态：0 未通过，1：忽略，3：通过，5：检测中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectStatus 检测状态：0 未通过，1：忽略，3：通过，5：检测中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 检测状态：0 未通过，1：忽略，3：通过，5：检测中
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectStatus 检测状态：0 未通过，1：忽略，3：通过，5：检测中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get 主机ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostId 主机ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostId 主机ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIp 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIp 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 外网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTime 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTime 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最近出现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTime 最近出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最近出现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTime 最近出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 是否可以修复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanBeFixed 是否可以修复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCanBeFixed() {
        return this.CanBeFixed;
    }

    /**
     * Set 是否可以修复
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanBeFixed 是否可以修复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanBeFixed(Long CanBeFixed) {
        this.CanBeFixed = CanBeFixed;
    }

    /**
     * Get 主机安全uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 主机安全uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 主机安全uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public BaselineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItem(BaselineItem source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.ItemDesc != null) {
            this.ItemDesc = new String(source.ItemDesc);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String(source.FixMethod);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.DetectResultDesc != null) {
            this.DetectResultDesc = new String(source.DetectResultDesc);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.CanBeFixed != null) {
            this.CanBeFixed = new Long(source.CanBeFixed);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "ItemDesc", this.ItemDesc);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "DetectResultDesc", this.DetectResultDesc);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "CanBeFixed", this.CanBeFixed);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

