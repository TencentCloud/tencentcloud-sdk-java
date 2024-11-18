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

public class NetAttackEventInfo extends AbstractModel {

    /**
    * 处理状态，0 待处理 1 已处理 2 已加白  3 已忽略 4 已删除 5: 已开启防御
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 攻击源ip
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 攻击源地
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞CVE编号
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * 漏洞攻击热度
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * 漏洞防御状态，0关闭，1开启
    */
    @SerializedName("VulDefenceStatus")
    @Expose
    private Long VulDefenceStatus;

    /**
    * 漏洞是否支持防御，0:不支持 1:支持
    */
    @SerializedName("VulSupportDefense")
    @Expose
    private Long VulSupportDefense;

    /**
    * 服务进程 base64 
    */
    @SerializedName("SvcPs")
    @Expose
    private String SvcPs;

    /**
    * 攻击数据包
    */
    @SerializedName("NetPayload")
    @Expose
    private String NetPayload;

    /**
    * 异常行为
    */
    @SerializedName("AbnormalAction")
    @Expose
    private String AbnormalAction;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机额外信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 攻击次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

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
    * 攻击发生时间
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 0: 尝试攻击 1:攻击成功
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 0:无失陷行为 1: rce(命令执行) 2: dnslog 3: writefile
    */
    @SerializedName("HostOpType")
    @Expose
    private Long HostOpType;

    /**
    * 进程树,需要用base64 解码
    */
    @SerializedName("HostOpProcessTree")
    @Expose
    private String HostOpProcessTree;

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
     * Get 攻击源ip 
     * @return SrcIP 攻击源ip
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 攻击源ip
     * @param SrcIP 攻击源ip
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 攻击源地 
     * @return Location 攻击源地
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 攻击源地
     * @param Location 攻击源地
     */
    public void setLocation(String Location) {
        this.Location = Location;
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
     * Get 漏洞CVE编号 
     * @return CVEId 漏洞CVE编号
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set 漏洞CVE编号
     * @param CVEId 漏洞CVE编号
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get 漏洞攻击热度 
     * @return AttackLevel 漏洞攻击热度
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set 漏洞攻击热度
     * @param AttackLevel 漏洞攻击热度
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get 漏洞防御状态，0关闭，1开启 
     * @return VulDefenceStatus 漏洞防御状态，0关闭，1开启
     */
    public Long getVulDefenceStatus() {
        return this.VulDefenceStatus;
    }

    /**
     * Set 漏洞防御状态，0关闭，1开启
     * @param VulDefenceStatus 漏洞防御状态，0关闭，1开启
     */
    public void setVulDefenceStatus(Long VulDefenceStatus) {
        this.VulDefenceStatus = VulDefenceStatus;
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
     * Get 服务进程 base64  
     * @return SvcPs 服务进程 base64 
     */
    public String getSvcPs() {
        return this.SvcPs;
    }

    /**
     * Set 服务进程 base64 
     * @param SvcPs 服务进程 base64 
     */
    public void setSvcPs(String SvcPs) {
        this.SvcPs = SvcPs;
    }

    /**
     * Get 攻击数据包 
     * @return NetPayload 攻击数据包
     */
    public String getNetPayload() {
        return this.NetPayload;
    }

    /**
     * Set 攻击数据包
     * @param NetPayload 攻击数据包
     */
    public void setNetPayload(String NetPayload) {
        this.NetPayload = NetPayload;
    }

    /**
     * Get 异常行为 
     * @return AbnormalAction 异常行为
     */
    public String getAbnormalAction() {
        return this.AbnormalAction;
    }

    /**
     * Set 异常行为
     * @param AbnormalAction 异常行为
     */
    public void setAbnormalAction(String AbnormalAction) {
        this.AbnormalAction = AbnormalAction;
    }

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机额外信息 
     * @return MachineExtraInfo 主机额外信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
     * @param MachineExtraInfo 主机额外信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
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
     * Get 攻击发生时间 
     * @return MergeTime 攻击发生时间
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 攻击发生时间
     * @param MergeTime 攻击发生时间
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 0: 尝试攻击 1:攻击成功 
     * @return Type 0: 尝试攻击 1:攻击成功
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: 尝试攻击 1:攻击成功
     * @param Type 0: 尝试攻击 1:攻击成功
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 0:无失陷行为 1: rce(命令执行) 2: dnslog 3: writefile 
     * @return HostOpType 0:无失陷行为 1: rce(命令执行) 2: dnslog 3: writefile
     */
    public Long getHostOpType() {
        return this.HostOpType;
    }

    /**
     * Set 0:无失陷行为 1: rce(命令执行) 2: dnslog 3: writefile
     * @param HostOpType 0:无失陷行为 1: rce(命令执行) 2: dnslog 3: writefile
     */
    public void setHostOpType(Long HostOpType) {
        this.HostOpType = HostOpType;
    }

    /**
     * Get 进程树,需要用base64 解码 
     * @return HostOpProcessTree 进程树,需要用base64 解码
     */
    public String getHostOpProcessTree() {
        return this.HostOpProcessTree;
    }

    /**
     * Set 进程树,需要用base64 解码
     * @param HostOpProcessTree 进程树,需要用base64 解码
     */
    public void setHostOpProcessTree(String HostOpProcessTree) {
        this.HostOpProcessTree = HostOpProcessTree;
    }

    public NetAttackEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackEventInfo(NetAttackEventInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.VulDefenceStatus != null) {
            this.VulDefenceStatus = new Long(source.VulDefenceStatus);
        }
        if (source.VulSupportDefense != null) {
            this.VulSupportDefense = new Long(source.VulSupportDefense);
        }
        if (source.SvcPs != null) {
            this.SvcPs = new String(source.SvcPs);
        }
        if (source.NetPayload != null) {
            this.NetPayload = new String(source.NetPayload);
        }
        if (source.AbnormalAction != null) {
            this.AbnormalAction = new String(source.AbnormalAction);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.PayVersion != null) {
            this.PayVersion = new Long(source.PayVersion);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.HostOpType != null) {
            this.HostOpType = new Long(source.HostOpType);
        }
        if (source.HostOpProcessTree != null) {
            this.HostOpProcessTree = new String(source.HostOpProcessTree);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "VulDefenceStatus", this.VulDefenceStatus);
        this.setParamSimple(map, prefix + "VulSupportDefense", this.VulSupportDefense);
        this.setParamSimple(map, prefix + "SvcPs", this.SvcPs);
        this.setParamSimple(map, prefix + "NetPayload", this.NetPayload);
        this.setParamSimple(map, prefix + "AbnormalAction", this.AbnormalAction);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HostOpType", this.HostOpType);
        this.setParamSimple(map, prefix + "HostOpProcessTree", this.HostOpProcessTree);

    }
}

