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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstancesItem extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。取值范围：
<ul>
<li>2：包年包月</li>
<li>3：按量</li>
</ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * 地域 ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 存储周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * 实例业务状态。取值范围：
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 是否开启 Grafana
<li>0：不开启</li>
<li>1：开启</li>
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * 实例IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv4Address")
    @Expose
    private String IPv4Address;

    /**
    * 实例关联的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 计费状态
<ul>
<li>1：正常</li>
<li>2：过期</li>
<li>3：销毁</li>
<li>4：分配中</li>
<li>5：分配失败</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * 规格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 自动续费标记
<ul>
<li>0：不自动续费</li>
<li>1：开启自动续费</li>
<li>2：禁止自动续费</li>
<li>-1：无效</ii>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否快过期
<ul>
<li>0：否</li>
<li>1：快过期</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNearExpire")
    @Expose
    private Long IsNearExpire;

    /**
    * 数据写入需要的 Token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthToken")
    @Expose
    private String AuthToken;

    /**
    * Prometheus Remote Write 的地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteWrite")
    @Expose
    private String RemoteWrite;

    /**
    * Prometheus HTTP Api 根地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiRootPath")
    @Expose
    private String ApiRootPath;

    /**
    * Proxy 的地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String ProxyAddress;

    /**
    * Grafana 运行状态
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重启中</li>
<li>5：销毁中</li>
<li>6：已停机</li>
<li>7：已删除</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaStatus")
    @Expose
    private Long GrafanaStatus;

    /**
    * Grafana IP 白名单列表，使用英文分号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaIpWhiteList")
    @Expose
    private String GrafanaIpWhiteList;

    /**
    * 实例的授权信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grant")
    @Expose
    private PrometheusInstanceGrantInfo Grant;

    /**
    * 绑定的 Grafana 实例 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaInstanceId")
    @Expose
    private String GrafanaInstanceId;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式。取值范围：
<ul>
<li>2：包年包月</li>
<li>3：按量</li>
</ul> 
     * @return InstanceChargeType 实例计费模式。取值范围：
<ul>
<li>2：包年包月</li>
<li>3：按量</li>
</ul>
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围：
<ul>
<li>2：包年包月</li>
<li>3：按量</li>
</ul>
     * @param InstanceChargeType 实例计费模式。取值范围：
<ul>
<li>2：包年包月</li>
<li>3：按量</li>
</ul>
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 地域 ID 
     * @return RegionId 地域 ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID
     * @param RegionId 地域 ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

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
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID 
     * @return SubnetId 子网 ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID
     * @param SubnetId 子网 ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 存储周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataRetentionTime 存储周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set 存储周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataRetentionTime 存储周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get 实例业务状态。取值范围：
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul> 
     * @return InstanceStatus 实例业务状态。取值范围：
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例业务状态。取值范围：
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
     * @param InstanceStatus 实例业务状态。取值范围：
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaURL Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaURL Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 是否开启 Grafana
<li>0：不开启</li>
<li>1：开启</li> 
     * @return EnableGrafana 是否开启 Grafana
<li>0：不开启</li>
<li>1：开启</li>
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set 是否开启 Grafana
<li>0：不开启</li>
<li>1：开启</li>
     * @param EnableGrafana 是否开启 Grafana
<li>0：不开启</li>
<li>1：开启</li>
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
    }

    /**
     * Get 实例IPV4地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv4Address 实例IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv4Address() {
        return this.IPv4Address;
    }

    /**
     * Set 实例IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv4Address 实例IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    /**
     * Get 实例关联的标签列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 实例关联的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例关联的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 实例关联的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 计费状态
<ul>
<li>1：正常</li>
<li>2：过期</li>
<li>3：销毁</li>
<li>4：分配中</li>
<li>5：分配失败</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus 计费状态
<ul>
<li>1：正常</li>
<li>2：过期</li>
<li>3：销毁</li>
<li>4：分配中</li>
<li>5：分配失败</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set 计费状态
<ul>
<li>1：正常</li>
<li>2：过期</li>
<li>3：销毁</li>
<li>4：分配中</li>
<li>5：分配失败</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus 计费状态
<ul>
<li>1：正常</li>
<li>2：过期</li>
<li>3：销毁</li>
<li>4：分配中</li>
<li>5：分配失败</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get 规格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 自动续费标记
<ul>
<li>0：不自动续费</li>
<li>1：开启自动续费</li>
<li>2：禁止自动续费</li>
<li>-1：无效</ii>
</ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标记
<ul>
<li>0：不自动续费</li>
<li>1：开启自动续费</li>
<li>2：禁止自动续费</li>
<li>-1：无效</ii>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记
<ul>
<li>0：不自动续费</li>
<li>1：开启自动续费</li>
<li>2：禁止自动续费</li>
<li>-1：无效</ii>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标记
<ul>
<li>0：不自动续费</li>
<li>1：开启自动续费</li>
<li>2：禁止自动续费</li>
<li>-1：无效</ii>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否快过期
<ul>
<li>0：否</li>
<li>1：快过期</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNearExpire 是否快过期
<ul>
<li>0：否</li>
<li>1：快过期</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNearExpire() {
        return this.IsNearExpire;
    }

    /**
     * Set 是否快过期
<ul>
<li>0：否</li>
<li>1：快过期</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNearExpire 是否快过期
<ul>
<li>0：否</li>
<li>1：快过期</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNearExpire(Long IsNearExpire) {
        this.IsNearExpire = IsNearExpire;
    }

    /**
     * Get 数据写入需要的 Token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthToken 数据写入需要的 Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set 数据写入需要的 Token
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthToken 数据写入需要的 Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    /**
     * Get Prometheus Remote Write 的地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteWrite Prometheus Remote Write 的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteWrite() {
        return this.RemoteWrite;
    }

    /**
     * Set Prometheus Remote Write 的地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteWrite Prometheus Remote Write 的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteWrite(String RemoteWrite) {
        this.RemoteWrite = RemoteWrite;
    }

    /**
     * Get Prometheus HTTP Api 根地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiRootPath Prometheus HTTP Api 根地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiRootPath() {
        return this.ApiRootPath;
    }

    /**
     * Set Prometheus HTTP Api 根地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiRootPath Prometheus HTTP Api 根地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiRootPath(String ApiRootPath) {
        this.ApiRootPath = ApiRootPath;
    }

    /**
     * Get Proxy 的地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyAddress Proxy 的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set Proxy 的地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyAddress Proxy 的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyAddress(String ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get Grafana 运行状态
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重启中</li>
<li>5：销毁中</li>
<li>6：已停机</li>
<li>7：已删除</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaStatus Grafana 运行状态
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重启中</li>
<li>5：销毁中</li>
<li>6：已停机</li>
<li>7：已删除</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGrafanaStatus() {
        return this.GrafanaStatus;
    }

    /**
     * Set Grafana 运行状态
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重启中</li>
<li>5：销毁中</li>
<li>6：已停机</li>
<li>7：已删除</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaStatus Grafana 运行状态
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重启中</li>
<li>5：销毁中</li>
<li>6：已停机</li>
<li>7：已删除</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaStatus(Long GrafanaStatus) {
        this.GrafanaStatus = GrafanaStatus;
    }

    /**
     * Get Grafana IP 白名单列表，使用英文分号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaIpWhiteList Grafana IP 白名单列表，使用英文分号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaIpWhiteList() {
        return this.GrafanaIpWhiteList;
    }

    /**
     * Set Grafana IP 白名单列表，使用英文分号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaIpWhiteList Grafana IP 白名单列表，使用英文分号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaIpWhiteList(String GrafanaIpWhiteList) {
        this.GrafanaIpWhiteList = GrafanaIpWhiteList;
    }

    /**
     * Get 实例的授权信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grant 实例的授权信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusInstanceGrantInfo getGrant() {
        return this.Grant;
    }

    /**
     * Set 实例的授权信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grant 实例的授权信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrant(PrometheusInstanceGrantInfo Grant) {
        this.Grant = Grant;
    }

    /**
     * Get 绑定的 Grafana 实例 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaInstanceId 绑定的 Grafana 实例 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaInstanceId() {
        return this.GrafanaInstanceId;
    }

    /**
     * Set 绑定的 Grafana 实例 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaInstanceId 绑定的 Grafana 实例 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaInstanceId(String GrafanaInstanceId) {
        this.GrafanaInstanceId = GrafanaInstanceId;
    }

    public PrometheusInstancesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstancesItem(PrometheusInstancesItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.EnableGrafana != null) {
            this.EnableGrafana = new Long(source.EnableGrafana);
        }
        if (source.IPv4Address != null) {
            this.IPv4Address = new String(source.IPv4Address);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.IsNearExpire != null) {
            this.IsNearExpire = new Long(source.IsNearExpire);
        }
        if (source.AuthToken != null) {
            this.AuthToken = new String(source.AuthToken);
        }
        if (source.RemoteWrite != null) {
            this.RemoteWrite = new String(source.RemoteWrite);
        }
        if (source.ApiRootPath != null) {
            this.ApiRootPath = new String(source.ApiRootPath);
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new String(source.ProxyAddress);
        }
        if (source.GrafanaStatus != null) {
            this.GrafanaStatus = new Long(source.GrafanaStatus);
        }
        if (source.GrafanaIpWhiteList != null) {
            this.GrafanaIpWhiteList = new String(source.GrafanaIpWhiteList);
        }
        if (source.Grant != null) {
            this.Grant = new PrometheusInstanceGrantInfo(source.Grant);
        }
        if (source.GrafanaInstanceId != null) {
            this.GrafanaInstanceId = new String(source.GrafanaInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "EnableGrafana", this.EnableGrafana);
        this.setParamSimple(map, prefix + "IPv4Address", this.IPv4Address);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "IsNearExpire", this.IsNearExpire);
        this.setParamSimple(map, prefix + "AuthToken", this.AuthToken);
        this.setParamSimple(map, prefix + "RemoteWrite", this.RemoteWrite);
        this.setParamSimple(map, prefix + "ApiRootPath", this.ApiRootPath);
        this.setParamSimple(map, prefix + "ProxyAddress", this.ProxyAddress);
        this.setParamSimple(map, prefix + "GrafanaStatus", this.GrafanaStatus);
        this.setParamSimple(map, prefix + "GrafanaIpWhiteList", this.GrafanaIpWhiteList);
        this.setParamObj(map, prefix + "Grant.", this.Grant);
        this.setParamSimple(map, prefix + "GrafanaInstanceId", this.GrafanaInstanceId);

    }
}

