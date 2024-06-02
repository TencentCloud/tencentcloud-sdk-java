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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceItemExtraInfo extends AbstractModel {

    /**
    * 是否vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * 4.x专享集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipInstanceStatus")
    @Expose
    private Long VipInstanceStatus;

    /**
    * 专享集群峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 专享集群规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 专享集群节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 专享集群最大存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 专享集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetention")
    @Expose
    private Long MaxRetention;

    /**
    * 专项集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinRetention")
    @Expose
    private Long MinRetention;

    /**
    * 4.0共享集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
     * Get 是否vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVip 是否vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVip 是否vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get 4.x专享集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipInstanceStatus 4.x专享集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVipInstanceStatus() {
        return this.VipInstanceStatus;
    }

    /**
     * Set 4.x专享集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipInstanceStatus 4.x专享集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipInstanceStatus(Long VipInstanceStatus) {
        this.VipInstanceStatus = VipInstanceStatus;
    }

    /**
     * Get 专享集群峰值带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxBandWidth 专享集群峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 专享集群峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxBandWidth 专享集群峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 专享集群规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName 专享集群规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 专享集群规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 专享集群规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 专享集群节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeCount 专享集群节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 专享集群节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeCount 专享集群节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 专享集群最大存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxStorage 专享集群最大存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 专享集群最大存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxStorage 专享集群最大存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 专享集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetention 专享集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetention() {
        return this.MaxRetention;
    }

    /**
     * Set 专享集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetention 专享集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetention(Long MaxRetention) {
        this.MaxRetention = MaxRetention;
    }

    /**
     * Get 专项集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinRetention 专项集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinRetention() {
        return this.MinRetention;
    }

    /**
     * Set 专项集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinRetention 专项集群最大保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinRetention(Long MinRetention) {
        this.MinRetention = MinRetention;
    }

    /**
     * Get 4.0共享集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 4.0共享集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 4.0共享集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 4.0共享集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public InstanceItemExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceItemExtraInfo(InstanceItemExtraInfo source) {
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.VipInstanceStatus != null) {
            this.VipInstanceStatus = new Long(source.VipInstanceStatus);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MaxRetention != null) {
            this.MaxRetention = new Long(source.MaxRetention);
        }
        if (source.MinRetention != null) {
            this.MinRetention = new Long(source.MinRetention);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "VipInstanceStatus", this.VipInstanceStatus);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MaxRetention", this.MaxRetention);
        this.setParamSimple(map, prefix + "MinRetention", this.MinRetention);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

