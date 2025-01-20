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

public class CcnRouteTableSelectPolicy extends AbstractModel {

    /**
    * 实例类型：
私有网络: `VPC`
专线网关: `DIRECTCONNECT`
黑石私有网络: `BMVPC`
EDGE设备: `EDGE`
EDGE隧道: `EDGE_TUNNEL`
EDGE网关: `EDGE_VPNGW`
VPN网关：`VPNGW`
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源端CIDR。
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * 路由表ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由表备注。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 实例类型：
私有网络: `VPC`
专线网关: `DIRECTCONNECT`
黑石私有网络: `BMVPC`
EDGE设备: `EDGE`
EDGE隧道: `EDGE_TUNNEL`
EDGE网关: `EDGE_VPNGW`
VPN网关：`VPNGW` 
     * @return InstanceType 实例类型：
私有网络: `VPC`
专线网关: `DIRECTCONNECT`
黑石私有网络: `BMVPC`
EDGE设备: `EDGE`
EDGE隧道: `EDGE_TUNNEL`
EDGE网关: `EDGE_VPNGW`
VPN网关：`VPNGW`
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型：
私有网络: `VPC`
专线网关: `DIRECTCONNECT`
黑石私有网络: `BMVPC`
EDGE设备: `EDGE`
EDGE隧道: `EDGE_TUNNEL`
EDGE网关: `EDGE_VPNGW`
VPN网关：`VPNGW`
     * @param InstanceType 实例类型：
私有网络: `VPC`
专线网关: `DIRECTCONNECT`
黑石私有网络: `BMVPC`
EDGE设备: `EDGE`
EDGE隧道: `EDGE_TUNNEL`
EDGE网关: `EDGE_VPNGW`
VPN网关：`VPNGW`
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源端CIDR。 
     * @return SourceCidrBlock 源端CIDR。
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set 源端CIDR。
     * @param SourceCidrBlock 源端CIDR。
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
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

    /**
     * Get 路由表备注。 
     * @return Description 路由表备注。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 路由表备注。
     * @param Description 路由表备注。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CcnRouteTableSelectPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRouteTableSelectPolicy(CcnRouteTableSelectPolicy source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SourceCidrBlock != null) {
            this.SourceCidrBlock = new String(source.SourceCidrBlock);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SourceCidrBlock", this.SourceCidrBlock);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

