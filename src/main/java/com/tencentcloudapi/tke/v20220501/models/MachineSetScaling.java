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

public class MachineSetScaling extends AbstractModel {

    /**
    * <p>节点池最小副本数</p>
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * <p>节点池最大副本数</p>
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * <p>节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatePolicy")
    @Expose
    private String CreatePolicy;

    /**
    * <p>扩缩容模式</p><p>枚举值：</p><ul><li>ShutdownAndDelete： 释放模式，默认</li><li>Shutdown： 停机模式，关机不计费</li></ul><p>默认值：ShutdownAndDelete</p>
    */
    @SerializedName("ScaleDownMode")
    @Expose
    private String ScaleDownMode;

    /**
     * Get <p>节点池最小副本数</p> 
     * @return MinReplicas <p>节点池最小副本数</p>
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set <p>节点池最小副本数</p>
     * @param MinReplicas <p>节点池最小副本数</p>
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get <p>节点池最大副本数</p> 
     * @return MaxReplicas <p>节点池最大副本数</p>
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set <p>节点池最大副本数</p>
     * @param MaxReplicas <p>节点池最大副本数</p>
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get <p>节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatePolicy <p>节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatePolicy() {
        return this.CreatePolicy;
    }

    /**
     * Set <p>节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatePolicy <p>节点池扩容策略。ZoneEquality：多可用区打散；ZonePriority：首选可用区优先；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatePolicy(String CreatePolicy) {
        this.CreatePolicy = CreatePolicy;
    }

    /**
     * Get <p>扩缩容模式</p><p>枚举值：</p><ul><li>ShutdownAndDelete： 释放模式，默认</li><li>Shutdown： 停机模式，关机不计费</li></ul><p>默认值：ShutdownAndDelete</p> 
     * @return ScaleDownMode <p>扩缩容模式</p><p>枚举值：</p><ul><li>ShutdownAndDelete： 释放模式，默认</li><li>Shutdown： 停机模式，关机不计费</li></ul><p>默认值：ShutdownAndDelete</p>
     */
    public String getScaleDownMode() {
        return this.ScaleDownMode;
    }

    /**
     * Set <p>扩缩容模式</p><p>枚举值：</p><ul><li>ShutdownAndDelete： 释放模式，默认</li><li>Shutdown： 停机模式，关机不计费</li></ul><p>默认值：ShutdownAndDelete</p>
     * @param ScaleDownMode <p>扩缩容模式</p><p>枚举值：</p><ul><li>ShutdownAndDelete： 释放模式，默认</li><li>Shutdown： 停机模式，关机不计费</li></ul><p>默认值：ShutdownAndDelete</p>
     */
    public void setScaleDownMode(String ScaleDownMode) {
        this.ScaleDownMode = ScaleDownMode;
    }

    public MachineSetScaling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineSetScaling(MachineSetScaling source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.CreatePolicy != null) {
            this.CreatePolicy = new String(source.CreatePolicy);
        }
        if (source.ScaleDownMode != null) {
            this.ScaleDownMode = new String(source.ScaleDownMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "CreatePolicy", this.CreatePolicy);
        this.setParamSimple(map, prefix + "ScaleDownMode", this.ScaleDownMode);

    }
}

