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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 数据库用户密码，必须满足 8-64个字符，至少包含 大写字母、小写字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种
    */
    @SerializedName("MasterUserPassword")
    @Expose
    private String MasterUserPassword;

    /**
    * CPU核数。取值参考文档【购买指南】
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存大小，单位GiB。取值参考文档【购买指南】
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 已配置的私有网络中的子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * TDSQL-C PostgreSQL 合入的社区版本号。
支持入参值为：10.17。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数与DBMajorVersion、DBKernelVersion只能传递一个，且需要传递一个。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 项目Id，默认为0表示默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 连接数据库时，Endpoint使用的端口。取值范围为[1,65534]，默认值为5432
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 集群下实例数量。取值范围为[1,4]，默认值为1
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 购买时长，单位：月。取值范围为[1,60]，默认值为1。
只有当PayMode为PREPAID时生效。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 是否自动续费，0-不 1-是。默认值为0，只有当PayMode为PREPAID时生效。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * TDSQL-C PostgreSQL 合入的社区主要版本号。
支持入参值为：10。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数和DBVersion、DBKernelVersion只能传递一个，且需要传递一个。
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * TDSQL-C PostgreSQL 内核版本号。
支持入参值为：v10.17_r1.4。当输入该参数时，会创建此版本号对应的数据库内核。
注：该参数和DBVersion、DBMajorVersion只能传递一个，且需要传递一个。
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * 存储付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
默认为POSTPAID_BY_HOUR，实例付费模式为按小时付费时，存储付费模式不支持包年包月
    */
    @SerializedName("StoragePayMode")
    @Expose
    private String StoragePayMode;

    /**
    * 存储最大使用量，单位GB。取值参考文档【购买指南】。存储使用预付费模式时必须设置，存储使用按小时后付费时不可设置
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 数据库用户密码，必须满足 8-64个字符，至少包含 大写字母、小写字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种 
     * @return MasterUserPassword 数据库用户密码，必须满足 8-64个字符，至少包含 大写字母、小写字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种
     */
    public String getMasterUserPassword() {
        return this.MasterUserPassword;
    }

    /**
     * Set 数据库用户密码，必须满足 8-64个字符，至少包含 大写字母、小写字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种
     * @param MasterUserPassword 数据库用户密码，必须满足 8-64个字符，至少包含 大写字母、小写字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种
     */
    public void setMasterUserPassword(String MasterUserPassword) {
        this.MasterUserPassword = MasterUserPassword;
    }

    /**
     * Get CPU核数。取值参考文档【购买指南】 
     * @return CPU CPU核数。取值参考文档【购买指南】
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数。取值参考文档【购买指南】
     * @param CPU CPU核数。取值参考文档【购买指南】
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存大小，单位GiB。取值参考文档【购买指南】 
     * @return Memory 内存大小，单位GiB。取值参考文档【购买指南】
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位GiB。取值参考文档【购买指南】
     * @param Memory 内存大小，单位GiB。取值参考文档【购买指南】
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 已配置的私有网络中的子网ID 
     * @return SubnetId 已配置的私有网络中的子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 已配置的私有网络中的子网ID
     * @param SubnetId 已配置的私有网络中的子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费 
     * @return PayMode 实例付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
     * @param PayMode 实例付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致 
     * @return ClusterName 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致
     * @param ClusterName 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get TDSQL-C PostgreSQL 合入的社区版本号。
支持入参值为：10.17。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数与DBMajorVersion、DBKernelVersion只能传递一个，且需要传递一个。 
     * @return DBVersion TDSQL-C PostgreSQL 合入的社区版本号。
支持入参值为：10.17。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数与DBMajorVersion、DBKernelVersion只能传递一个，且需要传递一个。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set TDSQL-C PostgreSQL 合入的社区版本号。
支持入参值为：10.17。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数与DBMajorVersion、DBKernelVersion只能传递一个，且需要传递一个。
     * @param DBVersion TDSQL-C PostgreSQL 合入的社区版本号。
支持入参值为：10.17。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数与DBMajorVersion、DBKernelVersion只能传递一个，且需要传递一个。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 项目Id，默认为0表示默认项目 
     * @return ProjectId 项目Id，默认为0表示默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id，默认为0表示默认项目
     * @param ProjectId 项目Id，默认为0表示默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 连接数据库时，Endpoint使用的端口。取值范围为[1,65534]，默认值为5432 
     * @return Port 连接数据库时，Endpoint使用的端口。取值范围为[1,65534]，默认值为5432
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 连接数据库时，Endpoint使用的端口。取值范围为[1,65534]，默认值为5432
     * @param Port 连接数据库时，Endpoint使用的端口。取值范围为[1,65534]，默认值为5432
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 集群下实例数量。取值范围为[1,4]，默认值为1 
     * @return InstanceCount 集群下实例数量。取值范围为[1,4]，默认值为1
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 集群下实例数量。取值范围为[1,4]，默认值为1
     * @param InstanceCount 集群下实例数量。取值范围为[1,4]，默认值为1
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 购买时长，单位：月。取值范围为[1,60]，默认值为1。
只有当PayMode为PREPAID时生效。 
     * @return Period 购买时长，单位：月。取值范围为[1,60]，默认值为1。
只有当PayMode为PREPAID时生效。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月。取值范围为[1,60]，默认值为1。
只有当PayMode为PREPAID时生效。
     * @param Period 购买时长，单位：月。取值范围为[1,60]，默认值为1。
只有当PayMode为PREPAID时生效。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 是否自动续费，0-不 1-是。默认值为0，只有当PayMode为PREPAID时生效。 
     * @return AutoRenewFlag 是否自动续费，0-不 1-是。默认值为0，只有当PayMode为PREPAID时生效。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费，0-不 1-是。默认值为0，只有当PayMode为PREPAID时生效。
     * @param AutoRenewFlag 是否自动续费，0-不 1-是。默认值为0，只有当PayMode为PREPAID时生效。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get TDSQL-C PostgreSQL 合入的社区主要版本号。
支持入参值为：10。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数和DBVersion、DBKernelVersion只能传递一个，且需要传递一个。 
     * @return DBMajorVersion TDSQL-C PostgreSQL 合入的社区主要版本号。
支持入参值为：10。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数和DBVersion、DBKernelVersion只能传递一个，且需要传递一个。
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set TDSQL-C PostgreSQL 合入的社区主要版本号。
支持入参值为：10。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数和DBVersion、DBKernelVersion只能传递一个，且需要传递一个。
     * @param DBMajorVersion TDSQL-C PostgreSQL 合入的社区主要版本号。
支持入参值为：10。当输入该参数时，会基于此版本号创建对应的最新DBKernelVersion数据库内核。
注：该参数和DBVersion、DBKernelVersion只能传递一个，且需要传递一个。
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get TDSQL-C PostgreSQL 内核版本号。
支持入参值为：v10.17_r1.4。当输入该参数时，会创建此版本号对应的数据库内核。
注：该参数和DBVersion、DBMajorVersion只能传递一个，且需要传递一个。 
     * @return DBKernelVersion TDSQL-C PostgreSQL 内核版本号。
支持入参值为：v10.17_r1.4。当输入该参数时，会创建此版本号对应的数据库内核。
注：该参数和DBVersion、DBMajorVersion只能传递一个，且需要传递一个。
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set TDSQL-C PostgreSQL 内核版本号。
支持入参值为：v10.17_r1.4。当输入该参数时，会创建此版本号对应的数据库内核。
注：该参数和DBVersion、DBMajorVersion只能传递一个，且需要传递一个。
     * @param DBKernelVersion TDSQL-C PostgreSQL 内核版本号。
支持入参值为：v10.17_r1.4。当输入该参数时，会创建此版本号对应的数据库内核。
注：该参数和DBVersion、DBMajorVersion只能传递一个，且需要传递一个。
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get 存储付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
默认为POSTPAID_BY_HOUR，实例付费模式为按小时付费时，存储付费模式不支持包年包月 
     * @return StoragePayMode 存储付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
默认为POSTPAID_BY_HOUR，实例付费模式为按小时付费时，存储付费模式不支持包年包月
     */
    public String getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set 存储付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
默认为POSTPAID_BY_HOUR，实例付费模式为按小时付费时，存储付费模式不支持包年包月
     * @param StoragePayMode 存储付费模式
 - PREPAID：预付费，即包年包月
 - POSTPAID_BY_HOUR：按小时后付费
默认为POSTPAID_BY_HOUR，实例付费模式为按小时付费时，存储付费模式不支持包年包月
     */
    public void setStoragePayMode(String StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get 存储最大使用量，单位GB。取值参考文档【购买指南】。存储使用预付费模式时必须设置，存储使用按小时后付费时不可设置 
     * @return Storage 存储最大使用量，单位GB。取值参考文档【购买指南】。存储使用预付费模式时必须设置，存储使用按小时后付费时不可设置
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储最大使用量，单位GB。取值参考文档【购买指南】。存储使用预付费模式时必须设置，存储使用按小时后付费时不可设置
     * @param Storage 存储最大使用量，单位GB。取值参考文档【购买指南】。存储使用预付费模式时必须设置，存储使用按小时后付费时不可设置
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.MasterUserPassword != null) {
            this.MasterUserPassword = new String(source.MasterUserPassword);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new String(source.StoragePayMode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MasterUserPassword", this.MasterUserPassword);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);

    }
}

