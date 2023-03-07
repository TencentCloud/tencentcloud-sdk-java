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

public class BaselineFix extends AbstractModel{

    /**
    * 修复项名称
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 主机Ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 首次检测时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后检测时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 修复时间
    */
    @SerializedName("FixTime")
    @Expose
    private String FixTime;

    /**
    * 基线检测项结果ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 修复项名称 
     * @return ItemName 修复项名称
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 修复项名称
     * @param ItemName 修复项名称
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 主机Ip 
     * @return HostIp 主机Ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机Ip
     * @param HostIp 主机Ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 首次检测时间 
     * @return CreateTime 首次检测时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次检测时间
     * @param CreateTime 首次检测时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后检测时间 
     * @return ModifyTime 最后检测时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最后检测时间
     * @param ModifyTime 最后检测时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 修复时间 
     * @return FixTime 修复时间
     */
    public String getFixTime() {
        return this.FixTime;
    }

    /**
     * Set 修复时间
     * @param FixTime 修复时间
     */
    public void setFixTime(String FixTime) {
        this.FixTime = FixTime;
    }

    /**
     * Get 基线检测项结果ID 
     * @return Id 基线检测项结果ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 基线检测项结果ID
     * @param Id 基线检测项结果ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    public BaselineFix() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineFix(BaselineFix source) {
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.FixTime != null) {
            this.FixTime = new String(source.FixTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "FixTime", this.FixTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

