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

public class AssetPlanTask extends AbstractModel {

    /**
    * 默认启用状态：1启用，2未启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 执行周期
    */
    @SerializedName("Cycle")
    @Expose
    private String Cycle;

    /**
    * 执行命令或脚本
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 启动用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 配置文件路径
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

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
    * 首次采集时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 是否新增[0:否|1:是]
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * 服务器外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    *  附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 默认启用状态：1启用，2未启用 
     * @return Status 默认启用状态：1启用，2未启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 默认启用状态：1启用，2未启用
     * @param Status 默认启用状态：1启用，2未启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 执行周期 
     * @return Cycle 执行周期
     */
    public String getCycle() {
        return this.Cycle;
    }

    /**
     * Set 执行周期
     * @param Cycle 执行周期
     */
    public void setCycle(String Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get 执行命令或脚本 
     * @return Command 执行命令或脚本
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 执行命令或脚本
     * @param Command 执行命令或脚本
     */
    public void setCommand(String Command) {
        this.Command = Command;
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

    /**
     * Get 首次采集时间 
     * @return FirstTime 首次采集时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次采集时间
     * @param FirstTime 首次采集时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 是否新增[0:否|1:是] 
     * @return IsNew 是否新增[0:否|1:是]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 是否新增[0:否|1:是]
     * @param IsNew 是否新增[0:否|1:是]
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get 服务器外网IP 
     * @return MachineWanIp 服务器外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 服务器外网IP
     * @param MachineWanIp 服务器外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get  附加信息 
     * @return MachineExtraInfo  附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set  附加信息
     * @param MachineExtraInfo  附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public AssetPlanTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetPlanTask(AssetPlanTask source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Cycle != null) {
            this.Cycle = new String(source.Cycle);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
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
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

