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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeConfig extends AbstractModel{

    /**
    * Node ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Node parallelism
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parallelism")
    @Expose
    private Long Parallelism;

    /**
    * Slot sharing group
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotSharingGroup")
    @Expose
    private String SlotSharingGroup;

    /**
    * Configuration properties
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configuration")
    @Expose
    private Property [] Configuration;

    /**
    * 节点的状态ttl配置, 多个用 ; 分割
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateTTL")
    @Expose
    private String StateTTL;

    /**
     * Get Node ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id Node ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Node ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id Node ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Node parallelism
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parallelism Node parallelism
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParallelism() {
        return this.Parallelism;
    }

    /**
     * Set Node parallelism
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parallelism Node parallelism
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParallelism(Long Parallelism) {
        this.Parallelism = Parallelism;
    }

    /**
     * Get Slot sharing group
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotSharingGroup Slot sharing group
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlotSharingGroup() {
        return this.SlotSharingGroup;
    }

    /**
     * Set Slot sharing group
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotSharingGroup Slot sharing group
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotSharingGroup(String SlotSharingGroup) {
        this.SlotSharingGroup = SlotSharingGroup;
    }

    /**
     * Get Configuration properties
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configuration Configuration properties
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set Configuration properties
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configuration Configuration properties
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfiguration(Property [] Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get 节点的状态ttl配置, 多个用 ; 分割
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateTTL 节点的状态ttl配置, 多个用 ; 分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateTTL() {
        return this.StateTTL;
    }

    /**
     * Set 节点的状态ttl配置, 多个用 ; 分割
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateTTL 节点的状态ttl配置, 多个用 ; 分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateTTL(String StateTTL) {
        this.StateTTL = StateTTL;
    }

    public NodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeConfig(NodeConfig source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Parallelism != null) {
            this.Parallelism = new Long(source.Parallelism);
        }
        if (source.SlotSharingGroup != null) {
            this.SlotSharingGroup = new String(source.SlotSharingGroup);
        }
        if (source.Configuration != null) {
            this.Configuration = new Property[source.Configuration.length];
            for (int i = 0; i < source.Configuration.length; i++) {
                this.Configuration[i] = new Property(source.Configuration[i]);
            }
        }
        if (source.StateTTL != null) {
            this.StateTTL = new String(source.StateTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Parallelism", this.Parallelism);
        this.setParamSimple(map, prefix + "SlotSharingGroup", this.SlotSharingGroup);
        this.setParamArrayObj(map, prefix + "Configuration.", this.Configuration);
        this.setParamSimple(map, prefix + "StateTTL", this.StateTTL);

    }
}

