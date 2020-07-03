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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoutePolicyRequest extends AbstractModel{

    /**
    * 路由表ID
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由表策略ID
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
     * Get 路由表ID 
     * @return RouteTableId 路由表ID
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表ID
     * @param RouteTableId 路由表ID
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 路由表策略ID 
     * @return RoutePolicyId 路由表策略ID
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set 路由表策略ID
     * @param RoutePolicyId 路由表策略ID
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);

    }
}

