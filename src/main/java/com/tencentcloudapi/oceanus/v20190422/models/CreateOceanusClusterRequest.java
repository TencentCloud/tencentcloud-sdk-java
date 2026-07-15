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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOceanusClusterRequest extends AbstractModel {

    /**
    * <p>集群名称</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>地域Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77930"> DescribeRegions</a>查询Product参数设置 oceanus</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>可用区Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77929"> DescribeZones</a>查询<br>Product参数设置 oceanus</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>FlinkUI访问密码</p><p>用户名与密码将用于登录查看作业的 Flink UI 界面，集群用户名:admin</p>
    */
    @SerializedName("LoginPassword")
    @Expose
    private String LoginPassword;

    /**
    * <p>流计算通过 VPC 和弹性网卡来访问同地域中的其他云产品资源，并需要占用一定的子网 IP 数量，请确保所选子网的可用 IP 数量充足 如现有网络不符合您的要求，请前往 VPC 控制台<a href="https://console.cloud.tencent.com/vpc/vpc?rid=undefined">新建私有网络</a> 或 <a href="https://console.cloud.tencent.com/vpc/subnet?rid=undefined">新建子网</a></p>
    */
    @SerializedName("VpcDescriptions")
    @Expose
    private VPCDescription [] VpcDescriptions;

    /**
    * <p>流计算使用对象存储 COS 来保存作业的 checkpoint、jar 包、或投递日志等，如本地域无可用存储桶，请前往<a href="https://console.cloud.tencent.com/cos5">对象存储控制台</a>新建 为了保证您的正常使用，对应COS的生命周期配置请参考<a href="https://cloud.tencent.com/document/product/436/33417?from=console_document_search">文档</a></p>
    */
    @SerializedName("DefaultCOSBucket")
    @Expose
    private String DefaultCOSBucket;

    /**
    * <p>集群CU数， 12 CU 是流计算的最小计算资源和计费单位，1CU 包含1个 CPU 和 4GB 内存。 当CU数大于等于 48 时，减免管理节点费用。</p>
    */
    @SerializedName("CU")
    @Expose
    private Long CU;

    /**
    * <p>集群描述</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>购买时长，以月为单位</p><p>取值范围：[1, 48]</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>集群计费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li><li>POSTPAID_BY_SECOND： 按量计费</li></ul><p>默认值：POSTPAID_BY_SECOND</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>集群类型</p><p>枚举值：</p><ul><li>MULTI_AZ_CLUSTER： 多可用区集群</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>自动续费标识</p><p>枚举值：</p><ul><li>NOTIFY_AND_MANUAL_RENEW： 通知并手动续费</li><li>NOTIFY_AND_AUTO_RENEW： 通知并自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知并不自动续费</li></ul><p>默认值：NOTIFY_AND_MANUAL_RENEW</p><p>InstanceChargeType设置PREPAID时，对应包年包月集群，需要设置自动续费标识，按量计费集群不需要设置</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>Flink UI访问类型设置</p><p>枚举值：</p><ul><li>NetworkAccess_INTERNAL： 内网访问</li><li>NetworkAccess_EXTERNAL： 公网访问</li></ul><p>默认值：NetworkAccess_EXTERNAL</p>
    */
    @SerializedName("FlinkWebUINetworkAccessType")
    @Expose
    private String FlinkWebUINetworkAccessType;

    /**
    * <p>多可用区VPC</p>
    */
    @SerializedName("SlaveVpcDescriptions")
    @Expose
    private SlaveVpcDescriptions [] SlaveVpcDescriptions;

    /**
    * <p>核心内存比值，只支持 [0，2，4，8]</p>
    */
    @SerializedName("CUMemory")
    @Expose
    private Long CUMemory;

    /**
     * Get <p>集群名称</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p> 
     * @return ClusterName <p>集群名称</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
     * @param ClusterName <p>集群名称</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>地域Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77930"> DescribeRegions</a>查询Product参数设置 oceanus</p> 
     * @return RegionId <p>地域Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77930"> DescribeRegions</a>查询Product参数设置 oceanus</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77930"> DescribeRegions</a>查询Product参数设置 oceanus</p>
     * @param RegionId <p>地域Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77930"> DescribeRegions</a>查询Product参数设置 oceanus</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>可用区Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77929"> DescribeZones</a>查询<br>Product参数设置 oceanus</p> 
     * @return ZoneId <p>可用区Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77929"> DescribeZones</a>查询<br>Product参数设置 oceanus</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77929"> DescribeZones</a>查询<br>Product参数设置 oceanus</p>
     * @param ZoneId <p>可用区Id，可通过地域管理系统<a href="https://cloud.tencent.com/document/api/1596/77929"> DescribeZones</a>查询<br>Product参数设置 oceanus</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>FlinkUI访问密码</p><p>用户名与密码将用于登录查看作业的 Flink UI 界面，集群用户名:admin</p> 
     * @return LoginPassword <p>FlinkUI访问密码</p><p>用户名与密码将用于登录查看作业的 Flink UI 界面，集群用户名:admin</p>
     */
    public String getLoginPassword() {
        return this.LoginPassword;
    }

    /**
     * Set <p>FlinkUI访问密码</p><p>用户名与密码将用于登录查看作业的 Flink UI 界面，集群用户名:admin</p>
     * @param LoginPassword <p>FlinkUI访问密码</p><p>用户名与密码将用于登录查看作业的 Flink UI 界面，集群用户名:admin</p>
     */
    public void setLoginPassword(String LoginPassword) {
        this.LoginPassword = LoginPassword;
    }

    /**
     * Get <p>流计算通过 VPC 和弹性网卡来访问同地域中的其他云产品资源，并需要占用一定的子网 IP 数量，请确保所选子网的可用 IP 数量充足 如现有网络不符合您的要求，请前往 VPC 控制台<a href="https://console.cloud.tencent.com/vpc/vpc?rid=undefined">新建私有网络</a> 或 <a href="https://console.cloud.tencent.com/vpc/subnet?rid=undefined">新建子网</a></p> 
     * @return VpcDescriptions <p>流计算通过 VPC 和弹性网卡来访问同地域中的其他云产品资源，并需要占用一定的子网 IP 数量，请确保所选子网的可用 IP 数量充足 如现有网络不符合您的要求，请前往 VPC 控制台<a href="https://console.cloud.tencent.com/vpc/vpc?rid=undefined">新建私有网络</a> 或 <a href="https://console.cloud.tencent.com/vpc/subnet?rid=undefined">新建子网</a></p>
     */
    public VPCDescription [] getVpcDescriptions() {
        return this.VpcDescriptions;
    }

    /**
     * Set <p>流计算通过 VPC 和弹性网卡来访问同地域中的其他云产品资源，并需要占用一定的子网 IP 数量，请确保所选子网的可用 IP 数量充足 如现有网络不符合您的要求，请前往 VPC 控制台<a href="https://console.cloud.tencent.com/vpc/vpc?rid=undefined">新建私有网络</a> 或 <a href="https://console.cloud.tencent.com/vpc/subnet?rid=undefined">新建子网</a></p>
     * @param VpcDescriptions <p>流计算通过 VPC 和弹性网卡来访问同地域中的其他云产品资源，并需要占用一定的子网 IP 数量，请确保所选子网的可用 IP 数量充足 如现有网络不符合您的要求，请前往 VPC 控制台<a href="https://console.cloud.tencent.com/vpc/vpc?rid=undefined">新建私有网络</a> 或 <a href="https://console.cloud.tencent.com/vpc/subnet?rid=undefined">新建子网</a></p>
     */
    public void setVpcDescriptions(VPCDescription [] VpcDescriptions) {
        this.VpcDescriptions = VpcDescriptions;
    }

    /**
     * Get <p>流计算使用对象存储 COS 来保存作业的 checkpoint、jar 包、或投递日志等，如本地域无可用存储桶，请前往<a href="https://console.cloud.tencent.com/cos5">对象存储控制台</a>新建 为了保证您的正常使用，对应COS的生命周期配置请参考<a href="https://cloud.tencent.com/document/product/436/33417?from=console_document_search">文档</a></p> 
     * @return DefaultCOSBucket <p>流计算使用对象存储 COS 来保存作业的 checkpoint、jar 包、或投递日志等，如本地域无可用存储桶，请前往<a href="https://console.cloud.tencent.com/cos5">对象存储控制台</a>新建 为了保证您的正常使用，对应COS的生命周期配置请参考<a href="https://cloud.tencent.com/document/product/436/33417?from=console_document_search">文档</a></p>
     */
    public String getDefaultCOSBucket() {
        return this.DefaultCOSBucket;
    }

    /**
     * Set <p>流计算使用对象存储 COS 来保存作业的 checkpoint、jar 包、或投递日志等，如本地域无可用存储桶，请前往<a href="https://console.cloud.tencent.com/cos5">对象存储控制台</a>新建 为了保证您的正常使用，对应COS的生命周期配置请参考<a href="https://cloud.tencent.com/document/product/436/33417?from=console_document_search">文档</a></p>
     * @param DefaultCOSBucket <p>流计算使用对象存储 COS 来保存作业的 checkpoint、jar 包、或投递日志等，如本地域无可用存储桶，请前往<a href="https://console.cloud.tencent.com/cos5">对象存储控制台</a>新建 为了保证您的正常使用，对应COS的生命周期配置请参考<a href="https://cloud.tencent.com/document/product/436/33417?from=console_document_search">文档</a></p>
     */
    public void setDefaultCOSBucket(String DefaultCOSBucket) {
        this.DefaultCOSBucket = DefaultCOSBucket;
    }

    /**
     * Get <p>集群CU数， 12 CU 是流计算的最小计算资源和计费单位，1CU 包含1个 CPU 和 4GB 内存。 当CU数大于等于 48 时，减免管理节点费用。</p> 
     * @return CU <p>集群CU数， 12 CU 是流计算的最小计算资源和计费单位，1CU 包含1个 CPU 和 4GB 内存。 当CU数大于等于 48 时，减免管理节点费用。</p>
     */
    public Long getCU() {
        return this.CU;
    }

    /**
     * Set <p>集群CU数， 12 CU 是流计算的最小计算资源和计费单位，1CU 包含1个 CPU 和 4GB 内存。 当CU数大于等于 48 时，减免管理节点费用。</p>
     * @param CU <p>集群CU数， 12 CU 是流计算的最小计算资源和计费单位，1CU 包含1个 CPU 和 4GB 内存。 当CU数大于等于 48 时，减免管理节点费用。</p>
     */
    public void setCU(Long CU) {
        this.CU = CU;
    }

    /**
     * Get <p>集群描述</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p> 
     * @return Remark <p>集群描述</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>集群描述</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
     * @param Remark <p>集群描述</p><p>入参限制：支持1-50个英文、汉字、数字、连接线-或下划线_</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>购买时长，以月为单位</p><p>取值范围：[1, 48]</p> 
     * @return Period <p>购买时长，以月为单位</p><p>取值范围：[1, 48]</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，以月为单位</p><p>取值范围：[1, 48]</p>
     * @param Period <p>购买时长，以月为单位</p><p>取值范围：[1, 48]</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>集群计费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li><li>POSTPAID_BY_SECOND： 按量计费</li></ul><p>默认值：POSTPAID_BY_SECOND</p> 
     * @return InstanceChargeType <p>集群计费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li><li>POSTPAID_BY_SECOND： 按量计费</li></ul><p>默认值：POSTPAID_BY_SECOND</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>集群计费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li><li>POSTPAID_BY_SECOND： 按量计费</li></ul><p>默认值：POSTPAID_BY_SECOND</p>
     * @param InstanceChargeType <p>集群计费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li><li>POSTPAID_BY_SECOND： 按量计费</li></ul><p>默认值：POSTPAID_BY_SECOND</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>集群类型</p><p>枚举值：</p><ul><li>MULTI_AZ_CLUSTER： 多可用区集群</li></ul> 
     * @return ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>MULTI_AZ_CLUSTER： 多可用区集群</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p><p>枚举值：</p><ul><li>MULTI_AZ_CLUSTER： 多可用区集群</li></ul>
     * @param ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>MULTI_AZ_CLUSTER： 多可用区集群</li></ul>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>自动续费标识</p><p>枚举值：</p><ul><li>NOTIFY_AND_MANUAL_RENEW： 通知并手动续费</li><li>NOTIFY_AND_AUTO_RENEW： 通知并自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知并不自动续费</li></ul><p>默认值：NOTIFY_AND_MANUAL_RENEW</p><p>InstanceChargeType设置PREPAID时，对应包年包月集群，需要设置自动续费标识，按量计费集群不需要设置</p> 
     * @return RenewFlag <p>自动续费标识</p><p>枚举值：</p><ul><li>NOTIFY_AND_MANUAL_RENEW： 通知并手动续费</li><li>NOTIFY_AND_AUTO_RENEW： 通知并自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知并不自动续费</li></ul><p>默认值：NOTIFY_AND_MANUAL_RENEW</p><p>InstanceChargeType设置PREPAID时，对应包年包月集群，需要设置自动续费标识，按量计费集群不需要设置</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识</p><p>枚举值：</p><ul><li>NOTIFY_AND_MANUAL_RENEW： 通知并手动续费</li><li>NOTIFY_AND_AUTO_RENEW： 通知并自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知并不自动续费</li></ul><p>默认值：NOTIFY_AND_MANUAL_RENEW</p><p>InstanceChargeType设置PREPAID时，对应包年包月集群，需要设置自动续费标识，按量计费集群不需要设置</p>
     * @param RenewFlag <p>自动续费标识</p><p>枚举值：</p><ul><li>NOTIFY_AND_MANUAL_RENEW： 通知并手动续费</li><li>NOTIFY_AND_AUTO_RENEW： 通知并自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知并不自动续费</li></ul><p>默认值：NOTIFY_AND_MANUAL_RENEW</p><p>InstanceChargeType设置PREPAID时，对应包年包月集群，需要设置自动续费标识，按量计费集群不需要设置</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Flink UI访问类型设置</p><p>枚举值：</p><ul><li>NetworkAccess_INTERNAL： 内网访问</li><li>NetworkAccess_EXTERNAL： 公网访问</li></ul><p>默认值：NetworkAccess_EXTERNAL</p> 
     * @return FlinkWebUINetworkAccessType <p>Flink UI访问类型设置</p><p>枚举值：</p><ul><li>NetworkAccess_INTERNAL： 内网访问</li><li>NetworkAccess_EXTERNAL： 公网访问</li></ul><p>默认值：NetworkAccess_EXTERNAL</p>
     */
    public String getFlinkWebUINetworkAccessType() {
        return this.FlinkWebUINetworkAccessType;
    }

    /**
     * Set <p>Flink UI访问类型设置</p><p>枚举值：</p><ul><li>NetworkAccess_INTERNAL： 内网访问</li><li>NetworkAccess_EXTERNAL： 公网访问</li></ul><p>默认值：NetworkAccess_EXTERNAL</p>
     * @param FlinkWebUINetworkAccessType <p>Flink UI访问类型设置</p><p>枚举值：</p><ul><li>NetworkAccess_INTERNAL： 内网访问</li><li>NetworkAccess_EXTERNAL： 公网访问</li></ul><p>默认值：NetworkAccess_EXTERNAL</p>
     */
    public void setFlinkWebUINetworkAccessType(String FlinkWebUINetworkAccessType) {
        this.FlinkWebUINetworkAccessType = FlinkWebUINetworkAccessType;
    }

    /**
     * Get <p>多可用区VPC</p> 
     * @return SlaveVpcDescriptions <p>多可用区VPC</p>
     */
    public SlaveVpcDescriptions [] getSlaveVpcDescriptions() {
        return this.SlaveVpcDescriptions;
    }

    /**
     * Set <p>多可用区VPC</p>
     * @param SlaveVpcDescriptions <p>多可用区VPC</p>
     */
    public void setSlaveVpcDescriptions(SlaveVpcDescriptions [] SlaveVpcDescriptions) {
        this.SlaveVpcDescriptions = SlaveVpcDescriptions;
    }

    /**
     * Get <p>核心内存比值，只支持 [0，2，4，8]</p> 
     * @return CUMemory <p>核心内存比值，只支持 [0，2，4，8]</p>
     */
    public Long getCUMemory() {
        return this.CUMemory;
    }

    /**
     * Set <p>核心内存比值，只支持 [0，2，4，8]</p>
     * @param CUMemory <p>核心内存比值，只支持 [0，2，4，8]</p>
     */
    public void setCUMemory(Long CUMemory) {
        this.CUMemory = CUMemory;
    }

    public CreateOceanusClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOceanusClusterRequest(CreateOceanusClusterRequest source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.LoginPassword != null) {
            this.LoginPassword = new String(source.LoginPassword);
        }
        if (source.VpcDescriptions != null) {
            this.VpcDescriptions = new VPCDescription[source.VpcDescriptions.length];
            for (int i = 0; i < source.VpcDescriptions.length; i++) {
                this.VpcDescriptions[i] = new VPCDescription(source.VpcDescriptions[i]);
            }
        }
        if (source.DefaultCOSBucket != null) {
            this.DefaultCOSBucket = new String(source.DefaultCOSBucket);
        }
        if (source.CU != null) {
            this.CU = new Long(source.CU);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.FlinkWebUINetworkAccessType != null) {
            this.FlinkWebUINetworkAccessType = new String(source.FlinkWebUINetworkAccessType);
        }
        if (source.SlaveVpcDescriptions != null) {
            this.SlaveVpcDescriptions = new SlaveVpcDescriptions[source.SlaveVpcDescriptions.length];
            for (int i = 0; i < source.SlaveVpcDescriptions.length; i++) {
                this.SlaveVpcDescriptions[i] = new SlaveVpcDescriptions(source.SlaveVpcDescriptions[i]);
            }
        }
        if (source.CUMemory != null) {
            this.CUMemory = new Long(source.CUMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LoginPassword", this.LoginPassword);
        this.setParamArrayObj(map, prefix + "VpcDescriptions.", this.VpcDescriptions);
        this.setParamSimple(map, prefix + "DefaultCOSBucket", this.DefaultCOSBucket);
        this.setParamSimple(map, prefix + "CU", this.CU);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "FlinkWebUINetworkAccessType", this.FlinkWebUINetworkAccessType);
        this.setParamArrayObj(map, prefix + "SlaveVpcDescriptions.", this.SlaveVpcDescriptions);
        this.setParamSimple(map, prefix + "CUMemory", this.CUMemory);

    }
}

