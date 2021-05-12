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

public class ReplaceRouteTableAssociationRequest extends AbstractModel{

    /**
    * 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。 
     * @return SubnetId 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     * @param SubnetId 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public ReplaceRouteTableAssociationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceRouteTableAssociationRequest(ReplaceRouteTableAssociationRequest source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

