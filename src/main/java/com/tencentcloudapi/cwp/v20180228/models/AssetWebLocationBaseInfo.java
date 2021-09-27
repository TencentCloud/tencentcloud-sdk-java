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

public class AssetWebLocationBaseInfo extends AbstractModel{

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 操作系统
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * 域名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 站点端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 站点协议
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 服务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 站点路经数
    */
    @SerializedName("PathCount")
    @Expose
    private Long PathCount;

    /**
    * 运行用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 主目录
    */
    @SerializedName("MainPath")
    @Expose
    private String MainPath;

    /**
    * 主目录所有者
    */
    @SerializedName("MainPathOwner")
    @Expose
    private String MainPathOwner;

    /**
    * 拥有者权限
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 主机业务组ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 主机标签
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Web站点Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get 内网IP 
     * @return MachineIp 内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 内网IP
     * @param MachineIp 内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 外网IP 
     * @return MachineWanIp 外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 外网IP
     * @param MachineWanIp 外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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
     * Get 操作系统 
     * @return OsInfo 操作系统
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set 操作系统
     * @param OsInfo 操作系统
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get 域名 
     * @return Name 域名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 域名
     * @param Name 域名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 站点端口 
     * @return Port 站点端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 站点端口
     * @param Port 站点端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 站点协议 
     * @return Proto 站点协议
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 站点协议
     * @param Proto 站点协议
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
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
     * Get 站点路经数 
     * @return PathCount 站点路经数
     */
    public Long getPathCount() {
        return this.PathCount;
    }

    /**
     * Set 站点路经数
     * @param PathCount 站点路经数
     */
    public void setPathCount(Long PathCount) {
        this.PathCount = PathCount;
    }

    /**
     * Get 运行用户 
     * @return User 运行用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 运行用户
     * @param User 运行用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 主目录 
     * @return MainPath 主目录
     */
    public String getMainPath() {
        return this.MainPath;
    }

    /**
     * Set 主目录
     * @param MainPath 主目录
     */
    public void setMainPath(String MainPath) {
        this.MainPath = MainPath;
    }

    /**
     * Get 主目录所有者 
     * @return MainPathOwner 主目录所有者
     */
    public String getMainPathOwner() {
        return this.MainPathOwner;
    }

    /**
     * Set 主目录所有者
     * @param MainPathOwner 主目录所有者
     */
    public void setMainPathOwner(String MainPathOwner) {
        this.MainPathOwner = MainPathOwner;
    }

    /**
     * Get 拥有者权限 
     * @return Permission 拥有者权限
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 拥有者权限
     * @param Permission 拥有者权限
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
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
     * @return Tag 主机标签
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 主机标签
     * @param Tag 主机标签
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Web站点Id 
     * @return Id Web站点Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Web站点Id
     * @param Id Web站点Id
     */
    public void setId(String Id) {
        this.Id = Id;
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

    public AssetWebLocationBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebLocationBaseInfo(AssetWebLocationBaseInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.PathCount != null) {
            this.PathCount = new Long(source.PathCount);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.MainPath != null) {
            this.MainPath = new String(source.MainPath);
        }
        if (source.MainPathOwner != null) {
            this.MainPathOwner = new String(source.MainPathOwner);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "PathCount", this.PathCount);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "MainPath", this.MainPath);
        this.setParamSimple(map, prefix + "MainPathOwner", this.MainPathOwner);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

