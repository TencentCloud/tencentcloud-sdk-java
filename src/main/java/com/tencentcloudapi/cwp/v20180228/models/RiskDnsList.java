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

public class RiskDnsList extends AbstractModel{

    /**
    * 对外访问域名
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 访问次数
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程MD5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * 是否为全局规则，0否，1是
    */
    @SerializedName("GlobalRuleId")
    @Expose
    private Long GlobalRuleId;

    /**
    * 用户规则id
    */
    @SerializedName("UserRuleId")
    @Expose
    private Long UserRuleId;

    /**
    * 状态；0-待处理，2-已加白，3-非信任状态，4-已处理，5-已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 首次访问时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近访问时间
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 唯一 Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 参考
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 命令行
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 进程号
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 唯一UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 建议方案
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * 标签特性
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 外网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机在线状态 OFFLINE  ONLINE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
     * Get 对外访问域名 
     * @return Url 对外访问域名
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 对外访问域名
     * @param Url 对外访问域名
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 访问次数 
     * @return AccessCount 访问次数
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set 访问次数
     * @param AccessCount 访问次数
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get 进程名 
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 进程MD5 
     * @return ProcessMd5 进程MD5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set 进程MD5
     * @param ProcessMd5 进程MD5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get 是否为全局规则，0否，1是 
     * @return GlobalRuleId 是否为全局规则，0否，1是
     */
    public Long getGlobalRuleId() {
        return this.GlobalRuleId;
    }

    /**
     * Set 是否为全局规则，0否，1是
     * @param GlobalRuleId 是否为全局规则，0否，1是
     */
    public void setGlobalRuleId(Long GlobalRuleId) {
        this.GlobalRuleId = GlobalRuleId;
    }

    /**
     * Get 用户规则id 
     * @return UserRuleId 用户规则id
     */
    public Long getUserRuleId() {
        return this.UserRuleId;
    }

    /**
     * Set 用户规则id
     * @param UserRuleId 用户规则id
     */
    public void setUserRuleId(Long UserRuleId) {
        this.UserRuleId = UserRuleId;
    }

    /**
     * Get 状态；0-待处理，2-已加白，3-非信任状态，4-已处理，5-已忽略 
     * @return Status 状态；0-待处理，2-已加白，3-非信任状态，4-已处理，5-已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态；0-待处理，2-已加白，3-非信任状态，4-已处理，5-已忽略
     * @param Status 状态；0-待处理，2-已加白，3-非信任状态，4-已处理，5-已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 首次访问时间 
     * @return CreateTime 首次访问时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次访问时间
     * @param CreateTime 首次访问时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近访问时间 
     * @return MergeTime 最近访问时间
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 最近访问时间
     * @param MergeTime 最近访问时间
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 唯一 Quuid 
     * @return Quuid 唯一 Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 唯一 Quuid
     * @param Quuid 唯一 Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机ip 
     * @return HostIp 主机ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机ip
     * @param HostIp 主机ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 别名 
     * @return Alias 别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 别名
     * @param Alias 别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一ID 
     * @return Id 唯一ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID
     * @param Id 唯一ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 参考 
     * @return Reference 参考
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 参考
     * @param Reference 参考
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 命令行 
     * @return CmdLine 命令行
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 命令行
     * @param CmdLine 命令行
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get 进程号 
     * @return Pid 进程号
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程号
     * @param Pid 进程号
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 唯一UUID 
     * @return Uuid 唯一UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 唯一UUID
     * @param Uuid 唯一UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 建议方案 
     * @return SuggestScheme 建议方案
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set 建议方案
     * @param SuggestScheme 建议方案
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get 标签特性 
     * @return Tags 标签特性
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签特性
     * @param Tags 标签特性
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 外网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineWanIp 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineWanIp 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 主机在线状态 OFFLINE  ONLINE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineStatus 主机在线状态 OFFLINE  ONLINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机在线状态 OFFLINE  ONLINE
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineStatus 主机在线状态 OFFLINE  ONLINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    public RiskDnsList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDnsList(RiskDnsList source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.GlobalRuleId != null) {
            this.GlobalRuleId = new Long(source.GlobalRuleId);
        }
        if (source.UserRuleId != null) {
            this.UserRuleId = new Long(source.UserRuleId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "GlobalRuleId", this.GlobalRuleId);
        this.setParamSimple(map, prefix + "UserRuleId", this.UserRuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);

    }
}

