/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示待回收
STOPPED_NO_CHARGE：表示关机不收费
TERMINATING：表示销毁中
TERMINATED：表示已销毁
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 应用名称

    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 算力套餐名称

    */
    @SerializedName("BundleName")
    @Expose
    private String BundleName;

    /**
    * 实例所包含的GPU卡数
    */
    @SerializedName("GPUCount")
    @Expose
    private Long GPUCount;

    /**
    * 算力

    */
    @SerializedName("GPUPerformance")
    @Expose
    private String GPUPerformance;

    /**
    * 显存，单位：GB
    */
    @SerializedName("GPUMemory")
    @Expose
    private String GPUMemory;

    /**
    * CPU核数，单位：核
    */
    @SerializedName("CPU")
    @Expose
    private String CPU;

    /**
    * 内存，单位：GB

    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 系统盘数据
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 内网ip地址
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 公网ip地址
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 安全组ID

    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例最新操作
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 实例创建时间，时间格式："YYYY-MM-DD HH:MM:SS"
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 公网出带宽上限，默认10Mbps，单位：Mbps
    */
    @SerializedName("MaxOutBandwidth")
    @Expose
    private String MaxOutBandwidth;

    /**
    * 每月免费流量，默认500G，单位：GB
    */
    @SerializedName("MaxFreeTraffic")
    @Expose
    private String MaxFreeTraffic;

    /**
    * 应用配置环境
    */
    @SerializedName("ConfigurationEnvironment")
    @Expose
    private String ConfigurationEnvironment;

    /**
    * 实例包含的登录服务详情
    */
    @SerializedName("LoginServices")
    @Expose
    private LoginService [] LoginServices;

    /**
    * 应用服务的操作系统类型；参数：linux、windows
    */
    @SerializedName("OSType")
    @Expose
    private String OSType;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示待回收
STOPPED_NO_CHARGE：表示关机不收费
TERMINATING：表示销毁中
TERMINATED：表示已销毁 
     * @return InstanceState 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示待回收
STOPPED_NO_CHARGE：表示关机不收费
TERMINATING：表示销毁中
TERMINATED：表示已销毁
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示待回收
STOPPED_NO_CHARGE：表示关机不收费
TERMINATING：表示销毁中
TERMINATED：表示已销毁
     * @param InstanceState 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示待回收
STOPPED_NO_CHARGE：表示关机不收费
TERMINATING：表示销毁中
TERMINATED：表示已销毁
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 应用名称
 
     * @return ApplicationName 应用名称

     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称

     * @param ApplicationName 应用名称

     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 算力套餐名称
 
     * @return BundleName 算力套餐名称

     */
    public String getBundleName() {
        return this.BundleName;
    }

    /**
     * Set 算力套餐名称

     * @param BundleName 算力套餐名称

     */
    public void setBundleName(String BundleName) {
        this.BundleName = BundleName;
    }

    /**
     * Get 实例所包含的GPU卡数 
     * @return GPUCount 实例所包含的GPU卡数
     */
    public Long getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set 实例所包含的GPU卡数
     * @param GPUCount 实例所包含的GPU卡数
     */
    public void setGPUCount(Long GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get 算力
 
     * @return GPUPerformance 算力

     */
    public String getGPUPerformance() {
        return this.GPUPerformance;
    }

    /**
     * Set 算力

     * @param GPUPerformance 算力

     */
    public void setGPUPerformance(String GPUPerformance) {
        this.GPUPerformance = GPUPerformance;
    }

    /**
     * Get 显存，单位：GB 
     * @return GPUMemory 显存，单位：GB
     */
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * Set 显存，单位：GB
     * @param GPUMemory 显存，单位：GB
     */
    public void setGPUMemory(String GPUMemory) {
        this.GPUMemory = GPUMemory;
    }

    /**
     * Get CPU核数，单位：核 
     * @return CPU CPU核数，单位：核
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数，单位：核
     * @param CPU CPU核数，单位：核
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存，单位：GB
 
     * @return Memory 内存，单位：GB

     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位：GB

     * @param Memory 内存，单位：GB

     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 系统盘数据 
     * @return SystemDisk 系统盘数据
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘数据
     * @param SystemDisk 系统盘数据
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 内网ip地址 
     * @return PrivateIpAddresses 内网ip地址
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 内网ip地址
     * @param PrivateIpAddresses 内网ip地址
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 公网ip地址 
     * @return PublicIpAddresses 公网ip地址
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 公网ip地址
     * @param PublicIpAddresses 公网ip地址
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 安全组ID
 
     * @return SecurityGroupIds 安全组ID

     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID

     * @param SecurityGroupIds 安全组ID

     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例最新操作 
     * @return LatestOperation 实例最新操作
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 实例最新操作
     * @param LatestOperation 实例最新操作
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败
 
     * @return LatestOperationState 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

     * @param LatestOperationState 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 实例创建时间，时间格式："YYYY-MM-DD HH:MM:SS" 
     * @return CreateTime 实例创建时间，时间格式："YYYY-MM-DD HH:MM:SS"
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间，时间格式："YYYY-MM-DD HH:MM:SS"
     * @param CreateTime 实例创建时间，时间格式："YYYY-MM-DD HH:MM:SS"
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 公网出带宽上限，默认10Mbps，单位：Mbps 
     * @return MaxOutBandwidth 公网出带宽上限，默认10Mbps，单位：Mbps
     */
    public String getMaxOutBandwidth() {
        return this.MaxOutBandwidth;
    }

    /**
     * Set 公网出带宽上限，默认10Mbps，单位：Mbps
     * @param MaxOutBandwidth 公网出带宽上限，默认10Mbps，单位：Mbps
     */
    public void setMaxOutBandwidth(String MaxOutBandwidth) {
        this.MaxOutBandwidth = MaxOutBandwidth;
    }

    /**
     * Get 每月免费流量，默认500G，单位：GB 
     * @return MaxFreeTraffic 每月免费流量，默认500G，单位：GB
     */
    public String getMaxFreeTraffic() {
        return this.MaxFreeTraffic;
    }

    /**
     * Set 每月免费流量，默认500G，单位：GB
     * @param MaxFreeTraffic 每月免费流量，默认500G，单位：GB
     */
    public void setMaxFreeTraffic(String MaxFreeTraffic) {
        this.MaxFreeTraffic = MaxFreeTraffic;
    }

    /**
     * Get 应用配置环境 
     * @return ConfigurationEnvironment 应用配置环境
     */
    public String getConfigurationEnvironment() {
        return this.ConfigurationEnvironment;
    }

    /**
     * Set 应用配置环境
     * @param ConfigurationEnvironment 应用配置环境
     */
    public void setConfigurationEnvironment(String ConfigurationEnvironment) {
        this.ConfigurationEnvironment = ConfigurationEnvironment;
    }

    /**
     * Get 实例包含的登录服务详情 
     * @return LoginServices 实例包含的登录服务详情
     */
    public LoginService [] getLoginServices() {
        return this.LoginServices;
    }

    /**
     * Set 实例包含的登录服务详情
     * @param LoginServices 实例包含的登录服务详情
     */
    public void setLoginServices(LoginService [] LoginServices) {
        this.LoginServices = LoginServices;
    }

    /**
     * Get 应用服务的操作系统类型；参数：linux、windows 
     * @return OSType 应用服务的操作系统类型；参数：linux、windows
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * Set 应用服务的操作系统类型；参数：linux、windows
     * @param OSType 应用服务的操作系统类型；参数：linux、windows
     */
    public void setOSType(String OSType) {
        this.OSType = OSType;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.BundleName != null) {
            this.BundleName = new String(source.BundleName);
        }
        if (source.GPUCount != null) {
            this.GPUCount = new Long(source.GPUCount);
        }
        if (source.GPUPerformance != null) {
            this.GPUPerformance = new String(source.GPUPerformance);
        }
        if (source.GPUMemory != null) {
            this.GPUMemory = new String(source.GPUMemory);
        }
        if (source.CPU != null) {
            this.CPU = new String(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MaxOutBandwidth != null) {
            this.MaxOutBandwidth = new String(source.MaxOutBandwidth);
        }
        if (source.MaxFreeTraffic != null) {
            this.MaxFreeTraffic = new String(source.MaxFreeTraffic);
        }
        if (source.ConfigurationEnvironment != null) {
            this.ConfigurationEnvironment = new String(source.ConfigurationEnvironment);
        }
        if (source.LoginServices != null) {
            this.LoginServices = new LoginService[source.LoginServices.length];
            for (int i = 0; i < source.LoginServices.length; i++) {
                this.LoginServices[i] = new LoginService(source.LoginServices[i]);
            }
        }
        if (source.OSType != null) {
            this.OSType = new String(source.OSType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "BundleName", this.BundleName);
        this.setParamSimple(map, prefix + "GPUCount", this.GPUCount);
        this.setParamSimple(map, prefix + "GPUPerformance", this.GPUPerformance);
        this.setParamSimple(map, prefix + "GPUMemory", this.GPUMemory);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MaxOutBandwidth", this.MaxOutBandwidth);
        this.setParamSimple(map, prefix + "MaxFreeTraffic", this.MaxFreeTraffic);
        this.setParamSimple(map, prefix + "ConfigurationEnvironment", this.ConfigurationEnvironment);
        this.setParamArrayObj(map, prefix + "LoginServices.", this.LoginServices);
        this.setParamSimple(map, prefix + "OSType", this.OSType);

    }
}

