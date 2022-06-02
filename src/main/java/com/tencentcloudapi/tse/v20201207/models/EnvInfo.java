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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInfo extends AbstractModel{

    /**
    * 环境名称
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * 环境对应的网络信息
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
    * 云硬盘容量
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * 运行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Admin service 访问地址
    */
    @SerializedName("AdminServiceIp")
    @Expose
    private String AdminServiceIp;

    /**
    * Config service访问地址
    */
    @SerializedName("ConfigServiceIp")
    @Expose
    private String ConfigServiceIp;

    /**
    * 是否开启config-server公网
    */
    @SerializedName("EnableConfigInternet")
    @Expose
    private Boolean EnableConfigInternet;

    /**
    * config-server公网访问地址
    */
    @SerializedName("ConfigInternetServiceIp")
    @Expose
    private String ConfigInternetServiceIp;

    /**
    * 规格ID
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 环境的节点数
    */
    @SerializedName("EnvReplica")
    @Expose
    private Long EnvReplica;

    /**
    * 环境运行的节点数
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * 环境别名
    */
    @SerializedName("AliasEnvName")
    @Expose
    private String AliasEnvName;

    /**
     * Get 环境名称 
     * @return EnvName 环境名称
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set 环境名称
     * @param EnvName 环境名称
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get 环境对应的网络信息 
     * @return VpcInfos 环境对应的网络信息
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set 环境对应的网络信息
     * @param VpcInfos 环境对应的网络信息
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    /**
     * Get 云硬盘容量 
     * @return StorageCapacity 云硬盘容量
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set 云硬盘容量
     * @param StorageCapacity 云硬盘容量
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get 运行状态 
     * @return Status 运行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态
     * @param Status 运行状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Admin service 访问地址 
     * @return AdminServiceIp Admin service 访问地址
     */
    public String getAdminServiceIp() {
        return this.AdminServiceIp;
    }

    /**
     * Set Admin service 访问地址
     * @param AdminServiceIp Admin service 访问地址
     */
    public void setAdminServiceIp(String AdminServiceIp) {
        this.AdminServiceIp = AdminServiceIp;
    }

    /**
     * Get Config service访问地址 
     * @return ConfigServiceIp Config service访问地址
     */
    public String getConfigServiceIp() {
        return this.ConfigServiceIp;
    }

    /**
     * Set Config service访问地址
     * @param ConfigServiceIp Config service访问地址
     */
    public void setConfigServiceIp(String ConfigServiceIp) {
        this.ConfigServiceIp = ConfigServiceIp;
    }

    /**
     * Get 是否开启config-server公网 
     * @return EnableConfigInternet 是否开启config-server公网
     */
    public Boolean getEnableConfigInternet() {
        return this.EnableConfigInternet;
    }

    /**
     * Set 是否开启config-server公网
     * @param EnableConfigInternet 是否开启config-server公网
     */
    public void setEnableConfigInternet(Boolean EnableConfigInternet) {
        this.EnableConfigInternet = EnableConfigInternet;
    }

    /**
     * Get config-server公网访问地址 
     * @return ConfigInternetServiceIp config-server公网访问地址
     */
    public String getConfigInternetServiceIp() {
        return this.ConfigInternetServiceIp;
    }

    /**
     * Set config-server公网访问地址
     * @param ConfigInternetServiceIp config-server公网访问地址
     */
    public void setConfigInternetServiceIp(String ConfigInternetServiceIp) {
        this.ConfigInternetServiceIp = ConfigInternetServiceIp;
    }

    /**
     * Get 规格ID 
     * @return SpecId 规格ID
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 规格ID
     * @param SpecId 规格ID
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 环境的节点数 
     * @return EnvReplica 环境的节点数
     */
    public Long getEnvReplica() {
        return this.EnvReplica;
    }

    /**
     * Set 环境的节点数
     * @param EnvReplica 环境的节点数
     */
    public void setEnvReplica(Long EnvReplica) {
        this.EnvReplica = EnvReplica;
    }

    /**
     * Get 环境运行的节点数 
     * @return RunningCount 环境运行的节点数
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set 环境运行的节点数
     * @param RunningCount 环境运行的节点数
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get 环境别名 
     * @return AliasEnvName 环境别名
     */
    public String getAliasEnvName() {
        return this.AliasEnvName;
    }

    /**
     * Set 环境别名
     * @param AliasEnvName 环境别名
     */
    public void setAliasEnvName(String AliasEnvName) {
        this.AliasEnvName = AliasEnvName;
    }

    public EnvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvInfo(EnvInfo source) {
        if (source.EnvName != null) {
            this.EnvName = new String(source.EnvName);
        }
        if (source.VpcInfos != null) {
            this.VpcInfos = new VpcInfo[source.VpcInfos.length];
            for (int i = 0; i < source.VpcInfos.length; i++) {
                this.VpcInfos[i] = new VpcInfo(source.VpcInfos[i]);
            }
        }
        if (source.StorageCapacity != null) {
            this.StorageCapacity = new Long(source.StorageCapacity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AdminServiceIp != null) {
            this.AdminServiceIp = new String(source.AdminServiceIp);
        }
        if (source.ConfigServiceIp != null) {
            this.ConfigServiceIp = new String(source.ConfigServiceIp);
        }
        if (source.EnableConfigInternet != null) {
            this.EnableConfigInternet = new Boolean(source.EnableConfigInternet);
        }
        if (source.ConfigInternetServiceIp != null) {
            this.ConfigInternetServiceIp = new String(source.ConfigInternetServiceIp);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.EnvReplica != null) {
            this.EnvReplica = new Long(source.EnvReplica);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.AliasEnvName != null) {
            this.AliasEnvName = new String(source.AliasEnvName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamArrayObj(map, prefix + "VpcInfos.", this.VpcInfos);
        this.setParamSimple(map, prefix + "StorageCapacity", this.StorageCapacity);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AdminServiceIp", this.AdminServiceIp);
        this.setParamSimple(map, prefix + "ConfigServiceIp", this.ConfigServiceIp);
        this.setParamSimple(map, prefix + "EnableConfigInternet", this.EnableConfigInternet);
        this.setParamSimple(map, prefix + "ConfigInternetServiceIp", this.ConfigInternetServiceIp);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "EnvReplica", this.EnvReplica);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "AliasEnvName", this.AliasEnvName);

    }
}

