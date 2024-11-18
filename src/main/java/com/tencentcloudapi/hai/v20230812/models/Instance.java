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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示欠费隔离
TERMINATING：表示销毁中。
TERMINATED：表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 应用名称

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 算力套餐名称

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleName")
    @Expose
    private String BundleName;

    /**
    * 实例所包含的GPU卡数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUCount")
    @Expose
    private Long GPUCount;

    /**
    * 算力

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUPerformance")
    @Expose
    private String GPUPerformance;

    /**
    * 显存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUMemory")
    @Expose
    private String GPUMemory;

    /**
    * CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private String CPU;

    /**
    * 内存

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 系统盘数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 公网ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 安全组ID

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例最新操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 公网出带宽上限，默认10Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxOutBandwidth")
    @Expose
    private String MaxOutBandwidth;

    /**
    * 每月免费流量，默认500G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxFreeTraffic")
    @Expose
    private String MaxFreeTraffic;

    /**
    * 应用配置环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigurationEnvironment")
    @Expose
    private String ConfigurationEnvironment;

    /**
    * 实例包含的登录服务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginServices")
    @Expose
    private LoginService [] LoginServices;

    /**
    * 应用服务的操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OSType")
    @Expose
    private String OSType;

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示欠费隔离
TERMINATING：表示销毁中。
TERMINATED：表示已销毁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceState 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示欠费隔离
TERMINATING：表示销毁中。
TERMINATED：表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示欠费隔离
TERMINATING：表示销毁中。
TERMINATED：表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceState 实例状态：
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
ARREARS：表示欠费隔离
TERMINATING：表示销毁中。
TERMINATED：表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 应用名称

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称

注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 算力套餐名称

注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleName 算力套餐名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleName() {
        return this.BundleName;
    }

    /**
     * Set 算力套餐名称

注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleName 算力套餐名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleName(String BundleName) {
        this.BundleName = BundleName;
    }

    /**
     * Get 实例所包含的GPU卡数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUCount 实例所包含的GPU卡数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set 实例所包含的GPU卡数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUCount 实例所包含的GPU卡数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUCount(Long GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get 算力

注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUPerformance 算力

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGPUPerformance() {
        return this.GPUPerformance;
    }

    /**
     * Set 算力

注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUPerformance 算力

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUPerformance(String GPUPerformance) {
        this.GPUPerformance = GPUPerformance;
    }

    /**
     * Get 显存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUMemory 显存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * Set 显存
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUMemory 显存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUMemory(String GPUMemory) {
        this.GPUMemory = GPUMemory;
    }

    /**
     * Get CPU核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存

注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 系统盘数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk 系统盘数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk 系统盘数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIpAddresses 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIpAddresses 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 公网ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses 公网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 公网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses 公网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 安全组ID

注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIds 安全组ID

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID

注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIds 安全组ID

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例最新操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation 实例最新操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 实例最新操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation 实例最新操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState 实例最新操作状态：
SUCCESS：表示操作成功
OPERATING：表示操作执行中
FAILED：表示操作失败

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 实例创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 公网出带宽上限，默认10Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxOutBandwidth 公网出带宽上限，默认10Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxOutBandwidth() {
        return this.MaxOutBandwidth;
    }

    /**
     * Set 公网出带宽上限，默认10Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxOutBandwidth 公网出带宽上限，默认10Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxOutBandwidth(String MaxOutBandwidth) {
        this.MaxOutBandwidth = MaxOutBandwidth;
    }

    /**
     * Get 每月免费流量，默认500G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxFreeTraffic 每月免费流量，默认500G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxFreeTraffic() {
        return this.MaxFreeTraffic;
    }

    /**
     * Set 每月免费流量，默认500G
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxFreeTraffic 每月免费流量，默认500G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxFreeTraffic(String MaxFreeTraffic) {
        this.MaxFreeTraffic = MaxFreeTraffic;
    }

    /**
     * Get 应用配置环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigurationEnvironment 应用配置环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigurationEnvironment() {
        return this.ConfigurationEnvironment;
    }

    /**
     * Set 应用配置环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigurationEnvironment 应用配置环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigurationEnvironment(String ConfigurationEnvironment) {
        this.ConfigurationEnvironment = ConfigurationEnvironment;
    }

    /**
     * Get 实例包含的登录服务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginServices 实例包含的登录服务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoginService [] getLoginServices() {
        return this.LoginServices;
    }

    /**
     * Set 实例包含的登录服务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginServices 实例包含的登录服务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginServices(LoginService [] LoginServices) {
        this.LoginServices = LoginServices;
    }

    /**
     * Get 应用服务的操作系统类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OSType 应用服务的操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * Set 应用服务的操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OSType 应用服务的操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
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

