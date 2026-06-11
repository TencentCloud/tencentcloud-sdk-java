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

public class PulsarProClusterInfo extends AbstractModel {

    /**
    * <p>集群Id。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>说明信息。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>集群状态，0:创建中，1:正常，2:隔离</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>集群版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>节点分布情况</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeDistribution")
    @Expose
    private InstanceNodeDistribution [] NodeDistribution;

    /**
    * <p>最大储存容量，单位：MB</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>是否可以修改路由</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanEditRoute")
    @Expose
    private Boolean CanEditRoute;

    /**
    * <p>代表是专业版和小规格专业版的不同计费规格PULSAR.P1固定存储PULSAR.P2弹性存储</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingLabelVersion")
    @Expose
    private String BillingLabelVersion;

    /**
    * <p>实例到期时间戳，毫秒级精度。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>是否开启自动创建主题<br>true就是开启了，false是关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCreateTopicStatus")
    @Expose
    private Boolean AutoCreateTopicStatus;

    /**
    * <p>自动创建主题的默认分区数，如果没开启就是0</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultPartitionNumber")
    @Expose
    private Long DefaultPartitionNumber;

    /**
    * <p>用户自定义的租户别名，如果没有，会复用专业集群 ID</p>
    */
    @SerializedName("Tenant")
    @Expose
    private String Tenant;

    /**
    * <p>删除保护开关标识</p>
    */
    @SerializedName("DeleteProtection")
    @Expose
    private Long DeleteProtection;

    /**
    * <p>是否开启弹性tps</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
    */
    @SerializedName("ElasticTpsEnabled")
    @Expose
    private Long ElasticTpsEnabled;

    /**
    * <p>是否开启数据加密</p><p>枚举值：</p><ul><li>0： 关闭数据加密</li><li>1： 开启数据加密</li></ul>
    */
    @SerializedName("EncryptionStatus")
    @Expose
    private Long EncryptionStatus;

    /**
     * Get <p>集群Id。</p> 
     * @return ClusterId <p>集群Id。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群Id。</p>
     * @param ClusterId <p>集群Id。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称。</p> 
     * @return ClusterName <p>集群名称。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称。</p>
     * @param ClusterName <p>集群名称。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>说明信息。</p> 
     * @return Remark <p>说明信息。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>说明信息。</p>
     * @param Remark <p>说明信息。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>集群状态，0:创建中，1:正常，2:隔离</p> 
     * @return Status <p>集群状态，0:创建中，1:正常，2:隔离</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>集群状态，0:创建中，1:正常，2:隔离</p>
     * @param Status <p>集群状态，0:创建中，1:正常，2:隔离</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>集群版本</p> 
     * @return Version <p>集群版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>集群版本</p>
     * @param Version <p>集群版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>节点分布情况</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeDistribution <p>节点分布情况</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeDistribution [] getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set <p>节点分布情况</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeDistribution <p>节点分布情况</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeDistribution(InstanceNodeDistribution [] NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get <p>最大储存容量，单位：MB</p> 
     * @return MaxStorage <p>最大储存容量，单位：MB</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>最大储存容量，单位：MB</p>
     * @param MaxStorage <p>最大储存容量，单位：MB</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>是否可以修改路由</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanEditRoute <p>是否可以修改路由</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanEditRoute() {
        return this.CanEditRoute;
    }

    /**
     * Set <p>是否可以修改路由</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanEditRoute <p>是否可以修改路由</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanEditRoute(Boolean CanEditRoute) {
        this.CanEditRoute = CanEditRoute;
    }

    /**
     * Get <p>代表是专业版和小规格专业版的不同计费规格PULSAR.P1固定存储PULSAR.P2弹性存储</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingLabelVersion <p>代表是专业版和小规格专业版的不同计费规格PULSAR.P1固定存储PULSAR.P2弹性存储</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingLabelVersion() {
        return this.BillingLabelVersion;
    }

    /**
     * Set <p>代表是专业版和小规格专业版的不同计费规格PULSAR.P1固定存储PULSAR.P2弹性存储</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingLabelVersion <p>代表是专业版和小规格专业版的不同计费规格PULSAR.P1固定存储PULSAR.P2弹性存储</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingLabelVersion(String BillingLabelVersion) {
        this.BillingLabelVersion = BillingLabelVersion;
    }

    /**
     * Get <p>实例到期时间戳，毫秒级精度。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>实例到期时间戳，毫秒级精度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例到期时间戳，毫秒级精度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>实例到期时间戳，毫秒级精度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>是否开启自动创建主题<br>true就是开启了，false是关闭</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCreateTopicStatus <p>是否开启自动创建主题<br>true就是开启了，false是关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoCreateTopicStatus() {
        return this.AutoCreateTopicStatus;
    }

    /**
     * Set <p>是否开启自动创建主题<br>true就是开启了，false是关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCreateTopicStatus <p>是否开启自动创建主题<br>true就是开启了，false是关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCreateTopicStatus(Boolean AutoCreateTopicStatus) {
        this.AutoCreateTopicStatus = AutoCreateTopicStatus;
    }

    /**
     * Get <p>自动创建主题的默认分区数，如果没开启就是0</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultPartitionNumber <p>自动创建主题的默认分区数，如果没开启就是0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultPartitionNumber() {
        return this.DefaultPartitionNumber;
    }

    /**
     * Set <p>自动创建主题的默认分区数，如果没开启就是0</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultPartitionNumber <p>自动创建主题的默认分区数，如果没开启就是0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultPartitionNumber(Long DefaultPartitionNumber) {
        this.DefaultPartitionNumber = DefaultPartitionNumber;
    }

    /**
     * Get <p>用户自定义的租户别名，如果没有，会复用专业集群 ID</p> 
     * @return Tenant <p>用户自定义的租户别名，如果没有，会复用专业集群 ID</p>
     */
    public String getTenant() {
        return this.Tenant;
    }

    /**
     * Set <p>用户自定义的租户别名，如果没有，会复用专业集群 ID</p>
     * @param Tenant <p>用户自定义的租户别名，如果没有，会复用专业集群 ID</p>
     */
    public void setTenant(String Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get <p>删除保护开关标识</p> 
     * @return DeleteProtection <p>删除保护开关标识</p>
     */
    public Long getDeleteProtection() {
        return this.DeleteProtection;
    }

    /**
     * Set <p>删除保护开关标识</p>
     * @param DeleteProtection <p>删除保护开关标识</p>
     */
    public void setDeleteProtection(Long DeleteProtection) {
        this.DeleteProtection = DeleteProtection;
    }

    /**
     * Get <p>是否开启弹性tps</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul> 
     * @return ElasticTpsEnabled <p>是否开启弹性tps</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     */
    public Long getElasticTpsEnabled() {
        return this.ElasticTpsEnabled;
    }

    /**
     * Set <p>是否开启弹性tps</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     * @param ElasticTpsEnabled <p>是否开启弹性tps</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     */
    public void setElasticTpsEnabled(Long ElasticTpsEnabled) {
        this.ElasticTpsEnabled = ElasticTpsEnabled;
    }

    /**
     * Get <p>是否开启数据加密</p><p>枚举值：</p><ul><li>0： 关闭数据加密</li><li>1： 开启数据加密</li></ul> 
     * @return EncryptionStatus <p>是否开启数据加密</p><p>枚举值：</p><ul><li>0： 关闭数据加密</li><li>1： 开启数据加密</li></ul>
     */
    public Long getEncryptionStatus() {
        return this.EncryptionStatus;
    }

    /**
     * Set <p>是否开启数据加密</p><p>枚举值：</p><ul><li>0： 关闭数据加密</li><li>1： 开启数据加密</li></ul>
     * @param EncryptionStatus <p>是否开启数据加密</p><p>枚举值：</p><ul><li>0： 关闭数据加密</li><li>1： 开启数据加密</li></ul>
     */
    public void setEncryptionStatus(Long EncryptionStatus) {
        this.EncryptionStatus = EncryptionStatus;
    }

    public PulsarProClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProClusterInfo(PulsarProClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new InstanceNodeDistribution[source.NodeDistribution.length];
            for (int i = 0; i < source.NodeDistribution.length; i++) {
                this.NodeDistribution[i] = new InstanceNodeDistribution(source.NodeDistribution[i]);
            }
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.CanEditRoute != null) {
            this.CanEditRoute = new Boolean(source.CanEditRoute);
        }
        if (source.BillingLabelVersion != null) {
            this.BillingLabelVersion = new String(source.BillingLabelVersion);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoCreateTopicStatus != null) {
            this.AutoCreateTopicStatus = new Boolean(source.AutoCreateTopicStatus);
        }
        if (source.DefaultPartitionNumber != null) {
            this.DefaultPartitionNumber = new Long(source.DefaultPartitionNumber);
        }
        if (source.Tenant != null) {
            this.Tenant = new String(source.Tenant);
        }
        if (source.DeleteProtection != null) {
            this.DeleteProtection = new Long(source.DeleteProtection);
        }
        if (source.ElasticTpsEnabled != null) {
            this.ElasticTpsEnabled = new Long(source.ElasticTpsEnabled);
        }
        if (source.EncryptionStatus != null) {
            this.EncryptionStatus = new Long(source.EncryptionStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "CanEditRoute", this.CanEditRoute);
        this.setParamSimple(map, prefix + "BillingLabelVersion", this.BillingLabelVersion);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoCreateTopicStatus", this.AutoCreateTopicStatus);
        this.setParamSimple(map, prefix + "DefaultPartitionNumber", this.DefaultPartitionNumber);
        this.setParamSimple(map, prefix + "Tenant", this.Tenant);
        this.setParamSimple(map, prefix + "DeleteProtection", this.DeleteProtection);
        this.setParamSimple(map, prefix + "ElasticTpsEnabled", this.ElasticTpsEnabled);
        this.setParamSimple(map, prefix + "EncryptionStatus", this.EncryptionStatus);

    }
}

