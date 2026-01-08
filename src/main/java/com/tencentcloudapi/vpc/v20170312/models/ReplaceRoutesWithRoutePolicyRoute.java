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

public class ReplaceRoutesWithRoutePolicyRoute extends AbstractModel {

    /**
    * 路由唯一策略ID。
    */
    @SerializedName("RouteItemId")
    @Expose
    private String RouteItemId;

    /**
    * 匹配路由接收策略标记。
    */
    @SerializedName("ForceMatchPolicy")
    @Expose
    private Boolean ForceMatchPolicy;

    /**
     * Get 路由唯一策略ID。 
     * @return RouteItemId 路由唯一策略ID。
     */
    public String getRouteItemId() {
        return this.RouteItemId;
    }

    /**
     * Set 路由唯一策略ID。
     * @param RouteItemId 路由唯一策略ID。
     */
    public void setRouteItemId(String RouteItemId) {
        this.RouteItemId = RouteItemId;
    }

    /**
     * Get 匹配路由接收策略标记。 
     * @return ForceMatchPolicy 匹配路由接收策略标记。
     */
    public Boolean getForceMatchPolicy() {
        return this.ForceMatchPolicy;
    }

    /**
     * Set 匹配路由接收策略标记。
     * @param ForceMatchPolicy 匹配路由接收策略标记。
     */
    public void setForceMatchPolicy(Boolean ForceMatchPolicy) {
        this.ForceMatchPolicy = ForceMatchPolicy;
    }

    public ReplaceRoutesWithRoutePolicyRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceRoutesWithRoutePolicyRoute(ReplaceRoutesWithRoutePolicyRoute source) {
        if (source.RouteItemId != null) {
            this.RouteItemId = new String(source.RouteItemId);
        }
        if (source.ForceMatchPolicy != null) {
            this.ForceMatchPolicy = new Boolean(source.ForceMatchPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteItemId", this.RouteItemId);
        this.setParamSimple(map, prefix + "ForceMatchPolicy", this.ForceMatchPolicy);

    }
}

