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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetCapacity extends AbstractModel{

    /**
    * 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 服务器实例统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCounts")
    @Expose
    private InstanceCounts InstanceCounts;

    /**
     * Get 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 服务器类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 服务器实例统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCounts 服务器实例统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceCounts getInstanceCounts() {
        return this.InstanceCounts;
    }

    /**
     * Set 服务器实例统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCounts 服务器实例统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCounts(InstanceCounts InstanceCounts) {
        this.InstanceCounts = InstanceCounts;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "InstanceCounts.", this.InstanceCounts);

    }
}

