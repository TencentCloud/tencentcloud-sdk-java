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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDTSInstanceInfo extends AbstractModel{

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 仓库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetId")
    @Expose
    private Long SetId;

    /**
    * 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 仓库ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetId 仓库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSetId() {
        return this.SetId;
    }

    /**
     * Set 仓库ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetId 仓库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetId(Long SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 可用区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 实例访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 实例访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

