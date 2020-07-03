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

public class RouteTableConflict extends AbstractModel{

    /**
    * 路由表类型。
    */
    @SerializedName("RouteTableType")
    @Expose
    private String RouteTableType;

    /**
    * 路由表CIDR。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteTableCidrBlock")
    @Expose
    private String RouteTableCidrBlock;

    /**
    * 路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 路由表ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get 路由表类型。 
     * @return RouteTableType 路由表类型。
     */
    public String getRouteTableType() {
        return this.RouteTableType;
    }

    /**
     * Set 路由表类型。
     * @param RouteTableType 路由表类型。
     */
    public void setRouteTableType(String RouteTableType) {
        this.RouteTableType = RouteTableType;
    }

    /**
     * Get 路由表CIDR。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteTableCidrBlock 路由表CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRouteTableCidrBlock() {
        return this.RouteTableCidrBlock;
    }

    /**
     * Set 路由表CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteTableCidrBlock 路由表CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteTableCidrBlock(String RouteTableCidrBlock) {
        this.RouteTableCidrBlock = RouteTableCidrBlock;
    }

    /**
     * Get 路由表名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteTableName 路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set 路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteTableName 路由表名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get 路由表ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteTableId 路由表ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteTableId 路由表ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableType", this.RouteTableType);
        this.setParamSimple(map, prefix + "RouteTableCidrBlock", this.RouteTableCidrBlock);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

