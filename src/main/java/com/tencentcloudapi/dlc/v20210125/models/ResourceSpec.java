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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSpec extends AbstractModel {

    /**
    * <p>资源包类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>机型，例如X40/T20，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>四层计费项</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>规格描述</p>
    */
    @SerializedName("SpecDesc")
    @Expose
    private String SpecDesc;

    /**
    * <p>规格，格式为 {gpu}:{cpu}:{mem}:{vram}</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>GPU类型，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>单个物理节点上该计费项对应的最大 GPU 卡数，CPU / HM_CPU 恒为 0</p>
    */
    @SerializedName("MaxCardPerNode")
    @Expose
    private Long MaxCardPerNode;

    /**
     * Get <p>资源包类型</p> 
     * @return ResourceType <p>资源包类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源包类型</p>
     * @param ResourceType <p>资源包类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>机型，例如X40/T20，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType <p>机型，例如X40/T20，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>机型，例如X40/T20，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType <p>机型，例如X40/T20，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>四层计费项</p> 
     * @return BillingItem <p>四层计费项</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>四层计费项</p>
     * @param BillingItem <p>四层计费项</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>规格描述</p> 
     * @return SpecDesc <p>规格描述</p>
     */
    public String getSpecDesc() {
        return this.SpecDesc;
    }

    /**
     * Set <p>规格描述</p>
     * @param SpecDesc <p>规格描述</p>
     */
    public void setSpecDesc(String SpecDesc) {
        this.SpecDesc = SpecDesc;
    }

    /**
     * Get <p>规格，格式为 {gpu}:{cpu}:{mem}:{vram}</p> 
     * @return Spec <p>规格，格式为 {gpu}:{cpu}:{mem}:{vram}</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>规格，格式为 {gpu}:{cpu}:{mem}:{vram}</p>
     * @param Spec <p>规格，格式为 {gpu}:{cpu}:{mem}:{vram}</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>GPU类型，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType <p>GPU类型，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU类型，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType <p>GPU类型，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>单个物理节点上该计费项对应的最大 GPU 卡数，CPU / HM_CPU 恒为 0</p> 
     * @return MaxCardPerNode <p>单个物理节点上该计费项对应的最大 GPU 卡数，CPU / HM_CPU 恒为 0</p>
     */
    public Long getMaxCardPerNode() {
        return this.MaxCardPerNode;
    }

    /**
     * Set <p>单个物理节点上该计费项对应的最大 GPU 卡数，CPU / HM_CPU 恒为 0</p>
     * @param MaxCardPerNode <p>单个物理节点上该计费项对应的最大 GPU 卡数，CPU / HM_CPU 恒为 0</p>
     */
    public void setMaxCardPerNode(Long MaxCardPerNode) {
        this.MaxCardPerNode = MaxCardPerNode;
    }

    public ResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpec(ResourceSpec source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.SpecDesc != null) {
            this.SpecDesc = new String(source.SpecDesc);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.MaxCardPerNode != null) {
            this.MaxCardPerNode = new Long(source.MaxCardPerNode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "SpecDesc", this.SpecDesc);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "MaxCardPerNode", this.MaxCardPerNode);

    }
}

