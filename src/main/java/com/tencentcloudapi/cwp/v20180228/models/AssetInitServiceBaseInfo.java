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

public class AssetInitServiceBaseInfo extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型：
1:编码器
2:IE插件
3:网络提供者
4:镜像劫持
5:LSA提供者
6:KnownDLLs
7:启动执行
8:WMI
9:计划任务
10:Winsock提供者
11:打印监控器
12:资源管理器
13:驱动服务
14:登录
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 默认启用状态：0未启用，1启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 启动用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 服务器IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 服务器名称
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
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 数据更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型：
1:编码器
2:IE插件
3:网络提供者
4:镜像劫持
5:LSA提供者
6:KnownDLLs
7:启动执行
8:WMI
9:计划任务
10:Winsock提供者
11:打印监控器
12:资源管理器
13:驱动服务
14:登录 
     * @return Type 类型：
1:编码器
2:IE插件
3:网络提供者
4:镜像劫持
5:LSA提供者
6:KnownDLLs
7:启动执行
8:WMI
9:计划任务
10:Winsock提供者
11:打印监控器
12:资源管理器
13:驱动服务
14:登录
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型：
1:编码器
2:IE插件
3:网络提供者
4:镜像劫持
5:LSA提供者
6:KnownDLLs
7:启动执行
8:WMI
9:计划任务
10:Winsock提供者
11:打印监控器
12:资源管理器
13:驱动服务
14:登录
     * @param Type 类型：
1:编码器
2:IE插件
3:网络提供者
4:镜像劫持
5:LSA提供者
6:KnownDLLs
7:启动执行
8:WMI
9:计划任务
10:Winsock提供者
11:打印监控器
12:资源管理器
13:驱动服务
14:登录
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 默认启用状态：0未启用，1启用 
     * @return Status 默认启用状态：0未启用，1启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 默认启用状态：0未启用，1启用
     * @param Status 默认启用状态：0未启用，1启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 路径 
     * @return Path 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
     * @param Path 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 服务器IP 
     * @return MachineIp 服务器IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 服务器IP
     * @param MachineIp 服务器IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 服务器名称 
     * @return MachineName 服务器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 服务器名称
     * @param MachineName 服务器名称
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
     * Get 数据更新时间 
     * @return UpdateTime 数据更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
     * @param UpdateTime 数据更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetInitServiceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetInitServiceBaseInfo(AssetInitServiceBaseInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

