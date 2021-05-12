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

public class DisableRoutesRequest extends AbstractModel{

    /**
    * 路由表唯一ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由策略ID。不能和RouteItemIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
    */
    @SerializedName("RouteIds")
    @Expose
    private Long [] RouteIds;

    /**
    * 路由策略唯一ID。不能和RouteIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
    */
    @SerializedName("RouteItemIds")
    @Expose
    private String [] RouteItemIds;

    /**
     * Get 路由表唯一ID。 
     * @return RouteTableId 路由表唯一ID。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表唯一ID。
     * @param RouteTableId 路由表唯一ID。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 路由策略ID。不能和RouteItemIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。 
     * @return RouteIds 路由策略ID。不能和RouteItemIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
     */
    public Long [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set 路由策略ID。不能和RouteItemIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
     * @param RouteIds 路由策略ID。不能和RouteItemIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
     */
    public void setRouteIds(Long [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    /**
     * Get 路由策略唯一ID。不能和RouteIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。 
     * @return RouteItemIds 路由策略唯一ID。不能和RouteIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
     */
    public String [] getRouteItemIds() {
        return this.RouteItemIds;
    }

    /**
     * Set 路由策略唯一ID。不能和RouteIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
     * @param RouteItemIds 路由策略唯一ID。不能和RouteIds同时使用，但至少输入一个。该参数取值可通过查询路由列表（[DescribeRouteTables](https://cloud.tencent.com/document/product/215/15763)）获取。
     */
    public void setRouteItemIds(String [] RouteItemIds) {
        this.RouteItemIds = RouteItemIds;
    }

    public DisableRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableRoutesRequest(DisableRoutesRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteIds != null) {
            this.RouteIds = new Long[source.RouteIds.length];
            for (int i = 0; i < source.RouteIds.length; i++) {
                this.RouteIds[i] = new Long(source.RouteIds[i]);
            }
        }
        if (source.RouteItemIds != null) {
            this.RouteItemIds = new String[source.RouteItemIds.length];
            for (int i = 0; i < source.RouteItemIds.length; i++) {
                this.RouteItemIds[i] = new String(source.RouteItemIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);
        this.setParamArraySimple(map, prefix + "RouteItemIds.", this.RouteItemIds);

    }
}

