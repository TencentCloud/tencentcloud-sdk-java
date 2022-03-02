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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneClusterToPointInTimeRequest extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 数据库版本，目前仅支持 10.17
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

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
    * 集群付费模式
- PREPAID：预付费，即包年包月
- POSTPAID_BY_HOUR：按小时后付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 对应的备份数据来源集群ID
    */
    @SerializedName("SourceClusterId")
    @Expose
    private String SourceClusterId;

    /**
    * 对应的备份数据时间点。按照RFC3339标准表示，并且使用东八区时区时间。格式为：YYYY-MM-DDThh:mm:ss+08:00。
    */
    @SerializedName("SourceDataPoint")
    @Expose
    private String SourceDataPoint;

    /**
    * 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

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
    * 是否自动续费，0-不 1-是。默认为0，只有当PayMode为PREPAID时生效。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

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
     * Get 数据库版本，目前仅支持 10.17 
     * @return DBVersion 数据库版本，目前仅支持 10.17
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 数据库版本，目前仅支持 10.17
     * @param DBVersion 数据库版本，目前仅支持 10.17
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
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
     * Get 集群付费模式
- PREPAID：预付费，即包年包月
- POSTPAID_BY_HOUR：按小时后付费 
     * @return PayMode 集群付费模式
- PREPAID：预付费，即包年包月
- POSTPAID_BY_HOUR：按小时后付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 集群付费模式
- PREPAID：预付费，即包年包月
- POSTPAID_BY_HOUR：按小时后付费
     * @param PayMode 集群付费模式
- PREPAID：预付费，即包年包月
- POSTPAID_BY_HOUR：按小时后付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 对应的备份数据来源集群ID 
     * @return SourceClusterId 对应的备份数据来源集群ID
     */
    public String getSourceClusterId() {
        return this.SourceClusterId;
    }

    /**
     * Set 对应的备份数据来源集群ID
     * @param SourceClusterId 对应的备份数据来源集群ID
     */
    public void setSourceClusterId(String SourceClusterId) {
        this.SourceClusterId = SourceClusterId;
    }

    /**
     * Get 对应的备份数据时间点。按照RFC3339标准表示，并且使用东八区时区时间。格式为：YYYY-MM-DDThh:mm:ss+08:00。 
     * @return SourceDataPoint 对应的备份数据时间点。按照RFC3339标准表示，并且使用东八区时区时间。格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public String getSourceDataPoint() {
        return this.SourceDataPoint;
    }

    /**
     * Set 对应的备份数据时间点。按照RFC3339标准表示，并且使用东八区时区时间。格式为：YYYY-MM-DDThh:mm:ss+08:00。
     * @param SourceDataPoint 对应的备份数据时间点。按照RFC3339标准表示，并且使用东八区时区时间。格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public void setSourceDataPoint(String SourceDataPoint) {
        this.SourceDataPoint = SourceDataPoint;
    }

    /**
     * Get 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致。 
     * @return ClusterName 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致。
     * @param ClusterName 集群名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与ClusterId保持一致。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get 是否自动续费，0-不 1-是。默认为0，只有当PayMode为PREPAID时生效。 
     * @return AutoRenewFlag 是否自动续费，0-不 1-是。默认为0，只有当PayMode为PREPAID时生效。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费，0-不 1-是。默认为0，只有当PayMode为PREPAID时生效。
     * @param AutoRenewFlag 是否自动续费，0-不 1-是。默认为0，只有当PayMode为PREPAID时生效。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public CloneClusterToPointInTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneClusterToPointInTimeRequest(CloneClusterToPointInTimeRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
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
        if (source.SourceClusterId != null) {
            this.SourceClusterId = new String(source.SourceClusterId);
        }
        if (source.SourceDataPoint != null) {
            this.SourceDataPoint = new String(source.SourceDataPoint);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SourceClusterId", this.SourceClusterId);
        this.setParamSimple(map, prefix + "SourceDataPoint", this.SourceDataPoint);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

