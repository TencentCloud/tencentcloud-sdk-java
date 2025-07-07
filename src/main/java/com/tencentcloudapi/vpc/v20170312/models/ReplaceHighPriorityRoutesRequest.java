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

public class ReplaceHighPriorityRoutesRequest extends AbstractModel {

    /**
    * 高优路由表唯一 ID。
    */
    @SerializedName("HighPriorityRouteTableId")
    @Expose
    private String HighPriorityRouteTableId;

    /**
    * 高优路由表条目信息。
    */
    @SerializedName("HighPriorityRoutes")
    @Expose
    private HighPriorityRoute [] HighPriorityRoutes;

    /**
     * Get 高优路由表唯一 ID。 
     * @return HighPriorityRouteTableId 高优路由表唯一 ID。
     */
    public String getHighPriorityRouteTableId() {
        return this.HighPriorityRouteTableId;
    }

    /**
     * Set 高优路由表唯一 ID。
     * @param HighPriorityRouteTableId 高优路由表唯一 ID。
     */
    public void setHighPriorityRouteTableId(String HighPriorityRouteTableId) {
        this.HighPriorityRouteTableId = HighPriorityRouteTableId;
    }

    /**
     * Get 高优路由表条目信息。 
     * @return HighPriorityRoutes 高优路由表条目信息。
     */
    public HighPriorityRoute [] getHighPriorityRoutes() {
        return this.HighPriorityRoutes;
    }

    /**
     * Set 高优路由表条目信息。
     * @param HighPriorityRoutes 高优路由表条目信息。
     */
    public void setHighPriorityRoutes(HighPriorityRoute [] HighPriorityRoutes) {
        this.HighPriorityRoutes = HighPriorityRoutes;
    }

    public ReplaceHighPriorityRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceHighPriorityRoutesRequest(ReplaceHighPriorityRoutesRequest source) {
        if (source.HighPriorityRouteTableId != null) {
            this.HighPriorityRouteTableId = new String(source.HighPriorityRouteTableId);
        }
        if (source.HighPriorityRoutes != null) {
            this.HighPriorityRoutes = new HighPriorityRoute[source.HighPriorityRoutes.length];
            for (int i = 0; i < source.HighPriorityRoutes.length; i++) {
                this.HighPriorityRoutes[i] = new HighPriorityRoute(source.HighPriorityRoutes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighPriorityRouteTableId", this.HighPriorityRouteTableId);
        this.setParamArrayObj(map, prefix + "HighPriorityRoutes.", this.HighPriorityRoutes);

    }
}

