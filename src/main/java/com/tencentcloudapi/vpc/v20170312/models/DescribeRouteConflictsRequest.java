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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteConflictsRequest extends AbstractModel {

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 要检查的与之冲突的目的端列表。
    */
    @SerializedName("DestinationCidrBlocks")
    @Expose
    private String [] DestinationCidrBlocks;

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
     * Get 要检查的与之冲突的目的端列表。 
     * @return DestinationCidrBlocks 要检查的与之冲突的目的端列表。
     */
    public String [] getDestinationCidrBlocks() {
        return this.DestinationCidrBlocks;
    }

    /**
     * Set 要检查的与之冲突的目的端列表。
     * @param DestinationCidrBlocks 要检查的与之冲突的目的端列表。
     */
    public void setDestinationCidrBlocks(String [] DestinationCidrBlocks) {
        this.DestinationCidrBlocks = DestinationCidrBlocks;
    }

    public DescribeRouteConflictsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteConflictsRequest(DescribeRouteConflictsRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.DestinationCidrBlocks != null) {
            this.DestinationCidrBlocks = new String[source.DestinationCidrBlocks.length];
            for (int i = 0; i < source.DestinationCidrBlocks.length; i++) {
                this.DestinationCidrBlocks[i] = new String(source.DestinationCidrBlocks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "DestinationCidrBlocks.", this.DestinationCidrBlocks);

    }
}

