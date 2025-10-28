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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteTableConflict extends AbstractModel {

    /**
    * 路由表类型。
枚举值：CcsCluster、Vpc、VpcRouteTable、CcsClusterRouteTable
    */
    @SerializedName("RouteTableType")
    @Expose
    private String RouteTableType;

    /**
    * 路由表CIDR。
    */
    @SerializedName("RouteTableCidrBlock")
    @Expose
    private String RouteTableCidrBlock;

    /**
    * 路由表名称。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 路由表ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get 路由表类型。
枚举值：CcsCluster、Vpc、VpcRouteTable、CcsClusterRouteTable 
     * @return RouteTableType 路由表类型。
枚举值：CcsCluster、Vpc、VpcRouteTable、CcsClusterRouteTable
     */
    public String getRouteTableType() {
        return this.RouteTableType;
    }

    /**
     * Set 路由表类型。
枚举值：CcsCluster、Vpc、VpcRouteTable、CcsClusterRouteTable
     * @param RouteTableType 路由表类型。
枚举值：CcsCluster、Vpc、VpcRouteTable、CcsClusterRouteTable
     */
    public void setRouteTableType(String RouteTableType) {
        this.RouteTableType = RouteTableType;
    }

    /**
     * Get 路由表CIDR。 
     * @return RouteTableCidrBlock 路由表CIDR。
     */
    public String getRouteTableCidrBlock() {
        return this.RouteTableCidrBlock;
    }

    /**
     * Set 路由表CIDR。
     * @param RouteTableCidrBlock 路由表CIDR。
     */
    public void setRouteTableCidrBlock(String RouteTableCidrBlock) {
        this.RouteTableCidrBlock = RouteTableCidrBlock;
    }

    /**
     * Get 路由表名称。 
     * @return RouteTableName 路由表名称。
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set 路由表名称。
     * @param RouteTableName 路由表名称。
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get 路由表ID。 
     * @return RouteTableId 路由表ID。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表ID。
     * @param RouteTableId 路由表ID。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    public RouteTableConflict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteTableConflict(RouteTableConflict source) {
        if (source.RouteTableType != null) {
            this.RouteTableType = new String(source.RouteTableType);
        }
        if (source.RouteTableCidrBlock != null) {
            this.RouteTableCidrBlock = new String(source.RouteTableCidrBlock);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
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

