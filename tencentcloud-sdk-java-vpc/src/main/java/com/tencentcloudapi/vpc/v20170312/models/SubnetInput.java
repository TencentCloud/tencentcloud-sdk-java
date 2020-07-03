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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetInput extends AbstractModel{

    /**
    * 子网的`CIDR`。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 子网名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 可用区。形如：`ap-guangzhou-2`。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 指定关联路由表，形如：`rtb-3ryrwzuu`。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get 子网的`CIDR`。 
     * @return CidrBlock 子网的`CIDR`。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网的`CIDR`。
     * @param CidrBlock 子网的`CIDR`。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 子网名称。 
     * @return SubnetName 子网名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称。
     * @param SubnetName 子网名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 可用区。形如：`ap-guangzhou-2`。 
     * @return Zone 可用区。形如：`ap-guangzhou-2`。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。形如：`ap-guangzhou-2`。
     * @param Zone 可用区。形如：`ap-guangzhou-2`。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 指定关联路由表，形如：`rtb-3ryrwzuu`。 
     * @return RouteTableId 指定关联路由表，形如：`rtb-3ryrwzuu`。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 指定关联路由表，形如：`rtb-3ryrwzuu`。
     * @param RouteTableId 指定关联路由表，形如：`rtb-3ryrwzuu`。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

