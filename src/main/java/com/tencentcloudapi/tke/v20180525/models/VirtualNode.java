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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualNode extends AbstractModel{

    /**
    * 虚拟节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 虚拟节点所属子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 虚拟节点状态
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 虚拟节点名称 
     * @return Name 虚拟节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 虚拟节点名称
     * @param Name 虚拟节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 虚拟节点所属子网 
     * @return SubnetId 虚拟节点所属子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 虚拟节点所属子网
     * @param SubnetId 虚拟节点所属子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 虚拟节点状态 
     * @return Phase 虚拟节点状态
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set 虚拟节点状态
     * @param Phase 虚拟节点状态
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
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

    public VirtualNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualNode(VirtualNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

