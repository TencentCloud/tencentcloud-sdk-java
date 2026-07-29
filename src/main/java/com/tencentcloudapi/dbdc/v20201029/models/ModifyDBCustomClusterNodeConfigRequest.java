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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBCustomClusterNodeConfigRequest extends AbstractModel {

    /**
    * <p>目标集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>要修改的节点 ID 列表</p><p>入参限制：数量范围 1~50 个</p>
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
    * <p>新增或覆盖的集群 Label</p><p>入参限制：- 单次 ≤ 20 对；合并后节点总量不超过 20</p><ul><li>Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</li><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
    */
    @SerializedName("UpsertLabels")
    @Expose
    private Label [] UpsertLabels;

    /**
    * <p>要删除的 Label key 列表，按 key 精确匹配，key 不存在时幂等放行。</p><p>入参限制：- Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</p><ul><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
    */
    @SerializedName("DeleteLabelKeys")
    @Expose
    private String [] DeleteLabelKeys;

    /**
    * <p>新增或覆盖的 Taint。</p><p>入参限制：- 单次 ≤ 5 对；合并后节点总量不超过 5。</p><ul><li>唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</li><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
    */
    @SerializedName("UpsertTaints")
    @Expose
    private Taint [] UpsertTaints;

    /**
    * <p>要删除的 Taint 过滤器列表</p><p>入参限制：- 唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</p><ul><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
    */
    @SerializedName("DeleteTaints")
    @Expose
    private Taint [] DeleteTaints;

    /**
     * Get <p>目标集群 ID</p> 
     * @return ClusterId <p>目标集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>目标集群 ID</p>
     * @param ClusterId <p>目标集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>要修改的节点 ID 列表</p><p>入参限制：数量范围 1~50 个</p> 
     * @return NodeIds <p>要修改的节点 ID 列表</p><p>入参限制：数量范围 1~50 个</p>
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set <p>要修改的节点 ID 列表</p><p>入参限制：数量范围 1~50 个</p>
     * @param NodeIds <p>要修改的节点 ID 列表</p><p>入参限制：数量范围 1~50 个</p>
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    /**
     * Get <p>新增或覆盖的集群 Label</p><p>入参限制：- 单次 ≤ 20 对；合并后节点总量不超过 20</p><ul><li>Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</li><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul> 
     * @return UpsertLabels <p>新增或覆盖的集群 Label</p><p>入参限制：- 单次 ≤ 20 对；合并后节点总量不超过 20</p><ul><li>Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</li><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
     */
    public Label [] getUpsertLabels() {
        return this.UpsertLabels;
    }

    /**
     * Set <p>新增或覆盖的集群 Label</p><p>入参限制：- 单次 ≤ 20 对；合并后节点总量不超过 20</p><ul><li>Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</li><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
     * @param UpsertLabels <p>新增或覆盖的集群 Label</p><p>入参限制：- 单次 ≤ 20 对；合并后节点总量不超过 20</p><ul><li>Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</li><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
     */
    public void setUpsertLabels(Label [] UpsertLabels) {
        this.UpsertLabels = UpsertLabels;
    }

    /**
     * Get <p>要删除的 Label key 列表，按 key 精确匹配，key 不存在时幂等放行。</p><p>入参限制：- Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</p><ul><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul> 
     * @return DeleteLabelKeys <p>要删除的 Label key 列表，按 key 精确匹配，key 不存在时幂等放行。</p><p>入参限制：- Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</p><ul><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
     */
    public String [] getDeleteLabelKeys() {
        return this.DeleteLabelKeys;
    }

    /**
     * Set <p>要删除的 Label key 列表，按 key 精确匹配，key 不存在时幂等放行。</p><p>入参限制：- Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</p><ul><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
     * @param DeleteLabelKeys <p>要删除的 Label key 列表，按 key 精确匹配，key 不存在时幂等放行。</p><p>入参限制：- Key 格式对齐 K8s 原生（两段式，prefix DNS 子域 ≤ 253 字符，name ≤ 63 字符）</p><ul><li>Value ≤ 63 字符，可为空</li><li>不可操作系统保留前缀</li></ul>
     */
    public void setDeleteLabelKeys(String [] DeleteLabelKeys) {
        this.DeleteLabelKeys = DeleteLabelKeys;
    }

    /**
     * Get <p>新增或覆盖的 Taint。</p><p>入参限制：- 单次 ≤ 5 对；合并后节点总量不超过 5。</p><ul><li>唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</li><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul> 
     * @return UpsertTaints <p>新增或覆盖的 Taint。</p><p>入参限制：- 单次 ≤ 5 对；合并后节点总量不超过 5。</p><ul><li>唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</li><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
     */
    public Taint [] getUpsertTaints() {
        return this.UpsertTaints;
    }

    /**
     * Set <p>新增或覆盖的 Taint。</p><p>入参限制：- 单次 ≤ 5 对；合并后节点总量不超过 5。</p><ul><li>唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</li><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
     * @param UpsertTaints <p>新增或覆盖的 Taint。</p><p>入参限制：- 单次 ≤ 5 对；合并后节点总量不超过 5。</p><ul><li>唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</li><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
     */
    public void setUpsertTaints(Taint [] UpsertTaints) {
        this.UpsertTaints = UpsertTaints;
    }

    /**
     * Get <p>要删除的 Taint 过滤器列表</p><p>入参限制：- 唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</p><ul><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul> 
     * @return DeleteTaints <p>要删除的 Taint 过滤器列表</p><p>入参限制：- 唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</p><ul><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
     */
    public Taint [] getDeleteTaints() {
        return this.DeleteTaints;
    }

    /**
     * Set <p>要删除的 Taint 过滤器列表</p><p>入参限制：- 唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</p><ul><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
     * @param DeleteTaints <p>要删除的 Taint 过滤器列表</p><p>入参限制：- 唯一性键为 (Key, Effect)，匹配到已有 (Key, Effect) 时覆盖 Value，否则新增</p><ul><li>Effect 合法值：NoSchedule / PreferNoSchedule / NoExecute</li><li>同一 Key 允许多个不同 Effect 的 Taint 并存</li></ul>
     */
    public void setDeleteTaints(Taint [] DeleteTaints) {
        this.DeleteTaints = DeleteTaints;
    }

    public ModifyDBCustomClusterNodeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomClusterNodeConfigRequest(ModifyDBCustomClusterNodeConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
        if (source.UpsertLabels != null) {
            this.UpsertLabels = new Label[source.UpsertLabels.length];
            for (int i = 0; i < source.UpsertLabels.length; i++) {
                this.UpsertLabels[i] = new Label(source.UpsertLabels[i]);
            }
        }
        if (source.DeleteLabelKeys != null) {
            this.DeleteLabelKeys = new String[source.DeleteLabelKeys.length];
            for (int i = 0; i < source.DeleteLabelKeys.length; i++) {
                this.DeleteLabelKeys[i] = new String(source.DeleteLabelKeys[i]);
            }
        }
        if (source.UpsertTaints != null) {
            this.UpsertTaints = new Taint[source.UpsertTaints.length];
            for (int i = 0; i < source.UpsertTaints.length; i++) {
                this.UpsertTaints[i] = new Taint(source.UpsertTaints[i]);
            }
        }
        if (source.DeleteTaints != null) {
            this.DeleteTaints = new Taint[source.DeleteTaints.length];
            for (int i = 0; i < source.DeleteTaints.length; i++) {
                this.DeleteTaints[i] = new Taint(source.DeleteTaints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);
        this.setParamArrayObj(map, prefix + "UpsertLabels.", this.UpsertLabels);
        this.setParamArraySimple(map, prefix + "DeleteLabelKeys.", this.DeleteLabelKeys);
        this.setParamArrayObj(map, prefix + "UpsertTaints.", this.UpsertTaints);
        this.setParamArrayObj(map, prefix + "DeleteTaints.", this.DeleteTaints);

    }
}

