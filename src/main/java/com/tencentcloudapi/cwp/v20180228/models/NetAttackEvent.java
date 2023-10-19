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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetAttackEvent extends AbstractModel {

    /**
    * 日志ID
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
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 来源IP
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 来源地
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 攻击时间
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 攻击状态，0: 尝试攻击 1: 实锤攻击(攻击成功)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 处理状态，0 待处理 1 已处理 2 已加白  3 已忽略 4 已删除 5: 已开启防御
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 漏洞是否支持防御，0:不支持 1:支持
    */
    @SerializedName("VulSupportDefense")
    @Expose
    private Long VulSupportDefense;

    /**
    * 是否开启漏洞防御，0关1开
    */
    @SerializedName("VulDefenceStatus")
    @Expose
    private Long VulDefenceStatus;

    /**
    * 机器付费版本，0 基础版，1专业版，2旗舰版，3普惠版
    */
    @SerializedName("PayVersion")
    @Expose
    private Long PayVersion;

    /**
    * cvm uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 攻击次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 是否今日新增主机
    */
    @SerializedName("New")
    @Expose
    private Boolean New;

    /**
     * Get 日志ID 
     * @return Id 日志ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 日志ID
     * @param Id 日志ID
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
     * Get 目标端口 
     * @return DstPort 目标端口
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 来源IP 
     * @return SrcIP 来源IP
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 来源IP
     * @param SrcIP 来源IP
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 来源地 
     * @return Location 来源地
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 来源地
     * @param Location 来源地
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 攻击时间 
     * @return MergeTime 攻击时间
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 攻击时间
     * @param MergeTime 攻击时间
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
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

    /**
     * Get 攻击状态，0: 尝试攻击 1: 实锤攻击(攻击成功) 
     * @return Type 攻击状态，0: 尝试攻击 1: 实锤攻击(攻击成功)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 攻击状态，0: 尝试攻击 1: 实锤攻击(攻击成功)
     * @param Type 攻击状态，0: 尝试攻击 1: 实锤攻击(攻击成功)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 处理状态，0 待处理 1 已处理 2 已加白  3 已忽略 4 已删除 5: 已开启防御 
     * @return Status 处理状态，0 待处理 1 已处理 2 已加白  3 已忽略 4 已删除 5: 已开启防御
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态，0 待处理 1 已处理 2 已加白  3 已忽略 4 已删除 5: 已开启防御
     * @param Status 处理状态，0 待处理 1 已处理 2 已加白  3 已忽略 4 已删除 5: 已开启防御
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 漏洞是否支持防御，0:不支持 1:支持 
     * @return VulSupportDefense 漏洞是否支持防御，0:不支持 1:支持
     */
    public Long getVulSupportDefense() {
        return this.VulSupportDefense;
    }

    /**
     * Set 漏洞是否支持防御，0:不支持 1:支持
     * @param VulSupportDefense 漏洞是否支持防御，0:不支持 1:支持
     */
    public void setVulSupportDefense(Long VulSupportDefense) {
        this.VulSupportDefense = VulSupportDefense;
    }

    /**
     * Get 是否开启漏洞防御，0关1开 
     * @return VulDefenceStatus 是否开启漏洞防御，0关1开
     */
    public Long getVulDefenceStatus() {
        return this.VulDefenceStatus;
    }

    /**
     * Set 是否开启漏洞防御，0关1开
     * @param VulDefenceStatus 是否开启漏洞防御，0关1开
     */
    public void setVulDefenceStatus(Long VulDefenceStatus) {
        this.VulDefenceStatus = VulDefenceStatus;
    }

    /**
     * Get 机器付费版本，0 基础版，1专业版，2旗舰版，3普惠版 
     * @return PayVersion 机器付费版本，0 基础版，1专业版，2旗舰版，3普惠版
     */
    public Long getPayVersion() {
        return this.PayVersion;
    }

    /**
     * Set 机器付费版本，0 基础版，1专业版，2旗舰版，3普惠版
     * @param PayVersion 机器付费版本，0 基础版，1专业版，2旗舰版，3普惠版
     */
    public void setPayVersion(Long PayVersion) {
        this.PayVersion = PayVersion;
    }

    /**
     * Get cvm uuid 
     * @return Quuid cvm uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm uuid
     * @param Quuid cvm uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 攻击次数 
     * @return Count 攻击次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 攻击次数
     * @param Count 攻击次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 是否今日新增主机 
     * @return New 是否今日新增主机
     */
    public Boolean getNew() {
        return this.New;
    }

    /**
     * Set 是否今日新增主机
     * @param New 是否今日新增主机
     */
    public void setNew(Boolean New) {
        this.New = New;
    }

    public NetAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackEvent(NetAttackEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VulSupportDefense != null) {
            this.VulSupportDefense = new Long(source.VulSupportDefense);
        }
        if (source.VulDefenceStatus != null) {
            this.VulDefenceStatus = new Long(source.VulDefenceStatus);
        }
        if (source.PayVersion != null) {
            this.PayVersion = new Long(source.PayVersion);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.New != null) {
            this.New = new Boolean(source.New);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VulSupportDefense", this.VulSupportDefense);
        this.setParamSimple(map, prefix + "VulDefenceStatus", this.VulDefenceStatus);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "New", this.New);

    }
}

