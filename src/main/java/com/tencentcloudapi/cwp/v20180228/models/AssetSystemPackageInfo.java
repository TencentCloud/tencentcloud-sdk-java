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

public class AssetSystemPackageInfo extends AbstractModel {

    /**
    * 数据库名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 安装时间
    */
    @SerializedName("InstallTime")
    @Expose
    private String InstallTime;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 操作系统
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

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
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 主机Id
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Agent Id
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

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
     * Get 安装时间 
     * @return InstallTime 安装时间
     */
    public String getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set 安装时间
     * @param InstallTime 安装时间
     */
    public void setInstallTime(String InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get 主机IP 
     * @return MachineIp 主机IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机IP
     * @param MachineIp 主机IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
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
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 主机Id 
     * @return Quuid 主机Id
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Id
     * @param Quuid 主机Id
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Agent Id 
     * @return Uuid Agent Id
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Agent Id
     * @param Uuid Agent Id
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public AssetSystemPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetSystemPackageInfo(AssetSystemPackageInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.InstallTime != null) {
            this.InstallTime = new String(source.InstallTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
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
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "InstallTime", this.InstallTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

