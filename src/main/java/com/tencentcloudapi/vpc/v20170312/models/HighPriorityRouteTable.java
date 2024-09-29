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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighPriorityRouteTable extends AbstractModel {

    /**
    * 高优路由表唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighPriorityRouteTableId")
    @Expose
    private String HighPriorityRouteTableId;

    /**
    * VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 高优路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 高优路由表关联的子网列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetSet")
    @Expose
    private String [] SubnetSet;

    /**
    * 高优路由表条目信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighPriorityRouteSet")
    @Expose
    private HighPriorityRoute [] HighPriorityRouteSet;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 高优路由表唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighPriorityRouteTableId 高优路由表唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHighPriorityRouteTableId() {
        return this.HighPriorityRouteTableId;
    }

    /**
     * Set 高优路由表唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighPriorityRouteTableId 高优路由表唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighPriorityRouteTableId(String HighPriorityRouteTableId) {
        this.HighPriorityRouteTableId = HighPriorityRouteTableId;
    }

    /**
     * Get VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 高优路由表名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 高优路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高优路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 高优路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 高优路由表关联的子网列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetSet 高优路由表关联的子网列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set 高优路由表关联的子网列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetSet 高优路由表关联的子网列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetSet(String [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * Get 高优路由表条目信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighPriorityRouteSet 高优路由表条目信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HighPriorityRoute [] getHighPriorityRouteSet() {
        return this.HighPriorityRouteSet;
    }

    /**
     * Set 高优路由表条目信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighPriorityRouteSet 高优路由表条目信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighPriorityRouteSet(HighPriorityRoute [] HighPriorityRouteSet) {
        this.HighPriorityRouteSet = HighPriorityRouteSet;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public HighPriorityRouteTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighPriorityRouteTable(HighPriorityRouteTable source) {
        if (source.HighPriorityRouteTableId != null) {
            this.HighPriorityRouteTableId = new String(source.HighPriorityRouteTableId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubnetSet != null) {
            this.SubnetSet = new String[source.SubnetSet.length];
            for (int i = 0; i < source.SubnetSet.length; i++) {
                this.SubnetSet[i] = new String(source.SubnetSet[i]);
            }
        }
        if (source.HighPriorityRouteSet != null) {
            this.HighPriorityRouteSet = new HighPriorityRoute[source.HighPriorityRouteSet.length];
            for (int i = 0; i < source.HighPriorityRouteSet.length; i++) {
                this.HighPriorityRouteSet[i] = new HighPriorityRoute(source.HighPriorityRouteSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighPriorityRouteTableId", this.HighPriorityRouteTableId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SubnetSet.", this.SubnetSet);
        this.setParamArrayObj(map, prefix + "HighPriorityRouteSet.", this.HighPriorityRouteSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

