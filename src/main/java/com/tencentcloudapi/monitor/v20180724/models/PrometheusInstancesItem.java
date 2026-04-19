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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstancesItem extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例计费模式。取值范围：</p><ul><li>2：包年包月</li><li>3：按量</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * <p>地域 ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>存储周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * <p>实例业务状态。取值范围：</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重建中</li><li>5：销毁中</li><li>6：已停服</li><li>8：欠费停服中</li><li>9：欠费已停服</li></ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * <p>Grafana 面板 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>是否开启 Grafana</p><li>0：不开启</li><li>1：开启</li>
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * <p>实例IPV4地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv4Address")
    @Expose
    private String IPv4Address;

    /**
    * <p>实例关联的标签列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * <p>购买的实例过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>计费状态</p><ul><li>1：正常</li><li>2：过期</li><li>3：销毁</li><li>4：分配中</li><li>5：分配失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * <p>规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>自动续费标记</p><ul><li>0：不自动续费</li><li>1：开启自动续费</li><li>2：禁止自动续费</li><li>-1：无效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>是否快过期</p><ul><li>0：否</li><li>1：快过期</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNearExpire")
    @Expose
    private Long IsNearExpire;

    /**
    * <p>数据写入需要的 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthToken")
    @Expose
    private String AuthToken;

    /**
    * <p>Prometheus Remote Write 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteWrite")
    @Expose
    private String RemoteWrite;

    /**
    * <p>Prometheus HTTP Api 根地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiRootPath")
    @Expose
    private String ApiRootPath;

    /**
    * <p>Proxy 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String ProxyAddress;

    /**
    * <p>Grafana 运行状态</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重启中</li><li>5：销毁中</li><li>6：已停机</li><li>7：已删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaStatus")
    @Expose
    private Long GrafanaStatus;

    /**
    * <p>Grafana IP 白名单列表，使用英文分号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaIpWhiteList")
    @Expose
    private String GrafanaIpWhiteList;

    /**
    * <p>实例的授权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grant")
    @Expose
    private PrometheusInstanceGrantInfo Grant;

    /**
    * <p>绑定的 Grafana 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaInstanceId")
    @Expose
    private String GrafanaInstanceId;

    /**
    * <p>告警规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertRuleLimit")
    @Expose
    private Long AlertRuleLimit;

    /**
    * <p>预聚合规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordingRuleLimit")
    @Expose
    private Long RecordingRuleLimit;

    /**
    * <p>迁移状态，0-不在迁移中，1-迁移中、原实例，2-迁移中、目标实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p><p>实例创建方式：<br>key: CreatedFrom<br>value: 0 - 来自prom控制台<br>1 - 来自tke集群详情页<br>2 - 来自新建集群页</p><p>免费试用到期时间:<br>key: FreeTrialExpireAt<br>value: RFC3339 格式时间字符串</p><p>关联的资源包ID:<br>key: ResourcePackageID<br>value: prompkg-xxxxx</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAttributes")
    @Expose
    private PrometheusRuleKV [] InstanceAttributes;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例计费模式。取值范围：</p><ul><li>2：包年包月</li><li>3：按量</li></ul> 
     * @return InstanceChargeType <p>实例计费模式。取值范围：</p><ul><li>2：包年包月</li><li>3：按量</li></ul>
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费模式。取值范围：</p><ul><li>2：包年包月</li><li>3：按量</li></ul>
     * @param InstanceChargeType <p>实例计费模式。取值范围：</p><ul><li>2：包年包月</li><li>3：按量</li></ul>
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>地域 ID</p> 
     * @return RegionId <p>地域 ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域 ID</p>
     * @param RegionId <p>地域 ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID</p> 
     * @return SubnetId <p>子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p>
     * @param SubnetId <p>子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>存储周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataRetentionTime <p>存储周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set <p>存储周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataRetentionTime <p>存储周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get <p>实例业务状态。取值范围：</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重建中</li><li>5：销毁中</li><li>6：已停服</li><li>8：欠费停服中</li><li>9：欠费已停服</li></ul> 
     * @return InstanceStatus <p>实例业务状态。取值范围：</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重建中</li><li>5：销毁中</li><li>6：已停服</li><li>8：欠费停服中</li><li>9：欠费已停服</li></ul>
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例业务状态。取值范围：</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重建中</li><li>5：销毁中</li><li>6：已停服</li><li>8：欠费停服中</li><li>9：欠费已停服</li></ul>
     * @param InstanceStatus <p>实例业务状态。取值范围：</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重建中</li><li>5：销毁中</li><li>6：已停服</li><li>8：欠费停服中</li><li>9：欠费已停服</li></ul>
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Grafana 面板 URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaURL <p>Grafana 面板 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set <p>Grafana 面板 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaURL <p>Grafana 面板 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>是否开启 Grafana</p><li>0：不开启</li><li>1：开启</li> 
     * @return EnableGrafana <p>是否开启 Grafana</p><li>0：不开启</li><li>1：开启</li>
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set <p>是否开启 Grafana</p><li>0：不开启</li><li>1：开启</li>
     * @param EnableGrafana <p>是否开启 Grafana</p><li>0：不开启</li><li>1：开启</li>
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
    }

    /**
     * Get <p>实例IPV4地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv4Address <p>实例IPV4地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv4Address() {
        return this.IPv4Address;
    }

    /**
     * Set <p>实例IPV4地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv4Address <p>实例IPV4地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    /**
     * Get <p>实例关联的标签列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification <p>实例关联的标签列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>实例关联的标签列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification <p>实例关联的标签列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get <p>购买的实例过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>购买的实例过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>购买的实例过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>购买的实例过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>计费状态</p><ul><li>1：正常</li><li>2：过期</li><li>3：销毁</li><li>4：分配中</li><li>5：分配失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus <p>计费状态</p><ul><li>1：正常</li><li>2：过期</li><li>3：销毁</li><li>4：分配中</li><li>5：分配失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set <p>计费状态</p><ul><li>1：正常</li><li>2：过期</li><li>3：销毁</li><li>4：分配中</li><li>5：分配失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus <p>计费状态</p><ul><li>1：正常</li><li>2：过期</li><li>3：销毁</li><li>4：分配中</li><li>5：分配失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get <p>规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName <p>规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName <p>规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>自动续费标记</p><ul><li>0：不自动续费</li><li>1：开启自动续费</li><li>2：禁止自动续费</li><li>-1：无效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag <p>自动续费标记</p><ul><li>0：不自动续费</li><li>1：开启自动续费</li><li>2：禁止自动续费</li><li>-1：无效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记</p><ul><li>0：不自动续费</li><li>1：开启自动续费</li><li>2：禁止自动续费</li><li>-1：无效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag <p>自动续费标记</p><ul><li>0：不自动续费</li><li>1：开启自动续费</li><li>2：禁止自动续费</li><li>-1：无效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>是否快过期</p><ul><li>0：否</li><li>1：快过期</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNearExpire <p>是否快过期</p><ul><li>0：否</li><li>1：快过期</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNearExpire() {
        return this.IsNearExpire;
    }

    /**
     * Set <p>是否快过期</p><ul><li>0：否</li><li>1：快过期</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNearExpire <p>是否快过期</p><ul><li>0：否</li><li>1：快过期</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNearExpire(Long IsNearExpire) {
        this.IsNearExpire = IsNearExpire;
    }

    /**
     * Get <p>数据写入需要的 Token</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthToken <p>数据写入需要的 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set <p>数据写入需要的 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthToken <p>数据写入需要的 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    /**
     * Get <p>Prometheus Remote Write 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteWrite <p>Prometheus Remote Write 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteWrite() {
        return this.RemoteWrite;
    }

    /**
     * Set <p>Prometheus Remote Write 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteWrite <p>Prometheus Remote Write 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteWrite(String RemoteWrite) {
        this.RemoteWrite = RemoteWrite;
    }

    /**
     * Get <p>Prometheus HTTP Api 根地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiRootPath <p>Prometheus HTTP Api 根地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiRootPath() {
        return this.ApiRootPath;
    }

    /**
     * Set <p>Prometheus HTTP Api 根地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiRootPath <p>Prometheus HTTP Api 根地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiRootPath(String ApiRootPath) {
        this.ApiRootPath = ApiRootPath;
    }

    /**
     * Get <p>Proxy 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyAddress <p>Proxy 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set <p>Proxy 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyAddress <p>Proxy 的地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyAddress(String ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get <p>Grafana 运行状态</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重启中</li><li>5：销毁中</li><li>6：已停机</li><li>7：已删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaStatus <p>Grafana 运行状态</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重启中</li><li>5：销毁中</li><li>6：已停机</li><li>7：已删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGrafanaStatus() {
        return this.GrafanaStatus;
    }

    /**
     * Set <p>Grafana 运行状态</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重启中</li><li>5：销毁中</li><li>6：已停机</li><li>7：已删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaStatus <p>Grafana 运行状态</p><ul><li>1：正在创建</li><li>2：运行中</li><li>3：异常</li><li>4：重启中</li><li>5：销毁中</li><li>6：已停机</li><li>7：已删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaStatus(Long GrafanaStatus) {
        this.GrafanaStatus = GrafanaStatus;
    }

    /**
     * Get <p>Grafana IP 白名单列表，使用英文分号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaIpWhiteList <p>Grafana IP 白名单列表，使用英文分号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaIpWhiteList() {
        return this.GrafanaIpWhiteList;
    }

    /**
     * Set <p>Grafana IP 白名单列表，使用英文分号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaIpWhiteList <p>Grafana IP 白名单列表，使用英文分号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaIpWhiteList(String GrafanaIpWhiteList) {
        this.GrafanaIpWhiteList = GrafanaIpWhiteList;
    }

    /**
     * Get <p>实例的授权信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grant <p>实例的授权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusInstanceGrantInfo getGrant() {
        return this.Grant;
    }

    /**
     * Set <p>实例的授权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grant <p>实例的授权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrant(PrometheusInstanceGrantInfo Grant) {
        this.Grant = Grant;
    }

    /**
     * Get <p>绑定的 Grafana 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaInstanceId <p>绑定的 Grafana 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaInstanceId() {
        return this.GrafanaInstanceId;
    }

    /**
     * Set <p>绑定的 Grafana 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaInstanceId <p>绑定的 Grafana 实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaInstanceId(String GrafanaInstanceId) {
        this.GrafanaInstanceId = GrafanaInstanceId;
    }

    /**
     * Get <p>告警规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertRuleLimit <p>告警规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlertRuleLimit() {
        return this.AlertRuleLimit;
    }

    /**
     * Set <p>告警规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertRuleLimit <p>告警规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertRuleLimit(Long AlertRuleLimit) {
        this.AlertRuleLimit = AlertRuleLimit;
    }

    /**
     * Get <p>预聚合规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordingRuleLimit <p>预聚合规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordingRuleLimit() {
        return this.RecordingRuleLimit;
    }

    /**
     * Set <p>预聚合规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordingRuleLimit <p>预聚合规则限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordingRuleLimit(Long RecordingRuleLimit) {
        this.RecordingRuleLimit = RecordingRuleLimit;
    }

    /**
     * Get <p>迁移状态，0-不在迁移中，1-迁移中、原实例，2-迁移中、目标实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrationType <p>迁移状态，0-不在迁移中，1-迁移中、原实例，2-迁移中、目标实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set <p>迁移状态，0-不在迁移中，1-迁移中、原实例，2-迁移中、目标实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrationType <p>迁移状态，0-不在迁移中，1-迁移中、原实例，2-迁移中、目标实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p><p>实例创建方式：<br>key: CreatedFrom<br>value: 0 - 来自prom控制台<br>1 - 来自tke集群详情页<br>2 - 来自新建集群页</p><p>免费试用到期时间:<br>key: FreeTrialExpireAt<br>value: RFC3339 格式时间字符串</p><p>关联的资源包ID:<br>key: ResourcePackageID<br>value: prompkg-xxxxx</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAttributes <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p><p>实例创建方式：<br>key: CreatedFrom<br>value: 0 - 来自prom控制台<br>1 - 来自tke集群详情页<br>2 - 来自新建集群页</p><p>免费试用到期时间:<br>key: FreeTrialExpireAt<br>value: RFC3339 格式时间字符串</p><p>关联的资源包ID:<br>key: ResourcePackageID<br>value: prompkg-xxxxx</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusRuleKV [] getInstanceAttributes() {
        return this.InstanceAttributes;
    }

    /**
     * Set <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p><p>实例创建方式：<br>key: CreatedFrom<br>value: 0 - 来自prom控制台<br>1 - 来自tke集群详情页<br>2 - 来自新建集群页</p><p>免费试用到期时间:<br>key: FreeTrialExpireAt<br>value: RFC3339 格式时间字符串</p><p>关联的资源包ID:<br>key: ResourcePackageID<br>value: prompkg-xxxxx</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAttributes <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p><p>实例创建方式：<br>key: CreatedFrom<br>value: 0 - 来自prom控制台<br>1 - 来自tke集群详情页<br>2 - 来自新建集群页</p><p>免费试用到期时间:<br>key: FreeTrialExpireAt<br>value: RFC3339 格式时间字符串</p><p>关联的资源包ID:<br>key: ResourcePackageID<br>value: prompkg-xxxxx</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAttributes(PrometheusRuleKV [] InstanceAttributes) {
        this.InstanceAttributes = InstanceAttributes;
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
        if (source.AlertRuleLimit != null) {
            this.AlertRuleLimit = new Long(source.AlertRuleLimit);
        }
        if (source.RecordingRuleLimit != null) {
            this.RecordingRuleLimit = new Long(source.RecordingRuleLimit);
        }
        if (source.MigrationType != null) {
            this.MigrationType = new Long(source.MigrationType);
        }
        if (source.InstanceAttributes != null) {
            this.InstanceAttributes = new PrometheusRuleKV[source.InstanceAttributes.length];
            for (int i = 0; i < source.InstanceAttributes.length; i++) {
                this.InstanceAttributes[i] = new PrometheusRuleKV(source.InstanceAttributes[i]);
            }
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
        this.setParamSimple(map, prefix + "AlertRuleLimit", this.AlertRuleLimit);
        this.setParamSimple(map, prefix + "RecordingRuleLimit", this.RecordingRuleLimit);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamArrayObj(map, prefix + "InstanceAttributes.", this.InstanceAttributes);

    }
}

