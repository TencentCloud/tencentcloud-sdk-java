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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteTable extends AbstractModel{

    /**
    * VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 路由表实例ID
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由表名称
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 路由表关联关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociationSet")
    @Expose
    private RouteTableAssociation [] AssociationSet;

    /**
    * IPv4路由策略集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteSet")
    @Expose
    private Route [] RouteSet;

    /**
    * 是否默认路由表
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get VPC实例ID 
     * @return VpcId VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID
     * @param VpcId VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 路由表实例ID 
     * @return RouteTableId 路由表实例ID
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID
     * @param RouteTableId 路由表实例ID
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 路由表名称 
     * @return RouteTableName 路由表名称
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set 路由表名称
     * @param RouteTableName 路由表名称
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get 路由表关联关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociationSet 路由表关联关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RouteTableAssociation [] getAssociationSet() {
        return this.AssociationSet;
    }

    /**
     * Set 路由表关联关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociationSet 路由表关联关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociationSet(RouteTableAssociation [] AssociationSet) {
        this.AssociationSet = AssociationSet;
    }

    /**
     * Get IPv4路由策略集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteSet IPv4路由策略集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Route [] getRouteSet() {
        return this.RouteSet;
    }

    /**
     * Set IPv4路由策略集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteSet IPv4路由策略集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteSet(Route [] RouteSet) {
        this.RouteSet = RouteSet;
    }

    /**
     * Get 是否默认路由表 
     * @return Main 是否默认路由表
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * Set 是否默认路由表
     * @param Main 是否默认路由表
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public RouteTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteTable(RouteTable source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.AssociationSet != null) {
            this.AssociationSet = new RouteTableAssociation[source.AssociationSet.length];
            for (int i = 0; i < source.AssociationSet.length; i++) {
                this.AssociationSet[i] = new RouteTableAssociation(source.AssociationSet[i]);
            }
        }
        if (source.RouteSet != null) {
            this.RouteSet = new Route[source.RouteSet.length];
            for (int i = 0; i < source.RouteSet.length; i++) {
                this.RouteSet[i] = new Route(source.RouteSet[i]);
            }
        }
        if (source.Main != null) {
            this.Main = new Boolean(source.Main);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamArrayObj(map, prefix + "AssociationSet.", this.AssociationSet);
        this.setParamArrayObj(map, prefix + "RouteSet.", this.RouteSet);
        this.setParamSimple(map, prefix + "Main", this.Main);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

