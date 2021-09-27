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

public class AssetWebAppBaseInfo extends AbstractModel{

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
    * 应用名
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
    * 根路径
    */
    @SerializedName("RootPath")
    @Expose
    private String RootPath;

    /**
    * 服务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 站点域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 虚拟路径
    */
    @SerializedName("VirtualPath")
    @Expose
    private String VirtualPath;

    /**
    * 插件数
    */
    @SerializedName("PluginCount")
    @Expose
    private Long PluginCount;

    /**
    * 应用ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 应用描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

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
     * Get 应用名 
     * @return Name 应用名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名
     * @param Name 应用名
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
     * Get 根路径 
     * @return RootPath 根路径
     */
    public String getRootPath() {
        return this.RootPath;
    }

    /**
     * Set 根路径
     * @param RootPath 根路径
     */
    public void setRootPath(String RootPath) {
        this.RootPath = RootPath;
    }

    /**
     * Get 服务类型 
     * @return ServiceType 服务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
     * @param ServiceType 服务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 站点域名 
     * @return Domain 站点域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 站点域名
     * @param Domain 站点域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 虚拟路径 
     * @return VirtualPath 虚拟路径
     */
    public String getVirtualPath() {
        return this.VirtualPath;
    }

    /**
     * Set 虚拟路径
     * @param VirtualPath 虚拟路径
     */
    public void setVirtualPath(String VirtualPath) {
        this.VirtualPath = VirtualPath;
    }

    /**
     * Get 插件数 
     * @return PluginCount 插件数
     */
    public Long getPluginCount() {
        return this.PluginCount;
    }

    /**
     * Set 插件数
     * @param PluginCount 插件数
     */
    public void setPluginCount(Long PluginCount) {
        this.PluginCount = PluginCount;
    }

    /**
     * Get 应用ID 
     * @return Id 应用ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 应用ID
     * @param Id 应用ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 应用描述 
     * @return Desc 应用描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 应用描述
     * @param Desc 应用描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
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

    public AssetWebAppBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebAppBaseInfo(AssetWebAppBaseInfo source) {
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
        if (source.RootPath != null) {
            this.RootPath = new String(source.RootPath);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VirtualPath != null) {
            this.VirtualPath = new String(source.VirtualPath);
        }
        if (source.PluginCount != null) {
            this.PluginCount = new Long(source.PluginCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
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
        this.setParamSimple(map, prefix + "RootPath", this.RootPath);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VirtualPath", this.VirtualPath);
        this.setParamSimple(map, prefix + "PluginCount", this.PluginCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

