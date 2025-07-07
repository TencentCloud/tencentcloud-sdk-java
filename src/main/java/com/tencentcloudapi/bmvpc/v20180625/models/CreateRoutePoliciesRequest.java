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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoutePoliciesRequest extends AbstractModel {

    /**
    * 路由表ID
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 新增的路由
    */
    @SerializedName("RoutePolicySet")
    @Expose
    private RoutePolicy [] RoutePolicySet;

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
     * Get 新增的路由 
     * @return RoutePolicySet 新增的路由
     */
    public RoutePolicy [] getRoutePolicySet() {
        return this.RoutePolicySet;
    }

    /**
     * Set 新增的路由
     * @param RoutePolicySet 新增的路由
     */
    public void setRoutePolicySet(RoutePolicy [] RoutePolicySet) {
        this.RoutePolicySet = RoutePolicySet;
    }

    public CreateRoutePoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoutePoliciesRequest(CreateRoutePoliciesRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RoutePolicySet != null) {
            this.RoutePolicySet = new RoutePolicy[source.RoutePolicySet.length];
            for (int i = 0; i < source.RoutePolicySet.length; i++) {
                this.RoutePolicySet[i] = new RoutePolicy(source.RoutePolicySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArrayObj(map, prefix + "RoutePolicySet.", this.RoutePolicySet);

    }
}

