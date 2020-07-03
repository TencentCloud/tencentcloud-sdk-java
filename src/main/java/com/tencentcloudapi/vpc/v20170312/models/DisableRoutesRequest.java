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
    * 路由策略ID。不能和RouteItemIds同时使用。
    */
    @SerializedName("RouteIds")
    @Expose
    private Long [] RouteIds;

    /**
    * 路由策略唯一ID。不能和RouteIds同时使用。
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
     * Get 路由策略ID。不能和RouteItemIds同时使用。 
     * @return RouteIds 路由策略ID。不能和RouteItemIds同时使用。
     */
    public Long [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set 路由策略ID。不能和RouteItemIds同时使用。
     * @param RouteIds 路由策略ID。不能和RouteItemIds同时使用。
     */
    public void setRouteIds(Long [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    /**
     * Get 路由策略唯一ID。不能和RouteIds同时使用。 
     * @return RouteItemIds 路由策略唯一ID。不能和RouteIds同时使用。
     */
    public String [] getRouteItemIds() {
        return this.RouteItemIds;
    }

    /**
     * Set 路由策略唯一ID。不能和RouteIds同时使用。
     * @param RouteItemIds 路由策略唯一ID。不能和RouteIds同时使用。
     */
    public void setRouteItemIds(String [] RouteItemIds) {
        this.RouteItemIds = RouteItemIds;
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

