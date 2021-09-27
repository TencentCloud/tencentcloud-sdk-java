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

public class AssetWebServiceBaseInfo extends AbstractModel{

    /**
    * 主机内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 操作系统信息
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * 主机业务组ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 主机标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * 数据库名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 二进制路径
    */
    @SerializedName("BinPath")
    @Expose
    private String BinPath;

    /**
    * 启动用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 安装路径
    */
    @SerializedName("InstallPath")
    @Expose
    private String InstallPath;

    /**
    * 配置路径
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * 关联进程数
    */
    @SerializedName("ProcessCount")
    @Expose
    private Long ProcessCount;

    /**
    * Web服务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 主机内网IP 
     * @return MachineIp 主机内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP
     * @param MachineIp 主机内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机外网IP 
     * @return MachineWanIp 主机外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP
     * @param MachineWanIp 主机外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 操作系统信息 
     * @return OsInfo 操作系统信息
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set 操作系统信息
     * @param OsInfo 操作系统信息
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get 主机业务组ID 
     * @return ProjectId 主机业务组ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 主机业务组ID
     * @param ProjectId 主机业务组ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 主机标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 数据库名 
     * @return Name 数据库名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名
     * @param Name 数据库名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 二进制路径 
     * @return BinPath 二进制路径
     */
    public String getBinPath() {
        return this.BinPath;
    }

    /**
     * Set 二进制路径
     * @param BinPath 二进制路径
     */
    public void setBinPath(String BinPath) {
        this.BinPath = BinPath;
    }

    /**
     * Get 启动用户 
     * @return User 启动用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 启动用户
     * @param User 启动用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 安装路径 
     * @return InstallPath 安装路径
     */
    public String getInstallPath() {
        return this.InstallPath;
    }

    /**
     * Set 安装路径
     * @param InstallPath 安装路径
     */
    public void setInstallPath(String InstallPath) {
        this.InstallPath = InstallPath;
    }

    /**
     * Get 配置路径 
     * @return ConfigPath 配置路径
     */
    public String getConfigPath() {
        return this.ConfigPath;
    }

    /**
     * Set 配置路径
     * @param ConfigPath 配置路径
     */
    public void setConfigPath(String ConfigPath) {
        this.ConfigPath = ConfigPath;
    }

    /**
     * Get 关联进程数 
     * @return ProcessCount 关联进程数
     */
    public Long getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set 关联进程数
     * @param ProcessCount 关联进程数
     */
    public void setProcessCount(Long ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get Web服务ID 
     * @return Id Web服务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Web服务ID
     * @param Id Web服务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 主机名称 
     * @return MachineName 主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称
     * @param MachineName 主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetWebServiceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebServiceBaseInfo(AssetWebServiceBaseInfo source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.BinPath != null) {
            this.BinPath = new String(source.BinPath);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.InstallPath != null) {
            this.InstallPath = new String(source.InstallPath);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
        }
        if (source.ProcessCount != null) {
            this.ProcessCount = new Long(source.ProcessCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "BinPath", this.BinPath);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "InstallPath", this.InstallPath);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "ProcessCount", this.ProcessCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

