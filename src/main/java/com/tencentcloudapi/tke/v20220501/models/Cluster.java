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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群描述
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * 集群版本（默认值为1.10.5）
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Upgrading 升级中,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 欠费隔离中,ResourceIsolated 欠费已隔离,ResourceReverse 冲正恢复中,Abnormal 异常)
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 集群等级，针对托管集群生效
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * 集群所在vpc的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群描述 
     * @return ClusterDescription 集群描述
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set 集群描述
     * @param ClusterDescription 集群描述
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    /**
     * Get 集群版本（默认值为1.10.5） 
     * @return ClusterVersion 集群版本（默认值为1.10.5）
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本（默认值为1.10.5）
     * @param ClusterVersion 集群版本（默认值为1.10.5）
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。 
     * @return ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     * @param ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Upgrading 升级中,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 欠费隔离中,ResourceIsolated 欠费已隔离,ResourceReverse 冲正恢复中,Abnormal 异常) 
     * @return ClusterStatus 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Upgrading 升级中,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 欠费隔离中,ResourceIsolated 欠费已隔离,ResourceReverse 冲正恢复中,Abnormal 异常)
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Upgrading 升级中,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 欠费隔离中,ResourceIsolated 欠费已隔离,ResourceReverse 冲正恢复中,Abnormal 异常)
     * @param ClusterStatus 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Upgrading 升级中,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 欠费隔离中,ResourceIsolated 欠费已隔离,ResourceReverse 冲正恢复中,Abnormal 异常)
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 集群等级，针对托管集群生效
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterLevel 集群等级，针对托管集群生效
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set 集群等级，针对托管集群生效
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterLevel 集群等级，针对托管集群生效
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get 集群所在vpc的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 集群所在vpc的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群所在vpc的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 集群所在vpc的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDescription != null) {
            this.ClusterDescription = new String(source.ClusterDescription);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

