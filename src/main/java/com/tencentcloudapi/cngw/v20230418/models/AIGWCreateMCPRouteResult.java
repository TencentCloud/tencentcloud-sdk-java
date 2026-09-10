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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWCreateMCPRouteResult extends AbstractModel {

    /**
    * <p>路由ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>结果</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
     * Get <p>路由ID</p> 
     * @return RouteId <p>路由ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由ID</p>
     * @param RouteId <p>路由ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>结果</p> 
     * @return Success <p>结果</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>结果</p>
     * @param Success <p>结果</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    public AIGWCreateMCPRouteResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWCreateMCPRouteResult(AIGWCreateMCPRouteResult source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Success", this.Success);

    }
}

