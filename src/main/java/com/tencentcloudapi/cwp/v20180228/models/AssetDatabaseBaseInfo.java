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

public class AssetDatabaseBaseInfo extends AbstractModel{

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
    * 监听端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 运行用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 绑定IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 配置文件路径
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * 日志文件路径
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * 数据路径
    */
    @SerializedName("DataPath")
    @Expose
    private String DataPath;

    /**
    * 运行权限
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 错误日志路径
    */
    @SerializedName("ErrorLogPath")
    @Expose
    private String ErrorLogPath;

    /**
    * 插件路径
    */
    @SerializedName("PlugInPath")
    @Expose
    private String PlugInPath;

    /**
    * 二进制路径
    */
    @SerializedName("BinPath")
    @Expose
    private String BinPath;

    /**
    * 启动参数
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 数据库ID
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
     * Get 监听端口 
     * @return Port 监听端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 监听端口
     * @param Port 监听端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议 
     * @return Proto 协议
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 协议
     * @param Proto 协议
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
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
     * Get 绑定IP 
     * @return Ip 绑定IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 绑定IP
     * @param Ip 绑定IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 配置文件路径 
     * @return ConfigPath 配置文件路径
     */
    public String getConfigPath() {
        return this.ConfigPath;
    }

    /**
     * Set 配置文件路径
     * @param ConfigPath 配置文件路径
     */
    public void setConfigPath(String ConfigPath) {
        this.ConfigPath = ConfigPath;
    }

    /**
     * Get 日志文件路径 
     * @return LogPath 日志文件路径
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set 日志文件路径
     * @param LogPath 日志文件路径
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get 数据路径 
     * @return DataPath 数据路径
     */
    public String getDataPath() {
        return this.DataPath;
    }

    /**
     * Set 数据路径
     * @param DataPath 数据路径
     */
    public void setDataPath(String DataPath) {
        this.DataPath = DataPath;
    }

    /**
     * Get 运行权限 
     * @return Permission 运行权限
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 运行权限
     * @param Permission 运行权限
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 错误日志路径 
     * @return ErrorLogPath 错误日志路径
     */
    public String getErrorLogPath() {
        return this.ErrorLogPath;
    }

    /**
     * Set 错误日志路径
     * @param ErrorLogPath 错误日志路径
     */
    public void setErrorLogPath(String ErrorLogPath) {
        this.ErrorLogPath = ErrorLogPath;
    }

    /**
     * Get 插件路径 
     * @return PlugInPath 插件路径
     */
    public String getPlugInPath() {
        return this.PlugInPath;
    }

    /**
     * Set 插件路径
     * @param PlugInPath 插件路径
     */
    public void setPlugInPath(String PlugInPath) {
        this.PlugInPath = PlugInPath;
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
     * Get 启动参数 
     * @return Param 启动参数
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 启动参数
     * @param Param 启动参数
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 数据库ID 
     * @return Id 数据库ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 数据库ID
     * @param Id 数据库ID
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

    public AssetDatabaseBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDatabaseBaseInfo(AssetDatabaseBaseInfo source) {
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
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.DataPath != null) {
            this.DataPath = new String(source.DataPath);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.ErrorLogPath != null) {
            this.ErrorLogPath = new String(source.ErrorLogPath);
        }
        if (source.PlugInPath != null) {
            this.PlugInPath = new String(source.PlugInPath);
        }
        if (source.BinPath != null) {
            this.BinPath = new String(source.BinPath);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
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
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "DataPath", this.DataPath);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "ErrorLogPath", this.ErrorLogPath);
        this.setParamSimple(map, prefix + "PlugInPath", this.PlugInPath);
        this.setParamSimple(map, prefix + "BinPath", this.BinPath);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

