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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteRequest extends AbstractModel {

    /**
    * 实例唯一id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 路由id
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
     * Get 实例唯一id 
     * @return InstanceId 实例唯一id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一id
     * @param InstanceId 实例唯一id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 路由id 
     * @return RouteId 路由id
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由id
     * @param RouteId 路由id
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    public DescribeRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteRequest(DescribeRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);

    }
}

