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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PulsarProInstance extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例版本</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * <p>实例状态，0-创建中，1-正常，2-隔离中，3-已销毁，4 - 异常, 5 - 发货失败，6-变配中，7-变配失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例配置规格名称</p>
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * <p>峰值TPS</p>
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * <p>存储容量，GB为单位</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>实例到期时间，毫秒为单位</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>0-后付费，1-预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>实例配置ID</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalableTps")
    @Expose
    private Long ScalableTps;

    /**
    * <p>VPC的id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>峰值带宽。单位：mbps</p>
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * <p>集群的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>集群创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>代表是专业版和标准版的不同计费规格<br>PULSAR.P1固定存储<br>PULSAR.P2弹性存储<br>PULSAR.S2标准版</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingLabelVersion")
    @Expose
    private String BillingLabelVersion;

    /**
    * <p>自定义租户</p>
    */
    @SerializedName("Tenant")
    @Expose
    private String Tenant;

    /**
    * <p>集群的证书列表</p>
    */
    @SerializedName("CertificateList")
    @Expose
    private CertificateInfo [] CertificateList;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例版本</p> 
     * @return InstanceVersion <p>实例版本</p>
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>实例版本</p>
     * @param InstanceVersion <p>实例版本</p>
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get <p>实例状态，0-创建中，1-正常，2-隔离中，3-已销毁，4 - 异常, 5 - 发货失败，6-变配中，7-变配失败</p> 
     * @return Status <p>实例状态，0-创建中，1-正常，2-隔离中，3-已销毁，4 - 异常, 5 - 发货失败，6-变配中，7-变配失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态，0-创建中，1-正常，2-隔离中，3-已销毁，4 - 异常, 5 - 发货失败，6-变配中，7-变配失败</p>
     * @param Status <p>实例状态，0-创建中，1-正常，2-隔离中，3-已销毁，4 - 异常, 5 - 发货失败，6-变配中，7-变配失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例配置规格名称</p> 
     * @return ConfigDisplay <p>实例配置规格名称</p>
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set <p>实例配置规格名称</p>
     * @param ConfigDisplay <p>实例配置规格名称</p>
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get <p>峰值TPS</p> 
     * @return MaxTps <p>峰值TPS</p>
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set <p>峰值TPS</p>
     * @param MaxTps <p>峰值TPS</p>
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get <p>存储容量，GB为单位</p> 
     * @return MaxStorage <p>存储容量，GB为单位</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>存储容量，GB为单位</p>
     * @param MaxStorage <p>存储容量，GB为单位</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>实例到期时间，毫秒为单位</p> 
     * @return ExpireTime <p>实例到期时间，毫秒为单位</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例到期时间，毫秒为单位</p>
     * @param ExpireTime <p>实例到期时间，毫秒为单位</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p> 
     * @return AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     * @param AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>0-后付费，1-预付费</p> 
     * @return PayMode <p>0-后付费，1-预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>0-后付费，1-预付费</p>
     * @param PayMode <p>0-后付费，1-预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>实例配置ID</p> 
     * @return SpecName <p>实例配置ID</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>实例配置ID</p>
     * @param SpecName <p>实例配置ID</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalableTps <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalableTps() {
        return this.ScalableTps;
    }

    /**
     * Set <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalableTps <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalableTps(Long ScalableTps) {
        this.ScalableTps = ScalableTps;
    }

    /**
     * Get <p>VPC的id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>VPC的id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC的id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>VPC的id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>子网id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>子网id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>峰值带宽。单位：mbps</p> 
     * @return MaxBandWidth <p>峰值带宽。单位：mbps</p>
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set <p>峰值带宽。单位：mbps</p>
     * @param MaxBandWidth <p>峰值带宽。单位：mbps</p>
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get <p>集群的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>集群的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>集群的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>集群的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>集群创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>集群创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>集群创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>集群创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>代表是专业版和标准版的不同计费规格<br>PULSAR.P1固定存储<br>PULSAR.P2弹性存储<br>PULSAR.S2标准版</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingLabelVersion <p>代表是专业版和标准版的不同计费规格<br>PULSAR.P1固定存储<br>PULSAR.P2弹性存储<br>PULSAR.S2标准版</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingLabelVersion() {
        return this.BillingLabelVersion;
    }

    /**
     * Set <p>代表是专业版和标准版的不同计费规格<br>PULSAR.P1固定存储<br>PULSAR.P2弹性存储<br>PULSAR.S2标准版</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingLabelVersion <p>代表是专业版和标准版的不同计费规格<br>PULSAR.P1固定存储<br>PULSAR.P2弹性存储<br>PULSAR.S2标准版</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingLabelVersion(String BillingLabelVersion) {
        this.BillingLabelVersion = BillingLabelVersion;
    }

    /**
     * Get <p>自定义租户</p> 
     * @return Tenant <p>自定义租户</p>
     */
    public String getTenant() {
        return this.Tenant;
    }

    /**
     * Set <p>自定义租户</p>
     * @param Tenant <p>自定义租户</p>
     */
    public void setTenant(String Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get <p>集群的证书列表</p> 
     * @return CertificateList <p>集群的证书列表</p>
     */
    public CertificateInfo [] getCertificateList() {
        return this.CertificateList;
    }

    /**
     * Set <p>集群的证书列表</p>
     * @param CertificateList <p>集群的证书列表</p>
     */
    public void setCertificateList(CertificateInfo [] CertificateList) {
        this.CertificateList = CertificateList;
    }

    public PulsarProInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProInstance(PulsarProInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.ScalableTps != null) {
            this.ScalableTps = new Long(source.ScalableTps);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BillingLabelVersion != null) {
            this.BillingLabelVersion = new String(source.BillingLabelVersion);
        }
        if (source.Tenant != null) {
            this.Tenant = new String(source.Tenant);
        }
        if (source.CertificateList != null) {
            this.CertificateList = new CertificateInfo[source.CertificateList.length];
            for (int i = 0; i < source.CertificateList.length; i++) {
                this.CertificateList[i] = new CertificateInfo(source.CertificateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ScalableTps", this.ScalableTps);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BillingLabelVersion", this.BillingLabelVersion);
        this.setParamSimple(map, prefix + "Tenant", this.Tenant);
        this.setParamArrayObj(map, prefix + "CertificateList.", this.CertificateList);

    }
}

