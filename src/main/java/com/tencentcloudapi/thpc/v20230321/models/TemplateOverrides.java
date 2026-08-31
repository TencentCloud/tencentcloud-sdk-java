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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateOverrides extends AbstractModel {

    /**
    * <p>候选机型族列表，最多 10 个。MULTI_CARD 模式的明确标志字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private String [] InstanceFamilies;

    /**
    * <p>每节点 GPU 卡数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuCountPerNode")
    @Expose
    private Long GpuCountPerNode;

    /**
    * <p>是否启用混合 GPU 卡数折算，默认 false。未传时保持已持久化的混卡开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableMixedGpuCount")
    @Expose
    private Boolean EnableMixedGpuCount;

    /**
    * <p>是否启用多可用区扩容。未传时保持已持久化的分区策略，局部更新不得覆盖。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableMultiZone")
    @Expose
    private Boolean EnableMultiZone;

    /**
     * Get <p>候选机型族列表，最多 10 个。MULTI_CARD 模式的明确标志字段。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceFamilies <p>候选机型族列表，最多 10 个。MULTI_CARD 模式的明确标志字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set <p>候选机型族列表，最多 10 个。MULTI_CARD 模式的明确标志字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceFamilies <p>候选机型族列表，最多 10 个。MULTI_CARD 模式的明确标志字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceFamilies(String [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    /**
     * Get <p>每节点 GPU 卡数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuCountPerNode <p>每节点 GPU 卡数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuCountPerNode() {
        return this.GpuCountPerNode;
    }

    /**
     * Set <p>每节点 GPU 卡数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuCountPerNode <p>每节点 GPU 卡数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuCountPerNode(Long GpuCountPerNode) {
        this.GpuCountPerNode = GpuCountPerNode;
    }

    /**
     * Get <p>是否启用混合 GPU 卡数折算，默认 false。未传时保持已持久化的混卡开关。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableMixedGpuCount <p>是否启用混合 GPU 卡数折算，默认 false。未传时保持已持久化的混卡开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableMixedGpuCount() {
        return this.EnableMixedGpuCount;
    }

    /**
     * Set <p>是否启用混合 GPU 卡数折算，默认 false。未传时保持已持久化的混卡开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableMixedGpuCount <p>是否启用混合 GPU 卡数折算，默认 false。未传时保持已持久化的混卡开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableMixedGpuCount(Boolean EnableMixedGpuCount) {
        this.EnableMixedGpuCount = EnableMixedGpuCount;
    }

    /**
     * Get <p>是否启用多可用区扩容。未传时保持已持久化的分区策略，局部更新不得覆盖。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableMultiZone <p>是否启用多可用区扩容。未传时保持已持久化的分区策略，局部更新不得覆盖。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableMultiZone() {
        return this.EnableMultiZone;
    }

    /**
     * Set <p>是否启用多可用区扩容。未传时保持已持久化的分区策略，局部更新不得覆盖。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableMultiZone <p>是否启用多可用区扩容。未传时保持已持久化的分区策略，局部更新不得覆盖。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableMultiZone(Boolean EnableMultiZone) {
        this.EnableMultiZone = EnableMultiZone;
    }

    public TemplateOverrides() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateOverrides(TemplateOverrides source) {
        if (source.InstanceFamilies != null) {
            this.InstanceFamilies = new String[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new String(source.InstanceFamilies[i]);
            }
        }
        if (source.GpuCountPerNode != null) {
            this.GpuCountPerNode = new Long(source.GpuCountPerNode);
        }
        if (source.EnableMixedGpuCount != null) {
            this.EnableMixedGpuCount = new Boolean(source.EnableMixedGpuCount);
        }
        if (source.EnableMultiZone != null) {
            this.EnableMultiZone = new Boolean(source.EnableMultiZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceFamilies.", this.InstanceFamilies);
        this.setParamSimple(map, prefix + "GpuCountPerNode", this.GpuCountPerNode);
        this.setParamSimple(map, prefix + "EnableMixedGpuCount", this.EnableMixedGpuCount);
        this.setParamSimple(map, prefix + "EnableMultiZone", this.EnableMultiZone);

    }
}

