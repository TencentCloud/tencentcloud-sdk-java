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

public class EnableRoutesRequest  extends AbstractModel{

    /**
    * 路由表唯一ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由策略唯一ID。
    */
    @SerializedName("RouteIds")
    @Expose
    private Integer [] RouteIds;

    /**
     * 获取路由表唯一ID。
     * @return RouteTableId 路由表唯一ID。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表唯一ID。
     * @param RouteTableId 路由表唯一ID。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取路由策略唯一ID。
     * @return RouteIds 路由策略唯一ID。
     */
    public Integer [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * 设置路由策略唯一ID。
     * @param RouteIds 路由策略唯一ID。
     */
    public void setRouteIds(Integer [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);

    }
}

