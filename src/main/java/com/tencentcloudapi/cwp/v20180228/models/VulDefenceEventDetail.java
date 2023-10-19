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

public class VulDefenceEventDetail extends AbstractModel {

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * cve编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 漏洞事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 攻击源ip
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 攻击源ip地址所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 攻击源端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourcePort")
    @Expose
    private Long [] SourcePort;

    /**
    * 创建事件时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新事件时间
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 事件发生次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ONLINE OFFLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 漏洞描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修复建议
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * 攻击payload
    */
    @SerializedName("NetworkPayload")
    @Expose
    private String NetworkPayload;

    /**
    * 关联进程pid
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 关联进程主类名
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 堆栈信息(rasp特有)
    */
    @SerializedName("StackTrace")
    @Expose
    private String StackTrace;

    /**
    * 漏洞ID相关的事件详情(json array格式 rasp特有)
    */
    @SerializedName("EventDetail")
    @Expose
    private String EventDetail;

    /**
    * 主机失陷事件进程树(json格式 WeDetect特有)
    */
    @SerializedName("ExceptionPstree")
    @Expose
    private String ExceptionPstree;

    /**
    * 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

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
     * Get cve编号 
     * @return CveId cve编号
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
     * @param CveId cve编号
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 漏洞事件id 
     * @return Id 漏洞事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞事件id
     * @param Id 漏洞事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名 
     * @return Alias 主机名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 主机名
     * @param Alias 主机名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 内网ip 
     * @return PrivateIp 内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
     * @param PrivateIp 内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公网ip 
     * @return PublicIp 公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
     * @param PublicIp 公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件 
     * @return EventType 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
     * @param EventType 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 攻击源ip 
     * @return SourceIp 攻击源ip
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 攻击源ip
     * @param SourceIp 攻击源ip
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 攻击源ip地址所在城市 
     * @return City 攻击源ip地址所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 攻击源ip地址所在城市
     * @param City 攻击源ip地址所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 攻击源端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourcePort 攻击源端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set 攻击源端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourcePort 攻击源端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourcePort(Long [] SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get 创建事件时间 
     * @return CreateTime 创建事件时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建事件时间
     * @param CreateTime 创建事件时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新事件时间 
     * @return MergeTime 更新事件时间
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 更新事件时间
     * @param MergeTime 更新事件时间
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 事件发生次数 
     * @return Count 事件发生次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 事件发生次数
     * @param Count 事件发生次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 
     * @return Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
     * @param Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get ONLINE OFFLINE 
     * @return MachineStatus ONLINE OFFLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set ONLINE OFFLINE
     * @param MachineStatus ONLINE OFFLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 漏洞描述信息 
     * @return Description 漏洞描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 漏洞描述信息
     * @param Description 漏洞描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修复建议 
     * @return Fix 修复建议
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复建议
     * @param Fix 修复建议
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get 攻击payload 
     * @return NetworkPayload 攻击payload
     */
    public String getNetworkPayload() {
        return this.NetworkPayload;
    }

    /**
     * Set 攻击payload
     * @param NetworkPayload 攻击payload
     */
    public void setNetworkPayload(String NetworkPayload) {
        this.NetworkPayload = NetworkPayload;
    }

    /**
     * Get 关联进程pid 
     * @return Pid 关联进程pid
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 关联进程pid
     * @param Pid 关联进程pid
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 关联进程主类名 
     * @return MainClass 关联进程主类名
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set 关联进程主类名
     * @param MainClass 关联进程主类名
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 堆栈信息(rasp特有) 
     * @return StackTrace 堆栈信息(rasp特有)
     */
    public String getStackTrace() {
        return this.StackTrace;
    }

    /**
     * Set 堆栈信息(rasp特有)
     * @param StackTrace 堆栈信息(rasp特有)
     */
    public void setStackTrace(String StackTrace) {
        this.StackTrace = StackTrace;
    }

    /**
     * Get 漏洞ID相关的事件详情(json array格式 rasp特有) 
     * @return EventDetail 漏洞ID相关的事件详情(json array格式 rasp特有)
     */
    public String getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set 漏洞ID相关的事件详情(json array格式 rasp特有)
     * @param EventDetail 漏洞ID相关的事件详情(json array格式 rasp特有)
     */
    public void setEventDetail(String EventDetail) {
        this.EventDetail = EventDetail;
    }

    /**
     * Get 主机失陷事件进程树(json格式 WeDetect特有) 
     * @return ExceptionPstree 主机失陷事件进程树(json格式 WeDetect特有)
     */
    public String getExceptionPstree() {
        return this.ExceptionPstree;
    }

    /**
     * Set 主机失陷事件进程树(json格式 WeDetect特有)
     * @param ExceptionPstree 主机失陷事件进程树(json格式 WeDetect特有)
     */
    public void setExceptionPstree(String ExceptionPstree) {
        this.ExceptionPstree = ExceptionPstree;
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

    public VulDefenceEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceEventDetail(VulDefenceEventDetail source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new Long[source.SourcePort.length];
            for (int i = 0; i < source.SourcePort.length; i++) {
                this.SourcePort[i] = new Long(source.SourcePort[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.NetworkPayload != null) {
            this.NetworkPayload = new String(source.NetworkPayload);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.StackTrace != null) {
            this.StackTrace = new String(source.StackTrace);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new String(source.EventDetail);
        }
        if (source.ExceptionPstree != null) {
            this.ExceptionPstree = new String(source.ExceptionPstree);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamArraySimple(map, prefix + "SourcePort.", this.SourcePort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "NetworkPayload", this.NetworkPayload);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "StackTrace", this.StackTrace);
        this.setParamSimple(map, prefix + "EventDetail", this.EventDetail);
        this.setParamSimple(map, prefix + "ExceptionPstree", this.ExceptionPstree);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

