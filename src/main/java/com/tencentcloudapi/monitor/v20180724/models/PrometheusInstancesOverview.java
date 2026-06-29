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

public class PrometheusInstancesOverview extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:销毁中； 6:已停机； 7: 已删除）</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * <p>计费状态（1:正常；2:过期; 3:销毁; 4:分配中; 5:分配失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * <p>是否开启 Grafana（0:不开启，1:开启）</p>
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * <p>Grafana 面板 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * <p>实例付费类型（1:试用版；2:预付费）</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * <p>规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>存储周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * <p>购买的实例过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>自动续费标记(0:不自动续费；1:开启自动续费；2:禁止自动续费；-1:无效)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>绑定集群总数</p>
    */
    @SerializedName("BoundTotal")
    @Expose
    private Long BoundTotal;

    /**
    * <p>绑定集群正常状态总数</p>
    */
    @SerializedName("BoundNormal")
    @Expose
    private Long BoundNormal;

    /**
    * <p>资源包状态，0-无可用资源包，1-有可用资源包</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackageStatus")
    @Expose
    private Long ResourcePackageStatus;

    /**
    * <p>资源包规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackageSpecName")
    @Expose
    private String ResourcePackageSpecName;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:销毁中； 6:已停机； 7: 已删除）</p> 
     * @return InstanceStatus <p>运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:销毁中； 6:已停机； 7: 已删除）</p>
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:销毁中； 6:已停机； 7: 已删除）</p>
     * @param InstanceStatus <p>运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:销毁中； 6:已停机； 7: 已删除）</p>
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>计费状态（1:正常；2:过期; 3:销毁; 4:分配中; 5:分配失败）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus <p>计费状态（1:正常；2:过期; 3:销毁; 4:分配中; 5:分配失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set <p>计费状态（1:正常；2:过期; 3:销毁; 4:分配中; 5:分配失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus <p>计费状态（1:正常；2:过期; 3:销毁; 4:分配中; 5:分配失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get <p>是否开启 Grafana（0:不开启，1:开启）</p> 
     * @return EnableGrafana <p>是否开启 Grafana（0:不开启，1:开启）</p>
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set <p>是否开启 Grafana（0:不开启，1:开启）</p>
     * @param EnableGrafana <p>是否开启 Grafana（0:不开启，1:开启）</p>
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
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
     * Get <p>实例付费类型（1:试用版；2:预付费）</p> 
     * @return InstanceChargeType <p>实例付费类型（1:试用版；2:预付费）</p>
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例付费类型（1:试用版；2:预付费）</p>
     * @param InstanceChargeType <p>实例付费类型（1:试用版；2:预付费）</p>
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
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
     * Get <p>自动续费标记(0:不自动续费；1:开启自动续费；2:禁止自动续费；-1:无效)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag <p>自动续费标记(0:不自动续费；1:开启自动续费；2:禁止自动续费；-1:无效)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记(0:不自动续费；1:开启自动续费；2:禁止自动续费；-1:无效)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag <p>自动续费标记(0:不自动续费；1:开启自动续费；2:禁止自动续费；-1:无效)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>绑定集群总数</p> 
     * @return BoundTotal <p>绑定集群总数</p>
     */
    public Long getBoundTotal() {
        return this.BoundTotal;
    }

    /**
     * Set <p>绑定集群总数</p>
     * @param BoundTotal <p>绑定集群总数</p>
     */
    public void setBoundTotal(Long BoundTotal) {
        this.BoundTotal = BoundTotal;
    }

    /**
     * Get <p>绑定集群正常状态总数</p> 
     * @return BoundNormal <p>绑定集群正常状态总数</p>
     */
    public Long getBoundNormal() {
        return this.BoundNormal;
    }

    /**
     * Set <p>绑定集群正常状态总数</p>
     * @param BoundNormal <p>绑定集群正常状态总数</p>
     */
    public void setBoundNormal(Long BoundNormal) {
        this.BoundNormal = BoundNormal;
    }

    /**
     * Get <p>资源包状态，0-无可用资源包，1-有可用资源包</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackageStatus <p>资源包状态，0-无可用资源包，1-有可用资源包</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourcePackageStatus() {
        return this.ResourcePackageStatus;
    }

    /**
     * Set <p>资源包状态，0-无可用资源包，1-有可用资源包</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackageStatus <p>资源包状态，0-无可用资源包，1-有可用资源包</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackageStatus(Long ResourcePackageStatus) {
        this.ResourcePackageStatus = ResourcePackageStatus;
    }

    /**
     * Get <p>资源包规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackageSpecName <p>资源包规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePackageSpecName() {
        return this.ResourcePackageSpecName;
    }

    /**
     * Set <p>资源包规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackageSpecName <p>资源包规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackageSpecName(String ResourcePackageSpecName) {
        this.ResourcePackageSpecName = ResourcePackageSpecName;
    }

    public PrometheusInstancesOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstancesOverview(PrometheusInstancesOverview source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.EnableGrafana != null) {
            this.EnableGrafana = new Long(source.EnableGrafana);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.BoundTotal != null) {
            this.BoundTotal = new Long(source.BoundTotal);
        }
        if (source.BoundNormal != null) {
            this.BoundNormal = new Long(source.BoundNormal);
        }
        if (source.ResourcePackageStatus != null) {
            this.ResourcePackageStatus = new Long(source.ResourcePackageStatus);
        }
        if (source.ResourcePackageSpecName != null) {
            this.ResourcePackageSpecName = new String(source.ResourcePackageSpecName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "EnableGrafana", this.EnableGrafana);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "BoundTotal", this.BoundTotal);
        this.setParamSimple(map, prefix + "BoundNormal", this.BoundNormal);
        this.setParamSimple(map, prefix + "ResourcePackageStatus", this.ResourcePackageStatus);
        this.setParamSimple(map, prefix + "ResourcePackageSpecName", this.ResourcePackageSpecName);

    }
}

