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

public class ModifyCcnRouteTablesRequest extends AbstractModel {

    /**
    * 需要修改的路由表列表。
    */
    @SerializedName("RouteTableInfo")
    @Expose
    private ModifyRouteTableInfo [] RouteTableInfo;

    /**
     * Get 需要修改的路由表列表。 
     * @return RouteTableInfo 需要修改的路由表列表。
     */
    public ModifyRouteTableInfo [] getRouteTableInfo() {
        return this.RouteTableInfo;
    }

    /**
     * Set 需要修改的路由表列表。
     * @param RouteTableInfo 需要修改的路由表列表。
     */
    public void setRouteTableInfo(ModifyRouteTableInfo [] RouteTableInfo) {
        this.RouteTableInfo = RouteTableInfo;
    }

    public ModifyCcnRouteTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCcnRouteTablesRequest(ModifyCcnRouteTablesRequest source) {
        if (source.RouteTableInfo != null) {
            this.RouteTableInfo = new ModifyRouteTableInfo[source.RouteTableInfo.length];
            for (int i = 0; i < source.RouteTableInfo.length; i++) {
                this.RouteTableInfo[i] = new ModifyRouteTableInfo(source.RouteTableInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RouteTableInfo.", this.RouteTableInfo);

    }
}

