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

public class ModifyRoutePolicyRequest  extends AbstractModel{

    /**
    * 路由表ID
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 修改的路由
    */
    @SerializedName("RoutePolicy")
    @Expose
    private RoutePolicy RoutePolicy;

    /**
     * 获取路由表ID
     * @return RouteTableId 路由表ID
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表ID
     * @param RouteTableId 路由表ID
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取修改的路由
     * @return RoutePolicy 修改的路由
     */
    public RoutePolicy getRoutePolicy() {
        return this.RoutePolicy;
    }

    /**
     * 设置修改的路由
     * @param RoutePolicy 修改的路由
     */
    public void setRoutePolicy(RoutePolicy RoutePolicy) {
        this.RoutePolicy = RoutePolicy;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamObj(map, prefix + "RoutePolicy.", this.RoutePolicy);

    }
}

